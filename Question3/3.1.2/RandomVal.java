import java.util.Random;

public class RandomVal{
    public static void main(String[] args) {
        Random random = new Random();
        int val1 = random.nextInt(350) + 1;
        int val2 = random.nextInt(350) + 1;
        int val3 = random.nextInt(350) + 1;

        int highVal = highNum(val1, val2, val3);
        int lowVal = lowNum(val1, val2, val3);

        displayRange(val1, val2, val3, highVal, lowVal);
		
		
	}

    public static int highNum(int val1, int val2, int val3) 
	{
        return Math.max(val1, Math.max(val2, val3));
    }

    public static int lowNum(int val1, int val2, int val3) 
	{
        return Math.min(val1, Math.min(val2, val3));
    }

    public static void displayRange(int val1, int val2, int val3, int highVal, int lowVal) 
	{
        System.out.println("Generated Values: " + val1 + ", " + val2 + ", " + val3);
        System.out.println("Highest Value: " + highVal);
        System.out.println("Lowest Value: " + lowVal);
    }
}
