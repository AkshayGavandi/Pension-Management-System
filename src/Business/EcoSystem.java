package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.FinancialAdvisorAndPlans.FinancialPlanDirectory;
import Business.InvestmentPlans.InvestmentPlanDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Akshay Gavandi
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private FinancialPlanDirectory planDirectory;
    private InvestmentPlanDirectory invPlanDirectory;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
            business.setPlanDirectory(new FinancialPlanDirectory());
            business.setInvPlanDirectory(new InvestmentPlanDirectory());
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public FinancialPlanDirectory getPlanDirectory() {
        return planDirectory;
    }

    public void setPlanDirectory(FinancialPlanDirectory planDirectory) {
        this.planDirectory = planDirectory;
    }

    public InvestmentPlanDirectory getInvPlanDirectory() {
        return invPlanDirectory;
    }

    public void setInvPlanDirectory(InvestmentPlanDirectory invPlanDirectory) {
        this.invPlanDirectory = invPlanDirectory;
    }
    
    

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        return true;
    }
}