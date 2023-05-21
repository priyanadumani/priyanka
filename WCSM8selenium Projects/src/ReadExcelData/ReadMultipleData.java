package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {


	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException,Exception {
		// Generalize the row count
		FileInputStream fis2 = new FileInputStream("./testData/testdata.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb2.getSheet("IPL");
		int data1 = sheet2.getLastRowNum();
		//System.out.println(data1);

		// Read the data from Multiple Row
		for(int i=1; i<=data1; i++) {
			FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis); 	/// refering from apache.poi factory and ready for read
			Sheet sheet = wb.getSheet("IPL"); // get into sheet
			Row row = sheet.getRow(i);	//get desired row
			Cell cell = row.getCell(0);	//get into desired cell/col
			String data = cell.getStringCellValue(); // get the value from cell
			Thread.sleep(2000);	
			System.out.println(data);
		}


	}

}
