
public class Coffee extends Beverage {
    private boolean extraShot;
    private boolean extraSyrup;
	private boolean b;
	private boolean c;

    public Coffee(String name, Size size, boolean extraShot, boolean extraSyrup) {
        super(name, Type.COFFEE, size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    public Coffee(String name, Type coffee, Size size, boolean b, boolean c) {
    	super(name, Type.COFFEE, size);
        this.b = b;
        this.c = c;
	}

	public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isExtraSyrup() {
        return extraSyrup;
    }

    public void setExtraSyrup(boolean extraSyrup) {
        this.extraSyrup = extraSyrup;
    }

    @Override
    public double calcPrice() {
        double price = BASE_PRICE;
        if (getSize() != Size.SMALL) {
            price += SIZE_PRICE;
        }
        if (extraShot) {
            price += 0.5;
        }
        if (extraSyrup) {
            price += 0.5;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + getName() + '\'' +
                ", size=" + getSize() +
                ", extraShot=" + extraShot +
                ", extraSyrup=" + extraSyrup +
                ", price=" + calcPrice() +
                '}';
    }
}
