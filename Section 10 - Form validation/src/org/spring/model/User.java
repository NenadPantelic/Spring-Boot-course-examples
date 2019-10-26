package org.spring.model;

import java.util.Arrays;

import javax.validation.constraints.Size;

public class User {

	@Size(min = 5, max = 10, message="Enter the name between 5 to 10 characters")
	private String _name;
	private String _gender;
	private String _country;
	private String _introduction;
	private String[] _visitedCountries;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public String getIntroduction() {
		return _introduction;
	}

	public void setIntroduction(String introduction) {
		_introduction = introduction;
	}

	public String[] getVisitedCountries() {
		return _visitedCountries;
	}

	public void setVisitedCountries(String[] visitedCountries) {
		_visitedCountries = visitedCountries;
	}

	@Override
	public String toString() {
		return "User [_name=" + _name + ", _gender=" + _gender + ", _country=" + _country + ", _introduction="
				+ _introduction + ", _visitedCountries=" + Arrays.toString(_visitedCountries) + "]";
	}

}
