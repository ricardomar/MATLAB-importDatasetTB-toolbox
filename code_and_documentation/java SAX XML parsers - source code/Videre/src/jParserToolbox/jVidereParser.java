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


public class jVidereParser extends DefaultHandler
{
	private boolean controlRawdata = false;
	private boolean controlImageRight = false;
	private boolean controlImageLeft = false;
	private String auxiliar;

	SAXParserFactory spf = SAXParserFactory.newInstance();

	private ArrayList<VidereFrame> frames= new ArrayList<VidereFrame>();
	private VidereFrame CurrentFrame; 
	
	public jVidereParser(String pathXMLfile) throws IOException
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
	
	public VidereFrame[] parseFile()
	{
		VidereFrame [] frameArray=new VidereFrame[0];
		return this.frames.toArray(frameArray);
	};
	
	public void characters(char[] buffer, int start, int length) 
	{
		if (controlImageRight && controlRawdata)
		{	
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));			
		}
		else if (controlImageLeft && controlRawdata)
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
			  CurrentFrame = new VidereFrame();
			  CurrentFrame.setTimestamp(Double.parseDouble(atts.getValue(0)));
			  controlRawdata = true;
			  
		  }		  
		  else if (qName.equals("image_right")&& controlRawdata)
		  {	
			  this.auxiliar="";
			  controlImageRight=true;
		  }
		  else if (qName.equals("image_left")&& controlRawdata)
		  {
			  this.auxiliar="";
			  controlImageLeft=true;
		  };
		  
	  };

	  public void endElement(String namespaceURI, String localName, String qName)
	  {
		  if(qName.equals("rawdata"))
		  {
			  frames.add(CurrentFrame);
			  controlRawdata = false;
		  }		  
		  else if (qName.equals("image_right")&& controlRawdata)
		  {
			  CurrentFrame.setPathRight(this.auxiliar);
			  controlImageRight=false;
		  }
		  else if (qName.equals("image_left")&& controlRawdata)
		  {
			  CurrentFrame.setPathLeft(this.auxiliar);			 
			  controlImageLeft=false;
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
};
