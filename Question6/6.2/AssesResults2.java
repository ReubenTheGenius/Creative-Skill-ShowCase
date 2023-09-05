import java.util.Scanner;

public class AssesResults2 {
	
    static final int TOTAL_TEST_MARK = 80;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int passedC= 0;
        int failedC = 0;
		double testMark;
		
        while (true) 
		{
            System.out.print("Enter the test mark (or -1 to exit): ");
            testMark = kb.nextDouble();

            if (testMark == -1) 
			{
                break;
            }

            if (validateMark(testMark)) 
			{
                int percentage = calcPercentage(testMark);
                boolean pass = determineResults(percentage);
                displayValues(percentage, pass ? "Pass" : "Fail");

                if (pass) {
                    passedC++;
                } else {
                    failedC++;
                }
            } 
			else 
			{
                System.out.println("Invalid mark entered.");
            }
        }

        displaySummary(passedC + failedC, passedC, failedC);
    }

    public static boolean validateMark(double testMark) 
	{
        return testMark > 0 && testMark <= TOTAL_TEST_MARK;
    }

    public static int calcPercentage(double testMark) 
	{
        return (int) ((testMark / TOTAL_TEST_MARK) * 100);
    }

    public static boolean determineResults(int percentage) 
	{
        return percentage >= 50;
    }

    public static void displayValues(int percentage, String result) 
	{
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }

    public static void displaySummary(int totalStudents, int passedC, int failedC) 
	{
        System.out.println("Total students: " + totalStudents);
        System.out.println("Passed: " + passedC);
        System.out.println("Failed: " + failedC);
    }
}
