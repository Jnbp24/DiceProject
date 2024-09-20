package opgave03;


public class Pigs
{
    private static int playerOneSum = 0;
    private static int playerTwoSum = 0;

    public static void main(String[] args)
    {
        System.out.println("Welcome to Pigs");
        System.out.println();
        printRules();
        System.out.println();
        System.out.println();
        playPigs();
    }
    public static void playPigs()
    {
        rollOneDie();

    }
    public static void printRules()
    {
        System.out.println("====================================================================================");
        System.out.println("Each player takes turns throwing the dice");
        System.out.println("The first player to reach 100 points wins");
        System.out.println("If a player rolls a dice and it shows 1, they lose all their points for that round");
        System.out.println("Each player can decide how long they want to keep throwing the dice");
        System.out.println("=====================================================================================");
    }
    public static void playerOne()
    {
        System.out.println("Player 1's turn");
        System.out.println("You currently have " + playerOneSum);
    }
    public static void playerTwo()
    {
        System.out.println("Player 2's turn");
        System.out.println("You currently have " + playerTwoSum);
    }
    public static int rollOneDie()
    {
        return (int) (Math.random() * 6 + 1);
    }
}
