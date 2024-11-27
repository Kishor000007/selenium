package apache_programs;

import java.io.FileInputStream;
import java.util.Properties;

public class a6 {

	public static void main(String[] args) throws Throwable {
		FileInputStream f=new FileInputStream(".\\Data\\ElorusData.properties");
		Properties p=new Properties();
		p.load(f);
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}
}
