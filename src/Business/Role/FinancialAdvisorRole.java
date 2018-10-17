/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Interface.AdministrativeRole.AdminWorkAreaJPanel;
import Interface.FinancialAdvisorRole.FinancialAdvisorWorkAreaJPanel;
/**
 *
 * @author Shreyansh
 */
public class FinancialAdvisorRole extends Role {
    
 @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FinancialAdvisorWorkAreaJPanel(userProcessContainer,organization,business,enterprise,account);
    }
}
