
public class ManagementCompany {
	final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private int temp;
	private double mgmFeePer;
	private String name;
	private String taxID;
	private Plot plot;
	private Property[] properties;
	
	public ManagementCompany()
	{
		this.name = "";
		this.taxID = "";
		this.mgmFeePer = 0.0;
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		plot = new Plot(x, y, width, depth);
		properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = otherCompany.plot;
		this.properties = otherCompany.properties;
	}
	public int addProperty(String name, String city, double rent, String owner) {
        Property property = new Property(name, city, rent, owner);
        return addProperty(property);
    }

    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
        Property property = new Property(name, city, rent, owner, x, y, width, depth);
        return addProperty(property);
    }

    public int addProperty(Property property) {
        if (temp >= MAX_PROPERTY) {
            return -1;
        }
        if (property == null) {
            return -2; 
        }
        if (!plot.encompasses(property.getPlot())) {
            return -3; 
        }
        for (int i = 0; i < temp; i++) {
            if (property.getPlot().overlaps(properties[i].getPlot())) {
                return -4; 
            }
        }
        properties[temp++] = property;
        return temp - 1; 
    }
    public void removeLastProperty()
    {
    	if (temp > 0)
    	{
    		properties[--temp] = null;
    	}
    }
    public boolean isPropertiesFull()
    {
    	return temp >= MAX_PROPERTY;
    }
    public int getPropertiesCount()
    {
    	return temp;
    }
    public double getTotalRent()
    {
    	double rent = 0.0;
    	for (int i = 0; i < temp; i++)
    	{
    		rent += properties[i].getRentAmount();
    	}
    	return rent;
    }
    public Property getHighestRentProperty()
    {
    	if (temp == 0)
    	{
    		return null;
    	}
    	Property highestRent = properties[0];
    	for (int i = 1; i < temp; i++)
    	{
    		if (properties[i].getRentAmount() > highestRent.getRentAmount())
    		{
    			highestRent = properties[i];
    		}
    	}
    	return highestRent;
    }
    public boolean isManagementFeeValid(double mgmFee)
    {
    	return mgmFee >= 0 && mgmFee <= 100;
    }
    public String getName()
    {
    	return name;
    }
    public String getTaxID()
    {
    	return taxID;
    }
    public Property[] getProperties()
    {
    	return properties;
    }
    public double getMgmFeePer()
    {
    	return mgmFeePer;
    }
    public Plot getPlot()
    {
    	return plot;
    }
    public String toString()
    {
    	StringBuilder result = new StringBuilder();
    	result.append("List of the properties for ").append(name).append(", taxID: ").append(taxID).append("\n______________________________________________________\n");
        for (int i = 0; i < temp; i++) 
        {
            result.append(properties[i].toString()).append("\n");
        }
        result.append("______________________________________________________\ntotal Management Fee: ").append(getTotalRent());
        return result.toString();
    }
}
