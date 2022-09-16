package lec2;

public class FactorsGCD {
public static void main(String[] args) {
	int a = 18;
	int b = 32;
	
	int divisor = a;
	int dividend = b;
	System.out.println("the remainders are:");
	while(divisor>0) {
		int remainder = dividend % divisor;
		
		System.out.println(remainder);
		dividend = divisor;
		divisor = remainder;
	}
	System.out.println("the greatest common divisor is:");
	System.out.println(dividend);
}
}
