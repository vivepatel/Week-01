import java.util.Scanner;
//Creating class Length to find length of string
public class Length{
	//creating method calculateLength to calculate length of given string
	public static int calculateLength(String str){
		int count = 0;
		//using StringIndexOutOfBoundsException to find length of string
		try{
			while(true){
				str.charAt(count);
				count ++;
			}
		}
		catch(StringIndexOutOfBoundsException e){
			return count;
		}
	}
	
	//Main method	
	public static void main(String[]args){
		//Scanner object
		Scanner sc = new Scanner (System.in);
		//creating variable to take user input
		System.out.print("Enter string : ");
		String str = sc.nextLine().trim();
		//calling calculateLength method and store returning data in len variable
		int len = calculateLength(str);
		//Printing Length
		System.out.println("The length of string is : "+ len);
	}
}