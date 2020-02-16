package firstpackage;

public class WhileDate {
    public static void main(String[]args) {
        int month = 1;

        while (month <= 12) {
            int day = 1;
            while (day <= 30) {
                System.out.println(month + "/" + day + "/" + "2020");
                day++;

            }
            month++;
        }
    }
}
