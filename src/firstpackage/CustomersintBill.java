package firstpackage;
import java.util.Scanner;
public class CustomersintBill {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Are you subscribed (Y/N) : ");
        String subs = newScanner.next();
        if (subs.equalsIgnoreCase("y")) {
            System.out.println("Please Enter Usage : ");
            int usage = newScanner.nextInt();
            if (usage > 0 && usage <= 100) {
                System.out.println("10 USD");
            } else if (usage > 100) {
                System.out.println("40 USD");
            }
        }
        else {
            System.out.println("Please visit Subscripton page ");
        }

    }
}