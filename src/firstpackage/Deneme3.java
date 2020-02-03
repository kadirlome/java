package firstpackage;
import java.lang.reflect.WildcardType;
import java.util.Scanner;
public class Deneme3 {
    public static void main(String[] args){

        Scanner mytesk = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String Name;
        Name = mytesk.nextLine();
        System.out.println("Please Enter Your Age : ");
        int Age;
        Age= mytesk.nextInt();
        System.out.println("Please Enter your Wight: ");
        float Weight;
        Weight=mytesk.nextFloat();
        System.out.println("Please Enter Your Hair Color: ");
        String Hair;
        Hair=mytesk.next();
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Weight);
        System.out.println(Hair);



    }

}
