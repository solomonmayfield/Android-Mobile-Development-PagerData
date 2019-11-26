package com.example.pagerdata;

import java.util.ArrayList;

public class DataSet {
	private static DataSet dataSet;
	private ArrayList<String> data;
	
	private DataSet()
	{
		data = new ArrayList<String>();
		data.add("First");
		data.add("Second");
		data.add("Third");
		data.add("Forth");
	}
	
	public static DataSet getInstance()
	{
		if(dataSet == null)
		{
			dataSet = new DataSet();
		}
		
		return dataSet;
	}
	
	public ArrayList<String> getData()
	{
		return data;
	}
}






