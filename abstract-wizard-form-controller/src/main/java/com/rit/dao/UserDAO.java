package com.rit.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import com.rit.vo.UserDetails;

/**
 * @author radheshyamc
 */
public class UserDAO {

	
	private JdbcTemplate jdbcTemplate;

	public UserDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean create(final UserDetails userDetails) {
		System.out.println("Method: create(-)");
		String sql = "INSERT INTO user_tbl VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		int count = jdbcTemplate.update(sql, new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				int index = 1;
				ps.setString(index++, userDetails.getUname());
				ps.setString(index++, userDetails.getPass());
				ps.setString(index++, userDetails.getEmail());
				ps.setString(index++, userDetails.getFname());
				ps.setString(index++, userDetails.getLname());
				ps.setString(index++, userDetails.getInitial());
				ps.setString(index++, userDetails.getDob());
				ps.setString(index++, userDetails.getMobile());
				ps.setString(index++, userDetails.getPhone());
				ps.setString(index++, userDetails.getAddr1());
				ps.setString(index++, userDetails.getStreet());
				ps.setString(index++, userDetails.getCity());
				ps.setString(index++, userDetails.getState());
				ps.setString(index++, userDetails.getCountry());
			}
		});

		System.out.println("count: " + count);
		if (count == 1)
			return true;
		else
			return false;
	}

}
