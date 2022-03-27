package javaapplication;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int inputNumber = sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=inputNumber/2;i++) {
			if(inputNumber%i==0) {
				flag=true;
				System.out.println("Not Prime");
				break;
			}
			}
		if(!flag) {
			System.out.println("Prime");
		}

	}

}
