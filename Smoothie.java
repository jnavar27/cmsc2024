
public class Smoothie extends Beverage {
    private int numFruits;
    private boolean proteinPowder;
	private boolean b;
	private int i;

    public Smoothie(String name, Size size, int numFruits, boolean proteinPowder) {
        super(name, Type.SMOOTHIE, size);
        this.numFruits = numFruits;
        this.proteinPowder = proteinPowder;
    }

    public Smoothie(String name, Type smoothie, Size size, boolean b, int i) {
    	super(name, Type.SMOOTHIE, size);
        this.b = b;
        this.i = i;
	}

	public int getNumFruits() {
        return numFruits;
    }

    public void setNumFruits(int numFruits) {
        this.numFruits = numFruits;
    }

    public boolean isProteinPowder() {
        return proteinPowder;
    }

    public void setProteinPowder(boolean proteinPowder) {
        this.proteinPowder = proteinPowder;
    }

    @Override
    public double calcPrice() {
        double price = BASE_PRICE;
        if (getSize() != Size.SMALL) {
            price += SIZE_PRICE;
        }
        price += numFruits * 0.5;
        if (proteinPowder) {
            price += 1.5;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Smoothie{" +
                "name='" + getName() + '\'' +
                ", size=" + getSize() +
                ", numFruits=" + numFruits +
                ", proteinPowder=" + proteinPowder +
                ", price=" + calcPrice() +
                '}';
    }
}
