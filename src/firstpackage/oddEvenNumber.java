package firstpackage;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class oddEvenNumber {
    public static void main(String[] args){
        Scanner newScanner=new Scanner(System.in);
        System.out.println("Please Enter the Number : ");
        int number=newScanner.nextInt();
        if (number%2==1){
            System.out.println("The Number is odd");
        }
        else {
            System.out.println("The Number is Even");
        }
    }
}
