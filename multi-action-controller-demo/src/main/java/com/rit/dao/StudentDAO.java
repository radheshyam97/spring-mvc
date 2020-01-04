package com.rit.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.rit.vo.StudentVO;

public class StudentDAO {

	JdbcTemplate jt;

	public StudentDAO(JdbcTemplate jt) {
		this.jt = jt;
	}

	public boolean add(final StudentVO studentVO) {
		String sql = "INSERT INTO student_tbl VALUES(?, ?, ?)";
		int insertCount = jt.update(sql, new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				int index = 1;
				ps.setLong(index++, studentVO.getRollno());
				ps.setString(index++, studentVO.getSname());
				ps.setDouble(index++, studentVO.getMarks());
			}
		});

		if (insertCount == 1)
			return true;
		else
			return false;
	}

	public boolean update(final StudentVO studentVO) {

		String sql = "UPDATE student_tbl SET name=?, marks=? WHERE roll_no = ?";
		int updateCount = jt.update(sql, new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				int index = 1;
				ps.setString(index++, studentVO.getSname());
				ps.setDouble(index++, studentVO.getMarks());
				ps.setLong(index++, studentVO.getRollno());
			}
		});

		if (updateCount == 1)
			return true;
		else
			return false;

	}

	public boolean delete(final StudentVO studentVO) {

		String sql = "DELETE FROM student_tbl WHERE roll_no = ?";
		int deleteCount = jt.update(sql, new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setLong(1, studentVO.getRollno());
			}
		});

		if (deleteCount == 1)
			return true;
		else
			return false;

	}

	public StudentVO get(StudentVO studentVO) {
		String sql = "SELECT roll_no, name, marks FROM student_tbl WHERE roll_no = ?";

		try {
			StudentVO result = jt.queryForObject(sql, new Object[] { studentVO.getRollno() }, new StudentMapper());
			return result;
		} catch (EmptyResultDataAccessException e) {
			System.out.println("Data Not Found");
			return null;
		}
	}

}
