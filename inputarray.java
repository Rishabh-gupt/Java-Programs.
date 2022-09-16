package lec2;

import java.util.Scanner;

public class inputarray {
public static void main(String[] args) {
	Scanner scn  = new Scanner(System.in);
	int len = scn.nextInt();
	int[] arr = new int[len];
	for(int i = 0;i<len;i++) {
		arr[i] = scn.nextInt();
	}
	for(int  i = 0;i<len;i++) {
		System.out.print( arr[i] + " ");
	}
	
}
}
