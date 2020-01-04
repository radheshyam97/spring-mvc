package com.rit.service;



import com.rit.dao.StudentDAO;
import com.rit.vo.StudentVO;

public class StudentService {
	private StudentDAO studentDAO;

	public StudentService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public boolean add(StudentVO studentVO) {
		return studentDAO.add(studentVO);
	}

	public boolean update(StudentVO studentVO) {
		return studentDAO.update(studentVO);
	}

	public boolean delete(StudentVO studentVO) {
		return studentDAO.delete(studentVO);
	}

	public StudentVO get(StudentVO studentVO) {
		return studentDAO.get(studentVO);
	}

}
