/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Interface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshay Gavandi
 */
public class LoginWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form LoginWorkArea
     */
    
    public final static Color backgroundBlue = new Color(0, 51, 102);    
    public final static Color loginPanelBlue = new Color(0, 0, 0);
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    public LoginWorkArea(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        txtPassword.setEchoChar('*');
        LoginPanel.setBackground(backgroundBlue);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        btnForgotPassword = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        LoginPanel.setBackground(new java.awt.Color(0, 51, 102));

        btnForgotPassword.setBackground(new java.awt.Color(255, 255, 255));
        btnForgotPassword.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        btnForgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnForgotPassword.setText("Forgot Password?");
        btnForgotPassword.setBorderPainted(false);
        btnForgotPassword.setContentAreaFilled(false);
        btnForgotPassword.setFocusPainted(false);
        btnForgotPassword.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnForgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnForgotPasswordMouseExited(evt);
            }
        });
        btnForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 51, 102));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log In");
        btnLogin.setPreferredSize(new java.awt.Dimension(150, 40));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(0, 51, 102));
        btnSignUp.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setPreferredSize(new java.awt.Dimension(150, 40));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\AED\\AED_workspace\\FinalProject\\Images\\login_icon.jpg")); // NOI18N

        txtUserName.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        txtUserName.setText("Username");
        txtUserName.setPreferredSize(new java.awt.Dimension(150, 40));
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        txtPassword.setText("Password");
        txtPassword.setPreferredSize(new java.awt.Dimension(150, 40));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPasswordMouseExited(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(btnForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(203, 203, 203))))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnForgotPassword))
                .addGap(27, 27, 27)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(LoginPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        // TODO add your handling code here:
        txtPassword.selectAll();
        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        // TODO add your handling code here:
        txtUserName.selectAll();
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
//        SystemAdminWorkAreaJPanel loginWorkArea = new SystemAdminWorkAreaJPanel(userProcessContainer, ecoSystem);
//        userProcessContainer.add("LoginWorkArea",loginWorkArea);
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system user account directory if you have the user
        UserAccount userAccount = ecoSystem.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : ecoSystem.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("workArea", userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, ecoSystem));
            layout.next(userProcessContainer);
        }
//        btnLogin.setEnabled(false);
//        btnLogin.setEnabled(true);
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        btnLogin.setBackground(Color.orange);
        btnLogin.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        btnLogin.setBackground(backgroundBlue);
        btnLogin.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnLoginMouseExited

    private void txtPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordMouseExited

    private void btnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseExited
        // TODO add your handling code here:
        btnSignUp.setBackground(backgroundBlue);
        btnSignUp.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSignUpMouseExited

    private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
        // TODO add your handling code here:
        btnSignUp.setBackground(Color.orange);
        btnSignUp.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSignUpMouseEntered

    private void btnForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnForgotPasswordActionPerformed

    private void btnForgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForgotPasswordMouseExited
        // TODO add your handling code here:
        btnForgotPassword.setFont(btnForgotPassword.getFont().deriveFont(2));
    }//GEN-LAST:event_btnForgotPasswordMouseExited

    private void btnForgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForgotPasswordMouseEntered
        // TODO add your handling code here:
        btnForgotPassword.setFont(btnForgotPassword.getFont().deriveFont(3));
    }//GEN-LAST:event_btnForgotPasswordMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
