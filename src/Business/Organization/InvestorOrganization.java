/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InvestorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vigensh Raghuraman
 */
public class InvestorOrganization extends Organization {
     
    public InvestorOrganization() {
        super(Organization.Type.Investor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InvestorRole());
        return roles;
    }
    
}
