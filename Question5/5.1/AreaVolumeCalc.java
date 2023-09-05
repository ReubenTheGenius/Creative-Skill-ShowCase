import java.util.Scanner;

public class AreaVolumeCalc
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		double radi, height, area, volume;

        System.out.print("Enter the height of the cylinder: ");
        height = scanner.nextDouble();

        System.out.print("Enter the radius of the base of the cylinder: ");
        radi = scanner.nextDouble();

        volume = calcVolume(radi, height);
        area = calcArea(radi, height);

        display(height, radi, volume, area);
    }
	
	public static double calcVolume(double radi, double height) 
	{
    return Math.PI * Math.pow(radi, 2) * height;
	}
	
	public static double calcArea(double radi, double height) 
	{
    return (2 * Math.PI) * Math.pow(radi, 2)* height + 2* Math.PI * Math.pow(radi,2);
	}
	
	public static void display(double height, double radi, double volume, double area) 
	{
    System.out.println("Cylinder Properties:");
    System.out.println("Height: " + height);
    System.out.println("Radius: " + radi);
    System.out.println("Volume: " + volume);
    System.out.println("Surface Area: " + area);
	}

}