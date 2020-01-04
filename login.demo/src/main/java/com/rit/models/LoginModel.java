package com.rit.models;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginModel {

	private JdbcTemplate jdbcTemplate;

	public LoginModel() {
	}

	public String validate(String userName, String userPass) {
		System.out.println("LoginModel: validate()");

		String sql = "SELECT TYPE FROM user_details_tbl WHERE user_name ='" + userName + "' AND user_pass ='" + userPass
				+ "'";

		try {
			System.out.println("SQL: " + sql);
			return jdbcTemplate.queryForObject(sql, String.class);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public LoginModel(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
