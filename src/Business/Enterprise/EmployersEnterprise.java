/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vignesh raghuraman
 */
public class EmployersEnterprise extends Enterprise{
     public EmployersEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Employers);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
