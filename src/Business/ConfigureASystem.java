package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Akshay Gavandi
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("admin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("Username", "Password", employee, new SystemAdminRole());
        
        return system;
    }
    
}
