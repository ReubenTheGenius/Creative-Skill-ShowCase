import java.util.Scanner;

public class MaritalStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Marital Status Codes:");
        System.out.println("S/s - Single");
        System.out.println("M/m - Married");
        System.out.println("D/d - Divorced");
        System.out.println("C/c - Civil Partnership");

        System.out.print("Enter your marital status code: ");
        char statusCode = scanner.next().toLowerCase().charAt(0);
		
		
		
        String sDescription;
        switch (statusCode) {
            case 's':
                sDescription = "Single";
                break;
            case 'm':
                sDescription = "Married";
                break;
            case 'd':
                sDescription = "Divorced";
                break;
            case 'c':
                sDescription = "Civil Partnership";
                break;
            default:
                sDescription = "Invalid marital status code";
        }

        System.out.println("Your marital status is: " + sDescription);
    }
}
