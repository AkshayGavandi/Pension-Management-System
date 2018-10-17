/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EmployerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shreyansh
 */
public class EmployerOrganization extends Organization {
     public EmployerOrganization() {
        super(Organization.Type.Employer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmployerRole());
        return roles;
    }
    
    
}
