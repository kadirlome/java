package firstpackage;
import java.util.Scanner;
public class CalculateJobs {
    public static void main(String[] args){
        Scanner newScanner= new Scanner(System.in);
        System.out.println("Please Enter your Age : ");
        int Age = newScanner.nextInt();
        System.out.println("Please Enter your JavaPoint : ");
        double JP =newScanner.nextInt();
        if ((Age>20) && (Age<30) && ( JP>=80) ){
            System.out.println(Age*1.5+JP*4.5);

        }
        else if ((Age>20) && (Age<30) && (JP<80)){
            System.out.println(Age*1.5*+JP*3.5);
        }
        else if ((Age>31) && (JP>=80)){
            System.out.println(Age*1.1+JP*4.5);

        }
        else if ((Age>31) && (JP<80)){
            System.out.println(Age*1.1+JP*3.5);

        }
        else
            System.out.println("Please Enter a valid age or java score ");


    }
}
