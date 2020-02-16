package firstpackage;
import java.util.Scanner;
public class IandEndValues {
    public static void main(String[] args){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter starting point : ");
        int start=newScanner.nextInt();
        System.out.println("Enter end Point : ");
        int end = newScanner.nextInt();
        System.out.println("Enter what you want to print : ");
        String toPrint=newScanner.next();
        for (int i=start ; i<end ; ){
            System.out.println(toPrint);
        }
    }
}



