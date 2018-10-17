/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AccountsRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shreyansh
 */
public class AccountsOrganization extends Organization {
     public AccountsOrganization() {
        super(Type.Accounts.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AccountsRole());
        return roles;
    }
    
}
