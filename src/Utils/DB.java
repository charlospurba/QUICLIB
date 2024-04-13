package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    
   private final String url
            = "jdbc:mariadb://localhost:3306/QuicLib";
   private final String username = "root";
   private final String password = "root";
   private Connection connection;
   private Statement statement;
   
   public DB() {
    init();
   }
   
   private void init() {
       try {
           this.connection = DriverManager.getConnection(url, username, password);
           this.statement = this.connection.createStatement();
       } catch (SQLException e) {
           System.out.println("Gagal terkoneksi ke Database");
       }
   }

   
   public ResultSet get(String query, String[] values) {
       try {
           if (values != null) {
               PreparedStatement preparedStatement = connection.prepareStatement(query);
               for (int i = 0; i < values.length; i++) {
                  preparedStatement.setString(i + 1, values[i]);
               }
               return preparedStatement.executeQuery(query);
           } else {
               return statement.executeQuery(query);
           }
       } catch (SQLException ex) {
           return null;
       }
   }
   
   public ResultSet getAllData(String query, String keyword) {
       try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + keyword + "%");
            return preparedStatement.executeQuery();
       } catch (SQLException e) {
           return null;
       }
   }
   
   public boolean update(String query, String[] values) {
       try {
           
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    preparedStatement.setString(i + 1, values[i]);
                }
            }
            
            preparedStatement.executeUpdate();
                    
            return true;
       } catch (SQLException ex) {
           return false;
       }
   }
   
}
