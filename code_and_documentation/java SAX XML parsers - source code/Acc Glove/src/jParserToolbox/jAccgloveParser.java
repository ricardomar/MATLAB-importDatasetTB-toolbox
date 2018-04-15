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

public class jAccgloveParser extends DefaultHandler
{
	private boolean controlRawdata = false;
	
	private boolean controlThumbX = false;
	private boolean controlThumbY = false;
	private boolean controlThumbZ = false;
	
	private boolean controlIndexX = false;
	private boolean controlIndexY = false;
	private boolean controlIndexZ = false;
	
	private boolean controlMiddleX = false;
	private boolean controlMiddleY = false;
	private boolean controlMiddleZ = false;
	
	private boolean controlRingX = false;
	private boolean controlRingY = false;
	private boolean controlRingZ = false;
	
	private boolean controlLittleX = false;
	private boolean controlLittleY = false;
	private boolean controlLittleZ = false;
	
	private boolean controlPalmX = false;
	private boolean controlPalmY = false;
	private boolean controlPalmZ = false;
	
	private String auxiliar;
	
	SAXParserFactory spf = SAXParserFactory.newInstance();
	
	private ArrayList<AccgloveFrame> frames= new ArrayList<AccgloveFrame>();
	private AccgloveFrame CurrentFrame; 
	
	public jAccgloveParser(String pathXMLfile) throws IOException
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
		}		
	}
	
	public String teste()
	{		
		return "Olá";
	}
	
	public AccgloveFrame[] parseFile()
	{
		AccgloveFrame [] frameArray=new AccgloveFrame[0];
		return this.frames.toArray(frameArray);
	}
	
	public void characters(char[] buffer, int start, int length) 
	{
		if (controlThumbX && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlThumbY && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlThumbZ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if(controlIndexX && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlIndexY && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlIndexZ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if(controlMiddleX && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlMiddleY && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlMiddleZ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if(controlRingX && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlRingY && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlRingZ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if(controlLittleX && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlLittleY && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlLittleZ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if(controlPalmX && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlPalmY && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlPalmZ && controlRawdata)
		{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
	}

	public void startElement(String namespaceURI, String localName,String qName, Attributes atts) 
	{
		  if(qName.equals("rawdata"))
		  {
			  CurrentFrame = new AccgloveFrame();
			  CurrentFrame.setTimestamp(Double.parseDouble(atts.getValue(0)));
			  controlRawdata = true; 
		  }		 
		  else if (qName.equals("ThumbX")&& controlRawdata)
		  {
		   controlThumbX=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("ThumbY")&& controlRawdata)
		  {
		   controlThumbY=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("ThumbZ")&& controlRawdata)
		  {
		   controlThumbZ=true;
		   this.auxiliar="";
		  }
		  
		  else if (qName.equals("IndexX")&& controlRawdata)
		  {
		   controlIndexX=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("IndexY")&& controlRawdata)
		  {
		   controlIndexY=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("IndexZ")&& controlRawdata)
		  {
		   controlIndexZ=true;
		   this.auxiliar="";
		  }
		  
		  else if (qName.equals("MiddleX")&& controlRawdata)
		  {
		   controlMiddleX=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("MiddleY")&& controlRawdata)
		  {
		   controlMiddleY=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("MiddleZ")&& controlRawdata)
		  {
		   controlMiddleZ=true;
		   this.auxiliar="";
		  }

		  else if (qName.equals("RingX")&& controlRawdata)
		  {
		   controlRingX=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("RingY")&& controlRawdata)
		  {
		   controlRingY=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("RingZ")&& controlRawdata)
		  {
		   controlRingZ=true;
		   this.auxiliar="";
		  }		  

		  else if (qName.equals("LittleX")&& controlRawdata)
		  {
		   controlLittleX=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("LittleY")&& controlRawdata)
		  {
		   controlLittleY=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("LittleZ")&& controlRawdata)
		  {
		   controlLittleZ=true;
		   this.auxiliar="";
		  }	
		  
		  else if (qName.equals("PalmX")&& controlRawdata)
		  {
		   controlPalmX=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("PalmY")&& controlRawdata)
		  {
		   controlPalmY=true;
		   this.auxiliar="";
		  }
		  else if (qName.equals("PalmZ")&& controlRawdata)
		  {
		   controlPalmZ=true;
		   this.auxiliar="";
		  }
		  
	}
	
	
	public void endElement(String namespaceURI, String localName, String qName)
	{
		  if(qName.equals("rawdata"))
		  {
			  frames.add(CurrentFrame);
			  controlRawdata = false;		  
		  }
		  else if (qName.equals("ThumbX")&& controlRawdata)
		  {
		   CurrentFrame.setDataThumb(0, Integer.parseInt(this.auxiliar));
		   controlThumbX=false;
		  }
		  else if (qName.equals("ThumbY")&& controlRawdata)
		  {
		   CurrentFrame.setDataThumb(1, Integer.parseInt(this.auxiliar));
		   controlThumbY=false;
		  }
		  else if (qName.equals("ThumbZ")&& controlRawdata)
		  {
		   CurrentFrame.setDataThumb(2, Integer.parseInt(this.auxiliar));
		   controlThumbZ=false;
		  }
		  
		  else if (qName.equals("IndexX")&& controlRawdata)
		  {
		   CurrentFrame.setDataIndex(0, Integer.parseInt(this.auxiliar));
		   controlIndexX=false;
		  }
		  else if (qName.equals("IndexY")&& controlRawdata)
		  {
		   CurrentFrame.setDataIndex(1, Integer.parseInt(this.auxiliar));
		   controlIndexY=false;
		  }
		  else if (qName.equals("IndexZ")&& controlRawdata)
		  {
		   CurrentFrame.setDataIndex(2, Integer.parseInt(this.auxiliar));
		   controlIndexZ=false;
		  }
		  
		  else if (qName.equals("MiddleX")&& controlRawdata)
		  {
		   CurrentFrame.setDataMiddle(0, Integer.parseInt(this.auxiliar));
		   controlMiddleX=false;
		  }
		  else if (qName.equals("MiddleY")&& controlRawdata)
		  {
		   CurrentFrame.setDataMiddle(1, Integer.parseInt(this.auxiliar));
		   controlMiddleY=false;
		  }
		  else if (qName.equals("MiddleZ")&& controlRawdata)
		  {
		   CurrentFrame.setDataMiddle(2, Integer.parseInt(this.auxiliar));
		   controlMiddleZ=false;
		  }
		  
		  else if (qName.equals("RingX")&& controlRawdata)
		  {
		   CurrentFrame.setDataRing(0, Integer.parseInt(this.auxiliar));
		   controlRingX=false;
		  }
		  else if (qName.equals("RingY")&& controlRawdata)
		  {
		   CurrentFrame.setDataRing(1, Integer.parseInt(this.auxiliar));
		   controlRingY=false;
		  }
		  else if (qName.equals("RingZ")&& controlRawdata)
		  {
		   CurrentFrame.setDataRing(2, Integer.parseInt(this.auxiliar));
		   controlRingZ=false;
		  }
		  
		  else if (qName.equals("LittleX")&& controlRawdata)
		  {
		   CurrentFrame.setDataLittle(0, Integer.parseInt(this.auxiliar));
		   controlLittleX=false;
		  }
		  else if (qName.equals("LittleY")&& controlRawdata)
		  {
		   CurrentFrame.setDataLittle(1, Integer.parseInt(this.auxiliar));
		   controlLittleY=false;
		  }
		  else if (qName.equals("LittleZ")&& controlRawdata)
		  {
		   CurrentFrame.setDataLittle(2, Integer.parseInt(this.auxiliar));
		   controlLittleZ=false;
		  }
		  
		  else if (qName.equals("PalmX")&& controlRawdata)
		  {
		   CurrentFrame.setDataPalm(0, Integer.parseInt(this.auxiliar));
		   controlPalmX=false;
		  }
		  else if (qName.equals("PalmY")&& controlRawdata)
		  {
		   CurrentFrame.setDataPalm(1, Integer.parseInt(this.auxiliar));
		   controlPalmY=false;
		  }
		  else if (qName.equals("PalmZ")&& controlRawdata)
		  {
		   CurrentFrame.setDataPalm(2, Integer.parseInt(this.auxiliar));
		   controlPalmZ=false;
		  }			  
	}
	
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