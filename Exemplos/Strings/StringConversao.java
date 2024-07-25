package acc.strings.sample;

public class StringConversao {
	public static void main(String[] args) {
		
//	Convertendo ASCII para String
	int i = 64;
	String aChar = new Character((char)i).toString();
	
//	Convertendo números em decimal para binário
	String binstr = Integer.toBinaryString(i);
	
//	Convertendo um valor booleano para integer
//	i = (b)?1:0;
	
//	Convertendo um número decimal para hexadecimal
	String hexstr = Integer.toHexString(i);
	System.out.println(hexstr);

//	Convertendo um Double para um String
	String s1 = Double.toString(i);
	
//	Convertendo um float para um StringConversion from float to String
	float f = 12.0f;
	String s2 = Float.toString(f);
		
//	Convertendo números em hexadecimal para integer
	int hi = Integer.valueOf("B8DA3", 16).intValue();
	
//	Convertendo um integer para código ASCII
	char ca = 'A';
	int sa = (int) ca; // Você terá o valor 65

//	Convertendo um número integer para boolean
//	b = (i != 0);
	
//	Convertendo de um integer para uma String
	String str1 = Integer.toString(i);
	//ou 
	String str2 = "" + i ;

//	Convertendo de um long para uma String
	long l = 42;
	String str = Long.toString(l);
	
//	Convertendo de uma String para Double
	double d1 = Double.valueOf(str).doubleValue();

//	Convertendo String para integer
	String str3 = "25";
	int i1 = Integer.valueOf(str3).intValue();
//	ou
	int i2 = Integer.parseInt(str3);

//	Convertendo uma String para um float
	float f1 = Float.valueOf(str3).floatValue();

//	Convertendo uma String para um long
	long l1 = Long.valueOf(str).longValue();
	//ou
	long l2 = Long.parseLong(str);
	
	}
}
