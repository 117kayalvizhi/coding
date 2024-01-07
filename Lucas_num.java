package programs;

import java.util.Scanner;

public class Lucas_num {
	static Scanner sc=new Scanner(System.in);
 public static void main(String[] args) {
	System.out.println("enter the number:");
	int num =sc.nextInt();
	int n1=2; int n2=1;
	if(n1>=1) {
		System.out.print(" 2 1 ");
		for(int i=1;i<=num;i++) {
			int n3=0;
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n2+" ");
			
			
		}
	}
		else {
			System.out.println("Invalid number");
		}
	}
}	


