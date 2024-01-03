package Basic;

import java.util.Scanner;

public class Target {
	static Scanner sc=new Scanner(System.in);	 
	public static void main(String[] args) {
		int a[]= {8,9,5,3,4,1};
		String res="not present";
		System.out.println("enter the key element");
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
			{
				res="present";
				break;
				
			}
		}
		System.out.println(res);
		
	}
	}


