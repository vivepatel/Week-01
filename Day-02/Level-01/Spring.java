public class Spring {
    public static void main(String[] args) {
        if(args.length != 2)
        {
            System.out.println("Enter the Two Inputs");
        }
		// here we are using the Wrapper class to take the Input from the command line
        int month = Integer.parseInt(args[0]);
        int day   = Integer.parseInt(args[1]);

        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        }
        else
        {
            System.out.println(" It's not a Spring Season");
        }

    }
}
