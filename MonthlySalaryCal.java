import java.util.Scanner;
import java.text.DecimalFormat;

public class MonthlySalaryCal 
{
    public static void main(String[] args) 
	{
        Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.##");
		double rAnnualAmountDue;
		
        System.out.print("Enter the annual amount due: ");
        String sAnnualAmountDue = kb.nextLine();
		rAnnualAmountDue = new Double(sAnnualAmountDue);
		
		if(rAnnualAmountDue>= 1)
		{
            

            double monthlySalary = rAnnualAmountDue / 12.0;

            System.out.println("Your monthly salary is: " + df.format(monthlySalary));
        } 
		
		else 
		{
            System.out.println("Invalid input. Please enter a valid number for the annual amount due.");
        }
    }
}
