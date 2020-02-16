package firstpackage;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[]args){
        int numberToGuess = 23;

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Guess the Number : ");
        int userGuess =newScanner.nextInt();


        if (userGuess>numberToGuess){
            System.out.println("Number is larger ");
        }
        else if (userGuess<numberToGuess){
            System.out.println("Number is Smaller ");

        }
        else {
            System.out.println("Congrats........");
        }
    }
}
