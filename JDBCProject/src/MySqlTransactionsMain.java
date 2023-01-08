import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class MySqlTransactionsMain {
	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "password");
			
			System.out.println("Database Connection Success!");
			
			con.setAutoCommit(false);
			
			
			
			Statement stmt2 = con.createStatement();
			stmt2.executeUpdate("insert into students values (1235,1,'A','C')");	
			
			
		
			Statement stmt = con.createStatement();
			stmt.executeUpdate("inserte into students values (1234,1,'A','C')");	
			
			
			
			
			
			con.commit();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			con.rollback();
			con.close();
			e.printStackTrace();
			
		}
	}

}
