package Practicejavaprogram;

public class Occarence {
	
	
		public static void main(String[] args) 
		{
			String s1="Neha";
			char [] ar=s1.toCharArray();
		//	int [] ar={2,1,2,1,2,1,3,3,6,5,4,1,2};
			int n=ar.length;
			//two for loops for comparision
			for (int i=0;i<n;i++ )
			{
				int count=1;
				for (int j=i+1;j<n ;j++ )
				{
					if(ar[i]==ar[j])//check for duplicate
					{
						count++;
						//loop for shifting
							for (int k=j;k<n-1;k++ )
							{
								ar[k]=ar[k+1];
							}
							n--;//ignore the last shifted element
							j--;//next comparision should start from shifted
					}					
				}
				System.out.println(ar[i] +" is repeated "+count +" times");
			}	
		}
	}