package firstpackage;
import java.util.Scanner;
public class GroceryStore {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int choice = 1;
        double subtotal = 0;
        double price = 0;
        double discount = 0;

        do {
            System.out.println("Steve's Groceries");
            System.out.println("\n");
            System.out.println("1.  Apples         $ 1.99 per lbs");
            System.out.println("2.  Oranges         $ 2.19 per lbs");
            System.out.println("3.  Chocolate Bar     $ 0.99 each");
            System.out.println("4.  Ice Cream         $ 3.49 a carton");
            System.out.println("5.  Watermelon         $ 0.88 per lbs");
            System.out.println("6.  Cottage Cheese     $ 1.29 package");
            System.out.println("7.  Mushrooms         $ 1.59 per lbs");
            System.out.println("8.  NY Strip Steak     $ 7.99 per lbs");
            System.out.println("9.  Pizza         $ 4.99 each");
            System.out.println("10. Strawberries     $ 2.49 each");
            System.out.println("");
            System.out.println("0. Quit");
            System.out.println("");

            System.out.println("Your subtotal is $ " +(int)(subtotal * 100) / 100.0);
            System.out.println("What would you like to purchase?  \nIf you have completed your checkout, enter 0.");
            choice = input.nextInt();

            if (choice == 0)
                break;

            System.out.println("How many do you want?");
            int qty = input.nextInt();

            switch (choice)    {
                case 1:
                    price = 1.99;
                    break;
                case 2:
                    price = 2.19;
                    break;
                case 3:
                    price = 0.99;
                    break;
                case 4:
                    price = 3.49;
                    break;
                case 5:
                    price = 0.88;
                    break;
                case 6:
                    price = 1.29;
                    break;
                case 7:
                    price = 1.59;
                    break;
                case 8:
                    price = 7.99;
                    break;
                case 9:
                    price = 4.99;
                    break;
                case 10:
                    price = 2.49;
            }
            subtotal = subtotal + (qty * price);
        }

        while(choice > 0);

        System.out.println("Are you a member of the A+ discount club? (Y/N)");
        String discountInput = input.next();
        char discountClub = discountInput.charAt(0);

        if (discountClub == 'y' || discountClub == 'Y'){
            discount = subtotal * .20;
        }

        double tax = ((subtotal - discount) * 0.075);
        double finalCost = subtotal - discount + tax;

        System.out.println("The subtotal is $ " + (int)(subtotal * 100) / 100.0);
        System.out.println("A+ Member's Discount $ " + (int) (discount * 100) / 100.0);
        System.out.println("Sales Tax $ " + (int)(tax* 100) / 100.0);
        System.out.println("Final price $ " + (int)(finalCost * 100) / 100.0);
    }
}

