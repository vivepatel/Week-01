import java.util.Scanner;
public class MaximumHandshakes{
   //method for calculating handshakes
   public int Handshakes(int students){
       int handshakes = (students * (students - 1)) / 2;
       return handshakes;
   }
   public static void main(String[] args){
       //create a scanner class
       Scanner sc = new Scanner(System.in);
       //taking inputs for no.of students
	   System.out.println(" Enter the Number of Student ");
       int students = sc.nextInt();
       // creating object of MaximumHandshakes class
       MaximumHandshakes obj = new MaximumHandshakes();
       //variable to store simple interest
       int handshake = obj.Handshakes(students);
       //display the result
       System.out.println("The maximum number of handshakes for "+ students+ " is "+handshake);
       
    }
}

