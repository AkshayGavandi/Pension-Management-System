/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InvestmentPlans;

/**
 *
 * @author Vigensh Raghuraman
 */
public class InvestmentPlan {
    
    private String planName;
    private String riskType;
    private String planCategory;
    private double planAmt;
    private int planPeriod;
    private double planInterestRate;

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public String getPlanCategory() {
        return planCategory;
    }

    public void setPlanCategory(String planCategory) {
        this.planCategory = planCategory;
    }

    
    public double getPlanAmt() {
        return planAmt;
    }

    public void setPlanAmt(double planAmt) {
        this.planAmt = planAmt;
    }

    public int getPlanPeriod() {
        return planPeriod;
    }

    public void setPlanPeriod(int planPeriod) {
        this.planPeriod = planPeriod;
    }

    public double getPlanInterestRate() {
        return planInterestRate;
    }

    public void setPlanInterestRate(double planInterestRate) {
        this.planInterestRate = planInterestRate;
    }
    
    @Override
        public String toString() {
        return planName;
        }
    
}
