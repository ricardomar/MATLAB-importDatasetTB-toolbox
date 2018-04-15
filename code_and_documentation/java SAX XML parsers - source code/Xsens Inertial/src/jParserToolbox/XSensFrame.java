package jParserToolbox;

public class XSensFrame 
{
	private double timestamp;
	private double[] acc;
	private double[] gyr;
	private double[] mag;
	private double[] quat;

	public XSensFrame()
	{
		this.timestamp=0;
		this.acc = new double[3];
		this.gyr = new double[3];
		this.mag = new double[3];
		this.quat = new double[4];
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
	
	public void setGyr(int index, double value)
	{
		this.gyr[index]=value;
	}
		
	public double[] getGyr()	
	{
		return this.gyr;
	}
	
	public void setMag(int index, double value)
	{
		this.mag[index]=value;
	}
		
	public double[] getMag()	
	{
		return this.mag;
	}

	public void setQuat(int index, double value)
	{
		this.quat[index]=value;
	}
		
	public double[] getQuat()	
	{
		return this.quat;
	}
	
}
