package JSONEXtractor.Common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class DbConnectAndExtract {

	private Properties ConnectionObj;
	private final String ConnectString="..\\GProject\\Config\\config.properties";
	private final String SqlCommand="..\\GProject\\Config\\config.properties";
	private final String RecordSet="..\\GProject\\Config\\config.properties";
	
	private List<TableOfCntnt> listofContents=null;
	String[] str={"",""};
	
	
	public DbConnectAndExtract()
	{
		BufferedReader reader;
		try {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();			
		}		
	}
	
	public String retriveTheData()
	{
		
		for(int i=0;i<10;i++)
		{
			
			listofContents.add()
		}
		return null;			
	}
	
	
	
	public String DbConnectClose()
	{
		return null;		
			
	}
	public String CreateJsonData()
	{
		return null;		
	}
	

}
