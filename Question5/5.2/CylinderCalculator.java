import java.util.Scanner;

public class CylinderCalculator 
{
    public static void main(String[] args) 
	{
        Scanner kb = new Scanner(System.in);
        char opt;
        double height, radi;

        System.out.print("Enter the height of the cylinder: ");
        height = kb.nextDouble();

        System.out.print("Enter the radius of the base of the cylinder: ");
        radi = kb.nextDouble();
		
		
		do
		{
            System.out.print("Enter calculation option (V/v for Volume, A/a for Area, N/n to exit): ");
            String optAns = kb.next().toUpperCase();

            opt = optAns.charAt(0);

            double result = 0;

            switch (opt) 
			{
                case 'V':
                    result = calcVolume(radi, height);
                    displayValues(opt, radi, height, result);
                    break;
                case 'A':
                    result = calcArea(radi, height);
                    displayValues(opt, radi, height, result);
                    break;
                case 'N':
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option selected.");
			}
        } 
		while (true);
    }

    public static double calcVolume(double radi, double height) 
	{
        return Math.PI * Math.pow(radi, 2) * height;
    }

    public static double calcArea(double radi, double height)
	{
        return 2 * Math.PI * Math.pow(radi, 2) + 2 * Math.PI * radi * height;
    }

    public static void displayValues(char opt, double radi, double height, double result)
	{

        if (opt == 'V') 
		{
            System.out.println("Volume of Cylinder with height "+height+" and radius "+radi+": " + result);
        }
		else if (opt == 'A') 
		{
            System.out.println("Surface Area of Cylinder with height "+ height +" and radius " + radi + ": " + result);
        }

        System.out.println();
    }
}