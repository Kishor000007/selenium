package testNG_programs;

import org.testng.annotations.DataProvider;
import apache_programs.a4;

public class SampleDataProviders {

	@DataProvider
	public Object[][] elorusAddContactData() throws Throwable {
		Object[][] data=new Object[1][7];
		data[0][0]=a4.getData("./Data/ElorusData.xlsx", "ElorusLogin", 1, 0);
	    data[0][1]=a4.getData("./Data/ElorusData.xlsx", "ElorusLogin", 1, 1);
		data[0][2]=a4.getData("./Data/ElorusData.xlsx", "ElorusLogin", 1, 2);
	    data[0][3]=a4.getData("./Data/ElorusData.xlsx", "ElorusContact", 1, 0);
		data[0][4]=a4.getData("./Data/ElorusData.xlsx", "ElorusContact", 1, 1);
		data[0][5]=a4.getData("./Data/ElorusData.xlsx", "ElorusContact", 1, 2);
        data[0][6]=a4.getData("./Data/ElorusData.xlsx", "ElorusContact", 1, 3);
        return data;
	}
}

	