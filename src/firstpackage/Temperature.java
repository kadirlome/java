package firstpackage;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Enter Temprature : ");
        int temp=myScanner.nextInt();
        if (temp<20){
            System.out.println("Winter ");


        }
        else if ((temp>21) && (temp<60)){
            System.out.println("Fall");

        }
        else if ((temp>41) && (temp<60)){
            System.out.println("Spring");
        }
        else
            System.out.println("Summer");




    }
}
