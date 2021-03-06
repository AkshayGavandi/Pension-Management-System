/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CustomerWorkArea;

import Business.Enterprise.Enterprise;
import Business.FinancialAdvisorAndPlans.FinancialAdvisor;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinancialAdvisorWorkRequest;
import Business.WorkQueue.WorkRequest;
import Interface.AdministrativeRole.ManageOrganizationJPanel;
import Interface.LoginWorkArea;
import static Interface.LoginWorkArea.backgroundBlue;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shreyansh
 */
public class CustomerHomePage extends javax.swing.JPanel {

    /**
     * Creates new form SalariedCustomerHomePage
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    FinancialAdvisor financialAdvisor;
    
    
    public CustomerHomePage(JPanel userProcessContainer, Enterprise enterprise,Organization organization,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization=organization;
        this.userAccount = userAccount;
        notification.setText("");
        checkNotifications();
    }

   private void checkNotifications(){
        for(WorkRequest request:organization.getWorkQueue().getWorkRequestList()){
            //if(((FinancialAdvisorWorkRequest)request).getCustName().equalsIgnoreCase(userAccount.getUsername())){
                if(((FinancialAdvisorWorkRequest)request).isNotify()){
                    notification.setBackground(Color.orange);
                    notification.setForeground(Color.black);
                    notification.setText("Financial Advisor has suggested plans");
                    ((FinancialAdvisorWorkRequest)request).setNotify(false);
                }
                else{
                    notification.setText("");
                    notification.setBackground(backgroundBlue);
                    notification.setForeground(Color.white);
                }
            //}
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewNotificationsBtn = new javax.swing.JButton();
        selectGoalBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        notification = new javax.swing.JLabel();
        CustomerProcessContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1800, 1000));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Home Page");

        viewNotificationsBtn.setBackground(new java.awt.Color(0, 51, 102));
        viewNotificationsBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        viewNotificationsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewNotificationsBtn.setText("View Plans Notifications");
        viewNotificationsBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewNotificationsBtn.setBorderPainted(false);
        viewNotificationsBtn.setContentAreaFilled(false);
        viewNotificationsBtn.setOpaque(true);
        viewNotificationsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewNotificationsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewNotificationsBtnMouseExited(evt);
            }
        });
        viewNotificationsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNotificationsBtnActionPerformed(evt);
            }
        });

        selectGoalBtn.setBackground(new java.awt.Color(0, 51, 102));
        selectGoalBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        selectGoalBtn.setForeground(new java.awt.Color(255, 255, 255));
        selectGoalBtn.setText("Personalise your Goals");
        selectGoalBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectGoalBtn.setBorderPainted(false);
        selectGoalBtn.setContentAreaFilled(false);
        selectGoalBtn.setOpaque(true);
        selectGoalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectGoalBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectGoalBtnMouseExited(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(0, 1));

        notification.setBackground(new java.awt.Color(0, 51, 102));
        notification.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        notification.setForeground(new java.awt.Color(255, 255, 255));
        notification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notification.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewNotificationsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectGoalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(selectGoalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(viewNotificationsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(738, 738, 738))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(146, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(941, Short.MAX_VALUE)))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        CustomerProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        CustomerProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(CustomerProcessContainer);

        add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1780, 1090));
    }// </editor-fold>//GEN-END:initComponents

    private void viewNotificationsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewNotificationsBtnMouseEntered
        // TODO add your handling code here:
        viewNotificationsBtn.setBackground(Color.orange);
        viewNotificationsBtn.setForeground(Color.BLACK);
        VariousPlans vp = new VariousPlans(CustomerProcessContainer,organization,userAccount,enterprise);
        CustomerProcessContainer.add("VariousPlans", vp);
        CardLayout layout = (CardLayout) CustomerProcessContainer.getLayout();
        layout.next(CustomerProcessContainer);
        
        notification.setText("");
        notification.setBackground(backgroundBlue);
        notification.setForeground(Color.white);
        
    }//GEN-LAST:event_viewNotificationsBtnMouseEntered

    private void viewNotificationsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewNotificationsBtnMouseExited
        // TODO add your handling code here:
        viewNotificationsBtn.setBackground(LoginWorkArea.backgroundBlue);
        viewNotificationsBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_viewNotificationsBtnMouseExited

    private void selectGoalBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectGoalBtnMouseEntered
        // TODO add your handling code here:
        selectGoalBtn.setBackground(Color.orange);
        selectGoalBtn.setForeground(Color.BLACK);
        CustomerRequestPage crp = new CustomerRequestPage(CustomerProcessContainer, enterprise,organization,userAccount);
        CustomerProcessContainer.add("CustomerRequestPage", crp);
        CardLayout layout = (CardLayout) CustomerProcessContainer.getLayout();
        layout.next(CustomerProcessContainer);
    }//GEN-LAST:event_selectGoalBtnMouseEntered

    private void selectGoalBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectGoalBtnMouseExited
        // TODO add your handling code here:
        selectGoalBtn.setBackground(LoginWorkArea.backgroundBlue);
        selectGoalBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_selectGoalBtnMouseExited

    private void viewNotificationsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNotificationsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewNotificationsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CustomerProcessContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel notification;
    private javax.swing.JButton selectGoalBtn;
    private javax.swing.JButton viewNotificationsBtn;
    // End of variables declaration//GEN-END:variables
}
