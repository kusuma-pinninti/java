import java.sql.*;

public class App{
    public static void main(String[] args) throws Exception {
    Connection connect = null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connect = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "root@1234");
    Statement statement = connect.createStatement();
    // statement.execute(&quot;create database cse&quot;);
    statement.execute("use db");

    ResultSet resultSet=statement.executeQuery("select * from student");
        while(resultSet.next()){
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getInt(2));
        }
    }
}
