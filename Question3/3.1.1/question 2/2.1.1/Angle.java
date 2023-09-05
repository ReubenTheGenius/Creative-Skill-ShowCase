import java.util.Scanner;
public class Angle{
    public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		
		String response;
        double degrees;
		
		System.out.println("Your angle in degrees: ");
		degrees = kb.nextDouble();
		
		response = deterAngle(degrees);
		
		System.out.println(response);
    }

    public static String deterAngle(double degrees) {
        if (degrees == 90.0) 
		{
            return "The angle is a right angle";
        } 
		else 
		{
            return "The angle is not a right angle";
        }
    }
}
