package com.cts.cit.controller;

import java.util.Date;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.cit.exception.ApplicationException;
import com.cts.cit.model.CCRepresentative;
import com.cts.cit.model.Customer;
import com.cts.cit.model.IssueDetail;
import com.cts.cit.service.CustomerIssueService;

@Controller
public class LoginController

{

	@Autowired
	CustomerIssueService custService;

	@Autowired
	public LoginController(CustomerIssueService service, Validator validator) {
		System.out.println("in parametized constr of controller with validator");
		this.custService = service;
		this.validator = validator;
	}

	@Autowired
	private Validator validator;

	@RequestMapping(value = "/login1", method = RequestMethod.GET)
	public String showLoginPage(@ModelAttribute("customer") Customer customer, ModelMap map) {
		// IssueDetail issueDetail = new IssueDetail();
		// Type Your Code here
		//map.addAttribute("customer",new Customer());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showCustomerPage(@ModelAttribute("customer") Customer customer, ModelMap map,
			BindingResult result) throws ApplicationException{

		// Type Your Code here
		validator.validate(customer, result);
		if (result.hasErrors()) {
			return "login";
		} else {
			custService.addCustomerObject(customer); 
			return "customerform";
		}
	}

	
	  @GetMapping("/customerform") 
	  public String showCustomerForm() {
	  
	  return "customerform";
	  }
	 

	@RequestMapping(value = "/customerform", method = RequestMethod.POST)
	public ModelAndView showCustomerIssue(ModelMap model, @RequestParam String issueid, @RequestParam String option) {
		IssueDetail issueDetail = new IssueDetail();

		ModelAndView modelAndView = new ModelAndView();
		
		// Type Your Code here
		if(option.equals("ri")){
			int issueId= Integer.parseInt(custService.getMaxissueId().substring(1));
			System.out.println(issueId);
			issueId= issueId+1;
			String currentIssueId = "I"+issueId;
			model.addAttribute("custIssueId",currentIssueId );
			modelAndView.setViewName("raiseissue");
			
		}else if (option.equals("vi")) {
			modelAndView.setViewName("customerissue");
			IssueDetail issueobj = custService.getIssueDetailById(issueid);
			System.out.println(issueid);
			System.out.println(issueobj);
			if(issueobj!=null) {
				modelAndView.addObject("issueobj", issueobj);
			}else {
				throw new ApplicationException("No records found with that id");
			}
		}
		
		return modelAndView;
	}

	@RequestMapping(value = "/raiseissue", method = RequestMethod.POST)
	public ModelAndView raiseIssue(ModelMap model, @RequestParam String issueReportDate, @RequestParam String custId,
			@RequestParam String category, @RequestParam String descr) {
		CCRepresentative ccr = new CCRepresentative();
		IssueDetail issueDetail = new IssueDetail();
		CCRepresentative ccrToModify = new CCRepresentative();

		ModelAndView modelAndView = new ModelAndView("issueraised");
		

		// Type Your Code here
		if(issueReportDate.trim().isEmpty() || custId.trim().isEmpty() || category.trim().isEmpty() || descr.trim().isEmpty() )
		{
			throw new ApplicationException("Please Enter All the Required Details");
		}
		// check if the entered date is valid or not
		if (!custService.validateDateOfReport(issueReportDate)) 
		{
			// if Date is not valid then we will raise a Exception
			throw new ApplicationException("Please Enter Valid Date(Format:yyyy-mm-dd)"); 
		}
		else 
		{
			// setting up issueDetail object with values received from the form
			issueDetail.setIssueReportDate(CustomerIssueService.stringToDateConverter(issueReportDate));
			issueDetail.setCustId(custId);
			issueDetail.setCategory(category);
			issueDetail.setDescription(descr);

			// finding available CCR
			CCRepresentative availableCCR = custService.getAvailableCCR();

			//We need to Increment the availableCCR's issueCount
			//Because we are assigning him a Issue to resolve
			availableCCR.setIssuesInProgress(availableCCR.getIssuesInProgress()+1);
			
			// setting the availableCCR's Id to issueDetail Object
			issueDetail.setCcRepId(availableCCR.getCcRId());

			// Since we are not getting custIssueId from the form we need to generate it again
			int issueId = Integer.parseInt(custService.getMaxissueId().substring(1)); //return 9
			issueId = issueId + 1;// 10
			
			String currentIssueId = "I"+ issueId; // it will be I10
			issueDetail.setCustIssueId(currentIssueId);
			
			
			//also add issue id to availableCCR issueIds
			//I1;I2;I3;I4
			availableCCR.setIssueIds( availableCCR.getIssueIds()+";"+currentIssueId);
				
			
			issueDetail.setIssueStatus("InProgress"); // setting the default status as InProgress

			// adding issue detail to our issuesList
			CustomerIssueService.issuesList.add(issueDetail);

			// adding that issueDetail to model
			model.addAttribute(issueDetail);
			modelAndView.addObject("issue", issueDetail);

			return modelAndView;
		}

	}


	}

