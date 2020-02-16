package firstpackage;
import java.util.Scanner;
public class FiveMultiplesOfFive {
    public static void main(String[]args){
        Scanner newScanner=new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int start;
        start=newScanner.nextInt();
        System.out.println("Please enter end number : ");
        int end =newScanner.nextInt();

        if (start<end){
            for (int i=start; i<end ; i=i+5){
                System.out.println(i);
            }
        }
        else {
            for (int i=50 ; i>=10; i=i-5){
                System.out.println(i);
            }

        }
    }
}
