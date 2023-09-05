import java.util.Scanner;

public class DetermineFinalMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 20;
        
        System.out.println("Enter marks for " + numStudents + " students:");
        
        for (int i = 1; i <= numStudents; i++) {
            
            System.out.print("Enter test mark 1 for student "+i+": ");
            double testMark1 = scanner.nextDouble();
            
            System.out.print("Enter test mark 2 for student "+i+": ");
            double testMark2 = scanner.nextDouble();
            
            System.out.print("Enter test mark 3 for student "+i+": ");
            double testMark3 = scanner.nextDouble();
            
            System.out.print("Enter exam mark for student "+i+": ");
            double examMark = scanner.nextDouble();
            
            // Calculate the final mark
            double finalMark = (0.5 * examMark) + (0.5 * (testMark1 + testMark2 + testMark3))/3;
            
            // Consume the newline character left in the input buffer
            scanner.nextLine();
            
            System.out.println("Final mark for " + i + " is: " + finalMark);
        }
    }
}
