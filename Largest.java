package Basic;

public class Largest {
	public static void main(String[] args) {
		int arr[]= {89,5,61,12,34,11,0,89,2,45};
		int lar=arr[0];
		int sma=arr[0]; 
		for(int i=0;i<arr.length;i++) {
			if(lar>arr[i]) {
				lar=arr[i];
				     
			}
			else if(sma<arr[i]) {
				sma=arr[i];
				
			}
		}
		System.out.println( "the largest number is:"+lar);
		System.out.println("the smallest number is:"+sma);
	}

}

