import java.sql.*;

public class Database{
	public static void main(String arg[]) throws Exception
	
	{
		Class.forName("org.sqlite.JDBC");
		
		Connection con = DriverManager.getConnection("jdbc:sqlite:G://SQLite//sqlite-tools-win32-x86-3390000//univ.db");
		
		Statement stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from dept");
		
		int dno;
		String dname;
		
		while(rs.next())
		{
			dno=rs.getInt("deptno");
			dname=rs.getString("dname");
			
			System.out.println(dno+" "+dname);
		}
		
	}
}
