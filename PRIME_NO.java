package lec2;

import java.util.Scanner;

public class PRIME_NO {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int div = 1;
	int factors = 0;
	while(div<=n) {
		int rem = n%div;
		if(rem==0) {
			factors = factors +1;
		
		}
		div++;
	}
	
	if(factors==2) {
		System.out.println("Prime");
	}
		else
		{
			System.out.println("NotPrime");
		}
	
	}

}
