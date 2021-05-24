package com.aviva.util;

import com.aviva.model.InsurancePolicy;

import java.util.Date;
import java.util.List;

public class PolicyManagement {
    public boolean validatePolicyType(String health_insurance) {
        return false;
    }

    public InsurancePolicy viewPolicyByInsurancePolicyId(List<InsurancePolicy> policyList, String s) {
        return new InsurancePolicy(null,null,null,null,null,null,0);
    }

    public List<InsurancePolicy> viewPolicyByExpiryDate(List<InsurancePolicy> policyList, Date parse) {
        return null;
    }

    public double calculatePremiumAmountByExpiryDate(List<InsurancePolicy> policyList, Date parse) {
        return 0.0;
    }

    public void countOfPolicyHoldersBasedOnPolicyType(List<InsurancePolicy> policyList) {
    }

    public int countOfPolicyHoldersWithAdditonalBonus(List<InsurancePolicy> policyList, Date parse) {
        return 0;
    }
}
