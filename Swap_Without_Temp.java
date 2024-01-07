package programs;

public class Swap_Without_Temp {
	public static void main(String[] args) {
		int a=90;
		int b=50;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
        System.out.println(b);
	}

}
