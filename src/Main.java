import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain = "";

        do {
            int die1 = rnd.nextInt(1, 7);
            int die2 = rnd.nextInt(1, 7);


            final int firstSum = die1 + die2;
            System.out.printf("%d + %d = %d %n", die1, die2, firstSum);

            if (firstSum == 7 || firstSum == 11)
            {
                System.out.println("Congratulations, you won!");
                return;
            }
            if (firstSum == 2 || firstSum == 3 || firstSum == 12)
            {
                System.out.println("You lost!");
                return;
            }

            int newSum = 0;
            while (newSum != firstSum && newSum != 7)
            {
                die1 = rnd.nextInt(1, 7);
                die2 = rnd.nextInt(1, 7);
                newSum = die1 + die2;
                System.out.printf("%d + %d = %d %n", die1, die2, newSum);
            }

            if (newSum == firstSum)
            {
                System.out.println("Congratulations, you won!");
            }
            else
            {
                System.out.println("You lost!");
            }
            System.out.println();
            System.out.println("Do you want to play again? [Y/N]: ");
            if (in.hasNext())
            {
                playAgain = in.next();
                in.nextLine();
            }
            }
        while (playAgain.equalsIgnoreCase("Y"));
    }
}
