package firstpackage;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please Enter a Year : ");
        int year =myScanner.nextInt();
        if(year>2019){
            System.out.println("After Millenium");
        }
        else {
            System.out.println("Before Millenium");
        }

    }
}
