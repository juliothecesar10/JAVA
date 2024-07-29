package acc.br.enumeracao;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Locale;
import java.util.stream.Stream;

public class EnumFasesDaLua {

    public static final long SYNODIC_PERIOD = 2551442877L; //29.530588854 days

    public static final LocalDateTime KNOWN_LUA_NOVA = LocalDate.of(1970, Month.JANUARY, 7).atStartOfDay();
    

    static enum MoonPhase {
        LUA_NOVA, // Nova
        CRESCENTE, // Crescente
        QUARTO_CRESCENTE, // Quarto crescente
        CRESCENTE_GIBOSA, // Crescente gibosa
        LUA_CHEIA, // Cheia
        MINGUANTE_GIBOSA, // Minguante gibosa
        QUARTO_MINGUANTE, // Quarto minguante
        MINGUANTE; // Minguante
    }

    public static int getLunarDay(LocalDateTime day) {
    	
        int lunarDay = (int) Duration.ofMillis(Duration.between(KNOWN_LUA_NOVA, day).toMillis() % SYNODIC_PERIOD).toDays();
        //System.out.println(" =>"+Duration.ofMillis(Duration.between(KNOWN_LUA_NOVA, day).toMillis()));
        //System.out.println(" =>"+Duration.ofMillis(Duration.between(KNOWN_LUA_NOVA, day).toMillis() % SYNODIC_PERIOD));
        //System.out.println(" =>"+Duration.ofMillis(Duration.between(KNOWN_LUA_NOVA, day).toMillis() % SYNODIC_PERIOD).toDays());
        
        //duracao em milisegundos entre o dia informado e a luanovaconhecida.
        //dividir pelo synodic 
        //o resto da divisao transformar em dias
        
        return lunarDay;
    }

    public static MoonPhase getMoonPhase(int lunarDay) {
    	int phaseNum = (int)Math.floor(lunarDay/3.7);
    	System.out.println("phaseNum = " + phaseNum);
    	System.out.println("lunarDay = " + lunarDay);
        return MoonPhase.values()[phaseNum];
    }

    public static MoonPhase getMoonPhaseConway(int lunarDay) {
        if(lunarDay<=28) {
            if(lunarDay>=24) {
                return MoonPhase.MINGUANTE;
            }
            if(lunarDay>=22) {
                return MoonPhase.QUARTO_MINGUANTE;
            }
            if(lunarDay>=17) {
                return MoonPhase.MINGUANTE_GIBOSA;
            }
            if(lunarDay>=14) {
                return MoonPhase.LUA_CHEIA;
            }
            if(lunarDay>=9) {
                return MoonPhase.CRESCENTE_GIBOSA;
            }
            if(lunarDay>=7) {
                return MoonPhase.QUARTO_CRESCENTE;
            }
            if(lunarDay>=2) {
                return MoonPhase.CRESCENTE;
            }
        }
        return MoonPhase.LUA_NOVA; //0,1,29
    }

    /**
     * Based on https://www.cs.williams.edu/~bailey/cs135/lectures/Lecture02.pdf and http://www.faqs.org/faqs/astronomy/faq/part3/section-15.html
     * Only works on 20th and 21th century
     */
    public static int getLunarDayConway(LocalDateTime ldt) {
    	int year = ldt.getYear();
    	int month = ldt.getMonthValue();
    	int day = ldt.getDayOfMonth();

        if(year < 1900 || year >= 2100) throw new RuntimeException("Date must be greater than 1900 and less than 2100");
        double centS = -4.0;
        if (year > 2000) {
            centS = (float) -8.3;
        }
        double lastTwoDigits = year%100.0;
        double vl = lastTwoDigits % 19; 
        if(vl > 9) {
            vl-=19.0;
        }
        vl*=11.0;
        vl%=30;
        vl+=centS;

        vl+=month+day;
        if(month<3) {
            vl+=2;
        }

        vl = Math.round(vl)%30;
        return (int)((vl < 0) ? vl+30 : vl);
    }

    public static void main(String[] args) {
    	LocalDateTime now = LocalDateTime.now();
    	LocalDateTime end = now.plusMonths(1);

        Stream.iterate(now, date -> date.plusDays(1))
            .limit(ChronoUnit.DAYS.between(now, end))
            .forEach(EnumFasesDaLua::printLunarAnalysis);
      
    }

    private static void printLunarAnalysis(LocalDateTime ldt) {
    	DateTimeFormatter df = DateTimeFormatter
            .ofLocalizedDate(FormatStyle.SHORT)
            .withLocale(new Locale("pt", "br"));
        System.out.println(" =>"+ ldt);
        int lunarDay = getLunarDay(ldt);
        int lunarDayConway = getLunarDayConway(ldt);
        MoonPhase moonPhase = getMoonPhase(lunarDay);
        MoonPhase moonPhaseConway = getMoonPhaseConway(lunarDayConway);
        System.out.println("Data: " + ldt.format(df));
        System.out.println("Dia lunar: " + lunarDay);
        System.out.println("Dia lunar Conway: " + lunarDayConway);
        System.out.println("Fase da lua (provável): " + moonPhase);
        System.out.println("Fase da lua (provável) Conway: " + moonPhaseConway);
        System.out.println("-------------------------------------------------");
    }
}