package programs;

import java.util.Scanner;

public class Unknown {
static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("enter the number:");
	int num =sc.nextInt();
	System.out.println("enter the a:");
	int a=sc.nextInt();
	System.out.println("enter the b:");
	int b=sc.nextInt();
	while(b<=num) {
		a++;
		b=a*a;
	}
	System.out.println(a-1);
}
}
