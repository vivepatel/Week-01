public class Pendistribuation {
    public static void main(String[] args) {
		// created the Two variables totalPens and totalStudent
        int totalPens= 14;
        int totalStudent = 3;
		// calculated the  equallyDistributed  
        int equallyDistributed = totalPens/totalStudent;
		// calculated the remaining once
        int remianingPens = totalPens% totalStudent;
        System.out.println(" The Pen Per Student is "+ equallyDistributed+" and the remaining pen not distributed is " + remianingPens);

    }
}

