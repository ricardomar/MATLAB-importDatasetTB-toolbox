package jParserToolbox;

public class KineticAccFrame 
{
	private double timestamp;
	private double[] accRaw;
	private double[] acc;
	
	public KineticAccFrame()
	{
		this.timestamp=0;
		this.accRaw = new double[3];
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
	
	public void setAccRaw(int index, double value)
	{
		this.accRaw[index]=value;
	}
	
	public double[] getAccRaw()
	{
		return this.accRaw;
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
