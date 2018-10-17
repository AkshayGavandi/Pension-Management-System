/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FinancialAdvisorAndPlans;

import java.util.ArrayList;

/**
 *
 * @author Vigensh Raghuraman
 */
public class FinancialPlanDirectory {
    
    private ArrayList<FinancialPlan> planList;

    public FinancialPlanDirectory() {
        planList = new ArrayList<>();
    }

    public ArrayList<FinancialPlan> getPlanList() {
        return planList;
    }

    public void setPlanList(ArrayList<FinancialPlan> planList) {
        this.planList = planList;
    }
    

    public FinancialPlan addPlan(String planName,String planType,String planFreq,Double rate,int period,Double emi){
        FinancialPlan fPlan= new FinancialPlan();
        fPlan.setPlanName(planName);
        fPlan.setPlanType(planType);
        fPlan.setPlanFrequency(planFreq);
        fPlan.setPlanRoi(rate);
        fPlan.setPlanTime(period);
        fPlan.setPlanEMI(emi);
        planList.add(fPlan);
        return fPlan;
    }
    
    public void removePlan(FinancialPlan fplan){
        planList.remove(fplan);
    }
    
}
