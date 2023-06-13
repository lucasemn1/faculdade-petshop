package com.AnormaisEBruna.petshop.gui.views;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.services.UserService;
import com.AnormaisEBruna.petshop.utils.LoadImage;
import javax.swing.*;

import com.AnormaisEBruna.petshop.contracts.gui.UIScreen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;

@Component
public class LoginView implements UIScreen {
    public javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    public javax.swing.JPanel panelLogin;

    private javax.swing.JTextField emailloginbutton;
    public javax.swing.JPanel fotoPetShop;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField senhaloginbutton;

    @Autowired
    private UserService userService;

    public LoginView() {
        try {
            initComponents();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.loginButton.addActionListener((event) -> {
            handleLogin();
        });
    }

    private void initComponents() throws IOException {
        mainPanel = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        senhaloginbutton = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        emailloginbutton = new javax.swing.JTextField();
        fotoPetShop = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        mainPanel.setBackground(new Color(255, 255, 255));
        mainPanel.setBorder(BorderFactory.createCompoundBorder());
        mainPanel.setForeground(new Color(255, 255, 255));
        mainPanel.setPreferredSize(new Dimension(1440, 1024));

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setPreferredSize(new java.awt.Dimension(1440, 1024));

        loginPanel.setBackground(new java.awt.Color(204, 204, 204));
        loginPanel.setPreferredSize(new java.awt.Dimension(1024, 1024));
        loginPanel.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bem-Vindo!");

        jLabel2.setText("E-mail");

        jLabel3.setText("Senha");

        loginButton.setBackground(new java.awt.Color(0, 102, 204));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addGap(202, 202, 202)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addGap(239, 239, 239)
                                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addGap(0, 115, Short.MAX_VALUE)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(emailloginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(senhaloginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(100, 100, 100))
        );
        loginPanelLayout.setVerticalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailloginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(senhaloginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(306, Short.MAX_VALUE))
        );

        fotoPetShop.setBackground(new java.awt.Color(255, 255, 255));
        fotoPetShop.setForeground(new java.awt.Color(255, 255, 255));
        fotoPetShop.setPreferredSize(new java.awt.Dimension(800, 712));

        jLabel4.setBounds(600,230,250,250);
        ImageIcon imageIcon = LoadImage.load("imgs/imageLogin.jpeg");
        jLabel4.setIcon(imageIcon);
        fotoPetShop.add(jLabel4);
        javax.swing.GroupLayout fotoPetShopLayout = new javax.swing.GroupLayout(fotoPetShop);
        fotoPetShop.setLayout(fotoPetShopLayout);
        fotoPetShopLayout.setHorizontalGroup(
                fotoPetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoPetShopLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        fotoPetShopLayout.setVerticalGroup(
                fotoPetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoPetShopLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
                panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fotoPetShop, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127))
        );
        panelLoginLayout.setVerticalGroup(
                panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fotoPetShop, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


    }// </editor-fold>

    public void handleLogin() {
        try {
            String email = this.emailloginbutton.getText();
            String password = this.senhaloginbutton.getText();

            UserModel user = this.userService.findByCredentials(email, password);
            JOptionPane.showMessageDialog(null, user);
        }
         catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
         }
    }

    @Override
    public JPanel getMainPanel() {
        return this.panelLogin;
    }
}
