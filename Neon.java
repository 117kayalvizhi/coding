package programs;

import java.util.Scanner;

public class Neon {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int squr=num*num;
		int sum=0;
		while(squr!=0)
		{
			int a=squr%10;
			sum=sum+a;
			squr=squr/10;
			
		}
		if(sum==num) 
			System.out.println("the num " +num +"is neon");
			else 
			System.out.println("the num "+num+"is not neon");	
			
		}
	}


