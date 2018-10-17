/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FinancialAdvisorAndPlans.FinancialPlan;
import Business.Organization.Organization;

/**
 *
 * @author Akshay Gavandi
 */
public class FAWorkRequest extends WorkRequest{
    private String planName;
    private String planType;
    private String frequency;
    private String amount;
    private FinancialPlan financialPlan;

    public FinancialPlan getFinancialPlan() {
        return financialPlan;
    }

    public void setFinancialPlan(FinancialPlan financialPlan) {
        this.financialPlan = financialPlan;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    
}


