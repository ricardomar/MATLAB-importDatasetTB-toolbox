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


public class jKineticCloudParser extends DefaultHandler
{
	private boolean controlRawdata = false;
	private boolean controlCloud = false;
	private String auxiliar;
	
	SAXParserFactory spf = SAXParserFactory.newInstance();
	
	private ArrayList<KineticCloudFrame> frames= new ArrayList<KineticCloudFrame>();
	private KineticCloudFrame CurrentFrame;
	
	public jKineticCloudParser(String pathXMLfile) throws IOException
	{
		spf.setValidating(false);
		
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
	
	public KineticCloudFrame[] parseFile()
	{
		KineticCloudFrame [] frameArray=new KineticCloudFrame[0];
		return this.frames.toArray(frameArray);
	};
	
	public void characters(char[] buffer, int start, int length) 
	{
		if (controlCloud && controlRawdata)
		{			
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}	
	};
	
	  public void startElement(String namespaceURI, String localName,String qName, Attributes atts) 
	  {
		  if(qName.equals("rawdata"))
		  {
			  CurrentFrame = new KineticCloudFrame();
			  CurrentFrame.setTimestamp(Double.parseDouble(atts.getValue(0)));
			  controlRawdata = true; 
		  }		  
		  else if (qName.equals("path")&& controlRawdata)
		  {
			  this.auxiliar="";
			  controlCloud=true;
		  };
		  
	  };
	  
	  public void endElement(String namespaceURI, String localName, String qName)
	  {
		  if(qName.equals("rawdata"))
		  {
			  frames.add(CurrentFrame);
			  controlRawdata = false;
		  }		  
		  else if (qName.equals("path")&& controlRawdata)
		  {
			  CurrentFrame.setPath(this.auxiliar);
			  //System.out.println(this.auxiliar);
			  controlCloud=false;
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
