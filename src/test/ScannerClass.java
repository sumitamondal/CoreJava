package test;

import java.util.Scanner;


public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = scanner.nextInt();
		
		if(num%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd NUmber");
		}
		
 
	}

}
