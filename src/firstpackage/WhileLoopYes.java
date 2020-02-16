package firstpackage;
import java.util.Scanner;
public class WhileLoopYes {
    public static void main(System[]args){
        Scanner newScanner=new Scanner(System.in);
        String answer="";
        while (!answer.equalsIgnoreCase("y")){
            System.out.println("java is fun (y/n) : ");
            answer=newScanner.next();
        }
        System.out.println("ı knew you like java ");


    }
}
