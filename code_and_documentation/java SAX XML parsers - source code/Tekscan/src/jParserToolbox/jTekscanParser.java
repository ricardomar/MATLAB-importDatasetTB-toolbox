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


public class jTekscanParser extends DefaultHandler
{
	private boolean controlRawdata = false;
	
	private boolean controltDistal1= false;
	private boolean controltDistal2= false;
	private boolean controltDistal3= false;
	private boolean controltDistal4= false;
	private boolean controltDistal5= false;
	private boolean controltDistal6= false;
	private boolean controltDistal7= false;
	private boolean controltDistal8= false;
	private boolean controltDistal9= false;
	private boolean controltDistal10= false;
	private boolean controltDistal11= false;
	private boolean controltDistal12= false;
	private boolean controltDistal13= false;
	private boolean controltDistal14= false;
	private boolean controltDistal15= false;
	private boolean controltDistal16= false;

	private boolean controliDistal1= false;
	private boolean controliDistal2= false;
	private boolean controliDistal3= false;
	private boolean controliDistal4= false;
	private boolean controliDistal5= false;
	private boolean controliDistal6= false;
	private boolean controliDistal7= false;
	private boolean controliDistal8= false;
	private boolean controliDistal9= false;
	private boolean controliDistal10= false;
	private boolean controliDistal11= false;
	private boolean controliDistal12= false;
	private boolean controliDistal13= false;
	private boolean controliDistal14= false;
	private boolean controliDistal15= false;
	private boolean controliDistal16= false;

	private boolean controlmDistal1= false;
	private boolean controlmDistal2= false;
	private boolean controlmDistal3= false;
	private boolean controlmDistal4= false;
	private boolean controlmDistal5= false;
	private boolean controlmDistal6= false;
	private boolean controlmDistal7= false;
	private boolean controlmDistal8= false;
	private boolean controlmDistal9= false;
	private boolean controlmDistal10= false;
	private boolean controlmDistal11= false;
	private boolean controlmDistal12= false;
	private boolean controlmDistal13= false;
	private boolean controlmDistal14= false;
	private boolean controlmDistal15= false;
	private boolean controlmDistal16= false;

	private boolean controlrDistal1= false;
	private boolean controlrDistal2= false;
	private boolean controlrDistal3= false;
	private boolean controlrDistal4= false;
	private boolean controlrDistal5= false;
	private boolean controlrDistal6= false;
	private boolean controlrDistal7= false;
	private boolean controlrDistal8= false;
	private boolean controlrDistal9= false;
	private boolean controlrDistal10= false;
	private boolean controlrDistal11= false;
	private boolean controlrDistal12= false;
	private boolean controlrDistal13= false;
	private boolean controlrDistal14= false;
	private boolean controlrDistal15= false;
	private boolean controlrDistal16= false;

	private boolean controllDistal1= false;
	private boolean controllDistal2= false;
	private boolean controllDistal3= false;
	private boolean controllDistal4= false;
	private boolean controllDistal5= false;
	private boolean controllDistal6= false;
	private boolean controllDistal7= false;
	private boolean controllDistal8= false;
	private boolean controllDistal9= false;
	private boolean controllDistal10= false;
	private boolean controllDistal11= false;
	private boolean controllDistal12= false;
	private boolean controllDistal13= false;
	private boolean controllDistal14= false;
	private boolean controllDistal15= false;
	private boolean controllDistal16= false;

	private boolean controliMedial1= false;
	private boolean controliMedial2= false;
	private boolean controliMedial3= false;
	private boolean controliMedial4= false;
	private boolean controliMedial5= false;
	private boolean controliMedial6= false;
	private boolean controliMedial7= false;
	private boolean controliMedial8= false;
	private boolean controliMedial9= false;
	private boolean controliMedial10= false;
	private boolean controliMedial11= false;
	private boolean controliMedial12= false;

	private boolean controlmMedial1= false;
	private boolean controlmMedial2= false;
	private boolean controlmMedial3= false;
	private boolean controlmMedial4= false;
	private boolean controlmMedial5= false;
	private boolean controlmMedial6= false;
	private boolean controlmMedial7= false;
	private boolean controlmMedial8= false;
	private boolean controlmMedial9= false;
	private boolean controlmMedial10= false;
	private boolean controlmMedial11= false;
	private boolean controlmMedial12= false;

	private boolean controlrMedial1= false;
	private boolean controlrMedial2= false;
	private boolean controlrMedial3= false;
	private boolean controlrMedial4= false;
	private boolean controlrMedial5= false;
	private boolean controlrMedial6= false;
	private boolean controlrMedial7= false;
	private boolean controlrMedial8= false;
	private boolean controlrMedial9= false;
	private boolean controlrMedial10= false;
	private boolean controlrMedial11= false;
	private boolean controlrMedial12= false;

	private boolean controllMedial1= false;
	private boolean controllMedial2= false;
	private boolean controllMedial3= false;
	private boolean controllMedial4= false;
	private boolean controllMedial5= false;
	private boolean controllMedial6= false;
	private boolean controllMedial7= false;
	private boolean controllMedial8= false;
	private boolean controllMedial9= false;
	private boolean controllMedial10= false;
	private boolean controllMedial11= false;
	private boolean controllMedial12= false;
	
	private boolean controltProximal1= false;
	private boolean controltProximal2= false;
	private boolean controltProximal3= false;
	private boolean controltProximal4= false;
	private boolean controltProximal5= false;
	private boolean controltProximal6= false;
	private boolean controltProximal7= false;
	private boolean controltProximal8= false;
	private boolean controltProximal9= false;
	private boolean controltProximal10= false;
	private boolean controltProximal11= false;
	private boolean controltProximal12= false;

	private boolean controliProximal1= false;
	private boolean controliProximal2= false;
	private boolean controliProximal3= false;
	private boolean controliProximal4= false;
	private boolean controliProximal5= false;
	private boolean controliProximal6= false;
	private boolean controliProximal7= false;
	private boolean controliProximal8= false;
	private boolean controliProximal9= false;
	private boolean controliProximal10= false;
	private boolean controliProximal11= false;
	private boolean controliProximal12= false;

	private boolean controlmProximal1= false;
	private boolean controlmProximal2= false;
	private boolean controlmProximal3= false;
	private boolean controlmProximal4= false;
	private boolean controlmProximal5= false;
	private boolean controlmProximal6= false;
	private boolean controlmProximal7= false;
	private boolean controlmProximal8= false;
	private boolean controlmProximal9= false;
	private boolean controlmProximal10= false;
	private boolean controlmProximal11= false;
	private boolean controlmProximal12= false;

	private boolean controlrProximal1= false;
	private boolean controlrProximal2= false;
	private boolean controlrProximal3= false;
	private boolean controlrProximal4= false;
	private boolean controlrProximal5= false;
	private boolean controlrProximal6= false;
	private boolean controlrProximal7= false;
	private boolean controlrProximal8= false;
	private boolean controlrProximal9= false;
	private boolean controlrProximal10= false;
	private boolean controlrProximal11= false;
	private boolean controlrProximal12= false;

	private boolean controllProximal1= false;
	private boolean controllProximal2= false;
	private boolean controllProximal3= false;
	private boolean controllProximal4= false;
	private boolean controllProximal5= false;
	private boolean controllProximal6= false;
	private boolean controllProximal7= false;
	private boolean controllProximal8= false;
	private boolean controllProximal9= false;
	private boolean controllProximal10= false;
	private boolean controllProximal11= false;
	private boolean controllProximal12= false;

	private boolean controlpFingers1= false;
	private boolean controlpFingers2= false;
	private boolean controlpFingers3= false;
	private boolean controlpFingers4= false;
	private boolean controlpFingers5= false;
	private boolean controlpFingers6= false;
	private boolean controlpFingers7= false;
	private boolean controlpFingers8= false;
	private boolean controlpFingers9= false;
	private boolean controlpFingers10= false;
	private boolean controlpFingers11= false;
	private boolean controlpFingers12= false;
	private boolean controlpFingers13= false;
	private boolean controlpFingers14= false;
	private boolean controlpFingers15= false;
	private boolean controlpFingers16= false;
	private boolean controlpFingers17= false;
	private boolean controlpFingers18= false;
	private boolean controlpFingers19= false;
	private boolean controlpFingers20= false;
	private boolean controlpFingers21= false;
	private boolean controlpFingers22= false;
	private boolean controlpFingers23= false;
	private boolean controlpFingers24= false;
	private boolean controlpFingers25= false;
	private boolean controlpFingers26= false;
	private boolean controlpFingers27= false;
	private boolean controlpFingers28= false;
	private boolean controlpFingers29= false;
	private boolean controlpFingers30= false;
	private boolean controlpFingers31= false;
	private boolean controlpFingers32= false;
	private boolean controlpFingers33= false;
	private boolean controlpFingers34= false;
	private boolean controlpFingers35= false;
	private boolean controlpFingers36= false;
	private boolean controlpFingers37= false;
	private boolean controlpFingers38= false;
	private boolean controlpFingers39= false;
	private boolean controlpFingers40= false;
	private boolean controlpFingers41= false;
	private boolean controlpFingers42= false;
	private boolean controlpFingers43= false;
	private boolean controlpFingers44= false;
	private boolean controlpFingers45= false;
	private boolean controlpFingers46= false;
	private boolean controlpFingers47= false;
	private boolean controlpFingers48= false;
	private boolean controlpFingers49= false;
	private boolean controlpFingers50= false;
	private boolean controlpFingers51= false;
	private boolean controlpFingers52= false;
	private boolean controlpFingers53= false;
	private boolean controlpFingers54= false;
	private boolean controlpFingers55= false;
	private boolean controlpFingers56= false;
	private boolean controlpFingers57= false;
	private boolean controlpFingers58= false;
	private boolean controlpFingers59= false;
	private boolean controlpFingers60= false;
	private boolean controlpFingers61= false;
	private boolean controlpFingers62= false;
	private boolean controlpFingers63= false;
	private boolean controlpFingers64= false;
	private boolean controlpFingers65= false;
	private boolean controlpFingers66= false;
	private boolean controlpFingers67= false;
	private boolean controlpFingers68= false;
	private boolean controlpFingers69= false;
	private boolean controlpFingers70= false;
	private boolean controlpFingers71= false;
	private boolean controlpFingers72= false;
	private boolean controlpFingers73= false;
	private boolean controlpFingers74= false;
	private boolean controlpFingers75= false;
	private boolean controlpFingers76= false;
	
	private boolean controlpInternal1= false;
	private boolean controlpInternal2= false;
	private boolean controlpInternal3= false;
	private boolean controlpInternal4= false;
	private boolean controlpInternal5= false;
	private boolean controlpInternal6= false;
	private boolean controlpInternal7= false;
	private boolean controlpInternal8= false;
	private boolean controlpInternal9= false;
	private boolean controlpInternal10= false;
	private boolean controlpInternal11= false;
	private boolean controlpInternal12= false;
	private boolean controlpInternal13= false;
	private boolean controlpInternal14= false;
	private boolean controlpInternal15= false;
	private boolean controlpInternal16= false;
	private boolean controlpInternal17= false;
	private boolean controlpInternal18= false;
	private boolean controlpInternal19= false;
	private boolean controlpInternal20= false;
	private boolean controlpInternal21= false;
	private boolean controlpInternal22= false;
	private boolean controlpInternal23= false;
	private boolean controlpInternal24= false;
	private boolean controlpInternal25= false;
	private boolean controlpInternal26= false;
	private boolean controlpInternal27= false;
	private boolean controlpInternal28= false;
	private boolean controlpInternal29= false;
	private boolean controlpInternal30= false;
	private boolean controlpInternal31= false;
	private boolean controlpInternal32= false;
	private boolean controlpInternal33= false;
	private boolean controlpInternal34= false;
	private boolean controlpInternal35= false;
	private boolean controlpInternal36= false;
	private boolean controlpInternal37= false;
	private boolean controlpInternal38= false;
	private boolean controlpInternal39= false;
	private boolean controlpInternal40= false;
	private boolean controlpInternal41= false;
	private boolean controlpInternal42= false;
	private boolean controlpInternal43= false;
	private boolean controlpInternal44= false;
	private boolean controlpInternal45= false;

	private boolean controlpExternal1= false;
	private boolean controlpExternal2= false;
	private boolean controlpExternal3= false;
	private boolean controlpExternal4= false;
	private boolean controlpExternal5= false;
	private boolean controlpExternal6= false;
	private boolean controlpExternal7= false;
	private boolean controlpExternal8= false;
	private boolean controlpExternal9= false;
	private boolean controlpExternal10= false;
	private boolean controlpExternal11= false;
	private boolean controlpExternal12= false;
	private boolean controlpExternal13= false;
	private boolean controlpExternal14= false;
	private boolean controlpExternal15= false;
	private boolean controlpExternal16= false;
	private boolean controlpExternal17= false;
	private boolean controlpExternal18= false;
	private boolean controlpExternal19= false;
	private boolean controlpExternal20= false;
	private boolean controlpExternal21= false;
	private boolean controlpExternal22= false;
	private boolean controlpExternal23= false;
	private boolean controlpExternal24= false;
	private boolean controlpExternal25= false;
	private boolean controlpExternal26= false;
	private boolean controlpExternal27= false;
	private boolean controlpExternal28= false;
	private boolean controlpExternal29= false;
	private boolean controlpExternal30= false;
	private boolean controlpExternal31= false;
	private boolean controlpExternal32= false;
	private boolean controlpExternal33= false;
	private boolean controlpExternal34= false;
	private boolean controlpExternal35= false;
	private boolean controlpExternal36= false;
	private boolean controlpExternal37= false;
	private boolean controlpExternal38= false;
	private boolean controlpExternal39= false;
	private boolean controlpExternal40= false;
	private boolean controlpExternal41= false;
	private boolean controlpExternal42= false;
	private boolean controlpExternal43= false;
	private boolean controlpExternal44= false;
	private boolean controlpExternal45= false;
	private boolean controlpExternal46= false;
	private boolean controlpExternal47= false;
	private boolean controlpExternal48= false;
	private boolean controlpExternal49= false;
	private boolean controlpExternal50= false;
	private boolean controlpExternal51= false;
	private boolean controlpExternal52= false;
	
	private String auxiliar;
	
	SAXParserFactory spf = SAXParserFactory.newInstance();
	
	private ArrayList<TekscanFrame> frames= new ArrayList<TekscanFrame>();
	private TekscanFrame CurrentFrame; 
	
	public jTekscanParser(String pathXMLfile) throws IOException
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
	
	public TekscanFrame[] parseFile()
	{
		TekscanFrame [] frameArray=new TekscanFrame[0];
		return this.frames.toArray(frameArray);
	}
	
	public void characters(char[] buffer, int start, int length) 
	{
		if (controltDistal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal13 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal14 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal15 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltDistal16 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal13 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal14 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal15 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliDistal16 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal13 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal14 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal15 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmDistal16 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal13 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal14 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal15 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrDistal16 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal13 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal14 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal15 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllDistal16 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		
		else if (controliMedial1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliMedial12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmMedial12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrMedial12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllMedial12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controltProximal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controliProximal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlmProximal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlrProximal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controllProximal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlpFingers1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers13 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers14 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers15 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers16 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers17 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers18 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers19 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers20 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers21 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers22 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers23 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers24 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers25 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers26 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers27 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers28 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers29 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers30 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers31 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers32 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers33 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers34 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers35 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers36 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers37 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers38 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers39 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers40 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers41 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers42 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers43 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers44 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers45 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers46 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers47 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers48 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers49 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers50 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers51 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers52 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers53 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers54 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers55 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers56 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers57 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers58 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers59 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers60 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers61 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers62 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers63 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers64 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers65 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers66 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers67 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers68 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers69 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers70 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers71 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers72 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers73 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers74 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers75 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpFingers76 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlpInternal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal13 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal14 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal15 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal16 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal17 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal18 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal19 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal20 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal21 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal22 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal23 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal24 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal25 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal26 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal27 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal28 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal29 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal30 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal31 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal32 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal33 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal34 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal35 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal36 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal37 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal38 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal39 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal40 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal41 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal42 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal43 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal44 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpInternal45 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}
		else if (controlpExternal1 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal2 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal3 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal4 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal5 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal6 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal7 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal8 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal9 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal10 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal11 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal12 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal13 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal14 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal15 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal16 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal17 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal18 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal19 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal20 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal21 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal22 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal23 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal24 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal25 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal26 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal27 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal28 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal29 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal30 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal31 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal32 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal33 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal34 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal35 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal36 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal37 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal38 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal39 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal40 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal41 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal42 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal43 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal44 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal45 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal46 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal47 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal48 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal49 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal50 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal51 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		}

		else if (controlpExternal52 && controlRawdata)
		{
		     this.auxiliar=this.auxiliar.concat(new String(buffer, start, length));
		};
		
	}
	
	//public void startDocument() 
	//{
	//	
	//};

//		public void endDocument() 
//		{
	//	
//		};

	
	
	public void startElement(String namespaceURI, String localName,String qName, Attributes atts) 
	{
		  if(qName.equals("rawdata"))
		  {
			  CurrentFrame = new TekscanFrame();
			  CurrentFrame.setTimestamp(Double.parseDouble(atts.getValue(0)));
			  controlRawdata = true; 
		  }
		  else if (qName.equals("tDistal1")&& controlRawdata)
		  {
		       controltDistal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal2")&& controlRawdata)
		  {
		       controltDistal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal3")&& controlRawdata)
		  {
		       controltDistal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal4")&& controlRawdata)
		  {
		       controltDistal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal5")&& controlRawdata)
		  {
		       controltDistal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal6")&& controlRawdata)
		  {
		       controltDistal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal7")&& controlRawdata)
		  {
		       controltDistal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal8")&& controlRawdata)
		  {
		       controltDistal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal9")&& controlRawdata)
		  {
		       controltDistal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal10")&& controlRawdata)
		  {
		       controltDistal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal11")&& controlRawdata)
		  {
		       controltDistal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal12")&& controlRawdata)
		  {
		       controltDistal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal13")&& controlRawdata)
		  {
		       controltDistal13=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal14")&& controlRawdata)
		  {
		       controltDistal14=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal15")&& controlRawdata)
		  {
		       controltDistal15=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tDistal16")&& controlRawdata)
		  {
		       controltDistal16=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal1")&& controlRawdata)
		  {
		       controliDistal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal2")&& controlRawdata)
		  {
		       controliDistal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal3")&& controlRawdata)
		  {
		       controliDistal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal4")&& controlRawdata)
		  {
		       controliDistal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal5")&& controlRawdata)
		  {
		       controliDistal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal6")&& controlRawdata)
		  {
		       controliDistal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal7")&& controlRawdata)
		  {
		       controliDistal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal8")&& controlRawdata)
		  {
		       controliDistal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal9")&& controlRawdata)
		  {
		       controliDistal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal10")&& controlRawdata)
		  {
		       controliDistal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal11")&& controlRawdata)
		  {
		       controliDistal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal12")&& controlRawdata)
		  {
		       controliDistal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal13")&& controlRawdata)
		  {
		       controliDistal13=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal14")&& controlRawdata)
		  {
		       controliDistal14=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal15")&& controlRawdata)
		  {
		       controliDistal15=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iDistal16")&& controlRawdata)
		  {
		       controliDistal16=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal1")&& controlRawdata)
		  {
		       controlmDistal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal2")&& controlRawdata)
		  {
		       controlmDistal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal3")&& controlRawdata)
		  {
		       controlmDistal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal4")&& controlRawdata)
		  {
		       controlmDistal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal5")&& controlRawdata)
		  {
		       controlmDistal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal6")&& controlRawdata)
		  {
		       controlmDistal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal7")&& controlRawdata)
		  {
		       controlmDistal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal8")&& controlRawdata)
		  {
		       controlmDistal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal9")&& controlRawdata)
		  {
		       controlmDistal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal10")&& controlRawdata)
		  {
		       controlmDistal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal11")&& controlRawdata)
		  {
		       controlmDistal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal12")&& controlRawdata)
		  {
		       controlmDistal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal13")&& controlRawdata)
		  {
		       controlmDistal13=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal14")&& controlRawdata)
		  {
		       controlmDistal14=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal15")&& controlRawdata)
		  {
		       controlmDistal15=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mDistal16")&& controlRawdata)
		  {
		       controlmDistal16=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal1")&& controlRawdata)
		  {
		       controlrDistal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal2")&& controlRawdata)
		  {
		       controlrDistal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal3")&& controlRawdata)
		  {
		       controlrDistal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal4")&& controlRawdata)
		  {
		       controlrDistal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal5")&& controlRawdata)
		  {
		       controlrDistal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal6")&& controlRawdata)
		  {
		       controlrDistal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal7")&& controlRawdata)
		  {
		       controlrDistal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal8")&& controlRawdata)
		  {
		       controlrDistal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal9")&& controlRawdata)
		  {
		       controlrDistal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal10")&& controlRawdata)
		  {
		       controlrDistal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal11")&& controlRawdata)
		  {
		       controlrDistal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal12")&& controlRawdata)
		  {
		       controlrDistal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal13")&& controlRawdata)
		  {
		       controlrDistal13=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal14")&& controlRawdata)
		  {
		       controlrDistal14=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal15")&& controlRawdata)
		  {
		       controlrDistal15=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rDistal16")&& controlRawdata)
		  {
		       controlrDistal16=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal1")&& controlRawdata)
		  {
		       controllDistal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal2")&& controlRawdata)
		  {
		       controllDistal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal3")&& controlRawdata)
		  {
		       controllDistal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal4")&& controlRawdata)
		  {
		       controllDistal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal5")&& controlRawdata)
		  {
		       controllDistal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal6")&& controlRawdata)
		  {
		       controllDistal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal7")&& controlRawdata)
		  {
		       controllDistal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal8")&& controlRawdata)
		  {
		       controllDistal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal9")&& controlRawdata)
		  {
		       controllDistal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal10")&& controlRawdata)
		  {
		       controllDistal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal11")&& controlRawdata)
		  {
		       controllDistal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal12")&& controlRawdata)
		  {
		       controllDistal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal13")&& controlRawdata)
		  {
		       controllDistal13=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal14")&& controlRawdata)
		  {
		       controllDistal14=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal15")&& controlRawdata)
		  {
		       controllDistal15=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lDistal16")&& controlRawdata)
		  {
		       controllDistal16=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial1")&& controlRawdata)
		  {
		       controliMedial1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial2")&& controlRawdata)
		  {
		       controliMedial2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial3")&& controlRawdata)
		  {
		       controliMedial3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial4")&& controlRawdata)
		  {
		       controliMedial4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial5")&& controlRawdata)
		  {
		       controliMedial5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial6")&& controlRawdata)
		  {
		       controliMedial6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial7")&& controlRawdata)
		  {
		       controliMedial7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial8")&& controlRawdata)
		  {
		       controliMedial8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial9")&& controlRawdata)
		  {
		       controliMedial9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial10")&& controlRawdata)
		  {
		       controliMedial10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial11")&& controlRawdata)
		  {
		       controliMedial11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iMedial12")&& controlRawdata)
		  {
		       controliMedial12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial1")&& controlRawdata)
		  {
		       controlmMedial1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial2")&& controlRawdata)
		  {
		       controlmMedial2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial3")&& controlRawdata)
		  {
		       controlmMedial3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial4")&& controlRawdata)
		  {
		       controlmMedial4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial5")&& controlRawdata)
		  {
		       controlmMedial5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial6")&& controlRawdata)
		  {
		       controlmMedial6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial7")&& controlRawdata)
		  {
		       controlmMedial7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial8")&& controlRawdata)
		  {
		       controlmMedial8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial9")&& controlRawdata)
		  {
		       controlmMedial9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial10")&& controlRawdata)
		  {
		       controlmMedial10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial11")&& controlRawdata)
		  {
		       controlmMedial11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mMedial12")&& controlRawdata)
		  {
		       controlmMedial12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial1")&& controlRawdata)
		  {
		       controlrMedial1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial2")&& controlRawdata)
		  {
		       controlrMedial2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial3")&& controlRawdata)
		  {
		       controlrMedial3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial4")&& controlRawdata)
		  {
		       controlrMedial4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial5")&& controlRawdata)
		  {
		       controlrMedial5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial6")&& controlRawdata)
		  {
		       controlrMedial6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial7")&& controlRawdata)
		  {
		       controlrMedial7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial8")&& controlRawdata)
		  {
		       controlrMedial8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial9")&& controlRawdata)
		  {
		       controlrMedial9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial10")&& controlRawdata)
		  {
		       controlrMedial10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial11")&& controlRawdata)
		  {
		       controlrMedial11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rMedial12")&& controlRawdata)
		  {
		       controlrMedial12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial1")&& controlRawdata)
		  {
		       controllMedial1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial2")&& controlRawdata)
		  {
		       controllMedial2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial3")&& controlRawdata)
		  {
		       controllMedial3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial4")&& controlRawdata)
		  {
		       controllMedial4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial5")&& controlRawdata)
		  {
		       controllMedial5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial6")&& controlRawdata)
		  {
		       controllMedial6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial7")&& controlRawdata)
		  {
		       controllMedial7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial8")&& controlRawdata)
		  {
		       controllMedial8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial9")&& controlRawdata)
		  {
		       controllMedial9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial10")&& controlRawdata)
		  {
		       controllMedial10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial11")&& controlRawdata)
		  {
		       controllMedial11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lMedial12")&& controlRawdata)
		  {
		       controllMedial12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal1")&& controlRawdata)
		  {
		       controltProximal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal2")&& controlRawdata)
		  {
		       controltProximal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal3")&& controlRawdata)
		  {
		       controltProximal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal4")&& controlRawdata)
		  {
		       controltProximal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal5")&& controlRawdata)
		  {
		       controltProximal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal6")&& controlRawdata)
		  {
		       controltProximal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal7")&& controlRawdata)
		  {
		       controltProximal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal8")&& controlRawdata)
		  {
		       controltProximal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal9")&& controlRawdata)
		  {
		       controltProximal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal10")&& controlRawdata)
		  {
		       controltProximal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal11")&& controlRawdata)
		  {
		       controltProximal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("tProximal12")&& controlRawdata)
		  {
		       controltProximal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal1")&& controlRawdata)
		  {
		       controliProximal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal2")&& controlRawdata)
		  {
		       controliProximal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal3")&& controlRawdata)
		  {
		       controliProximal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal4")&& controlRawdata)
		  {
		       controliProximal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal5")&& controlRawdata)
		  {
		       controliProximal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal6")&& controlRawdata)
		  {
		       controliProximal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal7")&& controlRawdata)
		  {
		       controliProximal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal8")&& controlRawdata)
		  {
		       controliProximal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal9")&& controlRawdata)
		  {
		       controliProximal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal10")&& controlRawdata)
		  {
		       controliProximal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal11")&& controlRawdata)
		  {
		       controliProximal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("iProximal12")&& controlRawdata)
		  {
		       controliProximal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal1")&& controlRawdata)
		  {
		       controlmProximal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal2")&& controlRawdata)
		  {
		       controlmProximal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal3")&& controlRawdata)
		  {
		       controlmProximal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal4")&& controlRawdata)
		  {
		       controlmProximal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal5")&& controlRawdata)
		  {
		       controlmProximal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal6")&& controlRawdata)
		  {
		       controlmProximal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal7")&& controlRawdata)
		  {
		       controlmProximal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal8")&& controlRawdata)
		  {
		       controlmProximal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal9")&& controlRawdata)
		  {
		       controlmProximal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal10")&& controlRawdata)
		  {
		       controlmProximal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal11")&& controlRawdata)
		  {
		       controlmProximal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("mProximal12")&& controlRawdata)
		  {
		       controlmProximal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal1")&& controlRawdata)
		  {
		       controlrProximal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal2")&& controlRawdata)
		  {
		       controlrProximal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal3")&& controlRawdata)
		  {
		       controlrProximal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal4")&& controlRawdata)
		  {
		       controlrProximal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal5")&& controlRawdata)
		  {
		       controlrProximal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal6")&& controlRawdata)
		  {
		       controlrProximal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal7")&& controlRawdata)
		  {
		       controlrProximal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal8")&& controlRawdata)
		  {
		       controlrProximal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal9")&& controlRawdata)
		  {
		       controlrProximal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal10")&& controlRawdata)
		  {
		       controlrProximal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal11")&& controlRawdata)
		  {
		       controlrProximal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("rProximal12")&& controlRawdata)
		  {
		       controlrProximal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal1")&& controlRawdata)
		  {
		       controllProximal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal2")&& controlRawdata)
		  {
		       controllProximal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal3")&& controlRawdata)
		  {
		       controllProximal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal4")&& controlRawdata)
		  {
		       controllProximal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal5")&& controlRawdata)
		  {
		       controllProximal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal6")&& controlRawdata)
		  {
		       controllProximal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal7")&& controlRawdata)
		  {
		       controllProximal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal8")&& controlRawdata)
		  {
		       controllProximal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal9")&& controlRawdata)
		  {
		       controllProximal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal10")&& controlRawdata)
		  {
		       controllProximal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal11")&& controlRawdata)
		  {
		       controllProximal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("lProximal12")&& controlRawdata)
		  {
		       controllProximal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers1")&& controlRawdata)
		  {
		       controlpFingers1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers2")&& controlRawdata)
		  {
		       controlpFingers2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers3")&& controlRawdata)
		  {
		       controlpFingers3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers4")&& controlRawdata)
		  {
		       controlpFingers4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers5")&& controlRawdata)
		  {
		       controlpFingers5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers6")&& controlRawdata)
		  {
		       controlpFingers6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers7")&& controlRawdata)
		  {
		       controlpFingers7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers8")&& controlRawdata)
		  {
		       controlpFingers8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers9")&& controlRawdata)
		  {
		       controlpFingers9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers10")&& controlRawdata)
		  {
		       controlpFingers10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers11")&& controlRawdata)
		  {
		       controlpFingers11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers12")&& controlRawdata)
		  {
		       controlpFingers12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers13")&& controlRawdata)
		  {
		       controlpFingers13=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers14")&& controlRawdata)
		  {
		       controlpFingers14=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers15")&& controlRawdata)
		  {
		       controlpFingers15=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers16")&& controlRawdata)
		  {
		       controlpFingers16=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers17")&& controlRawdata)
		  {
		       controlpFingers17=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers18")&& controlRawdata)
		  {
		       controlpFingers18=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers19")&& controlRawdata)
		  {
		       controlpFingers19=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers20")&& controlRawdata)
		  {
		       controlpFingers20=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers21")&& controlRawdata)
		  {
		       controlpFingers21=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers22")&& controlRawdata)
		  {
		       controlpFingers22=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers23")&& controlRawdata)
		  {
		       controlpFingers23=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers24")&& controlRawdata)
		  {
		       controlpFingers24=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers25")&& controlRawdata)
		  {
		       controlpFingers25=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers26")&& controlRawdata)
		  {
		       controlpFingers26=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers27")&& controlRawdata)
		  {
		       controlpFingers27=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers28")&& controlRawdata)
		  {
		       controlpFingers28=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers29")&& controlRawdata)
		  {
		       controlpFingers29=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers30")&& controlRawdata)
		  {
		       controlpFingers30=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers31")&& controlRawdata)
		  {
		       controlpFingers31=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers32")&& controlRawdata)
		  {
		       controlpFingers32=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers33")&& controlRawdata)
		  {
		       controlpFingers33=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers34")&& controlRawdata)
		  {
		       controlpFingers34=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers35")&& controlRawdata)
		  {
		       controlpFingers35=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers36")&& controlRawdata)
		  {
		       controlpFingers36=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers37")&& controlRawdata)
		  {
		       controlpFingers37=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers38")&& controlRawdata)
		  {
		       controlpFingers38=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers39")&& controlRawdata)
		  {
		       controlpFingers39=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers40")&& controlRawdata)
		  {
		       controlpFingers40=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers41")&& controlRawdata)
		  {
		       controlpFingers41=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers42")&& controlRawdata)
		  {
		       controlpFingers42=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers43")&& controlRawdata)
		  {
		       controlpFingers43=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers44")&& controlRawdata)
		  {
		       controlpFingers44=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers45")&& controlRawdata)
		  {
		       controlpFingers45=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers46")&& controlRawdata)
		  {
		       controlpFingers46=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers47")&& controlRawdata)
		  {
		       controlpFingers47=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers48")&& controlRawdata)
		  {
		       controlpFingers48=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers49")&& controlRawdata)
		  {
		       controlpFingers49=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers50")&& controlRawdata)
		  {
		       controlpFingers50=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers51")&& controlRawdata)
		  {
		       controlpFingers51=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers52")&& controlRawdata)
		  {
		       controlpFingers52=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers53")&& controlRawdata)
		  {
		       controlpFingers53=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers54")&& controlRawdata)
		  {
		       controlpFingers54=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers55")&& controlRawdata)
		  {
		       controlpFingers55=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers56")&& controlRawdata)
		  {
		       controlpFingers56=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers57")&& controlRawdata)
		  {
		       controlpFingers57=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers58")&& controlRawdata)
		  {
		       controlpFingers58=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers59")&& controlRawdata)
		  {
		       controlpFingers59=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers60")&& controlRawdata)
		  {
		       controlpFingers60=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers61")&& controlRawdata)
		  {
		       controlpFingers61=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers62")&& controlRawdata)
		  {
		       controlpFingers62=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers63")&& controlRawdata)
		  {
		       controlpFingers63=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers64")&& controlRawdata)
		  {
		       controlpFingers64=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers65")&& controlRawdata)
		  {
		       controlpFingers65=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers66")&& controlRawdata)
		  {
		       controlpFingers66=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers67")&& controlRawdata)
		  {
		       controlpFingers67=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers68")&& controlRawdata)
		  {
		       controlpFingers68=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers69")&& controlRawdata)
		  {
		       controlpFingers69=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers70")&& controlRawdata)
		  {
		       controlpFingers70=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers71")&& controlRawdata)
		  {
		       controlpFingers71=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers72")&& controlRawdata)
		  {
		       controlpFingers72=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers73")&& controlRawdata)
		  {
		       controlpFingers73=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers74")&& controlRawdata)
		  {
		       controlpFingers74=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers75")&& controlRawdata)
		  {
		       controlpFingers75=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pFingers76")&& controlRawdata)
		  {
		       controlpFingers76=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal1")&& controlRawdata)
		  {
		       controlpInternal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal2")&& controlRawdata)
		  {
		       controlpInternal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal3")&& controlRawdata)
		  {
		       controlpInternal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal4")&& controlRawdata)
		  {
		       controlpInternal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal5")&& controlRawdata)
		  {
		       controlpInternal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal6")&& controlRawdata)
		  {
		       controlpInternal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal7")&& controlRawdata)
		  {
		       controlpInternal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal8")&& controlRawdata)
		  {
		       controlpInternal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal9")&& controlRawdata)
		  {
		       controlpInternal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal10")&& controlRawdata)
		  {
		       controlpInternal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal11")&& controlRawdata)
		  {
		       controlpInternal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal12")&& controlRawdata)
		  {
		       controlpInternal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal13")&& controlRawdata)
		  {
		       controlpInternal13=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal14")&& controlRawdata)
		  {
		       controlpInternal14=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal15")&& controlRawdata)
		  {
		       controlpInternal15=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal16")&& controlRawdata)
		  {
		       controlpInternal16=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal17")&& controlRawdata)
		  {
		       controlpInternal17=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal18")&& controlRawdata)
		  {
		       controlpInternal18=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal19")&& controlRawdata)
		  {
		       controlpInternal19=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal20")&& controlRawdata)
		  {
		       controlpInternal20=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal21")&& controlRawdata)
		  {
		       controlpInternal21=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal22")&& controlRawdata)
		  {
		       controlpInternal22=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal23")&& controlRawdata)
		  {
		       controlpInternal23=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal24")&& controlRawdata)
		  {
		       controlpInternal24=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal25")&& controlRawdata)
		  {
		       controlpInternal25=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal26")&& controlRawdata)
		  {
		       controlpInternal26=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal27")&& controlRawdata)
		  {
		       controlpInternal27=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal28")&& controlRawdata)
		  {
		       controlpInternal28=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal29")&& controlRawdata)
		  {
		       controlpInternal29=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal30")&& controlRawdata)
		  {
		       controlpInternal30=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal31")&& controlRawdata)
		  {
		       controlpInternal31=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal32")&& controlRawdata)
		  {
		       controlpInternal32=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal33")&& controlRawdata)
		  {
		       controlpInternal33=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal34")&& controlRawdata)
		  {
		       controlpInternal34=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal35")&& controlRawdata)
		  {
		       controlpInternal35=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal36")&& controlRawdata)
		  {
		       controlpInternal36=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal37")&& controlRawdata)
		  {
		       controlpInternal37=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal38")&& controlRawdata)
		  {
		       controlpInternal38=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal39")&& controlRawdata)
		  {
		       controlpInternal39=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal40")&& controlRawdata)
		  {
		       controlpInternal40=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal41")&& controlRawdata)
		  {
		       controlpInternal41=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal42")&& controlRawdata)
		  {
		       controlpInternal42=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal43")&& controlRawdata)
		  {
		       controlpInternal43=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal44")&& controlRawdata)
		  {
		       controlpInternal44=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pInternal45")&& controlRawdata)
		  {
		       controlpInternal45=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal1")&& controlRawdata)
		  {
		       controlpExternal1=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal2")&& controlRawdata)
		  {
		       controlpExternal2=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal3")&& controlRawdata)
		  {
		       controlpExternal3=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal4")&& controlRawdata)
		  {
		       controlpExternal4=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal5")&& controlRawdata)
		  {
		       controlpExternal5=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal6")&& controlRawdata)
		  {
		       controlpExternal6=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal7")&& controlRawdata)
		  {
		       controlpExternal7=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal8")&& controlRawdata)
		  {
		       controlpExternal8=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal9")&& controlRawdata)
		  {
		       controlpExternal9=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal10")&& controlRawdata)
		  {
		       controlpExternal10=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal11")&& controlRawdata)
		  {
		       controlpExternal11=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal12")&& controlRawdata)
		  {
		       controlpExternal12=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal13")&& controlRawdata)
		  {
		       controlpExternal13=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal14")&& controlRawdata)
		  {
		       controlpExternal14=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal15")&& controlRawdata)
		  {
		       controlpExternal15=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal16")&& controlRawdata)
		  {
		       controlpExternal16=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal17")&& controlRawdata)
		  {
		       controlpExternal17=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal18")&& controlRawdata)
		  {
		       controlpExternal18=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal19")&& controlRawdata)
		  {
		       controlpExternal19=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal20")&& controlRawdata)
		  {
		       controlpExternal20=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal21")&& controlRawdata)
		  {
		       controlpExternal21=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal22")&& controlRawdata)
		  {
		       controlpExternal22=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal23")&& controlRawdata)
		  {
		       controlpExternal23=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal24")&& controlRawdata)
		  {
		       controlpExternal24=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal25")&& controlRawdata)
		  {
		       controlpExternal25=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal26")&& controlRawdata)
		  {
		       controlpExternal26=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal27")&& controlRawdata)
		  {
		       controlpExternal27=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal28")&& controlRawdata)
		  {
		       controlpExternal28=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal29")&& controlRawdata)
		  {
		       controlpExternal29=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal30")&& controlRawdata)
		  {
		       controlpExternal30=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal31")&& controlRawdata)
		  {
		       controlpExternal31=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal32")&& controlRawdata)
		  {
		       controlpExternal32=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal33")&& controlRawdata)
		  {
		       controlpExternal33=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal34")&& controlRawdata)
		  {
		       controlpExternal34=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal35")&& controlRawdata)
		  {
		       controlpExternal35=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal36")&& controlRawdata)
		  {
		       controlpExternal36=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal37")&& controlRawdata)
		  {
		       controlpExternal37=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal38")&& controlRawdata)
		  {
		       controlpExternal38=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal39")&& controlRawdata)
		  {
		       controlpExternal39=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal40")&& controlRawdata)
		  {
		       controlpExternal40=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal41")&& controlRawdata)
		  {
		       controlpExternal41=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal42")&& controlRawdata)
		  {
		       controlpExternal42=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal43")&& controlRawdata)
		  {
		       controlpExternal43=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal44")&& controlRawdata)
		  {
		       controlpExternal44=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal45")&& controlRawdata)
		  {
		       controlpExternal45=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal46")&& controlRawdata)
		  {
		       controlpExternal46=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal47")&& controlRawdata)
		  {
		       controlpExternal47=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal48")&& controlRawdata)
		  {
		       controlpExternal48=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal49")&& controlRawdata)
		  {
		       controlpExternal49=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal50")&& controlRawdata)
		  {
		       controlpExternal50=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal51")&& controlRawdata)
		  {
		       controlpExternal51=true;
		       this.auxiliar="";
		  }

		  else if (qName.equals("pExternal52")&& controlRawdata)
		  {
		       controlpExternal52=true;
		       this.auxiliar="";
		  };
	}
	
	public void endElement(String namespaceURI, String localName, String qName)
	{
		  if(qName.equals("rawdata"))
		  {
			  frames.add(CurrentFrame);
			  controlRawdata = false;		  
		  }
		  else if (qName.equals("tDistal1")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(0, Integer.parseInt(this.auxiliar));
		       controltDistal1=false;
		  }

		  else if (qName.equals("tDistal2")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(1, Integer.parseInt(this.auxiliar));
		       controltDistal2=false;
		  }

		  else if (qName.equals("tDistal3")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(2, Integer.parseInt(this.auxiliar));
		       controltDistal3=false;
		  }

		  else if (qName.equals("tDistal4")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(3, Integer.parseInt(this.auxiliar));
		       controltDistal4=false;
		  }

		  else if (qName.equals("tDistal5")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(4, Integer.parseInt(this.auxiliar));
		       controltDistal5=false;
		  }

		  else if (qName.equals("tDistal6")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(5, Integer.parseInt(this.auxiliar));
		       controltDistal6=false;
		  }

		  else if (qName.equals("tDistal7")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(6, Integer.parseInt(this.auxiliar));
		       controltDistal7=false;
		  }

		  else if (qName.equals("tDistal8")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(7, Integer.parseInt(this.auxiliar));
		       controltDistal8=false;
		  }

		  else if (qName.equals("tDistal9")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(8, Integer.parseInt(this.auxiliar));
		       controltDistal9=false;
		  }

		  else if (qName.equals("tDistal10")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(9, Integer.parseInt(this.auxiliar));
		       controltDistal10=false;
		  }

		  else if (qName.equals("tDistal11")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(10, Integer.parseInt(this.auxiliar));
		       controltDistal11=false;
		  }

		  else if (qName.equals("tDistal12")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(11, Integer.parseInt(this.auxiliar));
		       controltDistal12=false;
		  }

		  else if (qName.equals("tDistal13")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(12, Integer.parseInt(this.auxiliar));
		       controltDistal13=false;
		  }

		  else if (qName.equals("tDistal14")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(13, Integer.parseInt(this.auxiliar));
		       controltDistal14=false;
		  }

		  else if (qName.equals("tDistal15")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(14, Integer.parseInt(this.auxiliar));
		       controltDistal15=false;
		  }

		  else if (qName.equals("tDistal16")&& controlRawdata)
		  {
		       CurrentFrame.setDatatDistal(15, Integer.parseInt(this.auxiliar));
		       controltDistal16=false;
		  }

		  else if (qName.equals("iDistal1")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(0, Integer.parseInt(this.auxiliar));
		       controliDistal1=false;
		  }

		  else if (qName.equals("iDistal2")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(1, Integer.parseInt(this.auxiliar));
		       controliDistal2=false;
		  }

		  else if (qName.equals("iDistal3")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(2, Integer.parseInt(this.auxiliar));
		       controliDistal3=false;
		  }

		  else if (qName.equals("iDistal4")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(3, Integer.parseInt(this.auxiliar));
		       controliDistal4=false;
		  }

		  else if (qName.equals("iDistal5")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(4, Integer.parseInt(this.auxiliar));
		       controliDistal5=false;
		  }

		  else if (qName.equals("iDistal6")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(5, Integer.parseInt(this.auxiliar));
		       controliDistal6=false;
		  }

		  else if (qName.equals("iDistal7")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(6, Integer.parseInt(this.auxiliar));
		       controliDistal7=false;
		  }

		  else if (qName.equals("iDistal8")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(7, Integer.parseInt(this.auxiliar));
		       controliDistal8=false;
		  }

		  else if (qName.equals("iDistal9")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(8, Integer.parseInt(this.auxiliar));
		       controliDistal9=false;
		  }

		  else if (qName.equals("iDistal10")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(9, Integer.parseInt(this.auxiliar));
		       controliDistal10=false;
		  }

		  else if (qName.equals("iDistal11")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(10, Integer.parseInt(this.auxiliar));
		       controliDistal11=false;
		  }

		  else if (qName.equals("iDistal12")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(11, Integer.parseInt(this.auxiliar));
		       controliDistal12=false;
		  }

		  else if (qName.equals("iDistal13")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(12, Integer.parseInt(this.auxiliar));
		       controliDistal13=false;
		  }

		  else if (qName.equals("iDistal14")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(13, Integer.parseInt(this.auxiliar));
		       controliDistal14=false;
		  }

		  else if (qName.equals("iDistal15")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(14, Integer.parseInt(this.auxiliar));
		       controliDistal15=false;
		  }

		  else if (qName.equals("iDistal16")&& controlRawdata)
		  {
		       CurrentFrame.setDataiDistal(15, Integer.parseInt(this.auxiliar));
		       controliDistal16=false;
		  }

		  else if (qName.equals("mDistal1")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(0, Integer.parseInt(this.auxiliar));
		       controlmDistal1=false;
		  }

		  else if (qName.equals("mDistal2")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(1, Integer.parseInt(this.auxiliar));
		       controlmDistal2=false;
		  }

		  else if (qName.equals("mDistal3")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(2, Integer.parseInt(this.auxiliar));
		       controlmDistal3=false;
		  }

		  else if (qName.equals("mDistal4")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(3, Integer.parseInt(this.auxiliar));
		       controlmDistal4=false;
		  }

		  else if (qName.equals("mDistal5")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(4, Integer.parseInt(this.auxiliar));
		       controlmDistal5=false;
		  }

		  else if (qName.equals("mDistal6")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(5, Integer.parseInt(this.auxiliar));
		       controlmDistal6=false;
		  }

		  else if (qName.equals("mDistal7")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(6, Integer.parseInt(this.auxiliar));
		       controlmDistal7=false;
		  }

		  else if (qName.equals("mDistal8")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(7, Integer.parseInt(this.auxiliar));
		       controlmDistal8=false;
		  }

		  else if (qName.equals("mDistal9")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(8, Integer.parseInt(this.auxiliar));
		       controlmDistal9=false;
		  }

		  else if (qName.equals("mDistal10")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(9, Integer.parseInt(this.auxiliar));
		       controlmDistal10=false;
		  }

		  else if (qName.equals("mDistal11")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(10, Integer.parseInt(this.auxiliar));
		       controlmDistal11=false;
		  }

		  else if (qName.equals("mDistal12")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(11, Integer.parseInt(this.auxiliar));
		       controlmDistal12=false;
		  }

		  else if (qName.equals("mDistal13")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(12, Integer.parseInt(this.auxiliar));
		       controlmDistal13=false;
		  }

		  else if (qName.equals("mDistal14")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(13, Integer.parseInt(this.auxiliar));
		       controlmDistal14=false;
		  }

		  else if (qName.equals("mDistal15")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(14, Integer.parseInt(this.auxiliar));
		       controlmDistal15=false;
		  }

		  else if (qName.equals("mDistal16")&& controlRawdata)
		  {
		       CurrentFrame.setDatamDistal(15, Integer.parseInt(this.auxiliar));
		       controlmDistal16=false;
		  }

		  else if (qName.equals("rDistal1")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(0, Integer.parseInt(this.auxiliar));
		       controlrDistal1=false;
		  }

		  else if (qName.equals("rDistal2")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(1, Integer.parseInt(this.auxiliar));
		       controlrDistal2=false;
		  }

		  else if (qName.equals("rDistal3")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(2, Integer.parseInt(this.auxiliar));
		       controlrDistal3=false;
		  }

		  else if (qName.equals("rDistal4")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(3, Integer.parseInt(this.auxiliar));
		       controlrDistal4=false;
		  }

		  else if (qName.equals("rDistal5")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(4, Integer.parseInt(this.auxiliar));
		       controlrDistal5=false;
		  }

		  else if (qName.equals("rDistal6")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(5, Integer.parseInt(this.auxiliar));
		       controlrDistal6=false;
		  }

		  else if (qName.equals("rDistal7")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(6, Integer.parseInt(this.auxiliar));
		       controlrDistal7=false;
		  }

		  else if (qName.equals("rDistal8")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(7, Integer.parseInt(this.auxiliar));
		       controlrDistal8=false;
		  }

		  else if (qName.equals("rDistal9")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(8, Integer.parseInt(this.auxiliar));
		       controlrDistal9=false;
		  }

		  else if (qName.equals("rDistal10")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(9, Integer.parseInt(this.auxiliar));
		       controlrDistal10=false;
		  }

		  else if (qName.equals("rDistal11")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(10, Integer.parseInt(this.auxiliar));
		       controlrDistal11=false;
		  }

		  else if (qName.equals("rDistal12")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(11, Integer.parseInt(this.auxiliar));
		       controlrDistal12=false;
		  }

		  else if (qName.equals("rDistal13")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(12, Integer.parseInt(this.auxiliar));
		       controlrDistal13=false;
		  }

		  else if (qName.equals("rDistal14")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(13, Integer.parseInt(this.auxiliar));
		       controlrDistal14=false;
		  }

		  else if (qName.equals("rDistal15")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(14, Integer.parseInt(this.auxiliar));
		       controlrDistal15=false;
		  }

		  else if (qName.equals("rDistal16")&& controlRawdata)
		  {
		       CurrentFrame.setDatarDistal(15, Integer.parseInt(this.auxiliar));
		       controlrDistal16=false;
		  }

		  else if (qName.equals("lDistal1")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(0, Integer.parseInt(this.auxiliar));
		       controllDistal1=false;
		  }

		  else if (qName.equals("lDistal2")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(1, Integer.parseInt(this.auxiliar));
		       controllDistal2=false;
		  }

		  else if (qName.equals("lDistal3")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(2, Integer.parseInt(this.auxiliar));
		       controllDistal3=false;
		  }

		  else if (qName.equals("lDistal4")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(3, Integer.parseInt(this.auxiliar));
		       controllDistal4=false;
		  }

		  else if (qName.equals("lDistal5")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(4, Integer.parseInt(this.auxiliar));
		       controllDistal5=false;
		  }

		  else if (qName.equals("lDistal6")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(5, Integer.parseInt(this.auxiliar));
		       controllDistal6=false;
		  }

		  else if (qName.equals("lDistal7")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(6, Integer.parseInt(this.auxiliar));
		       controllDistal7=false;
		  }

		  else if (qName.equals("lDistal8")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(7, Integer.parseInt(this.auxiliar));
		       controllDistal8=false;
		  }

		  else if (qName.equals("lDistal9")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(8, Integer.parseInt(this.auxiliar));
		       controllDistal9=false;
		  }

		  else if (qName.equals("lDistal10")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(9, Integer.parseInt(this.auxiliar));
		       controllDistal10=false;
		  }

		  else if (qName.equals("lDistal11")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(10, Integer.parseInt(this.auxiliar));
		       controllDistal11=false;
		  }

		  else if (qName.equals("lDistal12")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(11, Integer.parseInt(this.auxiliar));
		       controllDistal12=false;
		  }

		  else if (qName.equals("lDistal13")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(12, Integer.parseInt(this.auxiliar));
		       controllDistal13=false;
		  }

		  else if (qName.equals("lDistal14")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(13, Integer.parseInt(this.auxiliar));
		       controllDistal14=false;
		  }

		  else if (qName.equals("lDistal15")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(14, Integer.parseInt(this.auxiliar));
		       controllDistal15=false;
		  }

		  else if (qName.equals("lDistal16")&& controlRawdata)
		  {
		       CurrentFrame.setDatalDistal(15, Integer.parseInt(this.auxiliar));
		       controllDistal16=false;
		  }

		  else if (qName.equals("iMedial1")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(0, Integer.parseInt(this.auxiliar));
		       controliMedial1=false;
		  }

		  else if (qName.equals("iMedial2")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(1, Integer.parseInt(this.auxiliar));
		       controliMedial2=false;
		  }

		  else if (qName.equals("iMedial3")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(2, Integer.parseInt(this.auxiliar));
		       controliMedial3=false;
		  }

		  else if (qName.equals("iMedial4")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(3, Integer.parseInt(this.auxiliar));
		       controliMedial4=false;
		  }

		  else if (qName.equals("iMedial5")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(4, Integer.parseInt(this.auxiliar));
		       controliMedial5=false;
		  }

		  else if (qName.equals("iMedial6")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(5, Integer.parseInt(this.auxiliar));
		       controliMedial6=false;
		  }

		  else if (qName.equals("iMedial7")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(6, Integer.parseInt(this.auxiliar));
		       controliMedial7=false;
		  }

		  else if (qName.equals("iMedial8")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(7, Integer.parseInt(this.auxiliar));
		       controliMedial8=false;
		  }

		  else if (qName.equals("iMedial9")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(8, Integer.parseInt(this.auxiliar));
		       controliMedial9=false;
		  }

		  else if (qName.equals("iMedial10")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(9, Integer.parseInt(this.auxiliar));
		       controliMedial10=false;
		  }

		  else if (qName.equals("iMedial11")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(10, Integer.parseInt(this.auxiliar));
		       controliMedial11=false;
		  }

		  else if (qName.equals("iMedial12")&& controlRawdata)
		  {
		       CurrentFrame.setDataiMedial(11, Integer.parseInt(this.auxiliar));
		       controliMedial12=false;
		  }

		  else if (qName.equals("mMedial1")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(0, Integer.parseInt(this.auxiliar));
		       controlmMedial1=false;
		  }

		  else if (qName.equals("mMedial2")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(1, Integer.parseInt(this.auxiliar));
		       controlmMedial2=false;
		  }

		  else if (qName.equals("mMedial3")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(2, Integer.parseInt(this.auxiliar));
		       controlmMedial3=false;
		  }

		  else if (qName.equals("mMedial4")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(3, Integer.parseInt(this.auxiliar));
		       controlmMedial4=false;
		  }

		  else if (qName.equals("mMedial5")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(4, Integer.parseInt(this.auxiliar));
		       controlmMedial5=false;
		  }

		  else if (qName.equals("mMedial6")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(5, Integer.parseInt(this.auxiliar));
		       controlmMedial6=false;
		  }

		  else if (qName.equals("mMedial7")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(6, Integer.parseInt(this.auxiliar));
		       controlmMedial7=false;
		  }

		  else if (qName.equals("mMedial8")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(7, Integer.parseInt(this.auxiliar));
		       controlmMedial8=false;
		  }

		  else if (qName.equals("mMedial9")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(8, Integer.parseInt(this.auxiliar));
		       controlmMedial9=false;
		  }

		  else if (qName.equals("mMedial10")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(9, Integer.parseInt(this.auxiliar));
		       controlmMedial10=false;
		  }

		  else if (qName.equals("mMedial11")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(10, Integer.parseInt(this.auxiliar));
		       controlmMedial11=false;
		  }

		  else if (qName.equals("mMedial12")&& controlRawdata)
		  {
		       CurrentFrame.setDatamMedial(11, Integer.parseInt(this.auxiliar));
		       controlmMedial12=false;
		  }

		  else if (qName.equals("rMedial1")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(0, Integer.parseInt(this.auxiliar));
		       controlrMedial1=false;
		  }

		  else if (qName.equals("rMedial2")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(1, Integer.parseInt(this.auxiliar));
		       controlrMedial2=false;
		  }

		  else if (qName.equals("rMedial3")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(2, Integer.parseInt(this.auxiliar));
		       controlrMedial3=false;
		  }

		  else if (qName.equals("rMedial4")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(3, Integer.parseInt(this.auxiliar));
		       controlrMedial4=false;
		  }

		  else if (qName.equals("rMedial5")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(4, Integer.parseInt(this.auxiliar));
		       controlrMedial5=false;
		  }

		  else if (qName.equals("rMedial6")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(5, Integer.parseInt(this.auxiliar));
		       controlrMedial6=false;
		  }

		  else if (qName.equals("rMedial7")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(6, Integer.parseInt(this.auxiliar));
		       controlrMedial7=false;
		  }

		  else if (qName.equals("rMedial8")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(7, Integer.parseInt(this.auxiliar));
		       controlrMedial8=false;
		  }

		  else if (qName.equals("rMedial9")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(8, Integer.parseInt(this.auxiliar));
		       controlrMedial9=false;
		  }

		  else if (qName.equals("rMedial10")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(9, Integer.parseInt(this.auxiliar));
		       controlrMedial10=false;
		  }

		  else if (qName.equals("rMedial11")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(10, Integer.parseInt(this.auxiliar));
		       controlrMedial11=false;
		  }

		  else if (qName.equals("rMedial12")&& controlRawdata)
		  {
		       CurrentFrame.setDatarMedial(11, Integer.parseInt(this.auxiliar));
		       controlrMedial12=false;
		  }

		  else if (qName.equals("lMedial1")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(0, Integer.parseInt(this.auxiliar));
		       controllMedial1=false;
		  }

		  else if (qName.equals("lMedial2")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(1, Integer.parseInt(this.auxiliar));
		       controllMedial2=false;
		  }

		  else if (qName.equals("lMedial3")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(2, Integer.parseInt(this.auxiliar));
		       controllMedial3=false;
		  }

		  else if (qName.equals("lMedial4")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(3, Integer.parseInt(this.auxiliar));
		       controllMedial4=false;
		  }

		  else if (qName.equals("lMedial5")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(4, Integer.parseInt(this.auxiliar));
		       controllMedial5=false;
		  }

		  else if (qName.equals("lMedial6")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(5, Integer.parseInt(this.auxiliar));
		       controllMedial6=false;
		  }

		  else if (qName.equals("lMedial7")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(6, Integer.parseInt(this.auxiliar));
		       controllMedial7=false;
		  }

		  else if (qName.equals("lMedial8")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(7, Integer.parseInt(this.auxiliar));
		       controllMedial8=false;
		  }

		  else if (qName.equals("lMedial9")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(8, Integer.parseInt(this.auxiliar));
		       controllMedial9=false;
		  }

		  else if (qName.equals("lMedial10")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(9, Integer.parseInt(this.auxiliar));
		       controllMedial10=false;
		  }

		  else if (qName.equals("lMedial11")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(10, Integer.parseInt(this.auxiliar));
		       controllMedial11=false;
		  }

		  else if (qName.equals("lMedial12")&& controlRawdata)
		  {
		       CurrentFrame.setDatalMedial(11, Integer.parseInt(this.auxiliar));
		       controllMedial12=false;
		  }

		  else if (qName.equals("tProximal1")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(0, Integer.parseInt(this.auxiliar));
		       controltProximal1=false;
		  }

		  else if (qName.equals("tProximal2")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(1, Integer.parseInt(this.auxiliar));
		       controltProximal2=false;
		  }

		  else if (qName.equals("tProximal3")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(2, Integer.parseInt(this.auxiliar));
		       controltProximal3=false;
		  }

		  else if (qName.equals("tProximal4")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(3, Integer.parseInt(this.auxiliar));
		       controltProximal4=false;
		  }

		  else if (qName.equals("tProximal5")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(4, Integer.parseInt(this.auxiliar));
		       controltProximal5=false;
		  }

		  else if (qName.equals("tProximal6")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(5, Integer.parseInt(this.auxiliar));
		       controltProximal6=false;
		  }

		  else if (qName.equals("tProximal7")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(6, Integer.parseInt(this.auxiliar));
		       controltProximal7=false;
		  }

		  else if (qName.equals("tProximal8")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(7, Integer.parseInt(this.auxiliar));
		       controltProximal8=false;
		  }

		  else if (qName.equals("tProximal9")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(8, Integer.parseInt(this.auxiliar));
		       controltProximal9=false;
		  }

		  else if (qName.equals("tProximal10")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(9, Integer.parseInt(this.auxiliar));
		       controltProximal10=false;
		  }

		  else if (qName.equals("tProximal11")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(10, Integer.parseInt(this.auxiliar));
		       controltProximal11=false;
		  }

		  else if (qName.equals("tProximal12")&& controlRawdata)
		  {
		       CurrentFrame.setDatatProximal(11, Integer.parseInt(this.auxiliar));
		       controltProximal12=false;
		  }

		  else if (qName.equals("iProximal1")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(0, Integer.parseInt(this.auxiliar));
		       controliProximal1=false;
		  }

		  else if (qName.equals("iProximal2")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(1, Integer.parseInt(this.auxiliar));
		       controliProximal2=false;
		  }

		  else if (qName.equals("iProximal3")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(2, Integer.parseInt(this.auxiliar));
		       controliProximal3=false;
		  }

		  else if (qName.equals("iProximal4")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(3, Integer.parseInt(this.auxiliar));
		       controliProximal4=false;
		  }

		  else if (qName.equals("iProximal5")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(4, Integer.parseInt(this.auxiliar));
		       controliProximal5=false;
		  }

		  else if (qName.equals("iProximal6")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(5, Integer.parseInt(this.auxiliar));
		       controliProximal6=false;
		  }

		  else if (qName.equals("iProximal7")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(6, Integer.parseInt(this.auxiliar));
		       controliProximal7=false;
		  }

		  else if (qName.equals("iProximal8")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(7, Integer.parseInt(this.auxiliar));
		       controliProximal8=false;
		  }

		  else if (qName.equals("iProximal9")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(8, Integer.parseInt(this.auxiliar));
		       controliProximal9=false;
		  }

		  else if (qName.equals("iProximal10")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(9, Integer.parseInt(this.auxiliar));
		       controliProximal10=false;
		  }

		  else if (qName.equals("iProximal11")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(10, Integer.parseInt(this.auxiliar));
		       controliProximal11=false;
		  }

		  else if (qName.equals("iProximal12")&& controlRawdata)
		  {
		       CurrentFrame.setDataiProximal(11, Integer.parseInt(this.auxiliar));
		       controliProximal12=false;
		  }

		  else if (qName.equals("mProximal1")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(0, Integer.parseInt(this.auxiliar));
		       controlmProximal1=false;
		  }

		  else if (qName.equals("mProximal2")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(1, Integer.parseInt(this.auxiliar));
		       controlmProximal2=false;
		  }

		  else if (qName.equals("mProximal3")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(2, Integer.parseInt(this.auxiliar));
		       controlmProximal3=false;
		  }

		  else if (qName.equals("mProximal4")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(3, Integer.parseInt(this.auxiliar));
		       controlmProximal4=false;
		  }

		  else if (qName.equals("mProximal5")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(4, Integer.parseInt(this.auxiliar));
		       controlmProximal5=false;
		  }

		  else if (qName.equals("mProximal6")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(5, Integer.parseInt(this.auxiliar));
		       controlmProximal6=false;
		  }

		  else if (qName.equals("mProximal7")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(6, Integer.parseInt(this.auxiliar));
		       controlmProximal7=false;
		  }

		  else if (qName.equals("mProximal8")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(7, Integer.parseInt(this.auxiliar));
		       controlmProximal8=false;
		  }

		  else if (qName.equals("mProximal9")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(8, Integer.parseInt(this.auxiliar));
		       controlmProximal9=false;
		  }

		  else if (qName.equals("mProximal10")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(9, Integer.parseInt(this.auxiliar));
		       controlmProximal10=false;
		  }

		  else if (qName.equals("mProximal11")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(10, Integer.parseInt(this.auxiliar));
		       controlmProximal11=false;
		  }

		  else if (qName.equals("mProximal12")&& controlRawdata)
		  {
		       CurrentFrame.setDatamProximal(11, Integer.parseInt(this.auxiliar));
		       controlmProximal12=false;
		  }

		  else if (qName.equals("rProximal1")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(0, Integer.parseInt(this.auxiliar));
		       controlrProximal1=false;
		  }

		  else if (qName.equals("rProximal2")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(1, Integer.parseInt(this.auxiliar));
		       controlrProximal2=false;
		  }

		  else if (qName.equals("rProximal3")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(2, Integer.parseInt(this.auxiliar));
		       controlrProximal3=false;
		  }

		  else if (qName.equals("rProximal4")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(3, Integer.parseInt(this.auxiliar));
		       controlrProximal4=false;
		  }

		  else if (qName.equals("rProximal5")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(4, Integer.parseInt(this.auxiliar));
		       controlrProximal5=false;
		  }

		  else if (qName.equals("rProximal6")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(5, Integer.parseInt(this.auxiliar));
		       controlrProximal6=false;
		  }

		  else if (qName.equals("rProximal7")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(6, Integer.parseInt(this.auxiliar));
		       controlrProximal7=false;
		  }

		  else if (qName.equals("rProximal8")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(7, Integer.parseInt(this.auxiliar));
		       controlrProximal8=false;
		  }

		  else if (qName.equals("rProximal9")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(8, Integer.parseInt(this.auxiliar));
		       controlrProximal9=false;
		  }

		  else if (qName.equals("rProximal10")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(9, Integer.parseInt(this.auxiliar));
		       controlrProximal10=false;
		  }

		  else if (qName.equals("rProximal11")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(10, Integer.parseInt(this.auxiliar));
		       controlrProximal11=false;
		  }

		  else if (qName.equals("rProximal12")&& controlRawdata)
		  {
		       CurrentFrame.setDatarProximal(11, Integer.parseInt(this.auxiliar));
		       controlrProximal12=false;
		  }

		  else if (qName.equals("lProximal1")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(0, Integer.parseInt(this.auxiliar));
		       controllProximal1=false;
		  }

		  else if (qName.equals("lProximal2")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(1, Integer.parseInt(this.auxiliar));
		       controllProximal2=false;
		  }

		  else if (qName.equals("lProximal3")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(2, Integer.parseInt(this.auxiliar));
		       controllProximal3=false;
		  }

		  else if (qName.equals("lProximal4")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(3, Integer.parseInt(this.auxiliar));
		       controllProximal4=false;
		  }

		  else if (qName.equals("lProximal5")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(4, Integer.parseInt(this.auxiliar));
		       controllProximal5=false;
		  }

		  else if (qName.equals("lProximal6")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(5, Integer.parseInt(this.auxiliar));
		       controllProximal6=false;
		  }

		  else if (qName.equals("lProximal7")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(6, Integer.parseInt(this.auxiliar));
		       controllProximal7=false;
		  }

		  else if (qName.equals("lProximal8")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(7, Integer.parseInt(this.auxiliar));
		       controllProximal8=false;
		  }

		  else if (qName.equals("lProximal9")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(8, Integer.parseInt(this.auxiliar));
		       controllProximal9=false;
		  }

		  else if (qName.equals("lProximal10")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(9, Integer.parseInt(this.auxiliar));
		       controllProximal10=false;
		  }

		  else if (qName.equals("lProximal11")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(10, Integer.parseInt(this.auxiliar));
		       controllProximal11=false;
		  }

		  else if (qName.equals("lProximal12")&& controlRawdata)
		  {
		       CurrentFrame.setDatalProximal(11, Integer.parseInt(this.auxiliar));
		       controllProximal12=false;
		  }

		  else if (qName.equals("pFingers1")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(0, Integer.parseInt(this.auxiliar));
		       controlpFingers1=false;
		  }

		  else if (qName.equals("pFingers2")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(1, Integer.parseInt(this.auxiliar));
		       controlpFingers2=false;
		  }

		  else if (qName.equals("pFingers3")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(2, Integer.parseInt(this.auxiliar));
		       controlpFingers3=false;
		  }

		  else if (qName.equals("pFingers4")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(3, Integer.parseInt(this.auxiliar));
		       controlpFingers4=false;
		  }

		  else if (qName.equals("pFingers5")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(4, Integer.parseInt(this.auxiliar));
		       controlpFingers5=false;
		  }

		  else if (qName.equals("pFingers6")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(5, Integer.parseInt(this.auxiliar));
		       controlpFingers6=false;
		  }

		  else if (qName.equals("pFingers7")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(6, Integer.parseInt(this.auxiliar));
		       controlpFingers7=false;
		  }

		  else if (qName.equals("pFingers8")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(7, Integer.parseInt(this.auxiliar));
		       controlpFingers8=false;
		  }

		  else if (qName.equals("pFingers9")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(8, Integer.parseInt(this.auxiliar));
		       controlpFingers9=false;
		  }

		  else if (qName.equals("pFingers10")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(9, Integer.parseInt(this.auxiliar));
		       controlpFingers10=false;
		  }

		  else if (qName.equals("pFingers11")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(10, Integer.parseInt(this.auxiliar));
		       controlpFingers11=false;
		  }

		  else if (qName.equals("pFingers12")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(11, Integer.parseInt(this.auxiliar));
		       controlpFingers12=false;
		  }

		  else if (qName.equals("pFingers13")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(12, Integer.parseInt(this.auxiliar));
		       controlpFingers13=false;
		  }

		  else if (qName.equals("pFingers14")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(13, Integer.parseInt(this.auxiliar));
		       controlpFingers14=false;
		  }

		  else if (qName.equals("pFingers15")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(14, Integer.parseInt(this.auxiliar));
		       controlpFingers15=false;
		  }

		  else if (qName.equals("pFingers16")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(15, Integer.parseInt(this.auxiliar));
		       controlpFingers16=false;
		  }

		  else if (qName.equals("pFingers17")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(16, Integer.parseInt(this.auxiliar));
		       controlpFingers17=false;
		  }

		  else if (qName.equals("pFingers18")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(17, Integer.parseInt(this.auxiliar));
		       controlpFingers18=false;
		  }

		  else if (qName.equals("pFingers19")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(18, Integer.parseInt(this.auxiliar));
		       controlpFingers19=false;
		  }

		  else if (qName.equals("pFingers20")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(19, Integer.parseInt(this.auxiliar));
		       controlpFingers20=false;
		  }

		  else if (qName.equals("pFingers21")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(20, Integer.parseInt(this.auxiliar));
		       controlpFingers21=false;
		  }

		  else if (qName.equals("pFingers22")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(21, Integer.parseInt(this.auxiliar));
		       controlpFingers22=false;
		  }

		  else if (qName.equals("pFingers23")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(22, Integer.parseInt(this.auxiliar));
		       controlpFingers23=false;
		  }

		  else if (qName.equals("pFingers24")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(23, Integer.parseInt(this.auxiliar));
		       controlpFingers24=false;
		  }

		  else if (qName.equals("pFingers25")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(24, Integer.parseInt(this.auxiliar));
		       controlpFingers25=false;
		  }

		  else if (qName.equals("pFingers26")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(25, Integer.parseInt(this.auxiliar));
		       controlpFingers26=false;
		  }

		  else if (qName.equals("pFingers27")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(26, Integer.parseInt(this.auxiliar));
		       controlpFingers27=false;
		  }

		  else if (qName.equals("pFingers28")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(27, Integer.parseInt(this.auxiliar));
		       controlpFingers28=false;
		  }

		  else if (qName.equals("pFingers29")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(28, Integer.parseInt(this.auxiliar));
		       controlpFingers29=false;
		  }

		  else if (qName.equals("pFingers30")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(29, Integer.parseInt(this.auxiliar));
		       controlpFingers30=false;
		  }

		  else if (qName.equals("pFingers31")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(30, Integer.parseInt(this.auxiliar));
		       controlpFingers31=false;
		  }

		  else if (qName.equals("pFingers32")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(31, Integer.parseInt(this.auxiliar));
		       controlpFingers32=false;
		  }

		  else if (qName.equals("pFingers33")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(32, Integer.parseInt(this.auxiliar));
		       controlpFingers33=false;
		  }

		  else if (qName.equals("pFingers34")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(33, Integer.parseInt(this.auxiliar));
		       controlpFingers34=false;
		  }

		  else if (qName.equals("pFingers35")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(34, Integer.parseInt(this.auxiliar));
		       controlpFingers35=false;
		  }

		  else if (qName.equals("pFingers36")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(35, Integer.parseInt(this.auxiliar));
		       controlpFingers36=false;
		  }

		  else if (qName.equals("pFingers37")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(36, Integer.parseInt(this.auxiliar));
		       controlpFingers37=false;
		  }

		  else if (qName.equals("pFingers38")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(37, Integer.parseInt(this.auxiliar));
		       controlpFingers38=false;
		  }

		  else if (qName.equals("pFingers39")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(38, Integer.parseInt(this.auxiliar));
		       controlpFingers39=false;
		  }

		  else if (qName.equals("pFingers40")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(39, Integer.parseInt(this.auxiliar));
		       controlpFingers40=false;
		  }

		  else if (qName.equals("pFingers41")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(40, Integer.parseInt(this.auxiliar));
		       controlpFingers41=false;
		  }

		  else if (qName.equals("pFingers42")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(41, Integer.parseInt(this.auxiliar));
		       controlpFingers42=false;
		  }

		  else if (qName.equals("pFingers43")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(42, Integer.parseInt(this.auxiliar));
		       controlpFingers43=false;
		  }

		  else if (qName.equals("pFingers44")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(43, Integer.parseInt(this.auxiliar));
		       controlpFingers44=false;
		  }

		  else if (qName.equals("pFingers45")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(44, Integer.parseInt(this.auxiliar));
		       controlpFingers45=false;
		  }

		  else if (qName.equals("pFingers46")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(45, Integer.parseInt(this.auxiliar));
		       controlpFingers46=false;
		  }

		  else if (qName.equals("pFingers47")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(46, Integer.parseInt(this.auxiliar));
		       controlpFingers47=false;
		  }

		  else if (qName.equals("pFingers48")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(47, Integer.parseInt(this.auxiliar));
		       controlpFingers48=false;
		  }

		  else if (qName.equals("pFingers49")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(48, Integer.parseInt(this.auxiliar));
		       controlpFingers49=false;
		  }

		  else if (qName.equals("pFingers50")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(49, Integer.parseInt(this.auxiliar));
		       controlpFingers50=false;
		  }

		  else if (qName.equals("pFingers51")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(50, Integer.parseInt(this.auxiliar));
		       controlpFingers51=false;
		  }

		  else if (qName.equals("pFingers52")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(51, Integer.parseInt(this.auxiliar));
		       controlpFingers52=false;
		  }

		  else if (qName.equals("pFingers53")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(52, Integer.parseInt(this.auxiliar));
		       controlpFingers53=false;
		  }

		  else if (qName.equals("pFingers54")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(53, Integer.parseInt(this.auxiliar));
		       controlpFingers54=false;
		  }

		  else if (qName.equals("pFingers55")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(54, Integer.parseInt(this.auxiliar));
		       controlpFingers55=false;
		  }

		  else if (qName.equals("pFingers56")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(55, Integer.parseInt(this.auxiliar));
		       controlpFingers56=false;
		  }

		  else if (qName.equals("pFingers57")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(56, Integer.parseInt(this.auxiliar));
		       controlpFingers57=false;
		  }

		  else if (qName.equals("pFingers58")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(57, Integer.parseInt(this.auxiliar));
		       controlpFingers58=false;
		  }

		  else if (qName.equals("pFingers59")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(58, Integer.parseInt(this.auxiliar));
		       controlpFingers59=false;
		  }

		  else if (qName.equals("pFingers60")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(59, Integer.parseInt(this.auxiliar));
		       controlpFingers60=false;
		  }

		  else if (qName.equals("pFingers61")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(60, Integer.parseInt(this.auxiliar));
		       controlpFingers61=false;
		  }

		  else if (qName.equals("pFingers62")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(61, Integer.parseInt(this.auxiliar));
		       controlpFingers62=false;
		  }

		  else if (qName.equals("pFingers63")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(62, Integer.parseInt(this.auxiliar));
		       controlpFingers63=false;
		  }

		  else if (qName.equals("pFingers64")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(63, Integer.parseInt(this.auxiliar));
		       controlpFingers64=false;
		  }

		  else if (qName.equals("pFingers65")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(64, Integer.parseInt(this.auxiliar));
		       controlpFingers65=false;
		  }

		  else if (qName.equals("pFingers66")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(65, Integer.parseInt(this.auxiliar));
		       controlpFingers66=false;
		  }

		  else if (qName.equals("pFingers67")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(66, Integer.parseInt(this.auxiliar));
		       controlpFingers67=false;
		  }

		  else if (qName.equals("pFingers68")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(67, Integer.parseInt(this.auxiliar));
		       controlpFingers68=false;
		  }

		  else if (qName.equals("pFingers69")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(68, Integer.parseInt(this.auxiliar));
		       controlpFingers69=false;
		  }

		  else if (qName.equals("pFingers70")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(69, Integer.parseInt(this.auxiliar));
		       controlpFingers70=false;
		  }

		  else if (qName.equals("pFingers71")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(70, Integer.parseInt(this.auxiliar));
		       controlpFingers71=false;
		  }

		  else if (qName.equals("pFingers72")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(71, Integer.parseInt(this.auxiliar));
		       controlpFingers72=false;
		  }

		  else if (qName.equals("pFingers73")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(72, Integer.parseInt(this.auxiliar));
		       controlpFingers73=false;
		  }

		  else if (qName.equals("pFingers74")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(73, Integer.parseInt(this.auxiliar));
		       controlpFingers74=false;
		  }

		  else if (qName.equals("pFingers75")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(74, Integer.parseInt(this.auxiliar));
		       controlpFingers75=false;
		  }

		  else if (qName.equals("pFingers76")&& controlRawdata)
		  {
		       CurrentFrame.setDatapFingers(75, Integer.parseInt(this.auxiliar));
		       controlpFingers76=false;
		  }

		  else if (qName.equals("pInternal1")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(0, Integer.parseInt(this.auxiliar));
		       controlpInternal1=false;
		  }

		  else if (qName.equals("pInternal2")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(1, Integer.parseInt(this.auxiliar));
		       controlpInternal2=false;
		  }

		  else if (qName.equals("pInternal3")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(2, Integer.parseInt(this.auxiliar));
		       controlpInternal3=false;
		  }

		  else if (qName.equals("pInternal4")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(3, Integer.parseInt(this.auxiliar));
		       controlpInternal4=false;
		  }

		  else if (qName.equals("pInternal5")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(4, Integer.parseInt(this.auxiliar));
		       controlpInternal5=false;
		  }

		  else if (qName.equals("pInternal6")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(5, Integer.parseInt(this.auxiliar));
		       controlpInternal6=false;
		  }

		  else if (qName.equals("pInternal7")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(6, Integer.parseInt(this.auxiliar));
		       controlpInternal7=false;
		  }

		  else if (qName.equals("pInternal8")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(7, Integer.parseInt(this.auxiliar));
		       controlpInternal8=false;
		  }

		  else if (qName.equals("pInternal9")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(8, Integer.parseInt(this.auxiliar));
		       controlpInternal9=false;
		  }

		  else if (qName.equals("pInternal10")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(9, Integer.parseInt(this.auxiliar));
		       controlpInternal10=false;
		  }

		  else if (qName.equals("pInternal11")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(10, Integer.parseInt(this.auxiliar));
		       controlpInternal11=false;
		  }

		  else if (qName.equals("pInternal12")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(11, Integer.parseInt(this.auxiliar));
		       controlpInternal12=false;
		  }

		  else if (qName.equals("pInternal13")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(12, Integer.parseInt(this.auxiliar));
		       controlpInternal13=false;
		  }

		  else if (qName.equals("pInternal14")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(13, Integer.parseInt(this.auxiliar));
		       controlpInternal14=false;
		  }

		  else if (qName.equals("pInternal15")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(14, Integer.parseInt(this.auxiliar));
		       controlpInternal15=false;
		  }

		  else if (qName.equals("pInternal16")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(15, Integer.parseInt(this.auxiliar));
		       controlpInternal16=false;
		  }

		  else if (qName.equals("pInternal17")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(16, Integer.parseInt(this.auxiliar));
		       controlpInternal17=false;
		  }

		  else if (qName.equals("pInternal18")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(17, Integer.parseInt(this.auxiliar));
		       controlpInternal18=false;
		  }

		  else if (qName.equals("pInternal19")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(18, Integer.parseInt(this.auxiliar));
		       controlpInternal19=false;
		  }

		  else if (qName.equals("pInternal20")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(19, Integer.parseInt(this.auxiliar));
		       controlpInternal20=false;
		  }

		  else if (qName.equals("pInternal21")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(20, Integer.parseInt(this.auxiliar));
		       controlpInternal21=false;
		  }

		  else if (qName.equals("pInternal22")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(21, Integer.parseInt(this.auxiliar));
		       controlpInternal22=false;
		  }

		  else if (qName.equals("pInternal23")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(22, Integer.parseInt(this.auxiliar));
		       controlpInternal23=false;
		  }

		  else if (qName.equals("pInternal24")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(23, Integer.parseInt(this.auxiliar));
		       controlpInternal24=false;
		  }

		  else if (qName.equals("pInternal25")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(24, Integer.parseInt(this.auxiliar));
		       controlpInternal25=false;
		  }

		  else if (qName.equals("pInternal26")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(25, Integer.parseInt(this.auxiliar));
		       controlpInternal26=false;
		  }

		  else if (qName.equals("pInternal27")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(26, Integer.parseInt(this.auxiliar));
		       controlpInternal27=false;
		  }

		  else if (qName.equals("pInternal28")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(27, Integer.parseInt(this.auxiliar));
		       controlpInternal28=false;
		  }

		  else if (qName.equals("pInternal29")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(28, Integer.parseInt(this.auxiliar));
		       controlpInternal29=false;
		  }

		  else if (qName.equals("pInternal30")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(29, Integer.parseInt(this.auxiliar));
		       controlpInternal30=false;
		  }

		  else if (qName.equals("pInternal31")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(30, Integer.parseInt(this.auxiliar));
		       controlpInternal31=false;
		  }

		  else if (qName.equals("pInternal32")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(31, Integer.parseInt(this.auxiliar));
		       controlpInternal32=false;
		  }

		  else if (qName.equals("pInternal33")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(32, Integer.parseInt(this.auxiliar));
		       controlpInternal33=false;
		  }

		  else if (qName.equals("pInternal34")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(33, Integer.parseInt(this.auxiliar));
		       controlpInternal34=false;
		  }

		  else if (qName.equals("pInternal35")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(34, Integer.parseInt(this.auxiliar));
		       controlpInternal35=false;
		  }

		  else if (qName.equals("pInternal36")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(35, Integer.parseInt(this.auxiliar));
		       controlpInternal36=false;
		  }

		  else if (qName.equals("pInternal37")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(36, Integer.parseInt(this.auxiliar));
		       controlpInternal37=false;
		  }

		  else if (qName.equals("pInternal38")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(37, Integer.parseInt(this.auxiliar));
		       controlpInternal38=false;
		  }

		  else if (qName.equals("pInternal39")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(38, Integer.parseInt(this.auxiliar));
		       controlpInternal39=false;
		  }

		  else if (qName.equals("pInternal40")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(39, Integer.parseInt(this.auxiliar));
		       controlpInternal40=false;
		  }

		  else if (qName.equals("pInternal41")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(40, Integer.parseInt(this.auxiliar));
		       controlpInternal41=false;
		  }

		  else if (qName.equals("pInternal42")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(41, Integer.parseInt(this.auxiliar));
		       controlpInternal42=false;
		  }

		  else if (qName.equals("pInternal43")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(42, Integer.parseInt(this.auxiliar));
		       controlpInternal43=false;
		  }

		  else if (qName.equals("pInternal44")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(43, Integer.parseInt(this.auxiliar));
		       controlpInternal44=false;
		  }

		  else if (qName.equals("pInternal45")&& controlRawdata)
		  {
		       CurrentFrame.setDatapInternal(44, Integer.parseInt(this.auxiliar));
		       controlpInternal45=false;
		  }

		  else if (qName.equals("pExternal1")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(0, Integer.parseInt(this.auxiliar));
		       controlpExternal1=false;
		  }

		  else if (qName.equals("pExternal2")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(1, Integer.parseInt(this.auxiliar));
		       controlpExternal2=false;
		  }

		  else if (qName.equals("pExternal3")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(2, Integer.parseInt(this.auxiliar));
		       controlpExternal3=false;
		  }

		  else if (qName.equals("pExternal4")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(3, Integer.parseInt(this.auxiliar));
		       controlpExternal4=false;
		  }

		  else if (qName.equals("pExternal5")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(4, Integer.parseInt(this.auxiliar));
		       controlpExternal5=false;
		  }

		  else if (qName.equals("pExternal6")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(5, Integer.parseInt(this.auxiliar));
		       controlpExternal6=false;
		  }

		  else if (qName.equals("pExternal7")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(6, Integer.parseInt(this.auxiliar));
		       controlpExternal7=false;
		  }

		  else if (qName.equals("pExternal8")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(7, Integer.parseInt(this.auxiliar));
		       controlpExternal8=false;
		  }

		  else if (qName.equals("pExternal9")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(8, Integer.parseInt(this.auxiliar));
		       controlpExternal9=false;
		  }

		  else if (qName.equals("pExternal10")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(9, Integer.parseInt(this.auxiliar));
		       controlpExternal10=false;
		  }

		  else if (qName.equals("pExternal11")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(10, Integer.parseInt(this.auxiliar));
		       controlpExternal11=false;
		  }

		  else if (qName.equals("pExternal12")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(11, Integer.parseInt(this.auxiliar));
		       controlpExternal12=false;
		  }

		  else if (qName.equals("pExternal13")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(12, Integer.parseInt(this.auxiliar));
		       controlpExternal13=false;
		  }

		  else if (qName.equals("pExternal14")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(13, Integer.parseInt(this.auxiliar));
		       controlpExternal14=false;
		  }

		  else if (qName.equals("pExternal15")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(14, Integer.parseInt(this.auxiliar));
		       controlpExternal15=false;
		  }

		  else if (qName.equals("pExternal16")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(15, Integer.parseInt(this.auxiliar));
		       controlpExternal16=false;
		  }

		  else if (qName.equals("pExternal17")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(16, Integer.parseInt(this.auxiliar));
		       controlpExternal17=false;
		  }

		  else if (qName.equals("pExternal18")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(17, Integer.parseInt(this.auxiliar));
		       controlpExternal18=false;
		  }

		  else if (qName.equals("pExternal19")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(18, Integer.parseInt(this.auxiliar));
		       controlpExternal19=false;
		  }

		  else if (qName.equals("pExternal20")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(19, Integer.parseInt(this.auxiliar));
		       controlpExternal20=false;
		  }

		  else if (qName.equals("pExternal21")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(20, Integer.parseInt(this.auxiliar));
		       controlpExternal21=false;
		  }

		  else if (qName.equals("pExternal22")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(21, Integer.parseInt(this.auxiliar));
		       controlpExternal22=false;
		  }

		  else if (qName.equals("pExternal23")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(22, Integer.parseInt(this.auxiliar));
		       controlpExternal23=false;
		  }

		  else if (qName.equals("pExternal24")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(23, Integer.parseInt(this.auxiliar));
		       controlpExternal24=false;
		  }

		  else if (qName.equals("pExternal25")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(24, Integer.parseInt(this.auxiliar));
		       controlpExternal25=false;
		  }

		  else if (qName.equals("pExternal26")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(25, Integer.parseInt(this.auxiliar));
		       controlpExternal26=false;
		  }

		  else if (qName.equals("pExternal27")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(26, Integer.parseInt(this.auxiliar));
		       controlpExternal27=false;
		  }

		  else if (qName.equals("pExternal28")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(27, Integer.parseInt(this.auxiliar));
		       controlpExternal28=false;
		  }

		  else if (qName.equals("pExternal29")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(28, Integer.parseInt(this.auxiliar));
		       controlpExternal29=false;
		  }

		  else if (qName.equals("pExternal30")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(29, Integer.parseInt(this.auxiliar));
		       controlpExternal30=false;
		  }

		  else if (qName.equals("pExternal31")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(30, Integer.parseInt(this.auxiliar));
		       controlpExternal31=false;
		  }

		  else if (qName.equals("pExternal32")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(31, Integer.parseInt(this.auxiliar));
		       controlpExternal32=false;
		  }

		  else if (qName.equals("pExternal33")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(32, Integer.parseInt(this.auxiliar));
		       controlpExternal33=false;
		  }

		  else if (qName.equals("pExternal34")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(33, Integer.parseInt(this.auxiliar));
		       controlpExternal34=false;
		  }

		  else if (qName.equals("pExternal35")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(34, Integer.parseInt(this.auxiliar));
		       controlpExternal35=false;
		  }

		  else if (qName.equals("pExternal36")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(35, Integer.parseInt(this.auxiliar));
		       controlpExternal36=false;
		  }

		  else if (qName.equals("pExternal37")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(36, Integer.parseInt(this.auxiliar));
		       controlpExternal37=false;
		  }

		  else if (qName.equals("pExternal38")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(37, Integer.parseInt(this.auxiliar));
		       controlpExternal38=false;
		  }

		  else if (qName.equals("pExternal39")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(38, Integer.parseInt(this.auxiliar));
		       controlpExternal39=false;
		  }

		  else if (qName.equals("pExternal40")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(39, Integer.parseInt(this.auxiliar));
		       controlpExternal40=false;
		  }

		  else if (qName.equals("pExternal41")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(40, Integer.parseInt(this.auxiliar));
		       controlpExternal41=false;
		  }

		  else if (qName.equals("pExternal42")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(41, Integer.parseInt(this.auxiliar));
		       controlpExternal42=false;
		  }

		  else if (qName.equals("pExternal43")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(42, Integer.parseInt(this.auxiliar));
		       controlpExternal43=false;
		  }

		  else if (qName.equals("pExternal44")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(43, Integer.parseInt(this.auxiliar));
		       controlpExternal44=false;
		  }

		  else if (qName.equals("pExternal45")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(44, Integer.parseInt(this.auxiliar));
		       controlpExternal45=false;
		  }

		  else if (qName.equals("pExternal46")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(45, Integer.parseInt(this.auxiliar));
		       controlpExternal46=false;
		  }

		  else if (qName.equals("pExternal47")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(46, Integer.parseInt(this.auxiliar));
		       controlpExternal47=false;
		  }

		  else if (qName.equals("pExternal48")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(47, Integer.parseInt(this.auxiliar));
		       controlpExternal48=false;
		  }

		  else if (qName.equals("pExternal49")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(48, Integer.parseInt(this.auxiliar));
		       controlpExternal49=false;
		  }

		  else if (qName.equals("pExternal50")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(49, Integer.parseInt(this.auxiliar));
		       controlpExternal50=false;
		  }

		  else if (qName.equals("pExternal51")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(50, Integer.parseInt(this.auxiliar));
		       controlpExternal51=false;
		  }

		  else if (qName.equals("pExternal52")&& controlRawdata)
		  {
		       CurrentFrame.setDatapExternal(51, Integer.parseInt(this.auxiliar));
		       controlpExternal52=false;
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
