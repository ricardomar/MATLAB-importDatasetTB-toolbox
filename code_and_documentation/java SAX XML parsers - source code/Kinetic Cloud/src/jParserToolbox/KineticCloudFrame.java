package jParserToolbox;

public class KineticCloudFrame 
{

		private double timestamp;
		private String pathCloud;
		
		public KineticCloudFrame()
		{
			this.timestamp=0;
			this.pathCloud="";
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
			this.pathCloud=path;
		}

		public String getPath()
		{
			return this.pathCloud;
		}
	}