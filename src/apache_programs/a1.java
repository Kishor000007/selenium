package apache_programs;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//program to read the data from the excel
public class a1 {

	public static void main(String[] args) throws Throwable {

		//reads the data from the excel
		FileInputStream f=new FileInputStream("./Data/ElorusData.xlsx");
		
		//create the workspace out of the data read
		Workbook book=WorkbookFactory.create(f);
		
		//read the data from the workspace
		String data = book.getSheet("Demo").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(data);
			
	}
}
