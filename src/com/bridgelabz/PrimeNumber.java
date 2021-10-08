package com.bridgelabz;

import java.util.Iterator;
import java.util.Scanner;
public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inputNumber, temp = 0;
		
		System.out.println("Enter any number: ");
		
		inputNumber = scanner.nextInt();
		
		for(int i = 2; i <= inputNumber - 1; i++) {
			if(inputNumber % i == 0) {
				temp = temp + 1;
			}
		}
		if(temp > 0) {
			System.out.println("Given number is not  prime number");
		}
		else {
			System.out.println("Given number is  prime number");
		}
	}
	

}
