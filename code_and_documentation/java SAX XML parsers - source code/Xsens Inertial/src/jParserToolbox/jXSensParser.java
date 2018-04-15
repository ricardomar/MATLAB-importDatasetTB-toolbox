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



public class jXSensParser extends DefaultHandler
{
	private boolean controlRawdata = false;
	private boolean controlAccX = false;
	private boolean controlAccY = false;
	private boolean controlAccZ = false;
	
	private boolean controlGyrX = false;
	private boolean controlGyrY = false;
	private boolean controlGyrZ = false;
	
	private boolean controlMagX = false;
	private boolean controlMagY = false;
	private boolean controlMagZ = false;
	
	private boolean controlQuat1 = false;
	private boolean controlQuat2 = false;
	private boolean controlQuat3 = false;
	private boolean controlQuat4 = false;
		
	private String auxiliar;
	
	SAXParserFactory spf = SAXParserFactory.newInstance();
	
	private ArrayList<XSensFrame > frames= new ArrayList<XSensFrame >();
	private XSensFrame  CurrentFrame;
	
	public jXSensParser(String pathXMLfile) throws IOException
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
	
	public double teste2()
	{
		return Double.parseDouble("123");
	};
	
	public XSensFrame [] parseFile()
	{
		XSensFrame [] frameArray=new XSensFrame [0];
		return this.frames.toArray(frameArray);
	};
	
	public void characters(char[] buffer, int start, int length) 
	{
		if (controlAccX && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlAccY && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlAccZ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlGyrX && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlGyrY && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlGyrZ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlMagX && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlMagY && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlMagZ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlQuat1 && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlQuat2 && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlQuat3 && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlQuat4 && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		};
	
	};
	
	
	  public void startElement(String namespaceURI, String localName,String qName, Attributes atts) 
	  {
		  if(qName.equals("rawdata"))
		  {
			  CurrentFrame = new XSensFrame();
			  CurrentFrame.setTimestamp(Double.parseDouble(atts.getValue(0)));
			  controlRawdata = true; 
		  }		  
		  else if (qName.equals("accX")&& controlRawdata)
		  {
			  controlAccX=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("accY")&& controlRawdata)
		  {
			  controlAccY=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("accZ")&& controlRawdata)
		  {
			  controlAccZ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("gyrX")&& controlRawdata)
		  {
			  controlGyrX=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("gyrY")&& controlRawdata)
		  {
			  controlGyrY=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("gyrZ")&& controlRawdata)
		  {
			  controlGyrZ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("magX")&& controlRawdata)
		  {
			  controlMagX=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("magY")&& controlRawdata)
		  {
			  controlMagY=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("magZ")&& controlRawdata)
		  {
			  controlMagZ=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("quat1")&& controlRawdata)
		  {
			  controlQuat1=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("quat2")&& controlRawdata)
		  {
			  controlQuat2=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("quat3")&& controlRawdata)
		  {
			  controlQuat3=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("quat4")&& controlRawdata)
		  {
			  controlQuat4=true;
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
		  else if (qName.equals("accX")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setAcc(0, Double.parseDouble(this.auxiliar));
			  controlAccX=false;
		  }
		  else if (qName.equals("accY")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setAcc(1, Double.parseDouble(this.auxiliar));
			  controlAccY=false;
		  }
		  else if (qName.equals("accZ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setAcc(2, Double.parseDouble(this.auxiliar));
			  controlAccZ=false;
		  }
		  else if (qName.equals("gyrX")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setGyr(0, Double.parseDouble(this.auxiliar));
			  controlGyrX=false;
		  }
		  else if (qName.equals("gyrY")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setGyr(1, Double.parseDouble(this.auxiliar));
			  controlGyrY=false;
		  }
		  else if (qName.equals("gyrZ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setGyr(2, Double.parseDouble(this.auxiliar));
			  controlGyrZ=false;
		  }
		  else if (qName.equals("magX")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setMag(0, Double.parseDouble(this.auxiliar));
			  controlMagX=false;
		  }
		  else if (qName.equals("magY")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setMag(1, Double.parseDouble(this.auxiliar));
			  controlMagY=false;
		  }
		  else if (qName.equals("magZ")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setMag(2, Double.parseDouble(this.auxiliar));
			  controlMagZ=false;
		  }
		  else if (qName.equals("quat1")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setQuat(0, Double.parseDouble(this.auxiliar));
			  controlQuat1=false;
		  }
		  else if (qName.equals("quat2")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setQuat(1, Double.parseDouble(this.auxiliar));
			  controlQuat2=false;
		  }
		  else if (qName.equals("quat3")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setQuat(2, Double.parseDouble(this.auxiliar));
			  controlQuat3=false;
		  }
		  else if (qName.equals("quat4")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setQuat(3, Double.parseDouble(this.auxiliar));
			  controlQuat4=false;
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
