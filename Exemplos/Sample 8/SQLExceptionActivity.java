package sef.module8.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//The following program throws a checked exception. 
public class SQLExceptionActivity {


	public static void main(String[] args) {

			String url = "jdbc:mysql://localhost/sakila"; 
			String user = "root";
			String pass = "root";
			
			//The following code would not compile unless it's put inside a try catch
			//1 - put it in a try block and handle ClassNotFoundException
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn = DriverManager.getConnection(url, user, pass);
				System.out.println("Conexão estabelecida com successo! \n");
			
				cn.close();
			} catch (Exception SQLException) {
				System.out.println("Deu ruim no SQL.");
			}
			//2 - You also need to catch SQLException for it to compile
	}
}