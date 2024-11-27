package apache_programs;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a4 {

	public static String getData(String location,String sn,int r,int c) throws Throwable {
		FileInputStream f1=new FileInputStream(location);
		Workbook book= WorkbookFactory.create(f1);
		String data=book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
		return data;
	}	
	public static void main(String[] args) throws Throwable {
	 System.out.println(getData("./Data/ElorusData.xlsx", "ElorusLogin", 1, 0));
	 System.out.println(getData("./Data/ElorusData.xlsx", "ElorusLogin", 1, 1));
	 System.out.println(getData("./Data/ElorusData.xlsx", "ElorusLogin", 1, 2));
	
	}
}


