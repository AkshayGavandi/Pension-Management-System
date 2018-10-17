/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.FinancialAdvisorAndPlans.FinancialAdvisor;
import Business.FinancialAdvisorAndPlans.FinancialPlan;
import Business.Organization.Organization;
/**
 *
 * @author Shreyansh
 */
public class FinancialAdvisorWorkRequest extends WorkRequest{
    private String category;
    private String salary;
    private String goals;
    private String savings;
    private FinancialPlan financialPlan;
    private Organization organization;
    private String custName;
    private String custType;
    private boolean notify;

    public boolean isNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public FinancialPlan getFinancialPlan() {
        return financialPlan;
    }

    public void setFinancialPlan(FinancialPlan financialPlan) {
        this.financialPlan = financialPlan;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
    
    

    
    
//    private String extraComments;
//    
//
//    public String getExtraComments() {
//        return extraComments;
//    }
//
//    public void setExtraComments(String extraComments) {
//        this.extraComments = extraComments;
//    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getSavings() {
        return savings;
    }

    public void setSavings(String savings) {
        this.savings = savings;
    }

    
    
}
