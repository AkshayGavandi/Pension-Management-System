/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FederalAgencyRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akshay Gavandi
 */
public class FederalAgencyOrganization extends Organization {
     public FederalAgencyOrganization() {
        super(Organization.Type.FederalAgency.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FederalAgencyRole());
        return roles;
    }
    
}
