import java.sql.*;
public class Login {
    private static Connection connect = null;
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    private static String url="jdbc:mysql://localhost:3306/dbprove";
    private static String user="root",pass="";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url,user,pass);
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select*from user");
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                System.out.println(id+" "+name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
