import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String userString = kb.nextLine();
        
        int letCount = 0, digCount = 0, otherCount = 0;
        
        for (char c : userString.toCharArray()) 
		{
            if (Character.isLetter(c)) 
			{
                letCount++;
            } else if (Character.isDigit(c)) {
                digCount++;
            } else {
                otherCount++;
            }
        }
        
        System.out.print("Letter count: " + letCount+"\n" +"Digit count: " + digCount+"\n"+ "Other character count: " + otherCount+"\n");
        
    }
}
