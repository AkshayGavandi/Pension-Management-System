/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author vignesh raghuraman
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
     private WorkQueue workQueue;
     
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
         workQueue = new WorkQueue();
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
     public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    public enum EnterpriseType{
        //Banks("Banks"),
        Insurance("Insurance"),
        Employers("Employers"),
        FederalAgencies("Federal agencies"),
        //TrustFunds("Trust Fund"),
        Investors("Investors");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
