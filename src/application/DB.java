package application;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * JDBC class (DB in use: H2 DB)
 * @author dev.charles15531@gmail.com
 *
 */
public class DB {
	static String user = "neo";
	static String password = "";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("org.h2.Driver");
			con =  DriverManager.getConnection("jdbc:h2:file:C:/Users/A153024/eclipse-workspace/atm/resources/DB/my_db;IFEXISTS=FALSE", user, password);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
