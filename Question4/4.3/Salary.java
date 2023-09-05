import java.util.Scanner;

public class Salary{
    public static void main(String[] args) 
	{
        Scanner kb = new Scanner(System.in);
		double aSalary, mSalary;
        
		System.out.print("Enter the annual salary: ");
        aSalary = kb.nextDouble();

        mSalary = calcMonthly(aSalary);

        display(mSalary);
    }

    public static double calcMonthly(double aSalary) 
	{
        return aSalary / 12.00;
    }

    
	public static void display(double mSalary) 
	{
        System.out.println("Monthly salary: R" + mSalary);
    }
}
