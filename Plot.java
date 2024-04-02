
public class Plot {
	private int width;
	private int depth;
	private int x;
	private int y;
	
	public Plot()
	{
		this(0,0,1,1);
	}
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	public Plot(Plot otherPlot)
	{
		this(otherPlot.getX(), otherPlot.getY(), otherPlot.getWidth(), otherPlot.getDepth());
	}
	public boolean overlaps(Plot plot)
	{
		int x1 = this.x;
	    int y1 = this.y;
	    int x2 = this.x + this.width;
	    int y2 = this.y + this.depth;
	    int x1plot = plot.getX();
	    int y1plot = plot.getY();
	    int x2plot = plot.getX() + plot.getWidth();
	    int y2plot = plot.getY() + plot.getDepth();
	    boolean xLap = x1 < x2plot && x2 > x1plot;
	    boolean yLap = y1 < y2plot && y2 > y1plot;
	    return xLap && yLap;
	}
	public boolean encompasses(Plot plot)
	{
		int x1 = this.x;
	    int y1 = this.y;
	    int x2 = this.x + this.width;
	    int y2 = this.y + this.depth;
	    int x1plot = plot.getX();
	    int y1plot = plot.getY();
	    int x2plot = plot.getX() + plot.getWidth();
	    int y2plot = plot.getY() + plot.getDepth();
	    boolean xPass = x1plot >= x1 && x2plot <= x2;
	    boolean yPass = y1plot >= y1 && y2plot <= y2;
	    return xPass && yPass;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getWidth()
	{
		return width;
	}
	public int getDepth()
	{
		return depth;
	}
	public String toString()
	{
		return String.format("%d,%d,%d,%d", x, y, width, depth);
	}
}
