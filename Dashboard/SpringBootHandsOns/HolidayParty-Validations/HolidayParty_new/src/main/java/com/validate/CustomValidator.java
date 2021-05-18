package com.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;

@Component
public class CustomValidator implements Validator {

	public void validate(Object arg0, Errors arg1) {
		// Validations for empty inputs
		ValidationUtils.rejectIfEmpty(arg1, "userName", "", "User Name cannot be blank");
		ValidationUtils.rejectIfEmpty(arg1, "emailId", "", "Email ID cannot be blank");
		ValidationUtils.rejectIfEmpty(arg1, "confirmEmailId", "", "Confirm Email ID cannot be blank");

		RegistrationBean registrationBean = (RegistrationBean) arg0;

		String emailPattern = "^[\\w\\d._-]+@[\\w\\d.-]+(\\.[\\w]{2,3}){1,2}$";

		boolean emailFlag = false; // To confirm the validity of emailId
		boolean confirmEmailFlag = false; // To confirm the validity of confirmEmailId

		// Checking if contactNumber is valid
		if (Long.toString(registrationBean.getContactNumber()).length() != 10) {
			arg1.rejectValue("contactNumber", "",
					"Contact Number should be of 10 digits/Contact Number should not be blank");
		}

		// Checking if emailId is valid
		if (!registrationBean.getEmailId().matches(emailPattern)) {
			arg1.rejectValue("emailId", "", "Should be a proper email ID format");
		} else {
			emailFlag = true;
		}

		// Checking if confirmEmailId is valid
		if (!registrationBean.getConfirmEmailId().matches(emailPattern)) {
			arg1.rejectValue("confirmEmailId", "", "Should be a proper email ID format");
		} else {
			confirmEmailFlag = true;
		}

		// Checking if both emailId and confirmEmailId are valid, if yes, then checking
		// if both are same
		if (emailFlag && confirmEmailFlag
				&& !registrationBean.getConfirmEmailId().equals(registrationBean.getEmailId())) {
			arg1.rejectValue("confirmEmailId", "", "Email and Confirm Email should be same");
		}

		// Checking if the status checkbox is checked or not
		if (!registrationBean.isStatus()) {
			arg1.rejectValue("status", "", "please agree to the terms and conditions");
		}
	}

	public boolean supports(Class<?> target) {
		// TODO Auto-generated method stub
		return false;
	}

}
