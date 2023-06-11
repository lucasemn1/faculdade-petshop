package com.AnormaisEBruna.petshop.gui.views;

import javax.swing.*;
import java.awt.*;


public class NovoServiço extends JPanel {

    /**
     * Creates new form NovoServiço
     */
    public NovoServiço() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void initComponents() {

        novoServiçoPanel = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JFormattedTextField();
        labelPreço = new javax.swing.JLabel();
        textFieldPreço = new javax.swing.JFormattedTextField();
        labelPet = new javax.swing.JLabel();
        textFieldPet = new javax.swing.JFormattedTextField();
        cadastrarButton = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new Dimension(1024, 1024));
        setLayout(new FlowLayout());


        novoServiçoPanel.setBackground(new java.awt.Color(255, 255, 255));
        novoServiçoPanel.setPreferredSize(new Dimension(1024, 1024));


        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTitulo.setText("Cadastrar Novo Serviço");

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNome.setText("Nome do Serviço");

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        labelPreço.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPreço.setText("Preço");

        textFieldPreço.setActionCommand("<Not Set>");
        textFieldPreço.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        labelPet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPet.setText("Pet");

        textFieldPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPetActionPerformed(evt);
            }
        });

        cadastrarButton.setBackground(new java.awt.Color(51, 102, 255));
        cadastrarButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo do Serviço");

        javax.swing.GroupLayout novoServiçoPanelLayout = new javax.swing.GroupLayout(novoServiçoPanel);
        novoServiçoPanel.setLayout(novoServiçoPanelLayout);
        novoServiçoPanelLayout.setHorizontalGroup(
                novoServiçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(novoServiçoPanelLayout.createSequentialGroup()
                                .addContainerGap(381, Short.MAX_VALUE)
                                .addGroup(novoServiçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, novoServiçoPanelLayout.createSequentialGroup()
                                                .addGroup(novoServiçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, novoServiçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(novoServiçoPanelLayout.createSequentialGroup()
                                                                        .addGroup(novoServiçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(labelNome)
                                                                                .addComponent(textFieldNome)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jFormattedTextField1)
                                                                                .addComponent(labelPet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(textFieldPet, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(16, 16, 16)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, novoServiçoPanelLayout.createSequentialGroup()
                                                                .addGroup(novoServiçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(textFieldPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cadastrarButton))
                                                                .addGap(92, 92, 92)))
                                                .addGap(364, 364, 364))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, novoServiçoPanelLayout.createSequentialGroup()
                                                .addComponent(labelPreço)
                                                .addGap(480, 480, 480))))
        );
        novoServiçoPanelLayout.setVerticalGroup(
                novoServiçoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(novoServiçoPanelLayout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(labelTitulo)
                                .addGap(36, 36, 36)
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(labelPet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPreço)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cadastrarButton)
                                .addContainerGap(320, Short.MAX_VALUE))
        );

        add(novoServiçoPanel);
    }// </editor-fold>

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void textFieldPetActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPet;
    private javax.swing.JLabel labelPreço;
    private javax.swing.JLabel labelTitulo;
    public javax.swing.JPanel novoServiçoPanel;
    private javax.swing.JFormattedTextField textFieldNome;
    private javax.swing.JFormattedTextField textFieldPet;
    private javax.swing.JFormattedTextField textFieldPreço;
    // End of variables declaration
}
