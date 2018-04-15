package jParserToolbox;

public class PolhemusFrame
{
	private double timestamp;
	private double[] position;
	private double[] orientation;
	
	public PolhemusFrame()
	{
		this.timestamp=0;
		this.position= new double[3];
		this.orientation = new double[3];
	}
	
	public void setTimestamp(double value)
	{
		this.timestamp=value;
	}
	
	public double getTimestamp()
	{
		return this.timestamp;
	}
	
	public void setPosition(int index, double value)
	{
		this.position[index]=value;
	}
	
	public double[] getPosition()
	{
		return this.position;
	}
	
	public void setOrientation(int index, double value)
	{
		this.orientation[index]=value;
	}
		
	public double[] getOrientation()	
	{
		return this.orientation;
	}
	
}