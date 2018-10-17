/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Akshay Gavandi
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        ManagerRole("Manager Role"),
        FinancialAdvisorRole("Financial Advisor"),
        AccountsRole("Accounts Role"),
        CustomerRole("Customer Role"),
        InvestorRole("Investor Role"),
        EmployerRole("Employer Role");
        
        private String value;
        private RoleType(String value){
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName().substring(this.getClass().getName().lastIndexOf('.') + 1).trim();
       
    }
    
    
}