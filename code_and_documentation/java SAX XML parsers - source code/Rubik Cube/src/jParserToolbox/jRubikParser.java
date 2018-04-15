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

public class jRubikParser extends DefaultHandler
{
	private boolean controlRawdata = false;
	
	private boolean controlG1 = false;
	private boolean controlG2 = false;
	private boolean controlG3 = false;
	private boolean controlG4 = false;
	private boolean controlG5 = false;
	private boolean controlG6 = false;
	private boolean controlG7 = false;
	private boolean controlG8 = false;
	private boolean controlG9 = false;
	private boolean controlGx = false;
	private boolean controlGy = false;
	private boolean controlGz = false;
	
	private boolean controlW1 = false;
	private boolean controlW2 = false;
	private boolean controlW3 = false;
	private boolean controlW4 = false;
	private boolean controlW5 = false;
	private boolean controlW6 = false;
	private boolean controlW7 = false;
	private boolean controlW8 = false;
	private boolean controlW9 = false;
	private boolean controlWx = false;
	private boolean controlWy = false;
	private boolean controlWz = false;
	
	private boolean controlO1 = false;
	private boolean controlO2 = false;
	private boolean controlO3 = false;
	private boolean controlO4 = false;
	private boolean controlO5 = false;
	private boolean controlO6 = false;
	private boolean controlO7 = false;
	private boolean controlO8 = false;
	private boolean controlO9 = false;
	private boolean controlOx = false;
	private boolean controlOy = false;
	private boolean controlOz = false;
	
	private boolean controlB1 = false;
	private boolean controlB2 = false;
	private boolean controlB3 = false;
	private boolean controlB4 = false;
	private boolean controlB5 = false;
	private boolean controlB6 = false;
	private boolean controlB7 = false;
	private boolean controlB8 = false;
	private boolean controlB9 = false;
	private boolean controlBx = false;
	private boolean controlBy = false;
	private boolean controlBz = false;
	
	private boolean controlR1 = false;
	private boolean controlR2 = false;
	private boolean controlR3 = false;
	private boolean controlR4 = false;
	private boolean controlR5 = false;
	private boolean controlR6 = false;
	private boolean controlR7 = false;
	private boolean controlR8 = false;
	private boolean controlR9 = false;
	private boolean controlRx = false;
	private boolean controlRy = false;
	private boolean controlRz = false;
	
	private boolean controlY1 = false;
	private boolean controlY2 = false;
	private boolean controlY3 = false;
	private boolean controlY4 = false;
	private boolean controlY5 = false;
	private boolean controlY6 = false;
	private boolean controlY7 = false;
	private boolean controlY8 = false;
	private boolean controlY9 = false;
	private boolean controlYx = false;
	private boolean controlYy = false;
	private boolean controlYz = false;
		
	private String auxiliar;
	
	SAXParserFactory spf = SAXParserFactory.newInstance();
	
	private ArrayList<RubikFrame> frames= new ArrayList<RubikFrame>();
	private RubikFrame CurrentFrame; 

public jRubikParser(String pathXMLfile) throws IOException
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

public RubikFrame[] parseFile()
{
	RubikFrame [] frameArray=new RubikFrame[0];
	return this.frames.toArray(frameArray);
}

public void characters(char[] buffer, int start, int length) 
{
	if (controlG1 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlG2 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlG3 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlG4 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlG5 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlG6 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlG7 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
		else if (controlG8 && controlRawdata)
	{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlG9 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlGx && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlGy && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlGz && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlW1 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlW2 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlW3 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlW4 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlW5 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlW6 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlW7 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlW8 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlW9 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlWx && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlWy && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlWz && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlO1 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlO2 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlO3 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlO4 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlO5 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlO6 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlO7 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlO8 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlO9 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlOx && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlOy && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlOz && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB1 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB2 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB3 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB4 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB5 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB6 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB7 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB8 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB9 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlBx && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlBy && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlBz && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlR1 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlR2 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlR3 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlR4 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlR5 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlR6 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlR7 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlR8 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlR9 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlRx && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlRy && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlRz && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlY1 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlY2 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlY3 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlY4 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlY5 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlY6 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlY7 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlY8 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlY9 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlYx && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlYy && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlYz && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}	
}


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
		  CurrentFrame = new RubikFrame();
		  CurrentFrame.setTimestamp(Double.parseDouble(atts.getValue(0)));
		  controlRawdata = true; 
	  }		 
	  else if (qName.equals("G1")&& controlRawdata)
	  {
	   controlG1=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("G2")&& controlRawdata)
	  {
	   controlG2=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("G3")&& controlRawdata)
	  {
	   controlG3=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("G4")&& controlRawdata)
	  {
	   controlG4=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("G5")&& controlRawdata)
	  {
	   controlG5=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("G6")&& controlRawdata)
	  {
	   controlG6=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("G7")&& controlRawdata)
	  {
	   controlG7=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("G8")&& controlRawdata)
	  {
	   controlG8=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("G9")&& controlRawdata)
	  {
	   controlG9=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Gx")&& controlRawdata)
	  {
	   controlGx=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Gy")&& controlRawdata)
	  {
	   controlGy=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Gz")&& controlRawdata)
	  {
	   controlGz=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("W1")&& controlRawdata)
	  {
	   controlW1=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("W2")&& controlRawdata)
	  {
	   controlW2=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("W3")&& controlRawdata)
	  {
	   controlW3=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("W4")&& controlRawdata)
	  {
	   controlW4=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("W5")&& controlRawdata)
	  {
	   controlW5=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("W6")&& controlRawdata)
	  {
	   controlW6=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("W7")&& controlRawdata)
	  {
	   controlW7=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("W8")&& controlRawdata)
	  {
	   controlW8=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("W9")&& controlRawdata)
	  {
	   controlW9=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Wx")&& controlRawdata)
	  {
	   controlWx=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Wy")&& controlRawdata)
	  {
	   controlWy=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Wz")&& controlRawdata)
	  {
	   controlWz=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("O1")&& controlRawdata)
	  {
	   controlO1=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("O2")&& controlRawdata)
	  {
	   controlO2=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("O3")&& controlRawdata)
	  {
	   controlO3=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("O4")&& controlRawdata)
	  {
	   controlO4=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("O5")&& controlRawdata)
	  {
	   controlO5=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("O6")&& controlRawdata)
	  {
	   controlO6=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("O7")&& controlRawdata)
	  {
	   controlO7=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("O8")&& controlRawdata)
	  {
	   controlO8=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("O9")&& controlRawdata)
	  {
	   controlO9=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Ox")&& controlRawdata)
	  {
	   controlOx=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Oy")&& controlRawdata)
	  {
	   controlOy=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Oz")&& controlRawdata)
	  {
	   controlOz=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B1")&& controlRawdata)
	  {
	   controlB1=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B2")&& controlRawdata)
	  {
	   controlB2=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B3")&& controlRawdata)
	  {
	   controlB3=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B4")&& controlRawdata)
	  {
	   controlB4=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B5")&& controlRawdata)
	  {
	   controlB5=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B6")&& controlRawdata)
	  {
	   controlB6=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B7")&& controlRawdata)
	  {
	   controlB7=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B8")&& controlRawdata)
	  {
	   controlB8=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B9")&& controlRawdata)
	  {
	   controlB9=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Bx")&& controlRawdata)
	  {
	   controlBx=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("By")&& controlRawdata)
	  {
	   controlBy=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Bz")&& controlRawdata)
	  {
	   controlBz=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("R1")&& controlRawdata)
	  {
	   controlR1=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("R2")&& controlRawdata)
	  {
	   controlR2=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("R3")&& controlRawdata)
	  {
	   controlR3=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("R4")&& controlRawdata)
	  {
	   controlR4=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("R5")&& controlRawdata)
	  {
	   controlR5=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("R6")&& controlRawdata)
	  {
	   controlR6=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("R7")&& controlRawdata)
	  {
	   controlR7=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("R8")&& controlRawdata)
	  {
	   controlR8=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("R9")&& controlRawdata)
	  {
	   controlR9=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Rx")&& controlRawdata)
	  {
	   controlRx=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Ry")&& controlRawdata)
	  {
	   controlRy=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Rz")&& controlRawdata)
	  {
	   controlRz=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Y1")&& controlRawdata)
	  {
	   controlY1=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Y2")&& controlRawdata)
	  {
	   controlY2=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Y3")&& controlRawdata)
	  {
	   controlY3=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Y4")&& controlRawdata)
	  {
	   controlY4=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Y5")&& controlRawdata)
	  {
	   controlY5=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Y6")&& controlRawdata)
	  {
	   controlY6=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Y7")&& controlRawdata)
	  {
	   controlY7=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Y8")&& controlRawdata)
	  {
	   controlY8=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Y9")&& controlRawdata)
	  {
	   controlY9=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Yx")&& controlRawdata)
	  {
	   controlYx=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Yy")&& controlRawdata)
	  {
	   controlYy=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("Yz")&& controlRawdata)
	  {
	   controlYz=true;
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
	  else if (qName.equals("G1")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(0, Integer.parseInt(this.auxiliar));
	   controlG1=false;
	  }
	  else if (qName.equals("G2")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(1, Integer.parseInt(this.auxiliar));
	   controlG2=false;
	  }
	  else if (qName.equals("G3")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(2, Integer.parseInt(this.auxiliar));
	   controlG3=false;
	  }
	  else if (qName.equals("G4")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(3, Integer.parseInt(this.auxiliar));
	   controlG4=false;
	  }
	  else if (qName.equals("G5")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(4, Integer.parseInt(this.auxiliar));
	   controlG5=false;
	  }
	  else if (qName.equals("G6")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(5, Integer.parseInt(this.auxiliar));
	   controlG6=false;
	  }
	  else if (qName.equals("G7")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(6, Integer.parseInt(this.auxiliar));
	   controlG7=false;
	  }
	  else if (qName.equals("G8")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(7, Integer.parseInt(this.auxiliar));
	   controlG8=false;
	  }
	  else if (qName.equals("G9")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(8, Integer.parseInt(this.auxiliar));
	   controlG9=false;
	  }
	  else if (qName.equals("Gx")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(9, Integer.parseInt(this.auxiliar));
	   controlGx=false;
	  }
	  else if (qName.equals("Gy")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(10, Integer.parseInt(this.auxiliar));
	   controlGy=false;
	  }
	  else if (qName.equals("Gz")&& controlRawdata)
	  {
	   CurrentFrame.setDataGreen(11, Integer.parseInt(this.auxiliar));
	   controlGz=false;
	  }
	  else if (qName.equals("W1")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(0, Integer.parseInt(this.auxiliar));
	   controlW1=false;
	  }
	  else if (qName.equals("W2")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(1, Integer.parseInt(this.auxiliar));
	   controlW2=false;
	  }
	  else if (qName.equals("W3")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(2, Integer.parseInt(this.auxiliar));
	   controlW3=false;
	  }
	  else if (qName.equals("W4")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(3, Integer.parseInt(this.auxiliar));
	   controlW4=false;
	  }
	  else if (qName.equals("W5")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(4, Integer.parseInt(this.auxiliar));
	   controlW5=false;
	  }
	  else if (qName.equals("W6")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(5, Integer.parseInt(this.auxiliar));
	   controlW6=false;
	  }
	  else if (qName.equals("W7")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(6, Integer.parseInt(this.auxiliar));
	   controlW7=false;
	  }
	  else if (qName.equals("W8")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(7, Integer.parseInt(this.auxiliar));
	   controlW8=false;
	  }
	  else if (qName.equals("W9")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(8, Integer.parseInt(this.auxiliar));
	   controlW9=false;
	  }
	  else if (qName.equals("Wx")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(9, Integer.parseInt(this.auxiliar));
	   controlWx=false;
	  }
	  else if (qName.equals("Wy")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(10, Integer.parseInt(this.auxiliar));
	   controlWy=false;
	  }
	  else if (qName.equals("Wz")&& controlRawdata)
	  {
	   CurrentFrame.setDataWhite(11, Integer.parseInt(this.auxiliar));
	   controlWz=false;
	  }
	  else if (qName.equals("O1")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(0, Integer.parseInt(this.auxiliar));
	   controlO1=false;
	  }
	  else if (qName.equals("O2")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(1, Integer.parseInt(this.auxiliar));
	   controlO2=false;
	  }
	  else if (qName.equals("O3")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(2, Integer.parseInt(this.auxiliar));
	   controlO3=false;
	  }
	  else if (qName.equals("O4")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(3, Integer.parseInt(this.auxiliar));
	   controlO4=false;
	  }
	  else if (qName.equals("O5")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(4, Integer.parseInt(this.auxiliar));
	   controlO5=false;
	  }
	  else if (qName.equals("O6")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(5, Integer.parseInt(this.auxiliar));
	   controlO6=false;
	  }
	  else if (qName.equals("O7")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(6, Integer.parseInt(this.auxiliar));
	   controlO7=false;
	  }
	  else if (qName.equals("O8")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(7, Integer.parseInt(this.auxiliar));
	   controlO8=false;
	  }
	  else if (qName.equals("O9")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(8, Integer.parseInt(this.auxiliar));
	   controlO9=false;
	  }
	  else if (qName.equals("Ox")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(9, Integer.parseInt(this.auxiliar));
	   controlOx=false;
	  }
	  else if (qName.equals("Oy")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(10, Integer.parseInt(this.auxiliar));
	   controlOy=false;
	  }
	  else if (qName.equals("Oz")&& controlRawdata)
	  {
	   CurrentFrame.setDataOrange(11, Integer.parseInt(this.auxiliar));
	   controlOz=false;
	  }
	  else if (qName.equals("B1")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(0, Integer.parseInt(this.auxiliar));
	   controlB1=false;
	  }
	  else if (qName.equals("B2")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(1, Integer.parseInt(this.auxiliar));
	   controlB2=false;
	  }
	  else if (qName.equals("B3")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(2, Integer.parseInt(this.auxiliar));
	   controlB3=false;
	  }
	  else if (qName.equals("B4")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(3, Integer.parseInt(this.auxiliar));
	   controlB4=false;
	  }
	  else if (qName.equals("B5")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(4, Integer.parseInt(this.auxiliar));
	   controlB5=false;
	  }
	  else if (qName.equals("B6")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(5, Integer.parseInt(this.auxiliar));
	   controlB6=false;
	  }
	  else if (qName.equals("B7")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(6, Integer.parseInt(this.auxiliar));
	   controlB7=false;
	  }
	  else if (qName.equals("B8")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(7, Integer.parseInt(this.auxiliar));
	   controlB8=false;
	  }
	  else if (qName.equals("B9")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(8, Integer.parseInt(this.auxiliar));
	   controlB9=false;
	  }
	  else if (qName.equals("Bx")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(9, Integer.parseInt(this.auxiliar));
	   controlBx=false;
	  }
	  else if (qName.equals("By")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(10, Integer.parseInt(this.auxiliar));
	   controlBy=false;
	  }
	  else if (qName.equals("Bz")&& controlRawdata)
	  {
	   CurrentFrame.setDataBlue(11, Integer.parseInt(this.auxiliar));
	   controlBz=false;
	  }
	  else if (qName.equals("R1")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(0, Integer.parseInt(this.auxiliar));
	   controlR1=false;
	  }
	  else if (qName.equals("R2")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(1, Integer.parseInt(this.auxiliar));
	   controlR2=false;
	  }
	  else if (qName.equals("R3")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(2, Integer.parseInt(this.auxiliar));
	   controlR3=false;
	  }
	  else if (qName.equals("R4")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(3, Integer.parseInt(this.auxiliar));
	   controlR4=false;
	  }
	  else if (qName.equals("R5")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(4, Integer.parseInt(this.auxiliar));
	   controlR5=false;
	  }
	  else if (qName.equals("R6")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(5, Integer.parseInt(this.auxiliar));
	   controlR6=false;
	  }
	  else if (qName.equals("R7")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(6, Integer.parseInt(this.auxiliar));
	   controlR7=false;
	  }
	  else if (qName.equals("R8")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(7, Integer.parseInt(this.auxiliar));
	   controlR8=false;
	  }
	  else if (qName.equals("R9")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(8, Integer.parseInt(this.auxiliar));
	   controlR9=false;
	  }
	  else if (qName.equals("Rx")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(9, Integer.parseInt(this.auxiliar));
	   controlRx=false;
	  }
	  else if (qName.equals("Ry")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(10, Integer.parseInt(this.auxiliar));
	   controlRy=false;
	  }
	  else if (qName.equals("Rz")&& controlRawdata)
	  {
	   CurrentFrame.setDataRed(11, Integer.parseInt(this.auxiliar));
	   controlRz=false;
	  }
	  else if (qName.equals("Y1")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(0, Integer.parseInt(this.auxiliar));
	   controlY1=false;
	  }
	  else if (qName.equals("Y2")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(1, Integer.parseInt(this.auxiliar));
	   controlY2=false;
	  }
	  else if (qName.equals("Y3")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(2, Integer.parseInt(this.auxiliar));
	   controlY3=false;
	  }
	  else if (qName.equals("Y4")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(3, Integer.parseInt(this.auxiliar));
	   controlY4=false;
	  }
	  else if (qName.equals("Y5")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(4, Integer.parseInt(this.auxiliar));
	   controlY5=false;
	  }
	  else if (qName.equals("Y6")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(5, Integer.parseInt(this.auxiliar));
	   controlY6=false;
	  }
	  else if (qName.equals("Y7")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(6, Integer.parseInt(this.auxiliar));
	   controlY7=false;
	  }
	  else if (qName.equals("Y8")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(7, Integer.parseInt(this.auxiliar));
	   controlY8=false;
	  }
	  else if (qName.equals("Y9")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(8, Integer.parseInt(this.auxiliar));
	   controlY9=false;
	  }
	  else if (qName.equals("Yx")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(9, Integer.parseInt(this.auxiliar));
	   controlYx=false;
	  }
	  else if (qName.equals("Yy")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(10, Integer.parseInt(this.auxiliar));
	   controlYy=false;
	  }
	  else if (qName.equals("Yz")&& controlRawdata)
	  {
	   CurrentFrame.setDataYellow(11, Integer.parseInt(this.auxiliar));
	   controlYz=false;
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

};