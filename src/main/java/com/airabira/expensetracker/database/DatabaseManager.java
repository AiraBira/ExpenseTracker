package com.airabira.expensetracker.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private Connection connection;


    public Connection getConnection() {
        return connection;
    }

    public void ouvrirConnection() throws SQLException{
        this.connection = DriverManager.getConnection("jdbc:sqlite:data/expenses.db");
        }
    

    public void fermerConnection() throws SQLException {
        if (connection != null && !connection.isClosed()){
            connection.close();
        }
    }



}
