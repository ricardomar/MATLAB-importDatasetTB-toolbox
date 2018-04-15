package jParserToolbox;

public class WiiAccFrame 
{
	private double timestamp;
	private double[] acc;
	
	public WiiAccFrame()
	{
		this.timestamp=0;
		this.acc = new double[3];
	}
	
	public void setTimestamp(double value)
	{
		this.timestamp=value;
	}
	
	public double getTimestamp()
	{
		return this.timestamp;
	}
	
	public void setAcc(int index, double value)
	{
		this.acc[index]=value;
	}
		
	public double[] getAcc()	
	{
		return this.acc;
	}
	

}
