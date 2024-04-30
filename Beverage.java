import java.util.Objects;

public abstract class Beverage {
    private String name;
    private Type type;
    private Size size;
    protected final double BASE_PRICE = 2.0;
    protected final double SIZE_PRICE = 0.5;

    public Beverage(String name, Type type, Size size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double calcPrice();

    @Override
    public String toString() {
        return "Beverage{name='" + name + "', size=" + size + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beverage beverage = (Beverage) o;
        return name.equals(beverage.name) &&
                type == beverage.type &&
                size == beverage.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, size);
    }
}
