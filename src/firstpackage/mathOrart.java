package firstpackage;
import java.util.Scanner;
public class mathOrart {
    public static void main(String[] args){
        Scanner newScanner=new Scanner(System.in);
        System.out.print("Please select your choice : (Math / Art )");
        String choice=newScanner.next();
        if (choice.equalsIgnoreCase("math")){
            System.out.println("tutor (y/n) : ");
            String tutor=newScanner.next();
            if (tutor.equalsIgnoreCase("y")){
                System.out.println("ok");
            }
            else if (tutor.equalsIgnoreCase("n")){
                System.out.println("Study your self");
            }
            else {
                System.out.println("y or n please !! ");
            }
        }
        else if (choice.equalsIgnoreCase("art")){
            System.out.println("Nice Choice");
        }
        else {
            System.out.println("Only math or art ");
        }
    }
}
