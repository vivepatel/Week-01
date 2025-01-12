public class PossibleHandshake{
    public static void main(String[] args) {
        // we have created the Scanner object for taking inputs
        Scanner input= new Scanner(System.in);
        System.out.println( " Enter the Number of  Students");
		// created a variable numberOfStudents
		double numberOfStudents = input.nextDouble();
		// created the variable possibleHandshakes and calculated 
		double possibleHandshakes= (numberOfStudents * (numberOfStudents-1)) /2;
		System.out.println("The Number of Possible handshakes are " + possibleHandshakes );
		
    }
}

