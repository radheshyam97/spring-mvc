package com.rit.model;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginModel {

	JdbcTemplate jdbcTemplate;
	 

	public LoginModel(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String validate(UserDetails userDetails) {

		System.out.println("LoginModel: validate()");

		String sql = "SELECT TYPE FROM user_details_tbl WHERE user_name ='" + userDetails.getUname() + "' AND user_pass ='" + userDetails.getPass()
				+ "'";

		try {
			System.out.println("SQL: " + sql);
			return jdbcTemplate.queryForObject(sql, String.class);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	
		
	}

}
