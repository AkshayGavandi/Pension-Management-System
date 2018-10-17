/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.FinancialAdvisorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.FinancialAdvisorAndPlans.FinancialPlan;
import Business.Organization.FederalAgencyOrganization;
import Business.WorkQueue.FAWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vigensh Raghuraman
 */
public class ManageFinancialPlanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFinancialPlans
     */
     private JPanel userProcessContainer;
     private Organization org;
     private EcoSystem business;
     private Enterprise enterprise;
    public ManageFinancialPlanJPanel(JPanel userProcessContainer,Organization organization,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org=organization;
        this.business=system;
        populatePlanTable();
        //populateFederalPlans();
    }
    
//    private void populateFederalPlans(){
//        DefaultTableModel model = (DefaultTableModel) finPlanJTable.getModel();
//
//        //model.setRowCount(0);
//        
//        for (WorkRequest request: org.getWorkQueue().getWorkRequestList()) {
//            Object[] row = new Object[6];
//            row[0] = ((FAWorkRequest)request).getPlanName();
//            row[1] = ((FAWorkRequest)request).getPlanType();
//            row[2] = "";
//            row[3] = "";
//            row[4] = ((FAWorkRequest)request).getFrequency();
//            row[5] = ((FAWorkRequest)request).getAmount();
//            
//            model.addRow(row);
//        }
//    }

    public String populateFrequencyComboBox(String type){
        String frequency="";
        if(type.equals("Salaried")){
            cbFrequency.setSelectedItem("Monthly");
            jLabel7.setText("EMI Amount");
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            rateTxtField.setVisible(true);
            invPeriodTxtField.setVisible(true);
            emiTxtField.setVisible(true);
        }
        else if(type.equals("Retirees")){
            cbFrequency.setSelectedItem("One Time");
            jLabel7.setText("Investment Amount");
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            rateTxtField.setVisible(true);
            invPeriodTxtField.setVisible(true);
            emiTxtField.setVisible(true);
        }
        else if(type.equals("Dependents")){
            cbFrequency.setSelectedItem("Monthly");
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            rateTxtField.setVisible(false);
            invPeriodTxtField.setVisible(false);
            emiTxtField.setVisible(false);
        }
        try{
            frequency = cbFrequency.getSelectedItem().toString();
        }
        catch(Exception e){
            frequency="";
        }
        return frequency;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        finPlanJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rateTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        invPeriodTxtField = new javax.swing.JTextField();
        planViewBtn = new javax.swing.JButton();
        deletePlanBtn = new javax.swing.JButton();
        planUpdateBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        emiTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox<>();
        cbFrequency = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        finPlanJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plan Name", "Plan Type", "Plan Frequency", "Interest Rate", "Maturity Period  ", "EMI Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        finPlanJTable.setGridColor(new java.awt.Color(255, 255, 255));
        finPlanJTable.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane1.setViewportView(finPlanJTable);
        if (finPlanJTable.getColumnModel().getColumnCount() > 0) {
            finPlanJTable.getColumnModel().getColumn(0).setResizable(false);
            finPlanJTable.getColumnModel().getColumn(1).setResizable(false);
            finPlanJTable.getColumnModel().getColumn(2).setResizable(false);
            finPlanJTable.getColumnModel().getColumn(3).setResizable(false);
            finPlanJTable.getColumnModel().getColumn(4).setResizable(false);
            finPlanJTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Manage Plans");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        nameJTextField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });

        submitJButton.setBackground(new java.awt.Color(0, 51, 102));
        submitJButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Type:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Frequency:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Interest Rate:");

        rateTxtField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rateTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateTxtFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Investment Period:");

        invPeriodTxtField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        invPeriodTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invPeriodTxtFieldActionPerformed(evt);
            }
        });

        planViewBtn.setBackground(new java.awt.Color(0, 51, 102));
        planViewBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        planViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        planViewBtn.setText("View");
        planViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planViewBtnActionPerformed(evt);
            }
        });

        deletePlanBtn.setBackground(new java.awt.Color(0, 51, 102));
        deletePlanBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        deletePlanBtn.setForeground(new java.awt.Color(255, 255, 255));
        deletePlanBtn.setText("Delete");
        deletePlanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePlanBtnActionPerformed(evt);
            }
        });

        planUpdateBtn.setBackground(new java.awt.Color(0, 51, 102));
        planUpdateBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        planUpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        planUpdateBtn.setText("Update");
        planUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planUpdateBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Investment Amount:");

        emiTxtField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        emiTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emiTxtFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("%");

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salaried", "Retirees", "Dependents" }));
        cbType.setSelectedIndex(-1);
        cbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeActionPerformed(evt);
            }
        });

        cbFrequency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monthly", "One Time", " " }));
        cbFrequency.setSelectedIndex(-1);
        cbFrequency.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(planViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(planUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invPeriodTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emiTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletePlanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8))
                            .addComponent(cbFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emiTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addComponent(invPeriodTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletePlanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        int c=0;
        String name = "";
        String type = "";
        try{
            name = nameJTextField.getText();
            type= cbType.getSelectedItem().toString();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter name and select plan type");
            c++;
        }
        if(type.equals("Dependents")){
            JOptionPane.showMessageDialog(null, "Dependent plans can be created or modified only by Federal Agency");
        }
        else{
            String frequency="";    
            frequency=populateFrequencyComboBox(type);
            double rate=0;
            int period=0;
            double emi=0;
            try{
                rate = Double.parseDouble(rateTxtField.getText());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter valid interest rate");
                c++;
            }
            try{
                period = Integer.valueOf(invPeriodTxtField.getText());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter valid period");
                c++;
            }
            try{
               emi=Double.parseDouble(emiTxtField.getText());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter amount");
                c++;
            }

            if (nameJTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Please enter valid name!");
                c++;
            }
            else{
                if(c==0){
                    FinancialPlan fPlan = business.getPlanDirectory().addPlan(name, type, frequency,rate,period,emi);
                    populatePlanTable();
                }
            }
        }
    }//GEN-LAST:event_submitJButtonActionPerformed
    
    
    private void rateTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateTxtFieldActionPerformed

    private void invPeriodTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invPeriodTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invPeriodTxtFieldActionPerformed

    private void planViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planViewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = finPlanJTable.getSelectedRow();
        if (selectedRow < 0) {
              JOptionPane.showMessageDialog(null, "Please select a row from the table first to view detail", "Warning", JOptionPane.WARNING_MESSAGE);

        }else{
            FinancialPlan fPlan = (FinancialPlan) finPlanJTable.getValueAt(selectedRow, 0);
            nameJTextField.setText(fPlan.getPlanName());
            //typeJTextField.setText(fPlan.getPlanType());
            //freqJTextField.setText(fPlan.getPlanFrequency());
            rateTxtField.setText(String.valueOf(fPlan.getPlanRoi()));
            invPeriodTxtField.setText(String.valueOf(fPlan.getPlanTime()));
            emiTxtField.setText(String.valueOf(fPlan.getPlanEMI()));
            nameJTextField.setEnabled(false);
            //freqJTextField.setEnabled(false);
            emiTxtField.setEnabled(false);
        }
    }//GEN-LAST:event_planViewBtnActionPerformed
    
    private void deletePlanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePlanBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = finPlanJTable.getSelectedRow();
        if (selectedRow < 0) {
              JOptionPane.showMessageDialog(null, "Please select a row from the table first to view detail", "Warning", JOptionPane.WARNING_MESSAGE);

        }else{
            if(finPlanJTable.getValueAt(selectedRow, 1).equals("Dependents")){
                JOptionPane.showMessageDialog(null, "Cannot delete Federal Plans");
            }
            else{
                FinancialPlan fPlan = (FinancialPlan) finPlanJTable.getValueAt(selectedRow, 0);
                business.getPlanDirectory().removePlan(fPlan);
                populatePlanTable();
            }
        }    
    }//GEN-LAST:event_deletePlanBtnActionPerformed
    
    private void planUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planUpdateBtnActionPerformed
        // TODO add your handling code here:
        String type= cbFrequency.getSelectedItem().toString();
        Double rate = Double.parseDouble(rateTxtField.getText());
        int period = Integer.valueOf(invPeriodTxtField.getText());
        
        for(FinancialPlan plan:business.getPlanDirectory().getPlanList()){
            if (plan.getPlanName().equalsIgnoreCase(nameJTextField.getText())){
                plan.setPlanType(type);
                plan.setPlanRoi(rate);
                plan.setPlanTime(period);
                populatePlanTable();
            
            }
        }
        
        
    }//GEN-LAST:event_planUpdateBtnActionPerformed

    private void emiTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emiTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emiTxtFieldActionPerformed

    private void cbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeActionPerformed
        // TODO add your handling code here:
        String type= cbType.getSelectedItem().toString();
        populateFrequencyComboBox(type);
    }//GEN-LAST:event_cbTypeActionPerformed

    private void populatePlanTable() {
        DefaultTableModel model = (DefaultTableModel) finPlanJTable.getModel();

        model.setRowCount(0);
        for (FinancialPlan fPlan : business.getPlanDirectory().getPlanList()) {
            Object[] row = new Object[6];
            row[0] = fPlan;
            row[1] = fPlan.getPlanType();
            row[2] = fPlan.getPlanFrequency();
            row[3] = fPlan.getPlanRoi();
            row[4] = fPlan.getPlanTime();
            row[5] = fPlan.getPlanEMI();
            
            model.addRow(row);
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFrequency;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JButton deletePlanBtn;
    private javax.swing.JTextField emiTxtField;
    private javax.swing.JTable finPlanJTable;
    private javax.swing.JTextField invPeriodTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton planUpdateBtn;
    private javax.swing.JButton planViewBtn;
    private javax.swing.JTextField rateTxtField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
