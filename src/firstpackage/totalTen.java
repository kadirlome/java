package firstpackage;
import java.util.Scanner;
public class totalTen {
    public static void main (String[] args){
        Scanner newScanner=new Scanner(System.in);
        System.out.println("Please Enter the Note: ");
        int note=newScanner.nextInt();
        if ((note>0) && (note<45)){
            System.out.println("Geçmez");
        }
        else if (note<100){
            System.out.println("Geçer");
        }
    }
}
