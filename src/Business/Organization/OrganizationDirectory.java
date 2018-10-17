/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Akshay Gavandi
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Manager.getValue())){
            organization = new ManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Accounts.getValue())){
            organization = new AccountsOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FinancialAdvisor.getValue())){
           organization = new FinancialAdvisorOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Investor.getValue())){
            organization = new InvestorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FederalAgency.getValue())){
            organization = new FederalAgencyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Employer.getValue())){
            organization = new EmployerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}