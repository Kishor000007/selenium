package apache_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a3 {

	public static void main(String[] args) throws Throwable {
		//reads the data from the excel
		FileInputStream f1=new FileInputStream("./Data/ElorusData.xlsx");
		
		//create the workspace out of the data read
		Workbook book=WorkbookFactory.create(f1);
		
		book.getSheet("Demo").createRow(4).createCell(0).setCellValue("Radhika");
		
		FileOutputStream f2=new FileOutputStream("./Data/ElorusData.xlsx");
		book.write(f2);
	}
}
