package sef.module13.sample;
//Needs to be completed
import java.sql.*;

public class StatementSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/hr";
			String user = "root";
			String pass = "root";
			
			//1 - Load the driver
					
			//2 - Obtain a connection
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
			
			//3 - Create a Statement
			Statement st = cn.createStatement();
			st.executeQuery("Select C.country_id, C.country_name, R.region_name from countries as C, regions as R where C.REGION_id = R.region_id");
				
			//4 - Execute a query
			ResultSet rs = st.getResultSet();			
			
			System.out.println("ID\tNome\t Region");
			//5 - Traverse through the ResultSet and print all the records 
			while(rs.next()){
				System.out.println(rs.getString(1) + " -\t" +
						           rs.getString(2) + " -" +
						           rs.getString(3));
				
			}
			
			//closing the connection
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
