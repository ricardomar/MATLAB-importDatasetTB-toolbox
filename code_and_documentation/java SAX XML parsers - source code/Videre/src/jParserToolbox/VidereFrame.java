package jParserToolbox;

public class VidereFrame 
{
	private double timestamp;
	private String pathRightImage;
	private String pathLeftImage;
	
	public VidereFrame()
	{
		this.timestamp=0;
		this.pathRightImage="";
	}
		
	public void setTimestamp(double value)
	{
		this.timestamp=value;
	}
	
	public double getTimestamp()
	{
		return this.timestamp;
	}
	
	public void setPathRight(String path)
	{
		this.pathRightImage=path;
	}
	
	public void setPathLeft(String path)
	{
		this.pathLeftImage=path;
	}

	public String getPathRight()
	{
		return this.pathRightImage;
	}
	
	public String getPathLeft()
	{
		return this.pathLeftImage;
	}
	

}
