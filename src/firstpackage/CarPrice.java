package firstpackage;
import java.util.Scanner;
public class CarPrice {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int MSRP=20000;
        MSRP = scanner.nextInt();
        int discount = scanner.nextInt();
        int months = scanner.nextInt();
        double monthlyPayment = (MSRP*((float)(100-discount)/100))/months;
        System.out.println("Monthly Payment is : "+monthlyPayment);

    }
}
