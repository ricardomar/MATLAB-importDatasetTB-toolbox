package jParserToolbox;

public class RootDeviceFrame 
{
	private String DeviceAliasName;
	private String DataPath;
	
	public RootDeviceFrame()
	{
		this.DeviceAliasName="";
		this.DataPath="";
	}
	
	public void setDeviceAliasName(String value)
	{
		this.DeviceAliasName=value;
	}
	
	public void setDataPath(String value)
	{
		this.DataPath=value;
	}
	
	public String getDeviceAliasName()
	{
		return this.DeviceAliasName;
	}
	
	public String getDataPath()
	{
		return this.DataPath;
	}
	
}
