package com.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Bazaar {
    private Map<Integer, String> policyMap;

    public Map<Integer, String> getPolicyMap() {
        return policyMap;
    }

    public void setPolicyMap(Map<Integer, String> policyMap) {
        this.policyMap = policyMap;
    }

    public void addPolicyDetails(int policyId, String policyName) {
        policyMap.put(policyId, policyName);
    }

    public List<Integer> searchBasedOnPolicyType(String policyType) {
        List<Integer> policies = new ArrayList<>();

        for (int policyId : policyMap.keySet()) {
            if (policyMap.get(policyId).contains(policyType)) {
                policies.add(policyId);
            }
        }

        return policies;
    }
}
