import java.util.Scanner;

public class VoteCheckArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		// created a array name Student  
        int Student [] = new int[10];
		// Promt  for the user 
        System.out.println(" Enter the Age of the 10 Student ");
		// Taking the input for Array student 
        for ( int i=0;i<Student.length;i++)
        {
            Student[i] = input.nextInt();
        }
		// checking if the age is vaild for voting or not and is vaild or not
        for (int i= 0 ; i< Student.length; i++ )
        {
			// checking if the age is vaild 
            if(Student[i]<0)
            {
                System.out.println(" An invalid Age");
            }
			// checking if the student  is able to vote or note 
            else if (Student[i]>=18)
            {
                System.out.println(" The Student with the age "+ Student[i] + " can vote");
            }
        
            else
            {
                System.out.println(" The student  with the age "+ Student[i] + " can not vote");
            }
        }
    }
}
