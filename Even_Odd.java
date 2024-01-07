package programs;

import java.util.Scanner;

public class Even_Odd {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the value:");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("the num "+num+"is even");
		}
		else {
			 System.out.println("the num"+num+"is odd");
		}
	}

}
