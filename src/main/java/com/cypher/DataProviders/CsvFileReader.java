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
		System.out.println(filePath);
		file = new File(filePath);
		csvReader = new CSVReader(new FileReader(file));
		String[] nextRecord;
		List<Object[]> data = new ArrayList<Object[]>();
		while ((nextRecord = csvReader.readNext()) != null) {
			data.add(nextRecord);
		}
		return data.iterator();

	}
}
