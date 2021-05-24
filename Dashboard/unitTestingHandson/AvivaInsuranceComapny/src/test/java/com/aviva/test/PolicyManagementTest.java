package com.aviva.test;

import com.aviva.exception.InvalidInsurancePolicyException;
import com.aviva.model.InsurancePolicy;
import com.aviva.util.PolicyManagement;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PolicyManagementTest {

    private static List<InsurancePolicy> policyList = new ArrayList<InsurancePolicy>();
    ;
    private static PolicyManagement policy;
    private static SimpleDateFormat s = new SimpleDateFormat("yyyy-dd-MM");

    @BeforeClass
    public static void setUp() throws Exception {
        InsurancePolicy ip = new InsurancePolicy("100", "Health Insurance", "Arogya Sanjeevani Policy", "abc", s.parse("2021-23-01"), s.parse("2021-23-03"), 200.0);
        InsurancePolicy ip1 = new InsurancePolicy("101", "Health Insurance", "Critical Illness Insurance", "xyz", s.parse("2020-25-10"), s.parse("2021-25-10"), 600.0);
        InsurancePolicy ip2 = new InsurancePolicy("102", "Vehicle Insurance", "Comprehensive Insurance", "def", s.parse("2021-23-05"), s.parse("2021-23-06"), 800.0);
        policyList.add(ip);
        policyList.add(ip1);
        policyList.add(ip2);
        //Create few  objects for InsurancePolicy class and add to policyList.
        //Use that list to test all the methods in PolicyManagementTest class that requires a list of InsurancePolicy
    }

    // Test validatePolicyType method when the Insurance type is Health Insurance
    @Test
    public void test11ValidatePolicyTypeWhenHealthInsurance() throws InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        assertTrue(policy.validatePolicyType("Health Insurance"));
    }

    // Test validatePolicyType method when the Insurance type is Vehicle Insurance
    @Test
    public void test12ValidatePolicyTypeWhenVehicleInsurance() throws InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        assertTrue(policy.validatePolicyType("Vehicle Insurance"));
    }

    // Test validatePolicyType method when the Insurance type is Invalid
    @Test(expected = InvalidInsurancePolicyException.class)
    public void test13ValidatePolicyTypeWhenInvalid() throws InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        policy.validatePolicyType("Insurance");
    }

    // Test viewPolicyByInsurancePolicyId method for a valid Policy Id
    @Test
    public void test14ViewPolicyForValidInsurancePolicyId() throws InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        InsurancePolicy inspolicy = policy.viewPolicyByInsurancePolicyId(policyList, "100");
    }

    // Test viewPolicyByInsurancePolicyId method for an invalid Policy Id
    @Test(expected = InvalidInsurancePolicyException.class)
    public void test15ViewPolicyForInvalidInsurancePolicyId() throws InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        InsurancePolicy inspolicy = policy.viewPolicyByInsurancePolicyId(policyList, "1000");
    }

    // Test the viewPolicyByExpiryDate method
    @Test
    public void test16ViewPolicyByExpiryDate() throws ParseException, InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        List<InsurancePolicy> list = policy.viewPolicyByExpiryDate(policyList, s.parse("2021-23-03"));
    }

    // Test the viewPolicyByExpiryDate method for an Empty List
    @Test(expected = InvalidInsurancePolicyException.class)
    public void test17ViewPolicyByExpiryDateForEmptyList() throws ParseException, InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        List<InsurancePolicy> emptyList = new ArrayList<>();
        List<InsurancePolicy> list = policy.viewPolicyByExpiryDate(emptyList, s.parse("2021-23-03"));

    }

    // Test the calculatePremiumAmountByExpiryDate method
    @Test
    public void test18CalculatePremiumAmountByExpiryDate() throws ParseException, InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        assertEquals(800.0, policy.calculatePremiumAmountByExpiryDate(policyList, s.parse("2021-23-06")), 0);
    }

    // Test the calculatePremiumAmountByExpiryDate method for an Empty List
    @Test(expected = InvalidInsurancePolicyException.class)
    public void test19CalculatePremiumAmountByExpiryDateForEmptyList() throws ParseException, InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        List<InsurancePolicy> emptyList = new ArrayList<>();
        double amount = policy.calculatePremiumAmountByExpiryDate(emptyList, s.parse("2021-23-06"));
    }

    // Test the countOfPolicyHoldersBasedOnThePolicyType method
    @Test
    public void test20CountOfPolicyHoldersBasedOnThePolicyType() throws InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        policy.countOfPolicyHoldersBasedOnPolicyType(policyList);
    }

    // Test the countOfPolicyHoldersBasedOnThePolicyType method for an Empty List
    @Test(expected = InvalidInsurancePolicyException.class)
    public void test21CountOfPolicyHoldersBasedOnThePolicyTypeForEmptyList() throws InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        List<InsurancePolicy> emptyList = new ArrayList<>();
        policy.countOfPolicyHoldersBasedOnPolicyType(emptyList);
    }

    // Test the countOfPolicyHoldersWithAdditonalBonus method
    @Test
    public void test22CountOfPolicyHoldersWithAdditonalBonus() throws ParseException, InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        assertEquals(2, policy.countOfPolicyHoldersWithAdditonalBonus(policyList, s.parse("2021-01-05")));
    }

    // Test the countOfPolicyHoldersWithAdditonalBonus method for an empty List
    @Test(expected = InvalidInsurancePolicyException.class)
    public void test23CountOfPolicyHoldersWithAdditonalBonusForEmptyList() throws ParseException, InvalidInsurancePolicyException {
        // Fill the code
        policy = new PolicyManagement();
        List<InsurancePolicy> emptyList = new ArrayList<>();
        policy.countOfPolicyHoldersWithAdditonalBonus(emptyList, s.parse("2021-01-05"));
    }

}