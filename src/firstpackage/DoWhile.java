package firstpackage;

public class DoWhile {
    public static void main(String[] args){
        int counter=10;
        do {
            System.out.println("Counter : " +counter);
            counter++;
        }
        while (counter<10);
        System.out.println("With  while loop");
        while (counter<10){
            System.out.println(counter);
            counter++;
        }
    }
}
