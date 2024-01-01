package Basic;

public class Sec {

		public static void main(String[] args) {
			  int arr[]= {6,7,2,8,5,4};
			  int temp=0;int first=0;
			  for(int i=0;i<arr.length;i++) {
				  if(arr[i]>first) {
					  temp=first;
					  first=arr[i];
				  }
				  if(first==temp) {
					  System.out.println(" the second largest");
				  }
				  
				
					  
				  }
			  }
	}

