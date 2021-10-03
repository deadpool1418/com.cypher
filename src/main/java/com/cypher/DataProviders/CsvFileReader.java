package com.cypher.DataProviders;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class CsvFileReader {

	public static File file;
	public static CSVReader csvReader;

	public static Iterator<Object[]> readDataFromCsv(String filePath) throws IOException {
		int i = 0;
		List<Object[]> data = null;
		try {
			file = new File(filePath);
			csvReader = new CSVReader(new FileReader(file));
			String[] nextRecord;
			data = new ArrayList<Object[]>();
			while ((nextRecord = csvReader.readNext()) != null) {
				if(i != 0)
					data.add(nextRecord);
				i += 1;
			}
		}
		catch (Exception e) {
			System.out.println("File not found !!!");
		}
		return data.iterator();

	}
}
