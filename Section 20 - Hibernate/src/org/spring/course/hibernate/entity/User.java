package org.spring.course.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User2")
public class User {

	@Id
	@Column(name = "id")
	private int _id;
	@Column(name = "username")
	private String _username;
	@Column(name = "password")
	private String _password;

	@Column(name = "first_name")
	private String _firstName;
	@Column(name = "last_name")
	private String _lastName;

	public User(String username, String password, String firstName, String lastName) {
		_username = username;
		_password = password;
		_firstName = firstName;
		_lastName = lastName;
	}

	public User() {
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [_id=" + _id + ", _username=" + _username + ", _password=" + _password + ", _firstName="
				+ _firstName + ", _lastName=" + _lastName + "]";
	}

}
