package firstpackage;

import java.util.Scanner;

public class WearJacket {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please Enter temparatures : ");
        int temparatures = myScanner.nextInt();
        if(temparatures<= 30 ){
            System.out.println("Tepmaratures is :  "+temparatures+" Wear Jacket");

        }
        else{
            System.out.println("Tepmaratures is : "+temparatures+" Wear hat");
        }
    }
}
