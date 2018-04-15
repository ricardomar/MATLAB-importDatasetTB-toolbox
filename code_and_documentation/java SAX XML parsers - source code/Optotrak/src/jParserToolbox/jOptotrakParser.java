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

public class jOptotrakParser extends DefaultHandler
{
	private boolean controlRawdata = false;
	private boolean controlX = false;
	private boolean controlY = false;
	private boolean controlZ = false;
	private String auxiliar;
	
	SAXParserFactory spf = SAXParserFactory.newInstance();
	
	private ArrayList<OptotrakFrame > frames= new ArrayList<OptotrakFrame >();
	private OptotrakFrame CurrentFrame; 
	
	public jOptotrakParser(String pathXMLfile) throws IOException
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
	
	public OptotrakFrame [] parseFile()
	{
		OptotrakFrame  [] frameArray=new OptotrakFrame [0];
		return this.frames.toArray(frameArray);
	};

	public void characters(char[] buffer, int start, int length) 
	{
		if (controlX && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlY && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		}
		else if (controlZ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));	
		};
	};
	
	  public void endElement(String namespaceURI, String localName, String qName)
	  {
		  if(qName.equals("rawdata"))
		  {
			  frames.add(CurrentFrame);
			  controlRawdata = false;
		  }		  
		  else if (qName.equals("X")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setPosition(0, Double.parseDouble(this.auxiliar));
			  controlX=false;
		  }
		  else if (qName.equals("Y")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setPosition(1, Double.parseDouble(this.auxiliar));
			  controlY=false;
		  }
		  else if (qName.equals("Z")&& controlRawdata)
		  {
			  //System.out.println(this.auxiliar);
			  CurrentFrame.setPosition(2, Double.parseDouble(this.auxiliar));
			  controlZ=false;
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