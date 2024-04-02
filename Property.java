
public class Property {
	private String propertyName;
	private String city;
	private String owner;
	private double rentAmount;
	private Plot plot;

	public Property()
	{
		this("", "", 0.0, "");
	}
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this(propertyName, city,  rentAmount, owner, 0, 0, 0, 0);
	}
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	public Plot getPlot()
	{
		return plot;
	}
	public String getPropertyName()
	{
		return propertyName;
	}
	public String getCity()
	{
		return city;
	}
	public String getOwner()
	{
		return owner;
	}
	public double getRentAmount()
	{
		return rentAmount;
	}
	@Override
	public String toString()
	{
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}
}
