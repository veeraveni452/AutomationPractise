package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mongodb.client.model.geojson.LineString;

import java.util.List;

public class XLSXFileRead {
	public static Object[][] exceldata(String fileName) throws IOException {
//		String fileName = "data.xlsx";
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet1 = workbook.getSheet("Sheet1");
		int totalRows = sheet1.getLastRowNum() - sheet1.getFirstRowNum() + 1;
		List<String[]> lines = new ArrayList<String[]>();
		for(int i=0;i<totalRows;i++) {
			Row row= sheet1.getRow(i);
			int totalColumns=row.getLastCellNum()-row.getFirstCellNum();
			String[] line=new String[totalColumns];
			for(int j=0;j<totalColumns;j++) {
				Cell cell = row.getCell(j);
				line[j]=cell.getStringCellValue();
			}
			lines.add(line);
		}
		String[][]data=new String[lines.size()][0];
		lines.toArray(data);
		
		workbook.close();
		return data;
	}
}
