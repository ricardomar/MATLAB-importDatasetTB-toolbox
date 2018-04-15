package jParserToolbox;

public class RubikFrame 
{
	private double timestamp;
	private int[] dataGreen;
	private int[] dataWhite;
	private int[] dataOrange;
	private int[] dataBlue;
	private int[] dataRed;
	private int[] dataYellow;
	
	public RubikFrame()
	{
		this.timestamp=0;
		this.dataGreen=new int[12];
		this.dataWhite=new int[12];
		this.dataOrange=new int[12];
		this.dataBlue=new int[12];
		this.dataRed=new int[12];
		this.dataYellow=new int[12];		
	}
	
	public void setTimestamp(double value)
	{
		this.timestamp=value;
	}
	
	public double getTimestamp()
	{
		return this.timestamp;
	}
	
	public void setDataGreen(int position,int value)
	{
		this.dataGreen[position]=value;
	}
	
	public void setDataWhite(int position,int value)
	{
		this.dataWhite[position]=value;
	}
	
	public void setDataOrange(int position,int value)
	{
		this.dataOrange[position]=value;
	}
	
	public void setDataBlue(int position,int value)
	{
		this.dataBlue[position]=value;
	}
	
	public void setDataRed(int position,int value)
	{
		this.dataRed[position]=value;
	}
	
	public void setDataYellow(int position,int value)
	{
		this.dataYellow[position]=value;
	}
	
	public int[] getDataGreen()
	{
		return this.dataGreen;
	}
	
	public int[] getDataWhite()
	{
		return this.dataWhite;
	}
	
	public int[] getDataOrange()
	{
		return this.dataOrange;
	}
	
	public int[] getDataBlue()
	{
		return this.dataBlue;
	}
	
	public int[] getDataRed()
	{
		return this.dataRed;
	}
	
	public int[] getDataYellow()
	{
		return this.dataYellow;
	}
	

	
}
