/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author vignesh raghuraman
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Insurance){
            enterprise = new InsuranceEnterprise(name);
            enterpriseList.add(enterprise);
        }
         if (type == Enterprise.EnterpriseType.Employers){
            enterprise = new EmployersEnterprise(name);
            enterpriseList.add(enterprise);
        }
//          if (type == Enterprise.EnterpriseType.Banks){
//            enterprise = new BankEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
          if (type == Enterprise.EnterpriseType.FederalAgencies){
            enterprise = new FederalAgencyEnterprise(name);
            enterpriseList.add(enterprise);
        }
          if (type == Enterprise.EnterpriseType.Investors){
            enterprise = new InvestorEnterprise(name);
            enterpriseList.add(enterprise);
        }
//          if (type == Enterprise.EnterpriseType.TrustFunds){
//            enterprise = new TrustFundEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
          
           
//            if (type == Enterprise.EnterpriseType.Clinic){
//            enterprise = new ClinicEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
        return enterprise;
    }
    
}
