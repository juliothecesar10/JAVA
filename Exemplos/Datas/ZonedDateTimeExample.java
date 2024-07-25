package br.acc.datas;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {
	
	public static void main(String[] args) {
	      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");

	      // Get default time zone
	      System.out.println(ZoneOffset.systemDefault());         // Asia/Kuala_Lumpur
	      System.out.println(OffsetDateTime.now().getOffset());   // +08:00

	      // get current date time, with +08:00
	      ZonedDateTime now = ZonedDateTime.now();
	      System.out.println(dtf.format(now));                    // 2021/03/22 16:37:15
	      System.out.println(now.getOffset());                    // +08:00

	      // get get current date time, with +09:00
	      ZonedDateTime japanDateTime = now.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
	      System.out.println(dtf.format(japanDateTime));          // 2021/03/22 17:37:15
	      System.out.println(japanDateTime.getOffset());          // +09:00

	}

}
