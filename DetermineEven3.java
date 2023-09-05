import java.util.Scanner;

public class DetermineEven3 {
    public static void main(String[] args) 
	{
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = kb.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = kb.nextInt();

        boolean Num1Ev = findEven(num1);
        boolean Num2Ev = findEven(num2);

        displayResults(num1, num2, Num1Ev, Num2Ev);
    }

    public static boolean findEven(int num1, int num2) 
	{
        return number % 2 == 0;
    }

    public static void displayResults(int num1, int num2, boolean Num1Ev, boolean Num2Ev) 
	{
        System.out.println(num1 + " is even: " + Num1Ev);
        System.out.println(num2 + " is even: " + Num2Ev);
    }
}
