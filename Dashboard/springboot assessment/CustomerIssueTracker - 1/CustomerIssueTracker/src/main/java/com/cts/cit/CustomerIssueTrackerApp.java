package com.cts.cit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.cit.skeleton.SkeletonValidator;


@SpringBootApplication
public class CustomerIssueTrackerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CustomerIssueTrackerApp.class, args);
		SkeletonValidator skeletonValidator = new SkeletonValidator();
	}

}
