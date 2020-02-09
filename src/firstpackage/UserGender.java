package firstpackage;
import java.util.Scanner;
public class UserGender {
    public static void main(String[] args){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please Enter Your Gender : ");
        String Gen =newScanner.next();
        if (Gen.equals("M")){
            System.out.println("Male");
        }
        else if (Gen.equals("F")) {
            System.out.println("Famele");
        }
        else
            System.out.println("Please Enter M or F ");

    }
}
