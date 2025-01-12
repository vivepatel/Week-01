public class CalculateProfit {
       public static void main (String[] args){
		// created the two variables costPrice and sellingPrice
	     int costPrice = 129;
		 int sellingPrice = 191;
		 // created  variable and calculated the Profit 
		 int Profit = sellingPrice-costPrice;
		 // created variable profitPercentage and  calculated
		 double profitPercentage = (double)Profit/(double) costPrice*100;
		 System.out.println(" The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice  + " \n The Profit is INR  " +  Profit + 
		 
		  " and the Profit Percentage is " + profitPercentage );
	   }
}