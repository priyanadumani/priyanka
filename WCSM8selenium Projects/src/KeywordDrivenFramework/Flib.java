package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
		// It is use to store generic reusable methods...
		// all the methods are Non-static

		public String readExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException 
		{		
			FileInputStream fis = new FileInputStream(excelpath);
			Workbook wb = WorkbookFactory.create(fis);	// To Read the data
			Sheet sheet = wb.getSheet(sheetname);		// go into sheet of excel
			Row row = sheet.getRow(rowcount);			// go to desired row
			Cell cell = row.getCell(cellcount);			// go to desired cell/col
			String data = cell.getStringCellValue();	// get count of row
			return data;
		}


		public int rowcount(String excelpath,String sheetname1) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(excelpath);

			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheet(sheetname1);
			int data1=sheet.getLastRowNum();
			return data1;

		}
		
		// write Cell in excel file
		public void writeexceldata(String excelpath,String sheetname) throws EncryptedDocumentException, IOException 
		{
			FileInputStream fis = new FileInputStream(excelpath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetname);
			Row row = sheet.getRow(1);
			Cell cell = row.createCell(2);
			cell.setCellValue("BCCI");
			
			FileOutputStream fos = new FileOutputStream(excelpath);
			wb.write(fos);
		}

		// To read Property from property file
		public String readPropertyData(String propPath,String value) throws IOException {

			FileInputStream fis=new FileInputStream(propPath);
			Properties prop=new Properties();
			prop.load(fis);
			String data= prop.getProperty(value);
			return data;

		}
}
