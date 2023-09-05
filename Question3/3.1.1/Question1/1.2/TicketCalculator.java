import java.util.Scanner;
public class TicketCalculator{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		int numTick;
		
		System.out.print("how many tickets would you like to purchase: ");
		numTick = kb.nextInt();
		
		//call statement
		double TotalPrice = calcTotal(numTick);
		
		System.out.print("The new price is: R"+ TotalPrice);
		
	}

	//method header
	public static double calcTotal(int numTick)
	{
		double tickPrice = 0;
		//method body
		if(numTick<5 && numTick >=1 )
		{
			 tickPrice = 125.00;
		}
		if(numTick<25 && numTick >=5)
		{
			 tickPrice = 100.00;
		}
		if(numTick >=25)
		{
			tickPrice= 90.00;
		}
		
		double TotalPrice= tickPrice*numTick; 
		return TotalPrice;
	}
}