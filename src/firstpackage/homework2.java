package firstpackage;
import java.text.BreakIterator;
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        int choice = 1;
        System.out.format("\t Kadir's Grocery  \n");
        System.out.println("  123 : $2.49  ");
        System.out.println("  124 : $4.79  ");
        System.out.println("  125 : $1.65  ");
        System.out.println("  126 : $7.88  ");
        System.out.println("  127 : $0.99  \n\n\n");

        float item1= 2.49f;
        float item2= 4.79f;
        float item3= 1.65f;
        float item4= 7.88f;
        float item5= 0.99f;

        int quan1 = 1;
        int quan2 = 2;
        int Total = 3;

        if (choice == 0);

        System.out.println("How many do you want?");
        //int qty = input.nextInt();;


        System.out.format("\t Item id \t Quantity \t Price  \n");
        System.out.format("\t ..............................\n");

        System.out.format("\t 123 \t:\t\t" +(int)quan1+"\t \t $%.2f \n",item1);
        System.out.format("\t 125 \t:\t\t" +(int)quan2+"\t \t $%.2f \n",item3);

    }
}
