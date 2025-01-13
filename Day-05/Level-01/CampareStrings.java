import java.util.Scanner;
class CampareStrings{
	// created stringCheck method to check the string are equals with the charAt() 
   public static boolean stringCheck( String string1 , String string2 ){
		if(string1.length() == string2.length())
		{
		for ( int i=0;i<string1.length();i++)
		{
		   if(string1.charAt(i) != string2.charAt(i) )
		   { 
		    
			return false;
			
			
		   }
		}
		return true;
		
		}
		else
		{
		return false;
		}
    }
   public static void main( String[] args)
   { 
        // to take input 
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the String 1");
		// taking input for String 1
		String string1= input.next();
		System.out.println(" Enter the String 2");
		// taking input for String 2
		String string2 = input.next();
		// Checking strings are equals with the use of charAt() 
		boolean isEqual = CampareStrings.stringCheck( string1 , string2);
		// checking strings are equals with equals() 
		boolean result = string1.equals(string2);
		// checking if both the Equal string using both the method 
		if( isEqual && result )
		{
		  System.out.println(" The Strings are Equal ");
		}
		else
		{
		  System.out.println(" The String are not Equal");
		}
		
   }
}