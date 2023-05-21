package DataDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class ToReadDataFromCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("./testData/csvData.csv");
		CSVReader reader = new CSVReader(fr);

		String[] data1 = reader.readNext();
//
//		for(String dt:data1) {
//			System.out.println(dt);
//		}
//		String[] data2 = reader.readNext();
//
//		for(String dt:data2) {
//			System.out.println(dt);
//		}
		List<String[]> allData = reader.readAll();
		for(String[] sarr:allData)
		{
			for( String sar:sarr) {
				System.out.println(sar);
				
			}
		}


	}

}

