import java.util.Scanner;
class SubstringCheck{
	 public static String substringChecker( String string1, int start, int end)
	 {
		  StringBuilder  subString = new StringBuilder();
		  for (int  i = start; i<end; i++)
		  {
			  subString.append(string1.charAt(i));
		  }
		  return subString.toString();
		  
	 }
   public static void main( String[] args){
		Scanner input = new Scanner(System.in);
	    System.out.println(" Enter the String ");
		String string1 = input.next();
		System.out.println(" Enter the Start index for Subtring  ");
		int start=input.nextInt();
		System.out.println(" Enter the End Index for Subtring ");
		int end = input.nextInt();
		 String subString1= SubstringCheck.substringChecker( string1 , start ,end);
		 String subString2= string1.substring(start,end);
		boolean isEqual= subString1.equals(subString2);
		if(isEqual)
		{
			System.out.println(" The subString is equals");			
		}
		else
		{
			System.out.println(" The subString is Not equals");	
		}
		
		
	
   }
}