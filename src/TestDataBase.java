import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestDataBase {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost/aish_finance?"
	              + "user=sqluser&password=sqluserpw");
		
		java.sql.Statement statement = dbConnection.createStatement();
		

		

		ResultSet resultSet = statement.executeQuery("select name,password from admin");
		while(resultSet.next())
		{
		String username = resultSet.getString("name");
		String password =resultSet.getString("password");
		System.out.println(username+password);
		}
	}

}
