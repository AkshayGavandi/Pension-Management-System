/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FinancialAdvisorAndPlans;

/**
 *
 * @author Vigensh Raghuraman
 */
public class FinancialPlan {
    
    private int planId;
    private String planName;
    private String planType;
    private String planFrequency;
    private double planRoi;
    private int planTime;
    private double planEMI;
    private static int count=1;

    public FinancialPlan() {
        planId=count;
        count ++;
    
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

    public String getPlanFrequency() {
        return planFrequency;
    }

    public void setPlanFrequency(String planFrequency) {
        this.planFrequency = planFrequency;
    }

    public int getPlanId() {
        return planId;
    }

    public double getPlanRoi() {
        return planRoi;
    }

    public void setPlanRoi(double planRoi) {
        this.planRoi = planRoi;
    }

    public int getPlanTime() {
        return planTime;
    }

    public void setPlanTime(int planTime) {
        this.planTime = planTime;
    }

    public double getPlanEMI() {
        return planEMI;
    }

    public void setPlanEMI(double planEMI) {
        this.planEMI = planEMI;
    }
    
    
    
    
    @Override
        public String toString() {
        return planName;
        }
    
    
}
