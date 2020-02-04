package firstpackage;
import java.util.Scanner;
public class Task {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number  :");
        int number = scanner.nextInt();
        int remainder = number%2;
        if (remainder==1){
            System.out.print("odd");

        }
    }
}
