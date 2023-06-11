
package com.AnormaisEBruna.petshop.gui.views;

import com.AnormaisEBruna.petshop.utils.LoadImage;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author bielf
 */
public class NovoCuidador extends javax.swing.JPanel {

    /**
     * Creates new form EditarCuidador
     */
    public void setconfpanel(JPanel p){
        p.setSize(1024,1024);
        p.setLocation(0,0 ); // setlocation 0 p ser no meio da tela
        novoCuidadorPanel.add(p);
        novoCuidadorPanel.revalidate();
        novoCuidadorPanel.repaint();
    }
    public NovoCuidador() {
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

        novoCuidadorPanel = new javax.swing.JPanel();
        labelTelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JFormattedTextField();
        labelCidade = new javax.swing.JLabel();
        textFieldCidade = new javax.swing.JFormattedTextField();
        labelBairro = new javax.swing.JLabel();
        textFieldBairro = new javax.swing.JFormattedTextField();
        labelCep = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        textFieldCep = new javax.swing.JFormattedTextField();
        labelTitle = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        texfielName = new javax.swing.JFormattedTextField();
        labelEmail = new javax.swing.JLabel();
        textFieldNumero = new javax.swing.JFormattedTextField();
        textFieldEmail = new javax.swing.JFormattedTextField();
        cadastrarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        novoCuidadorPanel.setBackground(new java.awt.Color(255, 255, 255));
        novoCuidadorPanel.setPreferredSize(new java.awt.Dimension(1024,1024));

        labelTelefone.setText("Numero De Telefone");


        labelCidade.setText("Cidade");

        labelBairro.setText("Bairro");

        labelCep.setText("CEP");

        labelNumero.setText("Numero");

        labelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Cadastrar Novo Cuidador");

        labelName.setText("Nome");



        labelEmail.setText("E-mail");



        cadastrarButton.setBackground(new java.awt.Color(51, 102, 255));
        cadastrarButton.setForeground(new java.awt.Color(255,255,255));
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    cadastrarButtonActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        ImageIcon imageIcon = null;
        try {
            imageIcon = LoadImage.load("imgs/imageCuidador.png");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        jLabel1.setIcon(imageIcon); // NOI18N

        javax.swing.GroupLayout novoCuidadorPanelLayout = new javax.swing.GroupLayout(novoCuidadorPanel);
        novoCuidadorPanel.setLayout(novoCuidadorPanelLayout);
        novoCuidadorPanelLayout.setHorizontalGroup(
                novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(novoCuidadorPanelLayout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, novoCuidadorPanelLayout.createSequentialGroup()
                                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(novoCuidadorPanelLayout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(novoCuidadorPanelLayout.createSequentialGroup()
                                                                                .addComponent(labelCep)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(labelNumero))
                                                                        .addComponent(labelBairro)
                                                                        .addComponent(labelCidade)
                                                                        .addComponent(labelTelefone)
                                                                        .addComponent(labelName)
                                                                        .addComponent(labelEmail)
                                                                        .addComponent(textFieldEmail)
                                                                        .addComponent(texfielName)
                                                                        .addComponent(textFieldTelefone)
                                                                        .addComponent(textFieldCidade)
                                                                        .addComponent(textFieldBairro)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, novoCuidadorPanelLayout.createSequentialGroup()
                                                                                .addComponent(textFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                                                                .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(23, 23, 23))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, novoCuidadorPanelLayout.createSequentialGroup()
                                                .addComponent(cadastrarButton)
                                                .addGap(123, 123, 123))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap(206, Short.MAX_VALUE))
        );
        novoCuidadorPanelLayout.setVerticalGroup(
                novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(novoCuidadorPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(texfielName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelNumero)
                                        .addComponent(labelCep))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(novoCuidadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cadastrarButton)
                                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(novoCuidadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(novoCuidadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void cadastrarButtonActionPerformed(ActionEvent evt) throws IOException {
        Cuidador layoutcuidador =  new Cuidador();
        JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
        layoutcuidador.setNome(labelName.getText());
        layoutcuidador.setEmail(labelEmail.getText());
        layoutcuidador.setEndereço(labelCidade.getText());
        layoutcuidador.setTelefone(labelNumero.getText());
        layoutcuidador.refreshtable();
        novoCuidadorPanel.removeAll();
        setconfpanel(layoutcuidador);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel novoCuidadorPanel;
    private javax.swing.JFormattedTextField texfielName;
    private javax.swing.JFormattedTextField textFieldBairro;
    private javax.swing.JFormattedTextField textFieldCep;
    private javax.swing.JFormattedTextField textFieldCidade;
    private javax.swing.JFormattedTextField textFieldEmail;
    private javax.swing.JFormattedTextField textFieldNumero;
    private javax.swing.JFormattedTextField textFieldTelefone;
    // End of variables declaration                   
}