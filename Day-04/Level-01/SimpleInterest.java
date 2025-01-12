import java.util.Scanner;
public class SimpleInterest{
   //method for calculating Simple interest
   public double CalculateSimpleInterest(double Principal, int rate, int time){
       double simpleInterest = Principal * rate * time / 100;
       return simpleInterest;
   }
   public static void main(String[] args){
       //create a scanner class
       Scanner sc = new Scanner(System.in);
       //taking inputs for principal, time and rate
       
	   System.out.println("Enter the Principal rate and Time ");
	   //taking inputs for principal, time and rate
	   double Principal = sc.nextDouble();
       int rate = sc.nextInt();
       int time = sc.nextInt();
       // creating object of SimpleInterest class
       SimpleInterest SI = new SimpleInterest();
       //variable to store simple interest
       double simpleInterest = SI.CalculateSimpleInterest(Principal, rate, time);
       //display the result
       System.out.println("The Simple Interest is "+simpleInterest + " for Principal "+ Principal +", Rate of Interest "+rate +" and Time "+time);
       //close the scanner
       sc.close();
    }
}

       