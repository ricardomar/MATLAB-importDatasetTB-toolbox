package jParserToolbox;

public class UnibrainFrame 
{
	private double timestamp;
	private String pathImage;
	
	public UnibrainFrame()
	{
		this.timestamp=0;
		this.pathImage="";
	}
		
	public void setTimestamp(double value)
	{
		this.timestamp=value;
	}
	
	public double getTimestamp()
	{
		return this.timestamp;
	}
	
	public void setPath(String path)
	{
		this.pathImage=path;
	}

	public String getPath()
	{
		return this.pathImage;
	}
}
