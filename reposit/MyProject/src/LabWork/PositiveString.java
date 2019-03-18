package LabWork;

	/*
	 * accepts a String and checks if it is a positive string. 
	 * A string is considered a positive string, if on moving from left to right each character in the String 
	 * comes after the previous characters in the Alphabetical order
	 */

public class PositiveString {
	
	public static boolean PosString(String s)
	{
		
		for(int i = 0; i<s.length()-1;i++)
		{
			char c = s.charAt(i);
			char c1 = s.charAt(i+1);
			if((int)c < (int)c1)
			{
				
			}
			else
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Increasing String\n");
		System.out.println("Param :"+PosString("Param"));
		System.out.println("abcd : "+PosString("ABCD"));
	}

}
