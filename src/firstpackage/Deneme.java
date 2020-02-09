package firstpackage;
import java.util.Scanner;
public class Deneme {
    public static void main(String[] args){
       Scanner newScanner= new Scanner(System.in);
       System.out.print(" Size ? (S/M/L : ");
       String size=newScanner.next();
       System.out.print("Member ? (Y/N)");
       String member =newScanner.next();
       String Discount =newScanner.nextLine();


       if ((size.equals("S")) && member.compareToIgnoreCase("Y")==0){
           System.out.println("$9.99");
       }
       else if (size.equals("M")){
           System.out.println("$10.99");
       }
       else if (size.compareToIgnoreCase("L")==0){
           System.out.println("$11.99");
       }
       else {
           System.out.println("Sorry only S/M/L");
       }



    }



    }

