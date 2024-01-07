package programs;

public class Swap_With_Temp {
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int temp = 0;
		temp = a;

		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);

	}

}
