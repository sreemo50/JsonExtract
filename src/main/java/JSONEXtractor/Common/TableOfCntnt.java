package JSONEXtractor.Common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TableOfCntnt {
	private Properties properties;
	private final String propertyFilePath = "..\\GProject\\Config\\config.properties";
	public String IIDname = "";
	public String ttimePeriod = "";
	public String AAddedValues = "";
	public String EExplanations = "";

	public void setIDname(String IDname) {
		IIDname = IDname;
	}

	public void settimePeriod(int timePeriod) {
		switch(timePeriod)
		{
		   case 1 :
			   ttimePeriod = "Samsung";		      
		      break;
		      
		   case 2 :
			   ttimePeriod = "LG";
		      break; 		   
		   
		   default :
			   ttimePeriod = "ONIDA";
		 
		}		
	}
	
	public void setAddedValues(String AddedValues) {
		AAddedValues = AddedValues;
	}

	public void setExplanations(String Explanations) {
		EExplanations = Explanations;
	}

	public String getIDname() {
		return IIDname;
	}

	public String gettimePeriod() {
		return ttimePeriod;
	}
	
	public String getAddedValues() {		
		return AAddedValues;
	}

	public String getExplanations() {
		return EExplanations;
	}

}
