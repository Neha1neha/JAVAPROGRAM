package Practicejavaprogram;

public class Stringtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String s="welcome";
		char ch[]=s.toCharArray();
		int count=0;
		for(char c : ch) {
			count++;
			
		}
				
			String rev=""	;
			for(int i=count-1;i>=0;i--)
				
				rev=rev+s.charAt(i);
				
			{
				System.out.println(rev);
			}
		
	}

}
