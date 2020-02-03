package firstpackage;
import java.lang.reflect.WildcardType;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args){
        Scanner scannerMine = new Scanner(System.in);
        System.out.print("Please enter the width:");
        int width;
        width = scannerMine.nextInt();
        int height;
        System.out.print("Please enter the height:");
        height = scannerMine.nextInt();
        System.out.format("The area of the rectangle with %d and %d is %d",width,height,width*height);
    }
}
