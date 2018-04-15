package jParserToolbox;

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;

public class jCybergloveParser extends DefaultHandler
{
	private boolean controlRawdata = false;
	
	private boolean controltTMJ = false;
	private boolean controltMPJ = false;
	private boolean controltIJ = false;
	private boolean controltAbd = false;
	private boolean controliMPJ = false;
	private boolean controliPIJ = false;
	private boolean controliDIJ = false;
	private boolean controlmMPJ = false;
	private boolean controlmPIJ = false;
	private boolean controlmDIJ = false;
	private boolean controlmiAbd = false;
	private boolean controlrMPJ = false;
	private boolean controlrPIJ = false;
	private boolean controlrDIJ = false;
	private boolean controlrmAbd = false;
	private boolean controllMPJ = false;
	private boolean controllPIJ = false;
	private boolean controllDIJ = false;
	private boolean controllrAbd = false;
	private boolean controlpArch = false;
	private boolean controlwPitch = false;
	private boolean controlwYaw = false;
	
	private String auxiliar;
	
	SAXParserFactory spf = SAXParserFactory.newInstance();
	
	private ArrayList<CybergloveFrame> frames= new ArrayList<CybergloveFrame>();
	private CybergloveFrame CurrentFrame; 
	
	
	public jCybergloveParser(String pathXMLfile) throws IOException
	{		
		try 
		{
			SAXParser sp = spf.newSAXParser();
			sp.parse(new File(pathXMLfile), this);
		} 
		catch (ParserConfigurationException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e) 
		{
			e.printStackTrace();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		};		
	};

	public String teste()
	{		
		return "Olá";
	};
	
	public CybergloveFrame[] parseFile()
	{
		CybergloveFrame [] frameArray=new CybergloveFrame[0];
		return this.frames.toArray(frameArray);
	};
	
	public void characters(char[] buffer, int start, int length) 
	{
		if (controltTMJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controltMPJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controltIJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controltAbd && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controliMPJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controliPIJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controliDIJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlmMPJ && controlRawdata)		
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlmPIJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}		
		else if (controlmDIJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlmiAbd && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}		
		else if (controlrMPJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlrPIJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlrDIJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlrmAbd && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controllMPJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controllPIJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controllDIJ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controllrAbd && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlpArch && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlwPitch && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlwYaw && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		};
	};
	
	
	//public void startDocument() 
	//{
	//	
	//};
	
	//	public void endDocument() 
	//	{
	//	
	//	};
	
	  public void startElement(String namespaceURI, String localName,String qName, Attributes atts) 
	  {
		  if(qName.equals("rawdata"))
		  {
			  CurrentFrame = new CybergloveFrame();
			  CurrentFrame.setTimestamp(Double.parseDouble(atts.getValue(0)));
			  controlRawdata = true; 
		  }		  
		  else if (qName.equals("tTMJ")&& controlRawdata)
		  {
			  controltTMJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("tMPJ")&& controlRawdata)
		  {
			  controltMPJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("tIJ")&& controlRawdata)
		  {
			  controltIJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("tAbd")&& controlRawdata)
		  {
			  controltAbd=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("iMPJ")&& controlRawdata)
		  {
			  controliMPJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("iPIJ")&& controlRawdata)
		  {
			  controliPIJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("iDIJ")&& controlRawdata)
		  {
			  controliDIJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("mMPJ")&& controlRawdata)
		  {
			  controlmMPJ=true;
			  this.auxiliar="";
		  }		  
		  else if (qName.equals("mPIJ")&& controlRawdata)
		  {
			  controlmPIJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("mDIJ")&& controlRawdata)
		  {
			  controlmDIJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("miAbd")&& controlRawdata)
		  {
			  controlmiAbd=true;
			  this.auxiliar="";
		  }		  
		  else if (qName.equals("rMPJ")&& controlRawdata)
		  {
			  controlrMPJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("rPIJ")&& controlRawdata)
		  {
			  controlrPIJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("rDIJ")&& controlRawdata)
		  {
			  controlrDIJ=true;
			  this.auxiliar="";
		  }		  
		  else if (qName.equals("rmAbd")&& controlRawdata)
		  {
			  controlrmAbd=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("lMPJ")&& controlRawdata)
		  {
			  controllMPJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("lPIJ")&& controlRawdata)
		  {
			  controllPIJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("lDIJ")&& controlRawdata)
		  {
			  controllDIJ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("lrAbd")&& controlRawdata)
		  {
			  controllrAbd=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("pArch")&& controlRawdata)
		  {
			  controlpArch=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("wPitch")&& controlRawdata)
		  {
			  controlwPitch=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("wYaw")&& controlRawdata)
		  {
			  controlwYaw=true;
			  this.auxiliar="";
		  };
	  };

	  public void endElement(String namespaceURI, String localName, String qName)
	  {
		  if(qName.equals("rawdata"))
		  {
			  frames.add(CurrentFrame);
			  controlRawdata = false;
		  }		  
		  else if (qName.equals("tTMJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(0, Double.parseDouble(this.auxiliar));
			  controltTMJ=false;
		  }
		  else if (qName.equals("tMPJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(1, Double.parseDouble(this.auxiliar));
			  controltMPJ=false;
		  }
		  else if (qName.equals("tIJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(2, Double.parseDouble(this.auxiliar));
			  controltIJ=false;
		  }
		  else if (qName.equals("tAbd")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(3, Double.parseDouble(this.auxiliar));
			  controltAbd=false;
		  }
		  else if (qName.equals("iMPJ")&& controlRawdata)			  
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(4, Double.parseDouble(this.auxiliar));
			  controliMPJ=false;
		  }
		  else if (qName.equals("iPIJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(5, Double.parseDouble(this.auxiliar));
			  controliPIJ=false;
		  }
		  else if (qName.equals("iDIJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(6, Double.parseDouble(this.auxiliar));
			  controliDIJ=false;
		  }
		  else if (qName.equals("mMPJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(7, Double.parseDouble(this.auxiliar));
			  controlmMPJ=false;
		  }
		  else if (qName.equals("mPIJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(8, Double.parseDouble(this.auxiliar));
			  controlmPIJ=false;
		  }
		  else if (qName.equals("mDIJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(9, Double.parseDouble(this.auxiliar));
			  controlmDIJ=false;
		  }
		  else if (qName.equals("miAbd")&& controlRawdata)			  
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(10, Double.parseDouble(this.auxiliar));
			  controlmiAbd=false;
		  }
		  else if (qName.equals("rMPJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(11, Double.parseDouble(this.auxiliar));
			  controlrMPJ=false;
		  }
		  else if (qName.equals("rPIJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(12, Double.parseDouble(this.auxiliar));
			  controlrPIJ=false;
		  }
		  else if (qName.equals("rDIJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(13, Double.parseDouble(this.auxiliar));
			  controlrDIJ=false;
		  }
		  else if (qName.equals("rmAbd")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(14, Double.parseDouble(this.auxiliar));
			  controlrmAbd=false;
		  }
		  else if (qName.equals("lMPJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(15, Double.parseDouble(this.auxiliar));
			  controllMPJ=false;
		  }
		  else if (qName.equals("lPIJ")&& controlRawdata)			  
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(16, Double.parseDouble(this.auxiliar));
			  controllPIJ=false;
		  }
		  else if (qName.equals("lDIJ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(17, Double.parseDouble(this.auxiliar));
			  controllDIJ=false;
		  }
		  else if (qName.equals("lrAbd")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(18, Double.parseDouble(this.auxiliar));
			  controllrAbd=false;
		  }
		  else if (qName.equals("pArch")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(19, Double.parseDouble(this.auxiliar));
			  controlpArch=false;
		  }
		  else if (qName.equals("wPitch")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(20, Double.parseDouble(this.auxiliar));
			  controlwPitch=false;
		  }
		  else if (qName.equals("wYaw")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setData(21, Double.parseDouble(this.auxiliar));
			  controlwYaw=false;
		  };
	  };	
	
		 public void warning(SAXParseException exception) 
		 {
			    System.err.println("WARNING: line " + exception.getLineNumber() + ": "
			        + exception.getMessage());
		 };
		 
		  public void error(SAXParseException exception) 
		  {
			    System.err.println("ERROR: line " + exception.getLineNumber() + ": "
			        + exception.getMessage());
		  };
		  
		  
		  public void fatalError(SAXParseException exception) throws SAXException 
		  {
			    System.err.println("FATAL: line " + exception.getLineNumber() + ": "
			        + exception.getMessage());
			    throw (exception);
		  };
		
}
