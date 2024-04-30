
import java.util.ArrayList;
import java.util.List;

public class BevShop implements BevShopInterface {
    private static final int MAX_ALCOHOLIC_DRINKS_PER_ORDER = 3;
    private static final int MINIMUM_ALCOHOL_DRINKING_AGE = 21;

    private int alcoholDrinksOrdered;
    private List<Order> orders;

    public BevShop() {
        this.alcoholDrinksOrdered = 0;
        this.orders = new ArrayList<>();
    }

    @Override
    public void startNewOrder(int time, Day day, String customerName, int customerAge) {
        Customer customer = new Customer(customerName, customerAge);
        Order order = new Order(time, day, customer);
        orders.add(order);
    }

    //@Override
    public void processAlcoholOrder(String customerName, int customerAge, Alcohol alcohol) {
        if (customerAge >= MINIMUM_ALCOHOL_DRINKING_AGE && alcoholDrinksOrdered < MAX_ALCOHOLIC_DRINKS_PER_ORDER) {
            for (Order order : orders) {
                if (order.getCustomer().getName().equals(customerName)) {
                    order.addNewBeverage(alcohol);
                    alcoholDrinksOrdered++;
                    break;
                }
            }
        } else {
            System.out.println("Your age is not appropriate for alcohol drink or maximum limit reached.");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Order order : orders) {
            result.append(order).append("\n");
        }
        return result.toString();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

	@Override
	public boolean isValidTime(int time) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getMaxNumOfFruits() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinAgeForAlcohol() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getMaxOrderForAlcohol() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEligibleForMore() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumOfAlcoholDrink() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isValidAge(int age) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int findOrder(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalMonthlySale() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalNumOfMonthlyOrders() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order getCurrentOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderAtIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sortOrders() {
		// TODO Auto-generated method stub
		
	}
}

