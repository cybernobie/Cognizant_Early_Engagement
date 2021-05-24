package com.cts.cit.skeleton;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 * @author 222805
 * 
 * This class is used to verify if the Code Skeleton is intact and not modified by participants thereby ensuring smooth auto evaluation
 *
 */
public class SkeletonValidator {

	public SkeletonValidator() {
		validateClassName("com.cts.cit.CustomerIssueTrackerApp");
		
		validateClassName("com.cts.cit.controller.LoginController");
		validateClassName("com.cts.cit.model.CCRepresentative");
		validateClassName("com.cts.cit.model.Customer");
		validateClassName("com.cts.cit.model.IssueDetail");
		
		validateClassName("com.cts.cit.service.CustomerIssueService");
		
		
		
		
		validateMethodSignature("showLoginPage:String","com.cts.cit.controller.LoginController");
		validateMethodSignature("showCustomerPage:String","com.cts.cit.controller.LoginController");
		validateMethodSignature("showCustomerForm:String","com.cts.cit.controller.LoginController");
		validateMethodSignature("showCustomerIssue:ModelAndView","com.cts.cit.controller.LoginController");
		validateMethodSignature("raiseIssue:ModelAndView","com.cts.cit.controller.LoginController");
		
		validateMethodSignature("getAvailableCCR:CCRepresentative","com.cts.cit.service.CustomerIssueService");
			validateMethodSignature("getCCRById:CCRepresentative","com.cts.cit.service.CustomerIssueService");
		validateMethodSignature("getIssueDetailById:IssueDetail","com.cts.cit.service.CustomerIssueService");
		validateMethodSignature("getMaxissueId:String","com.cts.cit.service.CustomerIssueService");

	}

	private static final Logger LOG = Logger.getLogger("SkeletonValidator");

	protected final boolean validateClassName(String className) {

		boolean iscorrect = false;
		try {
			Class.forName(className);
			iscorrect = true;
			LOG.info("Class Name " + className + " is correct");

		} catch (ClassNotFoundException e) {
			LOG.log(Level.SEVERE, "You have changed either the " + "class name/package. Use the correct package "
					+ "and class name as provided in the skeleton");

		} catch (Exception e) {
			LOG.log(Level.SEVERE,
					"There is an error in validating the " + "Class Name. Please manually verify that the "
							+ "Class name is same as skeleton before uploading");
		}
		return iscorrect;

	}

	protected final void validateMethodSignature(String methodWithExcptn, String className) {
		Class cls = null;
		try {

			String[] actualmethods = methodWithExcptn.split(",");
			boolean errorFlag = false;
			String[] methodSignature;
			String methodName = null;
			String returnType = null;

			for (String singleMethod : actualmethods) {
				boolean foundMethod = false;
				methodSignature = singleMethod.split(":");

				methodName = methodSignature[0];
				returnType = methodSignature[1];
				cls = Class.forName(className);
				Method[] methods = cls.getMethods();
				for (Method findMethod : methods) {
					if (methodName.equals(findMethod.getName())) {
						foundMethod = true;
						if (!(findMethod.getReturnType().getSimpleName().equals(returnType))) {
							errorFlag = true;
							LOG.log(Level.SEVERE, " You have changed the " + "return type in '" + methodName
									+ "' method. Please stick to the " + "skeleton provided");

						} else {
							LOG.info("Method signature of " + methodName + " is valid");
						}

					}
				}
				if (!foundMethod) {
					errorFlag = true;
					LOG.log(Level.SEVERE, " Unable to find the given public method " + methodName
							+ ". Do not change the " + "given public method name. " + "Verify it with the skeleton");
				}

			}
			if (!errorFlag) {
				LOG.info("Method signature is valid");
			}

		} catch (Exception e) {
			LOG.log(Level.SEVERE,
					" There is an error in validating the " + "method structure. Please manually verify that the "
							+ "Method signature is same as the skeleton before uploading");
		}
	}

}
