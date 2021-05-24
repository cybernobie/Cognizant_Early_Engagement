package com.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;

@Component
public class CustomValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return RegistrationBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmpty(errors, "userName", "error.userName", "User Name cannot be blank");
		RegistrationBean reg = (RegistrationBean) target;

		if (!String.valueOf(reg.getContactNumber()).matches("^[0-9]{10}$")) {
			errors.rejectValue("contactNumber", "error.contactNumber",
					"Contact Number should be of 10 digits/Contact number should not be blank");
		}
		ValidationUtils.rejectIfEmpty(errors, "emailId", "error.emailId", "Email ID cannot be blank");
		ValidationUtils.rejectIfEmpty(errors, "confirmEmailId", "error.confirmEmailId", "Confirm  Email ID cannot be blank");
	
		if (!reg.getEmailId().matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,3}")) {
			errors.rejectValue("emailId", "error.emailId", "Should be a proper email ID format");
		}
		if (!reg.getConfirmEmailId().matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,3}")) {
			errors.rejectValue("confirmEmailId", "error.confirmEmailId", "Should be a proper email ID format");
		}
		if (!reg.getEmailId().equals(reg.getConfirmEmailId())) {
			errors.rejectValue("confirmEmailId", "error.confirmEmailId", "Email and Confirm Email should be same");
		}

		if (!reg.isStatus()) {
			errors.rejectValue("status", "error.status", "please agree to the terms and conditions");
		}
	
	}

}
