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

public class jWiiAccParser extends DefaultHandler
{
	private boolean controlRawdata = false;

	private boolean controlAccX = false;
	private boolean controlAccY = false;
	private boolean controlAccZ = false;
	
	private String auxiliar;
	
	SAXParserFactory spf = SAXParserFactory.newInstance();
	
	private ArrayList<WiiAccFrame> frames= new ArrayList<WiiAccFrame>();
	private WiiAccFrame CurrentFrame;
	
	public jWiiAccParser(String pathXMLfile) throws IOException
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
	
	public WiiAccFrame[] parseFile()
	{
		WiiAccFrame[] frameArray=new WiiAccFrame[0];
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
		};
	};
	
	  public void startElement(String namespaceURI, String localName,String qName, Attributes atts) 
	  {
		  if(qName.equals("rawdata"))
		  {
			  CurrentFrame = new WiiAccFrame();
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
