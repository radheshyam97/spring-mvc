package com.rit.service;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.rit.vo.EmployeeDetails;

public class EmployeeService {

	private JdbcTemplate jdbcTemplate;

	public EmployeeService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(final EmployeeDetails empDetails) {

		String sql = "INSERT INTO  emp VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, empDetails.getEmpNo());
				ps.setString(2, empDetails.getName());
				ps.setString(3, empDetails.getJob());
				ps.setInt(4, empDetails.getMgr());
				ps.setDate(5, new Date(System.currentTimeMillis()));
				ps.setDouble(6, empDetails.getSal());
				ps.setDouble(7, empDetails.getComm());
				ps.setInt(8, empDetails.getDeptNo());
			}
		});
	}
}
