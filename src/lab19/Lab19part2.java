package lab19;

import java.sql.*;

public class Lab19part2 {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl;encrypt=true; databaseName=AdventureWorks; user=*****;password=*****;trustServerCertificate=true";

        try (Connection con = DriverManager.getConnection(connectionUrl);
             Statement stmt = con.createStatement();) {

            String sql = "\tselect top 10 FirstName, LastName, EmailAddress  from Person.Contact where LastName like ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, args[0] + "%");
            ResultSet rs = ps.executeQuery();

            if(!rs.next()) {
                System.out.println("Nie znaleziono żadnych osób ");
            }else {
                do {
                    System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName")+" " + rs.getString("EmailAddress"));
                }while (rs.next());
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
