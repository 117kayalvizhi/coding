package programs;

import java.util.Scanner;

public class Positive_Negative {
static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("enter the  value1:");
	
	int v1=sc.nextInt();
	
	if(v1>0) {
		System.out.println("the num "+v1+" is positive");}
		else if(v1<0) {
			System.out.println("the num"+v1+"is negative");
			
		}
		else {
			System.out.println("************");
	}
}
}
