package firstpackage;
import java.util.Scanner;
public class DifShapes {
    public static void main(String[] args){
        Scanner newScanner=new Scanner(System.in);
        System.out.println("Please Enter C or R or T : ");
        String Shapes =newScanner.nextLine();
        if (Shapes.compareToIgnoreCase("c")==0){
            System.out.println("Please Enter the radius :");
            double radius = newScanner.nextDouble();
            System.out.println(2*3.14*radius);
        }
        else if (Shapes.compareToIgnoreCase("r")==0){
            System.out.println("Please enter width");
            int widht=newScanner.nextInt();
            System.out.println("Please Enter the Height : ");
            int Height = newScanner.nextInt();
            System.out.println(2*(widht+Height));
        }
        else if (Shapes.compareToIgnoreCase("t")==0){
            System.out.println("Please Enter the edge1 :");
            int egde1=newScanner.nextInt();
            System.out.println("Please Enter the edge2 :");
            int edge2=newScanner.nextInt();
            System.out.println("Please Enter the edge3 :");
            int edge3=newScanner.nextInt();
            System.out.println(egde1*edge2/edge3);
        }
        else {
            System.out.println("Please C,R or T");
        }
    }
}

