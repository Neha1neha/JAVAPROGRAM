package Practicejavaprogram;

public class Deleteduplifromarray {

	public static void main(String[] args) {
		int [] arr= {5,3,5,2,2,};
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) 
		{
			//loop for comparison
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {   //checking duplicate
					
					for(int k=j;k<n-1;k++)  //if duplicate then shift
					{
						
						arr[k]=arr[k+1];  
					}
					n--; //ignoring the last shifted element
					j--; //next comparison  should start from shifted element
					
				}
				
			}
			
		}
		int [] nwarr=new int[n];  //taking n size array
		for(int i=0;i<n; i++)
		{
			nwarr[i]=arr[i]; //copying old array to new array
		}
		System.out.println("output array:");
		for(int i=0;i<nwarr.length;i++) 
		{
			System.out.println(nwarr[i]);
		}

	}

}