package Demo;

import java.util.Scanner;

public class Bit_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		byte a,b,c;
		boolean d;
		//int a,b, c,d;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers 00,01,10,11");
		a=scanner.nextByte();
		b=scanner.nextByte();
		
		c =(byte) (a&b);
		System.out.println(c);
		
		

	}

}
