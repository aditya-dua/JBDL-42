import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class MySqlConnectionMain {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "password");
			
			System.out.println("Database Connection Success!");
			
			String query = "select * from customers;";
			
//			Statement stmt = con.createStatement();
//			
//			ResultSet rs = stmt.executeQuery(query);
//			
//			ResultSetMetaData rsmd = rs.getMetaData();
//			
//			
//			
//			while(rs.next()) {
//				System.out.println("Customer Name :"+rs.getString("customerName"));
//			}
//			rs.close();
//			stmt.close();
			
			PreparedStatement stmt = con.prepareStatement("insert into students values (?,?,?,?)");
			
			stmt.setInt(1,100);
			stmt.setInt(2,12);
			stmt.setString(3, "GFG");
			stmt.setString(4, "C.S.");
			
			stmt.executeUpdate();
			stmt.close();
			
			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
