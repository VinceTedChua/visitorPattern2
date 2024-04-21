import java.util.Scanner;


//Vince Ted Matthew D. Chua
//April 21st, 2024
//Software Engineering II
//Professor Jeremias Esperanza
import java.util.Scanner;

public class FurnitureOffers {
    public static void main(String[] args) {
        FurnitureType chairs = new FurnitureType("Chairs");
        FurnitureType tables = new FurnitureType("Tables");
        FurnitureType sofas = new FurnitureType("Sofas");

        FurnitureShippingCost flashDeal = new FurnitureShippingCost();
        //we named the Furniture with promo to integrate it to the main method cycle inducing its idea
        Scanner sc = new Scanner(System.in);

        int pick;
        do {
            System.out.println("Welcome to IKEA:");
            System.out.println("1. Buy Chairs");
            System.out.println("2. Buy Tables");
            System.out.println("3. Buy Sofas");
            System.out.println("4. Display Name");
            System.out.println("5. Terminate Program");
            System.out.print("Please select what would you like to do: ");
            pick = sc.nextInt();

            //case offers

            switch (pick) {
                case 1:
                    chairs.accept(flashDeal);
                    break;
                case 2:
                    tables.accept(flashDeal);
                    break;
                case 3:
                    sofas.accept(flashDeal);
                    break;
                case 4:
                    displayName();
                    break;
                case 5:
                    end();
                    break;
                default:
                    System.out.println("Oops, you selected an incorrect number. Kindly try again.");
            }
        } while (pick != 5);
    }
    //nested within the outside vicinity of the program.
    public static void displayName() {
        System.out.println("Vince Chua");
        System.out.println("Software Engineering II Visitor Pattern");
        System.out.println("Created: April 21st, 2024");
    }
    public static void end() {
        System.out.println("Stopping...");
        System.out.println("Terminating...");
        System.out.println("Ended...");
        System.out.println("Terminated by the Programmer - Vince Chua (3BSCS2)");
    }
}


