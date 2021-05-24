package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.LoginBean;
@Service
public class LoginService {
	
	public boolean validate(LoginBean bean)	{
		
		if (bean.getUserName().equalsIgnoreCase(bean.getPassword())) {
			return true;
		}
		
		return false;
	}
	

}
