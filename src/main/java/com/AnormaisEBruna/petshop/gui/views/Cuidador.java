package com.AnormaisEBruna.petshop.gui.views;

import com.AnormaisEBruna.petshop.gui.components.pages.InitialPage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Cuidador  extends  JPanel{
    NovoCuidador cadastropage = new NovoCuidador();
    EditarCuidador editpage = new EditarCuidador();
    VerCuidador verpage = new VerCuidador();

    Object nome,email,novonome,novoemail,endereço,telefone;


    /**
     * Creates new form Usuarios
     */

    public void setconfpanel(JPanel p){
        p.setSize(1024,1024);
        p.setLocation(0,0 ); // setlocation 0 p ser no meio da tela
        cuidadorPanel.add(p);
        cuidadorPanel.revalidate();
        cuidadorPanel.repaint();
    }
    public Cuidador() throws IOException {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        cuidadorPanel = new javax.swing.JPanel();
        cuidadorLabel = new javax.swing.JLabel();
        novoCuidadorButton = new javax.swing.JButton();
        deletButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCuidadores = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        visualizarButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1024,1024));
        setLayout(new FlowLayout());

        cuidadorPanel.setBackground(new java.awt.Color(255, 255, 255));
        cuidadorPanel.setPreferredSize(new java.awt.Dimension(1024, 1024));

        cuidadorLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cuidadorLabel.setText("Cuidador");

        novoCuidadorButton.setText("Novo Cuidador");
        novoCuidadorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoCuidadorButtonActionPerformed(evt);
            }
        });

        deletButton.setText("Deletar");
        deletButton.setMaximumSize(new java.awt.Dimension(75, 22));
        deletButton.setMinimumSize(new java.awt.Dimension(75, 22));
        deletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletButtonActionPerformed(evt);
            }
        });

        tabelaCuidadores.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Nome", "Email", "Endereço", "Telefone"
                }
        ));
        tabelaCuidadores.setToolTipText("");
        tabelaCuidadores.setShowGrid(false);
        jScrollPane1.setViewportView(tabelaCuidadores);

        editButton.setText("Editar");
        editButton.setMaximumSize(new java.awt.Dimension(75, 22));
        editButton.setMinimumSize(new java.awt.Dimension(75, 22));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        visualizarButton.setText("Visualizar");
        visualizarButton.setMaximumSize(new java.awt.Dimension(75, 22));
        visualizarButton.setMinimumSize(new java.awt.Dimension(75, 22));
        visualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cuidadorPanelLayout = new javax.swing.GroupLayout(cuidadorPanel);
        cuidadorPanel.setLayout(cuidadorPanelLayout);
        cuidadorPanelLayout.setHorizontalGroup(
                cuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cuidadorPanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(cuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cuidadorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(cuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cuidadorPanelLayout.createSequentialGroup()
                                                        .addComponent(novoCuidadorButton)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(visualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(deletButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7))
        );
        cuidadorPanelLayout.setVerticalGroup(
                cuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cuidadorPanelLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(cuidadorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addGroup(cuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(novoCuidadorButton)
                                        .addGroup(cuidadorPanelLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(cuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(cuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(visualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(deletButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1024, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cuidadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1024, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cuidadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>

    private void deletButtonActionPerformed(ActionEvent evt) {
        if(tabelaCuidadores.getSelectedRow() != -1){
            DefaultTableModel tabelaUsuario = (DefaultTableModel) tabelaCuidadores.getModel();
            tabelaUsuario.removeRow(tabelaCuidadores.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um cuidador para Excluir");
        }
    }

    private void editButtonActionPerformed(ActionEvent evt) {
        DefaultTableModel tablecuidadores = (DefaultTableModel) tabelaCuidadores.getModel();
        if(tabelaCuidadores.getSelectedRow() != -1){
            cuidadorPanel.removeAll();
            setconfpanel(editpage);
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um cuidador para Editar");
        }
    }

    private void visualizarButtonActionPerformed(ActionEvent evt) {
        cuidadorPanel.removeAll();
        setconfpanel(verpage);
    }

    private void novoCuidadorButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        cuidadorPanel.removeAll();
        setconfpanel(cadastropage);

    }
    // atualiza os dados antes de voltar para essa pagina.
    public void refreshtable(){
        DefaultTableModel tablecuidadores = (DefaultTableModel) tabelaCuidadores.getModel();
        Object[] dados = {"ID",nome,email,endereço,telefone};
        tablecuidadores.addRow(dados);
    }
    public void setNome(Object nome){
        this.nome=nome;
    }
    public void setEmail(Object email){
        this.email=email;
    }
    public void setTelefone(Object telefone){this.telefone=telefone; }
    public void setEndereço(Object endereço){this.endereço=endereço; }




    private javax.swing.JLabel cuidadorLabel;
    private javax.swing.JPanel cuidadorPanel;
    private javax.swing.JButton deletButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novoCuidadorButton;
    public javax.swing.JTable tabelaCuidadores;
    private javax.swing.JButton visualizarButton;
   
}
