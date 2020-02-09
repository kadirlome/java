package firstpackage;
import java.util.Scanner;
public class oddnumber {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please Enter Number : ");
        int number = myScanner.nextInt();
        if(number %2 ==0 ){
            System.out.println(number+"is even number");

        }
        else{
            System.out.println(number +"is odd Number");
        }
    }
}

