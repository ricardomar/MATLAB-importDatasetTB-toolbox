package jParserToolbox;

public class OptotrakFrame 
{
	private double timestamp;
	private double[] position;

	
	public OptotrakFrame ()
	{
		this.timestamp=0;
		this.position= new double[3];
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


}
