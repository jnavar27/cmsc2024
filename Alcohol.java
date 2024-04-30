
public class Alcohol extends Beverage {
    private boolean weekendOffer;
	private boolean b;

    public Alcohol(String name, Size size, boolean weekendOffer) {
        super(name, Type.ALCOHOL, size);
        this.weekendOffer = weekendOffer;
    }

    public Alcohol(String name, Type alcohol, Size medium, boolean b) {
    	 super(name, Type.ALCOHOL, medium);
         this.b = b;
	}

	public boolean isWeekendOffer() {
        return weekendOffer;
    }

    public void setWeekendOffer(boolean weekendOffer) {
        this.weekendOffer = weekendOffer;
    }

    @Override
    public double calcPrice() {
        double price = BASE_PRICE;
        if (weekendOffer) {
            price += 0.6;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "name='" + getName() + '\'' +
                ", size=" + getSize() +
                ", weekendOffer=" + weekendOffer +
                ", price=" + calcPrice() +
                '}';
    }
}
