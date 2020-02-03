package firstpackage;

public class Deneme2 {
        public static void main(String[] args){

            String toFormat="Java is Fun";
            System.out.format("Do you think %s",toFormat);
            double percentage =78.98;

            System.out.println();
            System.out.printf("Yes %%%f of the people thinks it is fun",percentage);
            System.out.println();
            System.out.printf("Yes %%%.2f of the people thinks it is fun",percentage);
        }
}
