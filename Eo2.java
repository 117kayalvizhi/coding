package programs;

import java.util.Scanner;

public class Eo2 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("enter the number:");
		int num =sc.nextInt();
		if(num%2==0) {
			if(num%6==0 && num%4==0) {
				System.out.println("Hi.............!");
			}
				else {
					System.out.println("go away.....");
				}
		}
		else {
				if(num%3==0 && num%5==0) {
					System.out.println("hey you.....!");
				
			}
				else {
					System.out.println("Tata Tata.......");
				}
				}
				
			}
		
	}


