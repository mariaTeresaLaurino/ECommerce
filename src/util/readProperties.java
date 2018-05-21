package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class readProperties {

	private static String pathFile="res/config.properties";
	public static String getUrl() {
	    Properties prop = new Properties();
	    InputStream input = null;
	    try {
	        input = new FileInputStream(pathFile);
	        // load a properties file
	        prop.load(input);
	        // get the property value and print it out
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    } finally {
	        if (input != null) {
	            try {
	                input.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        
	    }
	    return prop.getProperty("url");
	    
	  }
	
	
	public static String getUsername() {
		    Properties prop = new Properties();
		    InputStream input = null;
		    try {
		        input = new FileInputStream(pathFile);
		        // load a properties file
		        prop.load(input);
		        // get the property value and print it out
		    } catch (IOException ex) {
		        ex.printStackTrace();
		    } finally {
		        if (input != null) {
		            try {
		                input.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		        
		    }
		    return prop.getProperty("username");
		  }
	
	public static String getPassword() {
	    Properties prop = new Properties();
	    InputStream input = null;
	    try {
	        input = new FileInputStream(pathFile);
	        // load a properties file
	        prop.load(input);
	        // get the property value and print it out
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    } finally {
	        if (input != null) {
	            try {
	                input.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        
	    }
	    return prop.getProperty("password");
	  }
	
	
	
	
}
