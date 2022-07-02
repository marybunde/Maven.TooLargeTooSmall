import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
    //ask player to guess a number
    //User types in a number(user input)
    //computer tells player if their number is too large, too small or correct guess
public class TooLargeTooSmall {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int RanNum = (int) (Math.random() * 10 + 1);

        //int guess = userInput.nextInt();


        System.out.println("Pick a number from 1-10!");

        int num = ' ';

        while (num != RanNum) {
            num = userInput.nextInt();
            if (num < RanNum) {
                System.out.println("Too Small! Try again!");
            } else if (num > RanNum) {
                System.out.println("Too Big! Try again!");
            } else if (num == RanNum) {
                System.out.println("Correct guess!");
                break;

            }


        }
    }
}









