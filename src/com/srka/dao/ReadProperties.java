package com.srka.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ReadProperties {

	String propFileName = "db.properties";
	Logger logger = Logger.getLogger(ReadProperties.class);
	
	
	public ReadProperties() {
		
	}
	
	public ReadProperties(String propFileName) {
		this.propFileName = propFileName;		
	}


	public Properties getProperty() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(propFileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info(prop);
		return prop;
	}

}


