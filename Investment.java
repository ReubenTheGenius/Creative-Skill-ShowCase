import java.util.Scanner;
public class Investment
{
	public static double CalcInt(double Monthly, int Years)
	{
		Scanner k = new Scanner(System.in);
		
		double totalamount = 0.0;
		double EarnYear;
		System.out.println("Enter the amount of years for Investment: ");
		Years = k.nextInt();
		System.out.println("Year \t Amount");
		int CurYear = 2023;
		int count =1;
		do{
		EarnYear = Monthly*12;
		System.out.print(CurYear + "\t" + EarnYear );
		
		double increase = Monthly*0.1;
		
		Monthly = Monthly + increase;
		CurYear++ ;
		
		
		} while(Years<= count++);
		
		return EarnYear;
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		double EarnYear = 0;
		int CurYear = 0;
		int count=1;
		System.out.println("Enter the Monthly Investment amount: ");
		double Monthly = kb.nextDouble();
		
		
		
		double tInterest = CalcInt(EarnYear,CurYear);
		
	}
}