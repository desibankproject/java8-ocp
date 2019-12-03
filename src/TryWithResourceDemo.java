import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TryWithResourceDemo {
	public static void main(String[] args) throws SQLException   {
		try (Connection conn=DriverManager.
				getConnection("jdbc:mysql://localhost:3306/spring100_db","root","mysql@1234")) {
			 
		}
	}
}
