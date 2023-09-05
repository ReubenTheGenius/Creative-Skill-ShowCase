import java.util.Scanner;
public class Question1{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		double originalPrice, newPrice;
		
		System.out.print("Enter the original price of the Blouse: ");
		originalPrice = kb.nextDouble();
		
		//call statement
		newPrice = CalcPrice(originalPrice);
		
		System.out.print("The new price is: R"+ (newPrice+originalPrice));
		
	}

	//method header
	public static double CalcPrice(double originalPrice)
	{
		//method body
		final double discount = 0.25;
		double newPrice;
		
		newPrice=originalPrice*discount;
		return newPrice;
	}
}