package day11.practice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import day11.solved.ConnectionUtil;

class Task {
	int id;
	String name;
	String status;
}

public class TaskDAO {
	public void createTask(Task task) throws DAOException, SQLException {

		Connection connection = ConnectionUtil.getConnection();

		Statement stmt = connection.createStatement();

		Task one = new Task();
		one.id = 1;
		one.name = "Sample Task";
		one.status = "Pending";

		String query = "INSERT INTO task (id, name, status) VALUES (" + one.id + ", '" + one.name + "', '" + one.status
				+ "')";
		int rows = stmt.executeUpdate(query);
		System.out.println("No of rows inserted :" + rows);

		ConnectionUtil.close(connection, stmt, null);
	}
}
