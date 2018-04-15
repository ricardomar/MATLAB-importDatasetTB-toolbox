package jParserToolbox;

public class CybergloveFrame 
{
	private double timestamp;
	private double[] data;
	
	public CybergloveFrame()
	{
		this.timestamp=0;
		this.data= new double[22];		
	}
	
	public void setTimestamp(double value)
	{
		this.timestamp=value;
	}
	
	public double getTimestamp()
	{
		return this.timestamp;
	}
	
	public void setData(int position,double value)
	{
		this.data[position]=value;
	}
	
	public double[] getData()
	{
		return this.data;
	}

}
