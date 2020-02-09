package firstpackage;
import java.util.Scanner;
public class SciencesSkills {
    public static void main(String[] args){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter your skills set (Java/SQL/Cloud): ");

        String skills =newScanner.next();

        if (skills.equalsIgnoreCase("java")){
            System.out.println("Your score : ");
            int score=newScanner.nextInt();
        }
        else if (skills.equalsIgnoreCase("SQL")){
            System.out.println("SQL HacScore : ");
            int HacScore=newScanner.nextInt();

        }
        else if (skills.equalsIgnoreCase("cloud")){
            System.out.println("which certificated you have : ");
            String certifica=newScanner.next();
        }
        else {
            System.out.println("please Only Java/SQL/Cloud ");
        }
    }
}
