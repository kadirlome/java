package firstpackage;

public class HelloWorldFor2 {
    public static void main(String[] args){
        for (int i=0 ; i<1 ;i++){
            System.out.println("Hello ");
            for (int j=1; j<=3; j++){
                System.out.println("world");
            }
        }
        for (int i=1;i<=1;i++){
            for (int j=0 ; j<3; j++){
                System.out.println("hello ");
            }
            System.out.println("World");
        }
    }
}