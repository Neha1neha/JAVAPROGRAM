package Practicejavaprogram;

public class RepeatedArray {

	public static void main(String[] args) {
		int [] arr= {1,2,1,1,4,2,2};
		int n=arr.length;
		
		//loop for comparison
		for(int i=0; i<n; i++)
		{
			int count=0;
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]==arr[j]) {
					count++;
					for(int k=j; k<n-1; k++) {
						arr[k]=arr[k+1];
					}
					n--;
					j--;
				}
			}
			System.out.println(arr[i]+ " is repeated " +count +" times");
		}

	}

}