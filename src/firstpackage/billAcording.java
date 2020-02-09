package firstpackage;
import java.util.Scanner;
public class billAcording {

    public static void main(String[] args){
        Scanner  newScanner = new Scanner(System.in);
        System.out.println("Please Enter Consumption : ");
        int cons = newScanner.nextInt();

        if (cons<501){
            System.out.format("consumption : $"+0.3*cons);
        }
        else if ((cons>501) && (cons<1001)){
            System.out.format("Consumption  : $"+0.4*cons);

        }
        else if ((cons>1001) && (cons<2001)){
            System.out.format("Consumption  : $"+0.5*cons);

        }
        else
            System.out.format("Consumption  : $"+0.6*cons);

    }
}
