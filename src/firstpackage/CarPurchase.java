package firstpackage;
import java.util.Scanner;
public class CarPurchase {
    public static void main(String[] args){
        Scanner newScaner=new Scanner(System.in);
        System.out.println("Please Enter the  Car's Model (X/Y) : ");
        String model=newScaner.next();
        int MSPR=0;
        if (model.equals("X")){
            MSPR=30000;
            System.out.print("Do you want body package : (Y/N) ");
            String body =newScaner.next();
            if (body.equalsIgnoreCase("y")){
                MSPR = MSPR+5000;

            }
            System.out.println("Do you want Sound package : (Y/N) ");
            String sound=newScaner.next();
            if (sound.equals("y")){
                MSPR +=3000;

            }

        }
        else if (model.equals("Y")){
            MSPR=35000;
            System.out.println("Do you want to Ent. package ? : (Y/N)");
            String ent=newScaner.next();
            if (ent.equalsIgnoreCase("y")){
                MSPR +=8000;

                System.out.print("Sfety Package : (Y/N) ");
                String safety=newScaner.next();
                if (safety.equalsIgnoreCase("y")){
                    MSPR +=4000;

                }
            }

        }
        else {
            System.out.println("Sorry have only X and Y ");
        }
        if (MSPR!=0){
            System.out.println("$"+MSPR);
        }

    }
}
