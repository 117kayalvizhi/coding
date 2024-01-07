package programs;

import java.util.Scanner;

public class Fiba {
	static  Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("enter the number:");
	int num=sc.nextInt();
	int n1=0;
	int n2=1;
	int n3=0;
	for(int i=0;i<num;i++) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(n1+" ");
	}
	
}
}
