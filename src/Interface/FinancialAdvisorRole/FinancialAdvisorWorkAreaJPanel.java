/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.FinancialAdvisorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinancialAdvisorWorkRequest;
import Business.WorkQueue.WorkRequest;
import static Interface.LoginWorkArea.backgroundBlue;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

/**
 *
 * @author Vigensh Raghuraman
 */
public class FinancialAdvisorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FinancialAdvisorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Organization org;
    private EcoSystem system;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public FinancialAdvisorWorkAreaJPanel(JPanel userProcessContainer,Organization organization,EcoSystem system,Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org=organization;
        this.system = system;
        this.enterprise=enterprise;
        this.userAccount = userAccount;
        valueLabel.setText(organization.getName());
        notification.setText("");
        checkNotifications();
    }

    private void checkNotifications(){
        for(WorkRequest request:org.getWorkQueue().getWorkRequestList()){
            //if(((FinancialAdvisorWorkRequest)request).getCustName().equalsIgnoreCase(userAccount.getUsername())){
                if(((FinancialAdvisorWorkRequest)request).isNotify()){
                    notification.setBackground(Color.orange);
                    notification.setForeground(Color.black);
                    notification.setText("A customer has requested for plans");
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
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        viewCustReqBtn = new javax.swing.JButton();
        manageFinancialPlansBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        notification = new javax.swing.JLabel();
        FinancialAdvisorProcessContainer = new javax.swing.JPanel();

        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setLastDividerLocation(350);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Financial Advisor Work Area");

        enterpriseLabel.setBackground(new java.awt.Color(0, 51, 102));
        enterpriseLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Organization:");

        valueLabel.setBackground(new java.awt.Color(0, 51, 102));
        valueLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText("<value>");

        viewCustReqBtn.setBackground(new java.awt.Color(0, 51, 102));
        viewCustReqBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        viewCustReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewCustReqBtn.setText("View Customer Requests");
        viewCustReqBtn.setBorderPainted(false);
        viewCustReqBtn.setContentAreaFilled(false);
        viewCustReqBtn.setOpaque(true);
        viewCustReqBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewCustReqBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewCustReqBtnMouseExited(evt);
            }
        });
        viewCustReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustReqBtnActionPerformed(evt);
            }
        });

        manageFinancialPlansBtn.setBackground(new java.awt.Color(0, 51, 102));
        manageFinancialPlansBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        manageFinancialPlansBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageFinancialPlansBtn.setText("Manage Financial Plans");
        manageFinancialPlansBtn.setBorderPainted(false);
        manageFinancialPlansBtn.setContentAreaFilled(false);
        manageFinancialPlansBtn.setOpaque(true);
        manageFinancialPlansBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageFinancialPlansBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageFinancialPlansBtnMouseExited(evt);
            }
        });
        manageFinancialPlansBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFinancialPlansBtnActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(0, 1));

        notification.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        notification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notification.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(enterpriseLabel))
                    .addComponent(manageFinancialPlansBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewCustReqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterpriseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueLabel)
                .addGap(50, 50, 50)
                .addComponent(manageFinancialPlansBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(viewCustReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(176, 176, 176)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(615, Short.MAX_VALUE)))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        FinancialAdvisorProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        FinancialAdvisorProcessContainer.setPreferredSize(new java.awt.Dimension(350, 800));
        FinancialAdvisorProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(FinancialAdvisorProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageFinancialPlansBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFinancialPlansBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageFinancialPlansBtnActionPerformed

    private void viewCustReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustReqBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewCustReqBtnActionPerformed

    private void manageFinancialPlansBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageFinancialPlansBtnMouseEntered
        // TODO add your handling code here:
        manageFinancialPlansBtn.setBackground(Color.orange);
        manageFinancialPlansBtn.setForeground(Color.BLACK);

        ManageFinancialPlanJPanel manageFinancialPlanJPanel = new ManageFinancialPlanJPanel(FinancialAdvisorProcessContainer, org, system);
        FinancialAdvisorProcessContainer.add("ManageFinancialPlanJPanel", manageFinancialPlanJPanel);
        CardLayout layout = (CardLayout) FinancialAdvisorProcessContainer.getLayout();
        layout.next(FinancialAdvisorProcessContainer);
    }//GEN-LAST:event_manageFinancialPlansBtnMouseEntered

    private void manageFinancialPlansBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageFinancialPlansBtnMouseExited
        // TODO add your handling code here:
        manageFinancialPlansBtn.setBackground(backgroundBlue);
        manageFinancialPlansBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_manageFinancialPlansBtnMouseExited

    private void viewCustReqBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustReqBtnMouseEntered
        // TODO add your handling code here:
        viewCustReqBtn.setBackground(Color.orange);
        viewCustReqBtn.setForeground(Color.BLACK);

        ViewCustomerRequestJPanel viewCustomerRequestJPanel = new ViewCustomerRequestJPanel(FinancialAdvisorProcessContainer, org, system, enterprise);
        FinancialAdvisorProcessContainer.add("ViewCustomerRequestJPanel", viewCustomerRequestJPanel);
        CardLayout layout = (CardLayout) FinancialAdvisorProcessContainer.getLayout();
        layout.next(FinancialAdvisorProcessContainer);
        
        notification.setBackground(backgroundBlue);
        notification.setForeground(Color.white);
        notification.setText("");
        
        
    }//GEN-LAST:event_viewCustReqBtnMouseEntered

    private void viewCustReqBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustReqBtnMouseExited
        // TODO add your handling code here:
        viewCustReqBtn.setBackground(backgroundBlue);
        viewCustReqBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_viewCustReqBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FinancialAdvisorProcessContainer;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageFinancialPlansBtn;
    private javax.swing.JLabel notification;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewCustReqBtn;
    // End of variables declaration//GEN-END:variables
}
