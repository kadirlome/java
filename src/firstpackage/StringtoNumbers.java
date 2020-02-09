package firstpackage;
import java.util.Scanner;
public class StringtoNumbers {
    public static void main (String[] args){
        Scanner newScaner=new Scanner(System.in);
        System.out.print("Please enter number as text (one-ten) : ");
        String Number=newScaner.next();
        switch (Number){
            case "one":
                System.out.println("1");
            break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
            default:
                System.out.println("only one-four");
        }
    }
}
