package firstpackage;
import java.util.Scanner;
public class switchCase1 {
    public static void main(String[]args){
        Scanner newScanner=new Scanner(System.in);
        System.out.println("Please Enter the Number : ");
        int number=newScanner.nextInt();

        switch (number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Please Enter the number between 1 and 5 ");
        }

    }
}
