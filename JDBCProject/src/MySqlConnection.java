import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			
			System.out.println("Database Connection Success!");
			
			Statement stm = con.createStatement();
			String query = "CREATE DATABASE jdbcEx";
			
			stm.execute(query);
			System.out.println("DB craeted");
			con.close();
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}