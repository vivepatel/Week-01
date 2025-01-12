public class Coursefees {
    public static void main(String[] args) {
		//created the variables courseFee and discountAmount
        int courseFee = 125000;
		 // The University has offered 10% discount on the Coursefeee
        int Discount= 10;
		// calculating the discount
        double discountAmount = (double) courseFee *  (double)Discount/ (double)100; 
		 // Final fees is after the Discount
        double finalFee= courseFee-discountAmount;  
        System.out.println(" The discount amount is INR "+ discountAmount + " and final discounted fee is INR " + finalFee );

    }
}