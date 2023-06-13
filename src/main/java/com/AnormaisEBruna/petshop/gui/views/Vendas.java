/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.AnormaisEBruna.petshop.gui.views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author bielf
 */
public class Vendas extends JPanel {

    NovoProduto novoproduto = new NovoProduto();

    EditarProduto editpage = new EditarProduto();

    public void setconfpanel(JPanel p){
        p.setSize(1024,1024);
        p.setLocation(0,-20 ); // setlocation 0 p ser no meio da tela
        jPanel1.add(p);
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    Object produto,preço,novonome,novopreço;

    public Vendas() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        novoProdutoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        editarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        preçoField = new javax.swing.JFormattedTextField();
        labelTotal = new javax.swing.JLabel();

        setPreferredSize(new Dimension(1024, 1060));
        setLayout(new FlowLayout());

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 1060));

        novoProdutoButton.setText("Adicionar Produto");
        novoProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoProdutoButtonActionPerformed(evt);
            }
        });

        tabelaProdutos.setAutoCreateRowSorter(true);
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Id", "Produto", "Preço"
                }
        ) {

            boolean[] canEdit = new boolean [] {
                    false, false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setToolTipText("");
        tabelaProdutos.setShowGrid(false);
        jScrollPane1.setViewportView(tabelaProdutos);

        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Vendas");

        jFormattedTextField1.setText("Produtos");
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        preçoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        preçoField.setText("180,00");
        preçoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preçoFieldActionPerformed(evt);
            }
        });

        labelTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTotal.setText("Total :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(523, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(27, 27, 27)
                                                                        .addComponent(novoProdutoButton)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(editarButton)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(excluirButton)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelTotal)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(preçoField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(383, 383, 383))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel1)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(novoProdutoButton)
                                        .addComponent(editarButton)
                                        .addComponent(excluirButton)
                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(preçoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelTotal))
                                .addContainerGap(114, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>
    public void refreshtable(){
        DefaultTableModel tabelaUsuario = (DefaultTableModel) tabelaProdutos.getModel();
        Object[] dados = {"indisponivel",produto,preço};
        tabelaUsuario.addRow(dados);
    }
    public void setProduto(Object produto){
        this.produto=produto;
    }
    public void setPreço(Object preço){
        this.preço=preço;
    }

    public void editTable(){
        /*DefaultTableModel tabelaUsuario = (DefaultTableModel) tabelaProdutos.getModel();
        tabelaUsuario.setValueAt(novonome, tabelaProdutos.getSelectedRow(), 0);
        tabelaUsuario.setValueAt(novoemail, tabelaProdutos.getSelectedRow(), 1);
        tabelaUsuario.setValueAt("agr",tabelaProdutos.getSelectedRow(),2);*/
    }

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(tabelaProdutos.getSelectedRow() != -1){
            DefaultTableModel tabelaUsuario = (DefaultTableModel) tabelaProdutos.getModel();
            tabelaUsuario.removeRow(tabelaProdutos.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um produto para Excluir");
        }
    }
    public void setNovoNome(Object novonome){
        this.novonome= novonome;
    }
    public void setNovoPreço(Object novopreço){
        this.novopreço=novopreço;
    }

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(tabelaProdutos.getSelectedRow() != -1){
            jPanel1.removeAll();
            setconfpanel(editpage);
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um produto para Editar");
        }
    }

    private void novoProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jPanel1.removeAll();
        setconfpanel(novoproduto);

    }

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void preçoFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JButton editarButton;
    private javax.swing.JButton excluirButton;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JButton novoProdutoButton;
    private javax.swing.JFormattedTextField preçoField;
    // End of variables declaration
}
