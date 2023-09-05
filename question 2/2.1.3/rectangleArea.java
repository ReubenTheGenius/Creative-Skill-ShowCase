import java.util.Scanner;

public class rectangleArea
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		double length, width, area;
		
		System.out.print("Please enter the Length of the Rectangle: ");
		length = kb.nextDouble();
		
		System.out.print("Please enter the width of the Rectangle: ");
		width = kb.nextDouble();
		
		area = calcPeri(length, width);
		System.out.print("Perimeter of Rectangle is: " + area);
		
	}
	public static double calcPeri(double length, double width)
	{
		return 2*length + 2*width;
	}
}