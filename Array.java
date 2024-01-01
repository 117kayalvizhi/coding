
package Basic;

import java.util.Scanner;

public class Array {
static	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE:");
		int size=sc.nextInt();
		int a[]=new int [size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element:");
			a[i]=sc.nextInt();
			                                                                                                                                         
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]"+a[i]);
		}
		
			
		}
			
		
		
	}