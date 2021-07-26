package Practicejavaprogram;

public class dltstringarray {

	public static void main(String[] args) {
		String stg="12125gahssggaa";
		char [] arr=stg.toCharArray();
		int n=arr.length;
		//two loop for compare
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n;j++)
			{
				if(arr[i]==arr[j]) //checking duplicate
				{
					for(int k=j; k<n-1;k++) //if duplicate found do shift
					{
						arr[k]=arr[k+1];
					}
					n--; //ignore shifted element
					j--; //next compare should start with shifted element
				}
				
			}
			
		}
		char [] newarr=new char[n]; // taking new array size is n
		for(int i=0; i<n; i++) {
			newarr[i]=arr[i];  //coping new array to old array
		}
		

		String out=new String(newarr);
		System.out.println("***********input*********"+stg);
		System.out.println("******output**********"+newarr);

	}

}