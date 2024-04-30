
import java.util.ArrayList;
import java.util.List;

public class Order implements OrderInterface, Comparable<Order> {
    private int orderNumber;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private List<Beverage> beverages;

    public Order(int orderTime, Day orderDay, Customer customer) {
        this.orderNumber = generateOrderNumber();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = customer;
        this.beverages = new ArrayList<>();
    }

    private int generateOrderNumber() {
        return (int) (Math.random() * (90000 - 10000 + 1) + 10000);
    }

    public void addNewBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(int orderTime) {
        this.orderTime = orderTime;
    }

    public Day getOrderDay() {
        return orderDay;
    }

    public void setOrderDay(Day orderDay) {
        this.orderDay = orderDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<Beverage> beverages) {
        this.beverages = beverages;
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.orderNumber, o.orderNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order number: ").append(orderNumber).append("\n");
        sb.append("Order time: ").append(orderTime).append("\n");
        sb.append("Order day: ").append(orderDay).append("\n");
        sb.append("Customer: ").append(customer).append("\n");
        sb.append("Beverages:\n");
        for (Beverage beverage : beverages) {
            sb.append("- ").append(beverage).append("\n");
        }
        return sb.toString();
    }

	@Override
	public boolean isWeekend() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcOrderTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int findNumOfBeveType(Type type) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getTotalItems() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calcOrderPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
