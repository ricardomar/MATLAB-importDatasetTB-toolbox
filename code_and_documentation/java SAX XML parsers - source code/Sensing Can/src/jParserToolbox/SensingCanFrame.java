package jParserToolbox;


public class SensingCanFrame 
{
	private double timestamp;
	private int[] dataBone;
	private int[] dataBtwo;
	private int[] dataBthree;
	private int[] dataBfour;
	private int[] dataBfive;
	private int[] dataBsix;
	private int[] dataBseven;
	private int[] dataBeight;
	private int[] dataBnine;
	private int[] dataBten;
	
	public SensingCanFrame()
	{
		this.timestamp=0;
		this.dataBone=new int[7];
		this.dataBtwo=new int[7];
		this.dataBthree=new int[7];
		this.dataBfour=new int[7];
		this.dataBfive=new int[7];
		this.dataBsix=new int[7];
		this.dataBsix=new int[7];
		this.dataBseven=new int[7];
		this.dataBeight=new int[7];
		this.dataBnine=new int[7];
		this.dataBten=new int[7];
	}
	
	public void setTimestamp(double value)
	{
		this.timestamp=value;
	}
	
	public double getTimestamp()
	{
		return this.timestamp;
	}
	
	public void setDataBone(int position,int value)
	{
		this.dataBone[position]=value;
	}
	
	public void setDataBtwo(int position,int value)
	{
		this.dataBtwo[position]=value;
	}
	
	public void setDataBthree(int position,int value)
	{
		this.dataBthree[position]=value;
	}
	
	public void setDataBfour(int position,int value)
	{
		this.dataBfour[position]=value;
	}
	
	public void setDataBfive(int position,int value)
	{
		this.dataBfive[position]=value;
	}
	
	public void setDataBsix(int position,int value)
	{
		this.dataBsix[position]=value;
	}
	
	public void setDataBseven(int position,int value)
	{
		this.dataBseven[position]=value;
	}
	
	public void setDataBeight(int position,int value)
	{
		this.dataBeight[position]=value;
	}
	
	public void setDataBnine(int position,int value)
	{
		this.dataBnine[position]=value;
	}
	
	public void setDataBten(int position,int value)
	{
		this.dataBten[position]=value;
	}
	
	public int[] getDataBone()
	{
		return this.dataBone;
	}
	
	public int[] getDataBtwo()
	{
		return this.dataBtwo;
	}
	
	public int[] getDataBthree()
	{
		return this.dataBthree;
	}
	
	public int[] getDataBfour()
	{
		return this.dataBfour;
	}
	
	public int[] getDataBfive()
	{
		return this.dataBfive;
	}
	
	public int[] getDataBsix()
	{
		return this.dataBsix;
	}
	
	public int[] getDataBseven()
	{
		return this.dataBseven;
	}
	
	public int[] getDataBeight()
	{
		return this.dataBeight;
	}
	
	public int[] getDataBnine()
	{
		return this.dataBnine;
	}
	
	public int[] getDataBten()
	{
		return this.dataBten;
	}
	

	
}
