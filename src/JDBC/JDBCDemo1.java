package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

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
        String sql = "insert into student values(3,'shikha','IT',89)";

        // DML Queries : data manipulation language Queries
        // insert update delete

        statement.executeUpdate(sql);



    }
}
