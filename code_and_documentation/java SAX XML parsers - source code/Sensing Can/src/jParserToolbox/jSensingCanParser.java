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

public class jSensingCanParser extends DefaultHandler
{
	private boolean controlRawdata = false;
	
	private boolean controlB011 = false;
	private boolean controlB012 = false;
	private boolean controlB013 = false;
	private boolean controlB014 = false;
	private boolean controlB01x = false;
	private boolean controlB01y = false;
	private boolean controlB01z = false;
	
	private boolean controlB021 = false;
	private boolean controlB022 = false;
	private boolean controlB023 = false;
	private boolean controlB024 = false;
	private boolean controlB02x = false;
	private boolean controlB02y = false;
	private boolean controlB02z = false;

	private boolean controlB031 = false;
	private boolean controlB032 = false;
	private boolean controlB033 = false;
	private boolean controlB034 = false;
	private boolean controlB03x = false;
	private boolean controlB03y = false;
	private boolean controlB03z = false;
	
	private boolean controlB041 = false;
	private boolean controlB042 = false;
	private boolean controlB043 = false;
	private boolean controlB044 = false;
	private boolean controlB04x = false;
	private boolean controlB04y = false;
	private boolean controlB04z = false;
	
	private boolean controlB051 = false;
	private boolean controlB052 = false;
	private boolean controlB053 = false;
	private boolean controlB054 = false;
	private boolean controlB05x = false;
	private boolean controlB05y = false;
	private boolean controlB05z = false;
	
	private boolean controlB061 = false;
	private boolean controlB062 = false;
	private boolean controlB063 = false;
	private boolean controlB064 = false;
	private boolean controlB06x = false;
	private boolean controlB06y = false;
	private boolean controlB06z = false;
	
	private boolean controlB071 = false;
	private boolean controlB072 = false;
	private boolean controlB073 = false;
	private boolean controlB074 = false;
	private boolean controlB07x = false;
	private boolean controlB07y = false;
	private boolean controlB07z = false;
	
	private boolean controlB081 = false;
	private boolean controlB082 = false;
	private boolean controlB083 = false;
	private boolean controlB084 = false;
	private boolean controlB08x = false;
	private boolean controlB08y = false;
	private boolean controlB08z = false;
	
	private boolean controlB091 = false;
	private boolean controlB092 = false;
	private boolean controlB093 = false;
	private boolean controlB094 = false;
	private boolean controlB09x = false;
	private boolean controlB09y = false;
	private boolean controlB09z = false;

	private boolean controlB101 = false;
	private boolean controlB102 = false;
	private boolean controlB103 = false;
	private boolean controlB104 = false;
	private boolean controlB10x = false;
	private boolean controlB10y = false;
	private boolean controlB10z = false;

	
	private String auxiliar;
	
	SAXParserFactory spf = SAXParserFactory.newInstance();
	
	private ArrayList<SensingCanFrame> frames= new ArrayList<SensingCanFrame>();
	private SensingCanFrame CurrentFrame; 

public jSensingCanParser(String pathXMLfile) throws IOException
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

public SensingCanFrame[] parseFile()
{
	SensingCanFrame [] frameArray=new SensingCanFrame[0];
	return this.frames.toArray(frameArray);
}

public void characters(char[] buffer, int start, int length) 
{
	if (controlB011 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB012 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB013 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB014 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB01x && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB01y && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB01z && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
		else if (controlB021 && controlRawdata)
	{
			this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB022 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB023 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB024 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB02x && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB02y && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB02z && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB031 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB032 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB033 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB034 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB03x && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB03y && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB03z && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB041 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB042 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB043 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB044 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB04x && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB04y && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB04z && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB051 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB052 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB053 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB054 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB05x && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB05y && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB05z && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB061 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB062 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB063 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB064 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB06x && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB06y && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB06z && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB071 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB072 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB073 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB074 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB07x && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB07y && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB07z && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB081 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB082 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB083 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB084 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB08x && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB08y && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB08z && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB091 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB092 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB093 && controlRawdata)	
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB094 && controlRawdata)	
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB09x && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB09y && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB09z && controlRawdata)	
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB101 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB102 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB103 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB104 && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB10x && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB10y && controlRawdata)
	{
		this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
	}
	else if (controlB10z && controlRawdata)
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
		  CurrentFrame = new SensingCanFrame();
		  CurrentFrame.setTimestamp(Double.parseDouble(atts.getValue(0)));
		  controlRawdata = true; 
	  }		 
	  else if (qName.equals("B011")&& controlRawdata)
	  {
	   controlB011=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B012")&& controlRawdata)
	  {
	   controlB012=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B013")&& controlRawdata)
	  {
	   controlB013=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B014")&& controlRawdata)
	  {
	   controlB014=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B01x")&& controlRawdata)
	  {
	   controlB01x=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B01y")&& controlRawdata)
	  {
	   controlB01y=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B01z")&& controlRawdata)
	  {
	   controlB01z=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B021")&& controlRawdata)
	  {
	   controlB021=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B022")&& controlRawdata)
	  {
	   controlB022=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B023")&& controlRawdata)
	  {
	   controlB023=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B024")&& controlRawdata)
	  {
	   controlB024=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B02x")&& controlRawdata)
	  {
	   controlB02x=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B02y")&& controlRawdata)
	  {
	   controlB02y=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B02z")&& controlRawdata)
	  {
	   controlB02z=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B031")&& controlRawdata)
	  {
	   controlB031=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B032")&& controlRawdata)
	  {
	   controlB032=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B033")&& controlRawdata)
	  {
	   controlB033=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B034")&& controlRawdata)
	  {
	   controlB034=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B03x")&& controlRawdata)
	  {
	   controlB03x=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B03y")&& controlRawdata)
	  {
	   controlB03y=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B03z")&& controlRawdata)
	  {
	   controlB03z=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B041")&& controlRawdata)
	  {
	   controlB041=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B042")&& controlRawdata)
	  {
	   controlB042=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B043")&& controlRawdata)
	  {
	   controlB043=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B044")&& controlRawdata)
	  {
	   controlB044=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B04x")&& controlRawdata)
	  {
	   controlB04x=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B04y")&& controlRawdata)
	  {
	   controlB04y=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B04z")&& controlRawdata)
	  {
	   controlB04z=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B051")&& controlRawdata)
	  {
	   controlB051=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B052")&& controlRawdata)
	  {
	   controlB052=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B053")&& controlRawdata)
	  {
	   controlB053=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B054")&& controlRawdata)
	  {
	   controlB054=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B05x")&& controlRawdata)
	  {
	   controlB05x=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B05y")&& controlRawdata)
	  {
	   controlB05y=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B05z")&& controlRawdata)
	  {
	   controlB05z=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B061")&& controlRawdata)
	  {
	   controlB061=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B061")&& controlRawdata)
	  {
	   controlB061=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B062")&& controlRawdata)
	  {
	   controlB062=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B063")&& controlRawdata)
	  {
	   controlB063=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B064")&& controlRawdata)
	  {
	   controlB064=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B06x")&& controlRawdata)
	  {
	   controlB06x=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B06y")&& controlRawdata)
	  {
	   controlB06y=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B06z")&& controlRawdata)
	  {
	   controlB06z=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B071")&& controlRawdata)
	  {
	   controlB071=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B072")&& controlRawdata)
	  {
	   controlB072=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B073")&& controlRawdata)
	  {
	   controlB073=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B074")&& controlRawdata)
	  {
	   controlB074=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B07x")&& controlRawdata)
	  {
	   controlB07x=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B07y")&& controlRawdata)
	  {
	   controlB07y=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B07z")&& controlRawdata)
	  {
	   controlB07z=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B081")&& controlRawdata)
	  {
	   controlB081=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B082")&& controlRawdata)
	  {
	   controlB082=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B083")&& controlRawdata)
	  {
	   controlB083=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B084")&& controlRawdata)
	  {
	   controlB084=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B08x")&& controlRawdata)
	  {
	   controlB08x=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B08y")&& controlRawdata)
	  {
	   controlB08y=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B08z")&& controlRawdata)
	  {
	   controlB08z=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B091")&& controlRawdata)
	  {
	   controlB091=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B092")&& controlRawdata)
	  {
	   controlB092=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B093")&& controlRawdata)
	  {
	   controlB093=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B094")&& controlRawdata)
	  {
	   controlB094=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B09x")&& controlRawdata)
	  {
	   controlB09x=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B09y")&& controlRawdata)
	  {
	   controlB09y=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B09z")&& controlRawdata)
	  {
	   controlB09z=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B101")&& controlRawdata)
	  {
	   controlB101=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B102")&& controlRawdata)
	  {
	   controlB102=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B103")&& controlRawdata)
	  {
	   controlB103=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B104")&& controlRawdata)
	  {
	   controlB104=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B10x")&& controlRawdata)
	  {
	   controlB10x=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B10y")&& controlRawdata)
	  {
	   controlB10y=true;
	   this.auxiliar="";
	  }
	  else if (qName.equals("B10z")&& controlRawdata)
	  {
	   controlB10z=true;
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
	  else if (qName.equals("B011")&& controlRawdata)
	  {
	   CurrentFrame.setDataBone(0, Integer.parseInt(this.auxiliar));
	   controlB011=false;
	  }
	  else if (qName.equals("B012")&& controlRawdata)
	  {
	   CurrentFrame.setDataBone(1, Integer.parseInt(this.auxiliar));
	   controlB012=false;
	  }
	  else if (qName.equals("B013")&& controlRawdata)
	  {
	   CurrentFrame.setDataBone(2, Integer.parseInt(this.auxiliar));
	   controlB013=false;
	  }
	  else if (qName.equals("B014")&& controlRawdata)
	  {
	   CurrentFrame.setDataBone(3, Integer.parseInt(this.auxiliar));
	   controlB014=false;
	  }
	  else if (qName.equals("B01x")&& controlRawdata)
	  {
	   CurrentFrame.setDataBone(4, Integer.parseInt(this.auxiliar));
	   controlB01x=false;
	  }
	  else if (qName.equals("B01y")&& controlRawdata)
	  {
	   CurrentFrame.setDataBone(5, Integer.parseInt(this.auxiliar));
	   controlB01y=false;
	  }
	  else if (qName.equals("B01z")&& controlRawdata)
	  {
	   CurrentFrame.setDataBone(6, Integer.parseInt(this.auxiliar));
	   controlB01z=false;
	  }
	  

	  
	  else if (qName.equals("B021")&& controlRawdata)
	  {
	   CurrentFrame.setDataBtwo(0, Integer.parseInt(this.auxiliar));
	   controlB021=false;
	  }
	  else if (qName.equals("B022")&& controlRawdata)
	  {
	   CurrentFrame.setDataBtwo(1, Integer.parseInt(this.auxiliar));
	   controlB022=false;
	  }
	  else if (qName.equals("B023")&& controlRawdata)
	  {
	   CurrentFrame.setDataBtwo(2, Integer.parseInt(this.auxiliar));
	   controlB023=false;
	  }
	  else if (qName.equals("B024")&& controlRawdata)
	  {
	   CurrentFrame.setDataBtwo(3, Integer.parseInt(this.auxiliar));
	   controlB024=false;
	  }
	  else if (qName.equals("B02x")&& controlRawdata)
	  {
	   CurrentFrame.setDataBtwo(4, Integer.parseInt(this.auxiliar));
	   controlB02x=false;
	  }
	  else if (qName.equals("B02y")&& controlRawdata)
	  {
	   CurrentFrame.setDataBtwo(5, Integer.parseInt(this.auxiliar));
	   controlB02y=false;
	  }
	  else if (qName.equals("B02z")&& controlRawdata)
	  {
	   CurrentFrame.setDataBtwo(6, Integer.parseInt(this.auxiliar));
	   controlB02z=false;
	  }

	  
	  else if (qName.equals("B031")&& controlRawdata)
	  {
	   CurrentFrame.setDataBthree(0, Integer.parseInt(this.auxiliar));
	   controlB031=false;
	  }
	  else if (qName.equals("B032")&& controlRawdata)
	  {
	   CurrentFrame.setDataBthree(1, Integer.parseInt(this.auxiliar));
	   controlB032=false;
	  }
	  else if (qName.equals("B033")&& controlRawdata)
	  {
	   CurrentFrame.setDataBthree(2, Integer.parseInt(this.auxiliar));
	   controlB033=false;
	  }
	  else if (qName.equals("B034")&& controlRawdata)
	  {
	   CurrentFrame.setDataBthree(3, Integer.parseInt(this.auxiliar));
	   controlB034=false;
	  }
	  else if (qName.equals("B03x")&& controlRawdata)
	  {
	   CurrentFrame.setDataBthree(4, Integer.parseInt(this.auxiliar));
	   controlB03x=false;
	  }
	  else if (qName.equals("B03y")&& controlRawdata)
	  {
	   CurrentFrame.setDataBthree(5, Integer.parseInt(this.auxiliar));
	   controlB03y=false;
	  }
	  else if (qName.equals("B03z")&& controlRawdata)
	  {
	   CurrentFrame.setDataBthree(6, Integer.parseInt(this.auxiliar));
	   controlB03z=false;
	  }


	  
	  
	  
	  else if (qName.equals("B041")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfour(0, Integer.parseInt(this.auxiliar));
	   controlB041=false;
	  }
	  else if (qName.equals("B042")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfour(1, Integer.parseInt(this.auxiliar));
	   controlB042=false;
	  }
	  else if (qName.equals("B043")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfour(2, Integer.parseInt(this.auxiliar));
	   controlB043=false;
	  }
	  else if (qName.equals("B044")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfour(3, Integer.parseInt(this.auxiliar));
	   controlB044=false;
	  }
	  else if (qName.equals("B04x")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfour(4, Integer.parseInt(this.auxiliar));
	   controlB04x=false;
	  }
	  else if (qName.equals("B04y")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfour(5, Integer.parseInt(this.auxiliar));
	   controlB04y=false;
	  }
	  else if (qName.equals("B04z")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfour(6, Integer.parseInt(this.auxiliar));
	   controlB04z=false;
	  }

	  

	  
	  
	  
	  else if (qName.equals("B051")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfive(0, Integer.parseInt(this.auxiliar));
	   controlB051=false;
	  }
	  else if (qName.equals("B052")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfive(1, Integer.parseInt(this.auxiliar));
	   controlB052=false;
	  }
	  else if (qName.equals("B053")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfive(2, Integer.parseInt(this.auxiliar));
	   controlB053=false;
	  }
	  else if (qName.equals("B054")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfive(3, Integer.parseInt(this.auxiliar));
	   controlB054=false;
	  }
	  else if (qName.equals("B05x")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfive(4, Integer.parseInt(this.auxiliar));
	   controlB05x=false;
	  }
	  else if (qName.equals("B05y")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfive(5, Integer.parseInt(this.auxiliar));
	   controlB05y=false;
	  }
	  else if (qName.equals("B05z")&& controlRawdata)
	  {
	   CurrentFrame.setDataBfive(6, Integer.parseInt(this.auxiliar));
	   controlB05z=false;
	  }

	  
	  
	  
	  

	  else if (qName.equals("B061")&& controlRawdata)
	  {
	   CurrentFrame.setDataBsix(0, Integer.parseInt(this.auxiliar));
	   controlB061=false;
	  }
	  else if (qName.equals("B062")&& controlRawdata)
	  {
	   CurrentFrame.setDataBsix(1, Integer.parseInt(this.auxiliar));
	   controlB062=false;
	  }
	  else if (qName.equals("B063")&& controlRawdata)
	  {
	   CurrentFrame.setDataBsix(2, Integer.parseInt(this.auxiliar));
	   controlB063=false;
	  }
	  else if (qName.equals("B064")&& controlRawdata)
	  {
	   CurrentFrame.setDataBsix(3, Integer.parseInt(this.auxiliar));
	   controlB064=false;
	  }
	  else if (qName.equals("B06x")&& controlRawdata)
	  {
	   CurrentFrame.setDataBsix(4, Integer.parseInt(this.auxiliar));
	   controlB06x=false;
	  }
	  else if (qName.equals("B06y")&& controlRawdata)
	  {
	   CurrentFrame.setDataBsix(5, Integer.parseInt(this.auxiliar));
	   controlB06y=false;
	  }
	  else if (qName.equals("B06z")&& controlRawdata)
	  {
	   CurrentFrame.setDataBsix(6, Integer.parseInt(this.auxiliar));
	   controlB06z=false;
	  }


	  
	  
	  
	  
	  
	  
	  
	  
	  

	  else if (qName.equals("B071")&& controlRawdata)
	  {
	   CurrentFrame.setDataBseven(0, Integer.parseInt(this.auxiliar));
	   controlB071=false;
	  }
	  else if (qName.equals("B072")&& controlRawdata)
	  {
	   CurrentFrame.setDataBseven(1, Integer.parseInt(this.auxiliar));
	   controlB072=false;
	  }
	  else if (qName.equals("B073")&& controlRawdata)
	  {
	   CurrentFrame.setDataBseven(2, Integer.parseInt(this.auxiliar));
	   controlB073=false;
	  }
	  else if (qName.equals("B074")&& controlRawdata)
	  {
	   CurrentFrame.setDataBseven(3, Integer.parseInt(this.auxiliar));
	   controlB074=false;
	  }
	  else if (qName.equals("B07x")&& controlRawdata)
	  {
	   CurrentFrame.setDataBseven(4, Integer.parseInt(this.auxiliar));
	   controlB07x=false;
	  }
	  else if (qName.equals("B07y")&& controlRawdata)
	  {
	   CurrentFrame.setDataBseven(5, Integer.parseInt(this.auxiliar));
	   controlB07y=false;
	  }
	  else if (qName.equals("B07z")&& controlRawdata)
	  {
	   CurrentFrame.setDataBseven(6, Integer.parseInt(this.auxiliar));
	   controlB07z=false;
	  }

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  else if (qName.equals("B081")&& controlRawdata)
	  {
	   CurrentFrame.setDataBeight(0, Integer.parseInt(this.auxiliar));
	   controlB081=false;
	  }
	  else if (qName.equals("B082")&& controlRawdata)
	  {
	   CurrentFrame.setDataBeight(1, Integer.parseInt(this.auxiliar));
	   controlB082=false;
	  }
	  else if (qName.equals("B083")&& controlRawdata)
	  {
	   CurrentFrame.setDataBeight(2, Integer.parseInt(this.auxiliar));
	   controlB083=false;
	  }
	  else if (qName.equals("B084")&& controlRawdata)
	  {
	   CurrentFrame.setDataBeight(3, Integer.parseInt(this.auxiliar));
	   controlB084=false;
	  }
	  else if (qName.equals("B08x")&& controlRawdata)
	  {
	   CurrentFrame.setDataBeight(4, Integer.parseInt(this.auxiliar));
	   controlB08x=false;
	  }
	  else if (qName.equals("B08y")&& controlRawdata)
	  {
	   CurrentFrame.setDataBeight(5, Integer.parseInt(this.auxiliar));
	   controlB08y=false;
	  }
	  else if (qName.equals("B08z")&& controlRawdata)
	  {
	   CurrentFrame.setDataBeight(6, Integer.parseInt(this.auxiliar));
	   controlB08z=false;
	  }

	  

	  

	  else if (qName.equals("B091")&& controlRawdata)
	  {
	   CurrentFrame.setDataBnine(0, Integer.parseInt(this.auxiliar));
	   controlB091=false;
	  }
	  else if (qName.equals("B092")&& controlRawdata)
	  {
	   CurrentFrame.setDataBnine(1, Integer.parseInt(this.auxiliar));
	   controlB092=false;
	  }
	  else if (qName.equals("B093")&& controlRawdata)
	  {
	   CurrentFrame.setDataBnine(2, Integer.parseInt(this.auxiliar));
	   controlB093=false;
	  }
	  else if (qName.equals("B094")&& controlRawdata)
	  {
	   CurrentFrame.setDataBnine(3, Integer.parseInt(this.auxiliar));
	   controlB094=false;
	  }
	  else if (qName.equals("B09x")&& controlRawdata)
	  {
	   CurrentFrame.setDataBnine(4, Integer.parseInt(this.auxiliar));
	   controlB09x=false;
	  }
	  else if (qName.equals("B09y")&& controlRawdata)
	  {
	   CurrentFrame.setDataBnine(5, Integer.parseInt(this.auxiliar));
	   controlB09y=false;
	  }
	  else if (qName.equals("B09z")&& controlRawdata)
	  {
	   CurrentFrame.setDataBnine(6, Integer.parseInt(this.auxiliar));
	   controlB09z=false;
	  }

	   
	  


	  

	  

	  else if (qName.equals("B101")&& controlRawdata)
	  {
	   CurrentFrame.setDataBten(0, Integer.parseInt(this.auxiliar));
	   controlB101=false;
	  }
	  else if (qName.equals("B102")&& controlRawdata)
	  {
	   CurrentFrame.setDataBten(1, Integer.parseInt(this.auxiliar));
	   controlB102=false;
	  }
	  else if (qName.equals("B103")&& controlRawdata)
	  {
	   CurrentFrame.setDataBten(2, Integer.parseInt(this.auxiliar));
	   controlB103=false;
	  }
	  else if (qName.equals("B104")&& controlRawdata)
	  {
	   CurrentFrame.setDataBten(3, Integer.parseInt(this.auxiliar));
	   controlB104=false;
	  }
	  else if (qName.equals("B10x")&& controlRawdata)
	  {
	   CurrentFrame.setDataBten(4, Integer.parseInt(this.auxiliar));
	   controlB10x=false;
	  }
	  else if (qName.equals("B10y")&& controlRawdata)
	  {
	   CurrentFrame.setDataBten(5, Integer.parseInt(this.auxiliar));
	   controlB10y=false;
	  }
	  else if (qName.equals("B10z")&& controlRawdata)
	  {
	   CurrentFrame.setDataBten(6, Integer.parseInt(this.auxiliar));
	   controlB10z=false;
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