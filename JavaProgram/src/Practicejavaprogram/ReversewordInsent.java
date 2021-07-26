package Practicejavaprogram;

public class ReversewordInsent {

	public static void main(String[] args) {
		String s1="automation test engineer";
		char [] ch=s1.toCharArray();
		String out="";
		
		for(int i=0; i<ch.length; i++)
		{
			String word="";
			while(i<ch.length && ch[i]!=' ')
			{
				word=word+ch[i];
				i++;
			}
			out=word+" "+out;
		}
		System.out.println(out);

	}

}