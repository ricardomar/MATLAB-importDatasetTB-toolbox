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


public class jRootParser extends DefaultHandler
{
	private boolean controlDevice = false;
	private boolean controlDeviceAliasName = false;
	private boolean controlDataPath = false;
	private String auxiliar;
	
	SAXParserFactory spf = SAXParserFactory.newInstance();

	private ArrayList<RootDeviceFrame> frames= new ArrayList<RootDeviceFrame>();
	private RootDeviceFrame CurrentFrame; 
	
	public jRootParser(String pathXMLfile) throws IOException
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
	
	
	public RootDeviceFrame[] parseFile()
	{
		RootDeviceFrame [] frameArray=new RootDeviceFrame[0];
		return this.frames.toArray(frameArray);
	};
	
	public void characters(char[] buffer, int start, int length) 
	{
		if (controlDeviceAliasName && controlDevice)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlDataPath && controlDevice)
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
		  if(qName.equals("device"))
		  {
			  CurrentFrame = new RootDeviceFrame();
			  controlDevice = true; 
		  }		  
		  else if (qName.equals("alias_name")&& controlDevice)
		  {
			  controlDeviceAliasName=true;
			  this.auxiliar="";
		  }
		  else if (qName.equals("data")&& controlDevice)
		  {
			  controlDataPath=true;
			  this.auxiliar="";
		  };
		  
	  };
	  
	  public void endElement(String namespaceURI, String localName, String qName)
	  {
		  if(qName.equals("device"))
		  {
			  frames.add(CurrentFrame);
			  controlDevice = false;
		  }		  
		  else if (qName.equals("alias_name")&& controlDevice)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setDeviceAliasName(this.auxiliar);
			  controlDeviceAliasName=false;
		  }
		  else if (qName.equals("data")&& controlDevice)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setDataPath(this.auxiliar);
			  controlDataPath=false;
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
