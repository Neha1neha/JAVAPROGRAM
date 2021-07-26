package Practicejavaprogram;

import java.util.HashSet;

public class Findtotalnoofduplicate {

	public static void main(String[] args) {
		String s="india";
		
		// create Set collection to get only unique char
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		
		//compare each character of set with all char og given string
		
		int totalNumOfDuplicate=0;
		for (Character ch : set) {
			int count=0;
			for(int i=0; i<s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			//print char and count
			if(count>1)
			{
				 totalNumOfDuplicate ++;
			}
			System.out.println(ch+ " = "+count);
		}
	}

}

