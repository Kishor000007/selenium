package apache_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//program to replace the data in the excel
public class a2 {

	public static void main(String[] args) throws Throwable {
		
	   //reads the data from the excel
	   	FileInputStream f1=new FileInputStream("./Data/ElorusData.xlsx");
				
	   	//create the workspace out of the data read
	   	Workbook book=WorkbookFactory.create(f1);
				
	   	//read the data from the workspace
       book.getSheet("Demo").getRow(1).getCell(1).setCellValue("Kiara");
       
        FileOutputStream f2=new FileOutputStream("./Data/ElorusData.xlsx");
        book.write(f2);
       
	}
}
