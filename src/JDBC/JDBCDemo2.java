package JDBC;

import java.sql.*;

public class JDBCDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1 .  loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection
        String username = "root";
        String password = "root";
        String connectionURL = "jdbc:mysql://localhost:3306/8ambatch";
        Connection con = DriverManager.getConnection(connectionURL,username,password);

        // 3. creating statement
        Statement statement = con.createStatement();

        // 4. executing a query
        String sql = "select * from student";

        // DDL Queries : data Definition language Queries
        // Select

        ResultSet rs = statement.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }



    }
}
