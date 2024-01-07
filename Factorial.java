package programs;

import java.util.Scanner;

public class Factorial {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;   
			
		}
	System.out.println("the factorial "+num+ "is:"+fact);
	}
}
