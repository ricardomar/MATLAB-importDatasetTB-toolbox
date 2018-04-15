package jParserToolbox;

public class TekscanFrame 
{
	private double timestamp;
	
	private int[] tDistal;
	private int[] tProximal;

	private int[] iDistal;
	private int[] iMedial;
	private int[] iProximal;
	
	private int[] mDistal;
	private int[] mMedial;
	private int[] mProximal;
	
	private int[] rDistal;
	private int[] rMedial;
	private int[] rProximal;
	
	private int[] lDistal;
	private int[] lMedial;
	private int[] lProximal;
	
	private int[] pFingers;
	private int[] pInternal;
	private int[] pExternal;
	
	public TekscanFrame()
	{
		this.timestamp=0;
		
		this.tDistal= new int[16];
		this.tProximal= new int[12];
		
		this.iDistal = new int[16];
		this.iMedial = new int[12];
		this.iProximal = new int[12];
		
		this.mDistal = new int[16];
		this.mMedial = new int[12];
		this.mProximal = new int[12];
		
		this.rDistal = new int[16];
		this.rMedial = new int[12];
		this.rProximal = new int[12];
		
		this.lDistal = new int[16];
		this.lMedial = new int[12];
		this.lProximal = new int[12];
		
		this.pFingers = new int[76];
		this.pInternal = new int[45];
		this.pExternal = new int[52];
	}
	
	
	public void setTimestamp(double value)
	{
		this.timestamp=value;
	}
	
	public double getTimestamp()
	{
		return this.timestamp;
	}
	
	public void setDatatDistal(int position,int value)
	{
	    this.tDistal[position]=value;
	}

	public void setDatatProximal(int position,int value)
	{
	    this.tProximal[position]=value;
	}
	
	public void setDataiDistal(int position,int value)
	{
	    this.iDistal[position]=value;
	}
	
	public void setDataiMedial(int position,int value)
	{
	    this.iMedial[position]=value;
	}
	
	public void setDataiProximal(int position,int value)
	{
	    this.iProximal[position]=value;
	}
	
	public void setDatamDistal(int position,int value)
	{
	    this.mDistal[position]=value;
	}
	
	public void setDatamMedial(int position,int value)
	{
	    this.mMedial[position]=value;
	}
	
	public void setDatamProximal(int position,int value)
	{
	    this.mProximal[position]=value;
	}
	
	public void setDatarDistal(int position,int value)
	{
	    this.rDistal[position]=value;
	}
	
	public void setDatarMedial(int position,int value)
	{
	    this.rMedial[position]=value;
	}
	
	public void setDatarProximal(int position,int value)
	{
	    this.rProximal[position]=value;
	}
	
	public void setDatalDistal(int position,int value)
	{
	    this.lDistal[position]=value;
	}
	
	public void setDatalMedial(int position,int value)
	{
	    this.lMedial[position]=value;
	}
	
	public void setDatalProximal(int position,int value)
	{
	    this.lProximal[position]=value;
	}

	public void setDatapFingers(int position,int value)
	{
	    this.pFingers[position]=value;
	}
	
	public void setDatapInternal(int position,int value)
	{
	    this.pInternal[position]=value;
	}
	
	public void setDatapExternal(int position,int value)
	{
	    this.pExternal[position]=value;
	}
	
	public int[] getDatatDistal()
	{
	   return this.tDistal;
	}

	public int[] getDatatProximal()
	{
	   return this.tProximal;
	}

	public int[] getDataiDistal()
	{
	   return this.iDistal;
	}

	public int[] getDataiMedial()
	{
	   return this.iMedial;
	}

	public int[] getDataiProximal()
	{
	   return this.iProximal;
	}

	public int[] getDatamDistal()
	{
	   return this.mDistal;
	}

	public int[] getDatamMedial()
	{
	   return this.mMedial;
	}

	public int[] getDatamProximal()
	{
	   return this.mProximal;
	}

	public int[] getDatarDistal()
	{
	   return this.rDistal;
	}

	public int[] getDatarMedial()
	{
	   return this.rMedial;
	}

	public int[] getDatarProximal()
	{
	   return this.rProximal;
	}

	public int[] getDatalDistal()
	{
	   return this.lDistal;
	}

	public int[] getDatalMedial()
	{
	   return this.lMedial;
	}

	public int[] getDatalProximal()
	{
	   return this.lProximal;
	}

	public int[] getDatapFingers()
	{
	   return this.pFingers;
	}

	public int[] getDatapInternal()
	{
	   return this.pInternal;
	}

	public int[] getDatapExternal()
	{
	   return this.pExternal;
	}

	
}
