import java.util.Scanner;

public class ContainChar {
    public static void main(String[] args) 
	{
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inpStr = kb.nextLine();

        System.out.print("Enter a character: ");
        char chosenChar = kb.next().charAt(0);

        int count = countChar(inpStr, chosenChar);

        System.out.print("The character '" + chosenChar + "' appears in the string '" + inpStr + "' " + count + " times.");
    }

    public static int countChar(String inpStr, char chosenChar) 
	{
        int count = 0;

        for (char c : inpStr.toCharArray()) 
		{
            if (c == chosenChar) 
			{
                count++;
            }
        }

        return count;
    }
}
