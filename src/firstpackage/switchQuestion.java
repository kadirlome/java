package firstpackage;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class switchQuestion {
    public static void main(String[]args){
        Scanner newScaner=new Scanner(System.in);
        System.out.println("Please enter months");

        int months=newScaner.nextInt();

        switch (months){
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
            default:
                System.out.println("Which months ? ");
        }

    }
}
