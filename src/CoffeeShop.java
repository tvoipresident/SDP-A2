import java.util.Scanner;

public class CoffeeShop {
//    Menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.print("Choose a coffee type: ");
        int choice = scanner.nextInt();

        Coffee coffee = null;

        if (choice == 1) {
            coffee = new Espresso();
        }
        else if (choice == 2) {
            coffee = new Latte();
        }
        else {
            System.out.println("Wrong choice");
            System.exit(0);
        }

        System.out.println("Add condiments:");
        System.out.println("1. Milk");
        System.out.println("2. Marshmallow");
        System.out.println("3. Syrup");

        while (true) {
            System.out.print("Choose a condiment (0 to finish): ");
            int condimentChoice = scanner.nextInt();

            if (condimentChoice == 0) {
                break;
            }

            if (condimentChoice == 1) {
                coffee = new Milk(coffee);
            }
            else if (condimentChoice == 2) {
                coffee = new Marshmallow(coffee);

            }
            else if (condimentChoice == 3) {
                coffee = new Syrup(coffee);
            }
            else {
                System.out.println("Wrong choice");
            }
        }

        System.out.println("Your order: " + coffee.getDescription());
        System.out.println("Total cost: ₸" + coffee.cost());
    }
}
