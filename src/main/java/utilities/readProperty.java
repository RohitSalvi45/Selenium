package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readProperty {
Properties prop;
	
	public readProperty() {
		try {
			File src= new File("./config.property");
			FileInputStream fis= new FileInputStream(src);
			
			prop= new Properties();
			prop.load(fis);
			//System.out.println(prop.getProperty("appURL"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public String getApplicationURL() {
		String appURL= prop.getProperty("appURL");
		return appURL;
	}
	public String getdriver() {
		String driverp= prop.getProperty("driverpath");
		return driverp;
	}
}
