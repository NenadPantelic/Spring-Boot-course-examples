package org.spring.model;

public class User {

	private int _id;
	private String _name;
	private String _email;

	public User(int id, String name, String email) {
		super();
		_id = id;
		_name = name;
		_email = email;
	}

	public String getEmail() {
		return _email;
	}

	public int getId() {
		return _id;
	}

	public String getName() {
		return _name;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public void setId(int id) {
		_id = id;
	}

	public void setName(String name) {
		_name = name;
	}

	@Override
	public String toString() {
		return "User [_email=" + _email + ", _id=" + _id + ", _name=" + _name + "]";
	}

}
