package lab19;

import java.sql.*;

public class Lab19part1 {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl;encrypt=true; databaseName=AdventureWorks; user=****;password=****;trustServerCertificate=true";
        try (Connection con = DriverManager.getConnection(connectionUrl);
             Statement stmt = con.createStatement();) {

            String sql = "select top 10 FirstName, LastName, EmailAddress  from Person.Contact where LastName like 'Anderson'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName")+" "+rs.getString("EmailAddress"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
