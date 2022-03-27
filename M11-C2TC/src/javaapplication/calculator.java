package javaapplication; 
import java.util.Scanner;

public class calculator {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,ch,res;
		System.out.println("Please Enter Any Two Number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Choose any option from following");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Your Choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			res=a+b;
			System.out.println("Sum="+res);
			break;
		case 2:
			res=a-b;
			System.out.println("Differance="+res);
			break;
		case 3:
			res=a*b;
			System.out.println("Product="+res);
			break;
		case 4:
			res=a/b;
			System.out.println("Quotient="+res);
			break;
			default:
			System.out.println("please select the Right choice");
		    }
	    }		

	}



