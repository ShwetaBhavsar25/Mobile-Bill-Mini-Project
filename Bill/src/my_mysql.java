import java.sql.*;
public class my_mysql {

public  String[][] my_db_select() {
String[][] data = new String[4][5];

	
try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/mymobile","root","root");  
	Statement st=con.createStatement();  
	
	ResultSet rs=st.executeQuery("SELECT * FROM bill"); 
	int i=0;
	while(rs.next())  {
	 for(int j=0;j<5;j++) {
	 data[i][j]=rs.getString(j+1);
	 }
	 i=i+1;
	}

    con.close();  
}catch(Exception e){ System.out.println(e);} 

return data;
	}
}
	