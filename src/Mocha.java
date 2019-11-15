import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mocha {

	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	public static void main(String[] args,Connection con) throws SQLException {
			Statement stmt = con.createStatement(
	            ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	        ResultSet uprs = stmt.executeQuery(
	            "SELECT * FROM mocha.COFFEES");
	        uprs.moveToInsertRow();
	        uprs.updateString("COF_NAME", "tea");
	        uprs.updateInt("SUP_ID", 133);
	        uprs.updateFloat("PRICE", 56.6F);
	        uprs.updateInt("SALES", 10);
	        uprs.updateInt("TOTAL",20);
	        uprs.insertRow();
	        uprs.beforeFirst();
	}
}
