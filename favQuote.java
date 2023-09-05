import java.util.Scanner;

public class favQuote 
{
    public static void main(String[] args) 
	{
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your favorite quote: ");
        String quote = kb.nextLine();

        int vowelC = countVowels(quote);
        int spaceC = countSpaces(quote);

        System.out.println("The number of spaces is " + spaceC + " and there are " + vowelC + " vowels.");
    }

    public static int countVowels(String text) {
        int count = 0;
        String lowercaseText = text.toLowerCase(); // Convert to lowercase for case-insensitive counting

        for (int i = 0; i < lowercaseText.length(); i++) 
		{
            char ch = lowercaseText.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
                count++;
            }
        }

        return count;
    }

    public static int countSpaces(String text) 
	{
        int count = 0;

        for (int i = 0; i < text.length(); i++)
		{
            if (text.charAt(i) == ' ') 
			{
                count++;
            }
        }

        return count;
    }
}
