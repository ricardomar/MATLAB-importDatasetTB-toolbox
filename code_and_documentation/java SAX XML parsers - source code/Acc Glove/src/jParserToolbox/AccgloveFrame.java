package jParserToolbox;

public class AccgloveFrame 
{
	private double timestamp;
	private int[] dataThumb;
	private int[] dataIndex;
	private int[] dataMiddle;
	private int[] dataRing;
	private int[] dataLittle;
	private int[] dataPalm;
	
	
	public AccgloveFrame()
	{
		this.timestamp=0;
		this.dataThumb=new int[3];
		this.dataIndex=new int[3];
		this.dataMiddle=new int[3];
		this.dataRing=new int[3];
		this.dataLittle=new int[3];
		this.dataPalm=new int[3];		
	}
	
	public void setTimestamp(double value)
	{
		this.timestamp=value;
	}
	
	public double getTimestamp()
	{
		return this.timestamp;
	}
	
	public void setDataThumb(int position,int value)
	{
		this.dataThumb[position]=value;
	}
	
	public void setDataIndex(int position,int value)
	{
		this.dataIndex[position]=value;
	}
	
	public void setDataMiddle(int position,int value)
	{
		this.dataMiddle[position]=value;
	}
	
	public void setDataRing(int position,int value)
	{
		this.dataRing[position]=value;
	}
	
	public void setDataLittle(int position,int value)
	{
		this.dataLittle[position]=value;
	}
	
	public void setDataPalm(int position,int value)
	{
		this.dataPalm[position]=value;
	}
	
	public int[] getDataThumb()
	{
		return this.dataThumb;
	}
	
	public int[] getDataIndex()
	{
		return this.dataIndex;
	}
	
	public int[] getDataMiddle()
	{
		return this.dataMiddle;
	}
	
	public int[] getDataRing()
	{
		return this.dataRing;
	}
	
	public int[] getDataLittle()
	{
		return this.dataLittle;
	}
	
	public int[] getDataPalm()
	{
		return this.dataPalm;
	}
	
	
}
