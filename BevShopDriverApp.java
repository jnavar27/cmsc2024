import java.util.List;
import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BevShop bevShop = new BevShop();

        System.out.println("The current order in process can have at most 3 alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is 21");

        // Order 1
        System.out.println("Start please a new order:");
        System.out.println("Your Total Order for now is 0.0");

        System.out.println("Would you please enter your name:");
        String name1 = scanner.nextLine();

        System.out.println("Would you please enter your age:");
        int age1 = Integer.parseInt(scanner.nextLine());

        bevShop.startNewOrder(10, Day.MONDAY, name1, age1);

        System.out.println("Your age is above 20 and you are eligible to order alcohol");
        System.out.println("Would you please add an alcohol drink");
        bevShop.processAlcoholOrder(name1, age1, new Alcohol("Wine", Type.ALCOHOL, Size.MEDIUM, true));

        System.out.println("Would you please add a second alcohol drink");
        bevShop.processAlcoholOrder(name1, age1, new Alcohol("Beer", Type.ALCOHOL, Size.SMALL, false));

        System.out.println("Add third alcohol drink");
        bevShop.processAlcoholOrder(name1, age1, new Alcohol("Vodka", Type.ALCOHOL, Size.LARGE, false));

        System.out.println("Would you please add a COFFEE to your order:");
        bevShop.getOrders().get(0).addNewBeverage(new Coffee("Latte", Type.COFFEE, Size.SMALL, false, true));

        System.out.println("#------------------------------------#");

        // Order 2
        System.out.println("Would you please start a new order");
        System.out.println("Would you please enter your name:");
        String name2 = scanner.nextLine();

        System.out.println("Would you please enter your age:");
        int age2 = Integer.parseInt(scanner.nextLine());

        bevShop.startNewOrder(12, Day.TUESDAY, name2, age2);

        System.out.println("Would you please add a SMOOTHIE to order");
        bevShop.getOrders().get(1).addNewBeverage(new Smoothie("Berry Blast", Type.SMOOTHIE, Size.MEDIUM, true, 4));

        System.out.println("Would you please add a SMOOTHIE to order");
        bevShop.getOrders().get(1).addNewBeverage(new Smoothie("Tropical Delight", Type.SMOOTHIE, Size.LARGE, true, 5));

        System.out.println("Would you please add a COFFEE to order");
        bevShop.getOrders().get(1).addNewBeverage(new Coffee("Cappuccino", Type.COFFEE, Size.SMALL, true, false));

        System.out.println("Would you please add a drink ");
        bevShop.getOrders().get(1).addNewBeverage(new Alcohol("Whiskey", Type.ALCOHOL, Size.LARGE, false));

        System.out.println("Total price on the second Order: " + bevShop.getOrders().get(1).calcOrderPrice());
        System.out.println("Total amount for all Orders: " + calculateTotalSale(bevShop.getOrders()));
    }

    private static double calculateTotalSale(List<Order> orders) {
        double total = 0;
        for (Order order : orders) {
            total += order.calcOrderPrice();
        }
        return total;
    }
}

