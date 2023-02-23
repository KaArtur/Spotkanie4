package databases;

import java.sql.*;

public class
MyFirstJDBCconection {
    public static void main(String[] args) {
       String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl;encrypt=true; databaseName=AdventureWorks; user=****;password=///;trustServerCertificate=true";
        try (Connection con = DriverManager.getConnection(connectionUrl);
            Statement stmt = con.createStatement();) {

            String sql = "select top 10 FirstName, LastName  from Person.Contact";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
