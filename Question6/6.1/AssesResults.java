import java.util.Scanner;

//6.1
public class AssesResults {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double obMarks;
		int tMarks;
        
        System.out.print("Enter the test mark: ");
        obMarks = kb.nextDouble();

        System.out.print("Enter the total test mark: ");
        tMarks = kb.nextInt();

        if (validateMarks(obMarks, tMarks)) {
            int percentage = calcPercentage((int) obMarks, (int) tMarks);
            String result = determineResults(percentage);
            displayValues(percentage, result);
        } else {
            System.out.println("Invalid marks entered.");
        }
    }
    
    public static boolean validateMarks(double obMarks, int tMarks) {
        return obMarks > 0 && obMarks <= tMarks && tMarks > 0 && tMarks <= 100;
    }
    
    public static int calcPercentage(int obMarks, int tMarks) {
        return (obMarks * 100) / tMarks;
    }
    
    public static String determineResults(int percentage) {
        if (percentage >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    
    public static void displayValues(int percentage, String result) {
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }
}
