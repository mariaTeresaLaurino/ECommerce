package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import util.readProperties;

public class SingletonConnection {
	
	private static SingletonConnection instance = null;
	private Connection connection;
	
	
    
    private SingletonConnection() throws SQLException {
        try {
        		String url = readProperties.getUrl();
        		String username = readProperties.getUsername();;
        		String password = readProperties.getPassword();;;
            Class.forName("oracle.jdbc.OracleDriver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
        System.out.println("Connessione riuscita");
    }
    
    
	public static SingletonConnection getInstance() throws SQLException {
		if (instance == null) {
			instance = new SingletonConnection();
		}
		 else if (instance.getConnection().isClosed()) {
	            instance = new SingletonConnection();
	        }
		return instance;
	}


	public Connection getConnection() {
		return connection;
	}

}
