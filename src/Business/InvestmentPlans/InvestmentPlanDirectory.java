/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InvestmentPlans;

import java.util.ArrayList;

/**
 *
 * @author Vigensh Raghuraman
 */
public class InvestmentPlanDirectory {
    
    private ArrayList<InvestmentPlan> investmentPlanDir;
    
    public InvestmentPlanDirectory(){
        investmentPlanDir= new ArrayList<>();
    }

    public ArrayList<InvestmentPlan> getInvestmentPlanDir() {
        return investmentPlanDir;
    }

    public void setInvestmentPlanDir(ArrayList<InvestmentPlan> investmentPlanDir) {
        this.investmentPlanDir = investmentPlanDir;
    }
    
    public InvestmentPlan addInvPlan(String planName,String riskType,String planCat,Double rate,int period,Double amt){
        InvestmentPlan iPlan= new InvestmentPlan();
        iPlan.setPlanName(planName);
        iPlan.setPlanCategory(planCat);
        iPlan.setRiskType(riskType);
        iPlan.setPlanInterestRate(rate);
        iPlan.setPlanAmt(amt);
        iPlan.setPlanPeriod(period);
        investmentPlanDir.add(iPlan);
        return iPlan;
    }
    
    public void removePlan(InvestmentPlan iPlan){
        investmentPlanDir.remove(iPlan);
    }
}
