import java.util.Scanner;

public class TotalPurchase{
    public static void main(String[] args) {
        // we have created the Scanner object for taking inputs
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter the Unit Price and Quantity ");
		// created the two variables unitPrice and quantity
		double unitPrice= input.nextDouble();
		double quantity = input.nextDouble();
		// created  the totalPurchase and calculated 
		double totalPurchase= unitPrice * quantity;
		System.out.println("The total purchase price in INR " + totalPurchase + " if the quantity" + quantity+ " and unit price is INR"+ unitPrice);
		
    }
}

