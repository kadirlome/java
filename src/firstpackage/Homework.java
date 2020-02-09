package firstpackage;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args){


        float item1 = 2.49f;
        float item2 = 4.79f;
        float item3 = 1.65f;
        float item4 = 7.88f;
        float item5 = 0.99f;

        System.out.format("\t\t\t products \n");
        System.out.format("\t ..................\n");
        System.out.format("\t item1 \t: \t $%.1f \n",item1);
        System.out.format("\t item2 \t: \t $%.1f \n",item2);
        System.out.format("\t item3 \t: \t $%.1f \n",item3);
        System.out.format("\t item4 \t: \t $%.1f \n",item4);
        System.out.format("\t item5 \t: \t $%.1f \n",item5);

        Scanner myitem =new Scanner(System.in);
        int userInput;
        userInput = myitem.nextInt();
        System.out.print("Total : " +item1+item2+item3);

        System.out.print(userInput);
        System.out.println();


        //System.out.format("\t\t\t Receipt \n");
       // System.out.format("\t ..................\n");





    }
}
