package firstpackage;
import java.util.Scanner;
public class LetterGrades {
    public static void main(String[] args){
        Scanner newScanner=new Scanner(System.in);
        System.out.println("Please enter degre : ");
        int grade=newScanner.nextInt();

        if (grade<0){
            System.out.println("Grade can not be less than 0 ! ");
        }
        else if (grade<50){
            System.out.println("Fail");
        }
        else if (grade<60){
            System.out.println("D");
        }
        else if (grade<70){
            System.out.println("C");
        }
        else if (grade<80){
            System.out.println("B");
        }
        else if (grade<90){
            System.out.println("A");
        }
        else if (grade<99){
            System.out.println("A+");
        }

    }
}
