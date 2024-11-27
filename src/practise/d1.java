package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class d1 {

	@Test
	public void orrnageHrm() throws Throwable {
		FileInputStream file=new FileInputStream("D:\\Selenium\\Selenium\\Data\\OrrangeHrmData.xlsx");
		Workbook book=WorkbookFactory.create(file);
		String data1 = book.getSheet("OrangeHrmLogin").getRow(0).getCell(0).getStringCellValue();
		String data2 = book.getSheet("OrangeHrmLogin").getRow(0).getCell(1).getStringCellValue();
		String data3 = book.getSheet("OrangeHrmLogin").getRow(0).getCell(2).getStringCellValue();
		String data4 = book.getSheet("OrangeHrmLogin").getRow(1).getCell(0).getStringCellValue();
		String data5 = book.getSheet("OrangeHrmLogin").getRow(1).getCell(1).getStringCellValue();
		String data6 = book.getSheet("OrangeHrmLogin").getRow(1).getCell(2).getStringCellValue();
	    
	    book.getSheet("OrangeHrmLogin").createRow(2).createCell(0).setCellValue("Login");
	    book.getSheet("OrangeHrmLogin").getRow(2).createCell(1).setCellValue("Login");
	    book.getSheet("OrangeHrmLogin").getRow(2).createCell(2).setCellValue("Login");
	    
	    FileOutputStream f=new FileOutputStream("D:\\Selenium\\Selenium\\Data\\OrrangeHrmData.xlsx");
	    book.write(f);
	    
	    String data7 = book.getSheet("OrangeHrmLogin").getRow(2).getCell(0).getStringCellValue();
		String data8 = book.getSheet("OrangeHrmLogin").getRow(2).getCell(1).getStringCellValue();
		String data9 = book.getSheet("OrangeHrmLogin").getRow(2).getCell(2).getStringCellValue();
		
	    System.out.println(data1+" = "+data4);
	    System.out.println(data2+" = "+data5);
	    System.out.println(data3+" = "+data6);
	    System.out.println(data1+" = "+data7);
	    System.out.println(data2+" = "+data8);
	    System.out.println(data3+" = "+data9);
	    
	    
		book.close();
	}
}
