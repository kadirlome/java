package firstpackage;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner myScaner = new Scanner(System.in);
        int A = 10;
        int B = 15;
        int C = 20;
        if ((A+B>C) && (A+C>B) && (B+C>A)) {
            System.out.println("Can from Triangle");
        }
        else {
            System.out.println("Can not From Triangle");
        }
    }
}