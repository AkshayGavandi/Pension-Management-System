/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FinancialAdvisorAndPlans;
import Business.WorkQueue.WorkQueue;
/**
 *
 * @author Shreyansh
 */
public class FinancialAdvisor {
    
    private FinancialPlanDirectory financialPlanDirectory;
    private WorkQueue workQueue;

    public FinancialPlanDirectory getFinancialPlanDirectory() {
        return financialPlanDirectory;
    }

    public void setFinancialPlanDirectory(FinancialPlanDirectory financialPlanDirectory) {
        this.financialPlanDirectory = financialPlanDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public FinancialAdvisor() {
          financialPlanDirectory= new FinancialPlanDirectory();
        workQueue= new WorkQueue();
    }
    
    
    
}
