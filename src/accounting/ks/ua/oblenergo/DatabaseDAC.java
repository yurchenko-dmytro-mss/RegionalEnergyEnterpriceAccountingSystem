package accounting.ks.ua.oblenergo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseDAC {
/*
	Statement commandDML;
	ResultSet selectCommandResult;
	Connection connectionString;
	
	protected DatabaseDAC() {
		try {
	
	connectionString = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
	//CRUD
	commandDML = connectionString.createStatement();
		}
		catch (SQLException e) {
			System.out.println("-----------------------------Connection failure.--------------------------------");
			e.printStackTrace();
		}
	}
	
	protected String selectDML = "SELECT * FROM accounting.\"clientsAccounting\""; //READ
	protected String insertDML = "INSERT INTO accounting.\"clientsAccounting\" (id, \"clientName\", \"clientInfo\") VALUES (3, 'ClientNew', '34234234234'), (4, 'ClientNew0', '34werw34234234');"; //CREATE
	protected String updateDML = "UPDATE accounting.\"clientsAccounting\" SET \"clientName\"='NewOne', \"clientInfo\"='OneNew' WHERE id = 0;"; //UPDATE
	protected String deleteDML = "DELETE FROM accounting.\"clientsAccounting\" WHERE id = 1 or id = 2;"; //DELETE
	
	//ResultSet selectCommandResult; //FOR SELECT ONLY result show commandDML.executeQuery("SELECT * FROM accounting.\"clientsAccounting\"");
	
	public void runDML() {
		try {
		commandDML.executeUpdate("INSERT INTO accounting.\"clientsAccounting\" (id, \"clientName\", \"clientInfo\") VALUES (1, 'ClientNew', '34234234234'), (2, 'ClientNew0', '34werw34234234')");
		//commandDML.executeUpdate(updateDML);
		//commandDML.executeUpdate(deleteDML);
		//selectCommandResult = commandDML.executeQuery(selectDML);
		}
		catch (SQLException e) {
			System.out.println("=================Connection failure.============================");
			e.printStackTrace();
		}
	}
*/
}
