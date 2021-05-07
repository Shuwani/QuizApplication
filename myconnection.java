import java.sql.Connection;
import java.sql.DriverManager;

public class myconnection {
	public static Connection getConnection() {
		Connection con=null;
		try {
			String url="jdbc:mysql://localhost:3306/login_register";
			String uname="root";
			String pass="Pizza";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pass);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return con;
	}
}
