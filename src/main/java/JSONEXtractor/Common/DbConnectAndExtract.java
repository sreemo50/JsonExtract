package JSONEXtractor.Common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.google.gson.Gson;

public class DbConnectAndExtract {

	private Properties ConnectionObj;
	private final String ConnectString = "..\\GProject\\Config\\config.properties";
	private final String SqlCommand = "..\\GProject\\Config\\config.properties";
	private final String RecordSet = "..\\GProject\\Config\\config.properties";

	private List<TableOfCntnt> listofContents = null;
	private ArrayList arrList;
	private TableOfCntnt tbl;

	public DbConnectAndExtract() {
		arrList = new ArrayList();
		arrList.add("North");
		arrList.add(1);
		arrList.add("West");
		arrList.add("South");

		BufferedReader reader;
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String retriveTheData() {
		Object[] arr = arrList.toArray();
		for (int i = 0; i < arrList.size(); i++) {
			tbl = new TableOfCntnt();
			tbl.setIDname(arr[0].toString());
			tbl.settimePeriod(Integer.parseInt(arr[1].toString()));
			tbl.setAddedValues(arr[2].toString());
			tbl.setExplanations(arr[3].toString());
			listofContents.add(tbl);
		}
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(listofContents));
		
		return gson.toJson(listofContents);
	}

	public String DbConnectClose() {
		return null;

	}

	public String CreateJsonData() {
		return null;
	}

}
