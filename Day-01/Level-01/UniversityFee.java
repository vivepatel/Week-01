import java.util.Scanner;

public class UniversityFee{
    public static void main(String[] args) {
        // we have created the Scanner object for taking inputs
        Scanner input= new Scanner(System.in);
		System.out.println("Enter the fee");
		// created a variable fee 
		
		double fee=input.nextDouble();
		System.out.println("Enter the discountPercent");
		// created a variable discountPercent
		int discountPercent= input.nextInt();
		// created a Discount variable and calculating the discount value
		double Discount  = fee * discountPercent/(double)100;
		// here we are  calculating discounted fee by subtracting the fee from the Dicount amount
		System.out.println(" The discount amount is INR " + Discount + " and final discounted fee is INR " +(fee - Discount));
    

    }
}