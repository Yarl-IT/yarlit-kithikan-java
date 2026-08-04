class PrimitiveDataTypes{
    public static void main(String args[]){ 
        byte b1;
        b1 = 126;
        System.out.println("Byte: "+b1);

        short s1;
        s1 = 32000;
        System.out.println("Short: "+s1);

        int i;
        i = 65022;
        System.out.println("Int: "+i);

        long l;
        l = 650226558656L;
        System.out.println("Long: "+l);

        float f1;
        f1 = 25.6f;
        System.out.println("Float: "+f1);
		
		double db;
		db= 86.35D;
		System.out.println("Double: "+db);
		
		boolean bool;
		bool=true;
		System.out.println("Boolean: "+bool);
		
		char ch;
		ch= 'A';
		System.out.println("Char: "+ch);
		
		char ch1;
		ch1=65;			// decimal value
		System.out.println("Char: "+ch1);
		
		char ch2;
		ch2=0101;		//Octal value
		System.out.println("Char: "+ch2);
		
		char ch3;
		ch3=0x41;		//Hexa Decimal value
		System.out.println("Char: "+ch3);
		
		char ch4;
		ch4=0b1000001; //binary value
		System.out.println("Char: "+ch4);
		
		char ch5;
		ch5='\u0041';	//Unicode value
		System.out.println("Char: "+ch5);
    }
}