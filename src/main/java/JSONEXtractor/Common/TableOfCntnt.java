package JSONEXtractor.Common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TableOfCntnt {
	private Properties properties;
	private final String propertyFilePath = "..\\GProject\\Config\\config.properties";
	public String IDname = "";
	public String timePeriod = "";
	public String AddedValues = "";
	public String Explanations = "";

	public void setIDname(String IDname) {
		this.IDname = IDname;
	}

	public void settimePeriod(int timePeriod) {
		switch(timePeriod)
		{
		   case 1 :
			   this.timePeriod = "Samsung";		      
		      break;
		      
		   case 2 :
			   this.timePeriod = "LG";
		      break; 		   
		   
		   default :
			   this.timePeriod = "ONIDA";
		 
		}		
	}
	
	public void setAddedValues(String AddedValues) {
		this.AddedValues = AddedValues;
	}

	public void setExplanations(String Explanations) {
		this.AddedValues = Explanations;
	}

	public String getIDname() {
		return this.IDname;
	}

	public String gettimePeriod() {
		return this.timePeriod;
	}
	
	public String getAddedValues() {		
		return this.AddedValues;
	}

	public String getExplanations() {
		return this.AddedValues;
	}

	public TableOfCntnt() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getDriverPath() {

		String driverpath = properties.getProperty("drverpath");

		if (driverpath != null)
			return driverpath;
		else
			throw new RuntimeException("please specify driver path in config");

	}

	public String getApplicationUrl() {

		String appUrl = properties.getProperty("url");

		if (appUrl != null)
			return appUrl;
		else
			throw new RuntimeException("please specify appUrl in config");

	}

	public String defaultBrowser() {
		System.out.println("The browser does");
		String browserDef = properties.getProperty("defaultBrowser");

		if (browserDef != null)
			return browserDef;
		else
			throw new RuntimeException("please specify browserDef in config");

	}

}
