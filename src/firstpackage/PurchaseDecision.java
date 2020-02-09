package firstpackage;
import java.util.Scanner;
public class PurchaseDecision {
    public static void main(String[] args){
        Scanner newScanner=new Scanner(System.in);
        System.out.print("Please Enter the color (red/blue) : ");
        String color=newScanner.nextLine();
        System.out.print("Please enter tag price :");
        double priceTag=newScanner.nextDouble();
        System.out.print("Please Enter discount percentage (0.1-0.9 : ");
        float discount=newScanner.nextFloat();

        int colorValue;
        if (color.compareToIgnoreCase("red")==0){
            colorValue=20;

        } else if (color.compareToIgnoreCase("blue") == 0) {
            colorValue=10;
        }
        else {
            System.out.println("Red or Blue only");

        }
        int productionPoint = (int) (priceTag*discount);
    }
}
