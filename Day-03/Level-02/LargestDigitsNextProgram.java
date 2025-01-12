import java.util.Scanner;
   public class LargestDigitsNextProgram{
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize the array to store digits
        int maxDigit = 10; // Initial size of the digits array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits from the number and store them in the array
        while(number != 0) {
             if(index == maxDigit) {
			 // increment the maxDigit by 10
                maxDigit += 10; 
				
			// Creating an temporary array 
                int[] temp = new int[maxDigit]; 
			
			// Copy the previous elements in new array
                System.arraycopy(digits, 0, temp, 0, digits.length); 
                digits = temp; 
            }
            digits[index] = number % 10; 
            number /= 10; 
            index++;
        }
         // create variables to store the largest and second the largest digits
        int largest = 0; 
        int secondLargest = 0; 

        // calculate to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; 
                largest = digits[i]; 
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; 
            }
        }
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
     }
   }