package com.bookstore.model.dao;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionFactory {

	
	public static Connection connection = null;

	 

    public ConnectionFactory() {
    }

 

    public static Connection getConnection() {
        InputStream is = ConnectionFactory.class.getClassLoader().getResourceAsStream("jdbc1.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

 

        String driver = properties.getProperty("jdbc.driverName");
        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.username");
        String pwd = properties.getProperty("jdbc.password");

 
        try {
    Class.forName(driver);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

 

        try {
            connection = DriverManager.getConnection(url, username, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}