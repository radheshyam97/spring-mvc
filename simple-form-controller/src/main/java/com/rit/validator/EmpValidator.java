package com.rit.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.rit.vo.EmployeeDetails;

public class EmpValidator implements Validator {

	public boolean supports(Class<?> clazz) {

		System.out.println("Method: supports()");

		boolean flag = clazz.equals(EmployeeDetails.class);
		System.out.println("flag: " + flag);
		return flag;
	}

	public void validate(Object target, Errors errors) {

		System.out.println("Method: validate()");

		EmployeeDetails ed = (EmployeeDetails) target;

		// name
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.required", "The name field can't be empty");

		// deptno
		if (ed.getDeptNo() < 10) {
			errors.rejectValue("deptNo", "field.minValue", new Object[] { Integer.valueOf(9) },
					"The deptNo should be greator than 0");

		}
		if (ed.getDeptNo() > 99) {
			errors.rejectValue("deptNo", "field.maxValue", new Object[] { Integer.valueOf(9) },
					"The deptNo should be less than 99");

		}
	}

}
