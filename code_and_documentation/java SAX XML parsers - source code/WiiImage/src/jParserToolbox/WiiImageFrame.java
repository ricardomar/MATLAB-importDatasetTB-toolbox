package jParserToolbox;

public class WiiImageFrame 
{
	private double timestamp;
	private String pathImage;
	
	public WiiImageFrame()
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
