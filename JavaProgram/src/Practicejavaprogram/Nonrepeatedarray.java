package Practicejavaprogram;

public class Nonrepeatedarray {

	public static void main(String[] args) {
		int [] arr= {1,2,5,4,4};
		int n=arr.length;
		
		for(int i=0; i<n; i++)
		{
			int count=0;
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=j; k<n-1; k++)
					{
						arr[k]=arr[k+1];
					}
					n--;
					j--;
				}
				
			}
			if(count==0) {
				System.out.println(arr[i]);
			}
		}
	}

}