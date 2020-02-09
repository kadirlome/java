package firstpackage;
import java.util.Scanner;
public class Keyboadinput {
    public static void main(String[] args){
        Scanner myKeyboard = new Scanner(System.in);
        int userInput;
        userInput = myKeyboard.nextInt();
        System.out.println(userInput);


        int firtsNumber;
        int secondNumber;
        int thirdNumber;
        Scanner myKeyboad = new Scanner(System.in);
        System.out.println("Enter the edges :");

        firtsNumber =myKeyboard.nextInt();
        secondNumber = myKeyboard.nextInt();
        thirdNumber =myKeyboard.nextInt();

        System.out.println(firtsNumber+secondNumber+thirdNumber);


        /////////////////////////////////////////////////////////
       // Scanner myKeyboard = new Scanner(System.in);
        //System.out.println("Please Enter Your Name :");
        //String myName= myKeyboard.nextLine();
       // System.out.println("Your name is :"+myName);


        //Scanner scanner=new Scanner(System.in);
        //System.out.println("Type a String");
        //String one;
        //one =scanner.nextLine();

        //System.out.println("Your String is :" +one);

    }
}
