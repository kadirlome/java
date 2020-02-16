package firstpackage;

public class DoWhileDate {
    public static void main(String[] args){
        for (int  month=1; month<12 ; month++){
            System.out.println("Month"+month+"\n_____________");
            for (int day=1 ; day<=30; day++){
                System.out.println(month+"/"+day+"/"+"2020");

            }
            System.out.println("----------------");
        }
    }
}
