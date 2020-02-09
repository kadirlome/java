package firstpackage;
import java.util.Scanner;
public class tryExercise {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please Enter the C,R or T : ");
        String Shapes = newScanner.next();
        if (Shapes.compareToIgnoreCase("c") == 0) {
            System.out.println("Please Enter the radius : ");
            double radius = newScanner.nextDouble();
            System.out.println(2 * 3.14 * radius);
        }
        else if (Shapes.compareToIgnoreCase("r")==0){
            System.out.println("Please Enter the height : ");
            double height = newScanner.nextDouble();
            System.out.println("Please Enter the width : ");
            double width = newScanner.nextDouble();
            System.out.println(2*(height*width));
        }
        else if (Shapes.compareToIgnoreCase("t")==0){
            System.out.println("Please Enter edge1,edge2 and edge3 :");
            int edge1=newScanner.nextInt();
            int edge2=newScanner.nextInt();
            int edge3=newScanner.nextInt();
            System.out.println(edge1+edge2+edge3);
        }
        else
            System.out.println("Please just Enter the c,r or t");

    }
}
