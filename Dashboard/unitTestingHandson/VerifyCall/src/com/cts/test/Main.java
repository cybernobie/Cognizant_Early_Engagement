package com.cts.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(GenerateISBNTest.class);
		if(result.getFailureCount() == 0) {
			System.out.println("All Test cases Cleared");
		}else {
			System.out.println("One or more test case(s) failed");
			System.out.println("===============================");
			result.getFailures().forEach(x -> System.out.println(x.getMessage()));
		}
	}

}
