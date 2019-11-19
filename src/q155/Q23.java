package q155;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q23 {
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection (URL, userName, passWord);
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_UPDATABLE);
			st.execute("SELECT*FROM Employee");
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
			if (rs.getInt(1) ==112) {
			rs.updateString(2, "Jack");
			}
			}
			rs.absolute(2);
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
			} catch (SQLException ex) {
				System.out.println("Exception is raised");
			}
	}
}
