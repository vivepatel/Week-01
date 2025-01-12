import java.util.Scanner;

public class BonusSalary {
    public static void main(String[] args) {
	// to take the input from the user 
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the Salary and the Year of Service ");
		int salary = input.nextInt();
		int YearOfService =  input.nextInt();
		double Bonus = 0;
		if(YearOfService>5)
		{
		   Bonus = (double)salary * 0.05;
		   System.out.println(" The  Salary After 5% Bonus is " + Bonus );
		   
		}
		else
		{
		   System.out.println(" You can get the Bonus because Your year of service is less then 5");
		}
		
	
        
    }
}