package day12.solved;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import day11.solved.ConnectionUtil;

public class UserQueryPrepStmt {
	public static void main(String[] args) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String query = "INSERT INTO user (username, email,  password) VALUES ( ?, ?, ? );";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, "Gowtham");
		pst.setString(2, "gowtham.krish1705@gmail.com");
		pst.setString(3, "password009");
		System.out.println(pst.toString());
		int rows2 = pst.executeUpdate();
		System.out.println("No of rows inserted :" + rows2);
		pst.close();

	}
}
