package accounting.ks.ua.oblenergo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseFacade {

	public static List<String> getClients() {
		List<String> result = new ArrayList<String>();

		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234")) 
		{

			System.out.println("Java JDBC PostgreSQl Example");



			System.out.println("Connected to PostgreSQL database!");
			Statement statement = connection.createStatement();

			//ResultSet resultSet = 
					statement.executeUpdate("INSERT INTO accounting.\"clientsAccounting\" (id, \"clientName\", \"clientInfo\") VALUES (1, 'ClientNew', '34234234234'), (2, 'ClientNew0', '34werw34234234');");//("SELECT * FROM accounting.\"clientsAccounting\"");
			//while (resultSet.next()) {
				//result.add(resultSet.getString("clientName"));
				//result.add(resultSet.getString("clientInfo"));
			}
			
		
		catch (SQLException e) {
		System.out.println("Connection failure.");
		e.printStackTrace();
	}
	return result;
	
  }
	
}
