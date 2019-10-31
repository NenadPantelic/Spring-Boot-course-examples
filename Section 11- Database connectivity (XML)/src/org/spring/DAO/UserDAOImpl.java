package org.spring.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.spring.model.User;

public class UserDAOImpl implements UserDAO {

	private DataSource _dataSource;

	public UserDAOImpl(DataSource dataSource) {
		super();
		_dataSource = dataSource;
	}

	@Override
	public List<User> getAllUsers() {
		String query = "SELECT * FROM User";
		List<User> users = new ArrayList<User>();
		Connection connection = null;
		try {
			connection = _dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				User user = new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
				users.add(user);
			}

			resultSet.close();
			preparedStatement.close();
			return users;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {

		}
	}

}
