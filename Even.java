package Basic;

public class Even {
	
		public static void main(String[] args) {
			int a[] = { 2, 6, 5, 34, 23, 26 };
			int Even_sum = 0;
			int odd_sum = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					Even_sum += a[i];
				} else {
					odd_sum += a[i];
				}
			}

			System.out.println("the even number is:" + Even_sum);
			System.out.println("the odd number is:" + odd_sum);
		}
	}


