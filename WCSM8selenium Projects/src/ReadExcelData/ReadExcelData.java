package ReadExcelData;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");	// path of the excel
		Workbook wb = WorkbookFactory.create(fis);	//make file ready for read
		Sheet sheet = wb.getSheet("IPL"); //get into sheet
		Row row = sheet.getRow(6);	// get into row
		Cell cell = row.getCell(0);	//get into column
		String data = cell.getStringCellValue();	//get the text from cell
		System.out.println(data);

	}

}
