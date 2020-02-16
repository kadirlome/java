package firstpackage;

public class NumbersFrom100WhileLoop {
    public static void main(String[] args){
        double number =100;

        do {
            System.out.println(number);
            number -= 0.5;
        }
        while (number>=99.5);
        do {
            System.out.println(number);
            number-=1;

        }
        while (number<=99);
    }
}
