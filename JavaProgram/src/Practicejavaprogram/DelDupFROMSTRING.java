package Practicejavaprogram;

public class DelDupFROMSTRING {

	public static void main(String[] args) {
		String s="abbbbbacdddddd";
		char [] arr=s.toCharArray();
		int n=arr.length;
	//two loop for comparison
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n;j++) 
			{
				if(arr[i]==arr[j]) //checking duplicate 
				{
				for(int k=j; k<n-1; k++) //if found duplicate then shift
				{
					arr[k]=arr[k+1];
				}
				n--; //Ignore last shifted element
				j--; //should next comparison start from shifted element
				}
			}
			
		}
		char [] nar=new char[n]; //store in new array size is n
		for(int i=0;i<n; i++)
		{
			nar[i]=arr[i]; //taking old array to new array
		}
		String out=new String(nar); //convert char to string
		System.out.println(out);
		
		
	}
}
