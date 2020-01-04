package com.rit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rit.vo.StudentVO;

public class StudentMapper implements RowMapper<StudentVO> {

	public StudentVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentVO vo = new StudentVO();
		vo.setRollno(rs.getLong("roll_no"));
		vo.setSname(rs.getString("name"));
		vo.setMarks(rs.getDouble("marks"));
		return vo;

	}

}
