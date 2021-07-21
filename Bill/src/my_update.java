
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class my_update{
	
void  my_db_update(String str1, String str2,String str3,String str4) {
		try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/mymobile","root","root");  
	
	Statement st=con.createStatement();  
	int mark = Integer.parseInt(str3); 
	
	String query1="INSERT INTO `bill`"
	 + " (`mcompany`, `model`, `battery`, `price`)"
	 + "VALUES('" +str1+"','"+str2+"',"+mark+",'"+str4+"')";
	st.executeUpdate(query1); 
	
	
	con.close();  
	
	}catch(Exception e){ System.out.println(e);} 
}
}

