package practise;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class d3_DataProvider {
	
	public static String getData(String location,String sn,int r,int c) throws Throwable {
		FileInputStream f1=new FileInputStream(location);
		Workbook book= WorkbookFactory.create(f1);
		String data=book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
		return data;
	}	

	@DataProvider(name="OrrangeHrm")
	public Object[][] OrrangeHrmData() throws Throwable{
		Object[][] data=new Object[1][3];
		data[0][0]=d3_DataProvider.getData("./Data/OrrangeHrmData.xlsx", "OrangeHrmLogin", 1, 0);
		data[0][1]=d3_DataProvider.getData("./Data/OrrangeHrmData.xlsx", "OrangeHrmLogin", 1, 1);
		data[0][2]=d3_DataProvider.getData("./Data/OrrangeHrmData.xlsx", "OrangeHrmLogin", 1, 2);
		return data;	
	}
	
}
