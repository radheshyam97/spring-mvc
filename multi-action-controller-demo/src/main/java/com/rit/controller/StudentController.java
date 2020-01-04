package com.rit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.rit.service.StudentService;
import com.rit.vo.StudentVO;

public class StudentController extends MultiActionController {

	private StudentService studentService;

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		StudentVO studentVO = readStudentData(request);
		boolean flag = studentService.add(studentVO);
		ModelAndView modelAndView = new ModelAndView("managestudent", "msg", "Student Added Successfully.");
		return modelAndView;

	}

	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) {
		StudentVO studentVO = readStudentData(request);
		boolean flag = studentService.update(studentVO);
		ModelAndView modelAndView = new ModelAndView("managestudent", "msg", "Student Updated Successfully.");
		return modelAndView;
	}

	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
		StudentVO studentVO = readStudentData(request);
		boolean flag = studentService.delete(studentVO);
		ModelAndView modelAndView = new ModelAndView("managestudent", "msg", "Student Deleted Successfully.");
		return modelAndView;
	}

	public ModelAndView get(HttpServletRequest request, HttpServletResponse response) {
		StudentVO studentVO = readStudentData(request);
		StudentVO studentVORs = studentService.get(studentVO);
		if (studentVORs == null) {
			ModelAndView modelAndView = new ModelAndView("managestudent", "msg", "Student Data Does Not Exists.");
			return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView("managestudent", "stu", studentVORs);
			return modelAndView;
		}
	}

	private StudentVO readStudentData(HttpServletRequest request) {

		StudentVO vo = new StudentVO();

		if (!isEmptyString(request.getParameter("rollno")))
			vo.setRollno(new Long(request.getParameter("rollno").trim()));

		if (!isEmptyString(request.getParameter("sname")))
			vo.setSname(request.getParameter("sname").trim());

		if (!isEmptyString(request.getParameter("marks")))
			vo.setMarks(new Double(request.getParameter("marks").trim()));

		return vo;

	}

	private boolean isEmptyString(String str) {

		return (str == null || str.length() <= 0);

	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

}
