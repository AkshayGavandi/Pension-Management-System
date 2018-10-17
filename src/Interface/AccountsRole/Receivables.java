/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AccountsRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AccountsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccountsWorkRequest;
import Business.WorkQueue.FinancialAdvisorWorkRequest;
import Business.WorkQueue.RevenueWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Interface.FinancialAdvisorRole.SuggestFinancialPlanJpanel;
import java.awt.CardLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshay Gavandi
 */
public class Receivables extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccounts
     */
    private JPanel AccountsProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    
    public Receivables(JPanel AccountsProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.AccountsProcessContainer=AccountsProcessContainer;
        this.userAccount= account;
        this.organization=organization;
        this.enterprise=enterprise;
        populateRequestTable();
        updateAmount();
    }
    
    private void updateAmount(){
        double totalAmount = 0;
        for(int i=0;i<tblReceivables.getRowCount();i++){
            if(tblReceivables.getValueAt(i, 6).equals("Completed")){
                totalAmount+= Double.parseDouble(tblReceivables.getValueAt(i, 8).toString());
            }
        }
        txtTotalAmount.setText(String.valueOf(totalAmount));
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
        tblReceivables = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tblReceivables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise", "Customer", "Cust Type", "Plan Name", "Plan Type", "Risk", "Status", "Comments", "Amount", "Frequency", "Interest", "Maturity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReceivables.setGridColor(new java.awt.Color(255, 255, 255));
        tblReceivables.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane1.setViewportView(tblReceivables);
        if (tblReceivables.getColumnModel().getColumnCount() > 0) {
            tblReceivables.getColumnModel().getColumn(0).setResizable(false);
            tblReceivables.getColumnModel().getColumn(1).setResizable(false);
            tblReceivables.getColumnModel().getColumn(2).setResizable(false);
            tblReceivables.getColumnModel().getColumn(3).setResizable(false);
            tblReceivables.getColumnModel().getColumn(4).setResizable(false);
            tblReceivables.getColumnModel().getColumn(5).setResizable(false);
            tblReceivables.getColumnModel().getColumn(6).setResizable(false);
            tblReceivables.getColumnModel().getColumn(7).setResizable(false);
            tblReceivables.getColumnModel().getColumn(8).setResizable(false);
            tblReceivables.getColumnModel().getColumn(9).setResizable(false);
            tblReceivables.getColumnModel().getColumn(10).setResizable(false);
            tblReceivables.getColumnModel().getColumn(11).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Receivables");

        btnProcess.setBackground(new java.awt.Color(0, 51, 102));
        btnProcess.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Total Revenue Generated");

        txtTotalAmount.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReceivables.getSelectedRow();
        if (selectedRow < 0) {
              JOptionPane.showMessageDialog(null, "Please select a row from the table first to view detail", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        else{
            JOptionPane.showMessageDialog(null, "Process Completed");
            tblReceivables.setValueAt("Completed", selectedRow, 6);
            updateAmount();
            int i=0;
            for(WorkRequest request:organization.getWorkQueue().getWorkRequestList()){
                if(i==selectedRow){
                    request.setStatus("Completed");
                }
                i++;
            }
        }
        writeCSV();
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReceivables;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel tableModel = (DefaultTableModel) tblReceivables.getModel();
        tableModel.setRowCount(0);
        for(WorkRequest request:organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[12];
            row[0] = ((AccountsWorkRequest)request).getEnterprise().getName();
            row[1] = ((AccountsWorkRequest)request).getUserAccount().getUsername();
            row[2] = ((AccountsWorkRequest)request).getCustType();
            row[3] = ((AccountsWorkRequest)request).getPlanName();
            row[4] = ((AccountsWorkRequest)request).getPlanType();
            row[5] = ((AccountsWorkRequest)request).getRisk();
            row[6] = ((AccountsWorkRequest)request).getStatus();
            row[7] = ((AccountsWorkRequest)request).getMessage();
            row[8] = ((AccountsWorkRequest)request).getAmount();
            row[9] = ((AccountsWorkRequest)request).getFrequency();
            row[10]= ((AccountsWorkRequest)request).getRate();
            row[11]= ((AccountsWorkRequest)request).getPeriod();
            tableModel.addRow(row);
        }
    }
    
    private void writeCSV(){
        int selectedRow = tblReceivables.getSelectedRow();
        String user = tblReceivables.getValueAt(selectedRow, 1).toString();
        String risk = tblReceivables.getValueAt(selectedRow, 5).toString();
        int planMonths = Integer.valueOf((tblReceivables.getValueAt(selectedRow, 11)).toString());
        String custType= String.valueOf((tblReceivables.getValueAt(selectedRow, 2)));
        String planAmt_str=String.valueOf(tblReceivables.getValueAt(selectedRow, 8));
        String planInterest_str=String.valueOf(tblReceivables.getValueAt(selectedRow, 10));
        double totalROI=0.0;
        double riskFactor=1;
        if(risk.equalsIgnoreCase("High Risk")){
            riskFactor = 1.2;
        }
        else if(risk.equalsIgnoreCase("Medium Risk")){
            riskFactor = 1.1;
        }
        double interest =0;
        if(custType.equalsIgnoreCase("Salaried")){
            interest = riskFactor*(Double.parseDouble(planAmt_str)*Double.parseDouble(planInterest_str))/1200;
        }
        else if(custType.equalsIgnoreCase("Retirees")){
            interest = riskFactor*(planMonths*Double.parseDouble(planAmt_str)*Double.parseDouble(planInterest_str))/1200;
        }
        
        double principleAmt = Double.parseDouble(planAmt_str);
        double planROI = principleAmt+interest;
        totalROI=totalROI+planROI;
        String emiAmount=String.valueOf(totalROI/planMonths);
                        
        String planName = tblReceivables.getValueAt(selectedRow, 3).toString();
        String comma=",";
        //String file_Header = "Customer Name,Plan Name,Customer Type,Amount,Month";
        FileWriter fileWriter = null;
        String filePath="C:\\Users\\Akshay Gavandi\\Desktop\\Investment.csv";
        try {
            fileWriter = new FileWriter(filePath,true);
            //fileWriter.append(file_Header.toString());
            
        } catch (IOException ex) {
            Logger.getLogger(ViewInvestmentPlans.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(custType.equalsIgnoreCase("Retirees")){
        for(int i=0;i<planMonths;i++){
             try{
                        fileWriter.append(user);
                        fileWriter.append(comma);
                        fileWriter.append(planName);
                        fileWriter.append(comma);
                        fileWriter.append(custType);
                        fileWriter.append(comma);
                        fileWriter.append(emiAmount);
                        fileWriter.append(comma);
                        fileWriter.append(String.valueOf(i+1));
                        fileWriter.append(comma);
                        fileWriter.append("\n");
                    }
                   
             
             catch(Exception e){
                 System.out.println("Error in CsvFileWriter !!!");

             }


        }
        try {
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ViewInvestmentPlans.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        else if (custType.equalsIgnoreCase("Salaried")){
            try{
                        fileWriter.append(user);
                        fileWriter.append(comma);
                        fileWriter.append(planName);
                        fileWriter.append(comma);
                        fileWriter.append(custType);
                        fileWriter.append(comma);
                        fileWriter.append(String.valueOf(totalROI));
                        fileWriter.append(comma);
                        fileWriter.append(String.valueOf(planMonths));
                        fileWriter.append(comma);
                        fileWriter.append("\n");
                    }
                   
             
             catch(Exception e){
                 System.out.println("Error in CsvFileWriter !!!");

             }


        
        try {
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ViewInvestmentPlans.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
        else{
                        try{
                        fileWriter.append(user);
                        fileWriter.append(comma);
                        fileWriter.append(planName);
                        fileWriter.append(comma);
                        fileWriter.append(custType);
                        fileWriter.append(comma);
                        fileWriter.append(String.valueOf(totalROI));
                        fileWriter.append(comma);
                        fileWriter.append(String.valueOf(0));
                        fileWriter.append("\n");
                    }
                   
             
             catch(Exception e){
                 System.out.println("Error in CsvFileWriter !!!");

             }


        
        try {
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ViewInvestmentPlans.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
        }
            
        
        }
    
}
