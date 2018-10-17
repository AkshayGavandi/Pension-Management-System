/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.*;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.EmployerWorkArea.EmployerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Shreyansh
 */
public class EmployerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business)
    {
        EnterpriseDirectory ed = new EnterpriseDirectory();
        
        return new EmployerWorkAreaJPanel(userProcessContainer, account, organization, business,enterprise,ed);
    }
}
