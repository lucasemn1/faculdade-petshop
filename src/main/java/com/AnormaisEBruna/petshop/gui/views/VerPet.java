
package com.AnormaisEBruna.petshop.gui.views;
import com.AnormaisEBruna.petshop.utils.LoadImage;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author detup
 */
public class VerPet extends javax.swing.JPanel {

    /**
     * Creates new form VerPet
     */
    String nomedopet="Polo",nomedocuidador="Pablo",nomedaraça="Spitz";


    public VerPet()  {
        try {
            initComponents();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    class RoundedPanel extends JPanel
    {

        private int cornerRadius = 15;
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }
        @Override
        protected void paintComponent (Graphics g) {
            super.paintComponent (g);
            Dimension arcs = new Dimension (cornerRadius, cornerRadius);
            int width= getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            graphics.setColor(Color.WHITE);
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background

        }
    }

    public void setconfpanel(JPanel p){
        p.setSize(1440,1024);
        p.setLocation(0,0 ); // abre o painel já no local desejado
        VerPetPanel.add(p);
        VerPetPanel.revalidate();

        VerPetPanel.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() throws IOException {

        VerPetPanel = new javax.swing.JPanel();
        verFotoPet =  new RoundedPanel(200);
        jLabel1 = new javax.swing.JLabel();
        PetNameView = new javax.swing.JLabel();
        racePet = new javax.swing.JLabel();
        CuidadorPetView = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 1024));
        setLayout(new FlowLayout());

        VerPetPanel.setBackground(new java.awt.Color(255, 255, 255));

        verFotoPet.setBackground(new java.awt.Color(255, 255, 255));
        verFotoPet.setForeground(new java.awt.Color(255, 255, 255));
        verFotoPet.setPreferredSize(new java.awt.Dimension(250, 250));
        verFotoPet.setLayout(new java.awt.BorderLayout());



        PetNameView.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PetNameView.setForeground(new java.awt.Color(0, 0, 0));
        PetNameView.setText(nomedopet);

        racePet.setForeground(new java.awt.Color(0, 0, 0));
        racePet.setText(nomedaraça);

        CuidadorPetView.setForeground(new java.awt.Color(0, 0, 0));
        CuidadorPetView.setText(nomedocuidador);

        jTextField1.setText("Adicionar informações a respeito do pet");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("______________");
        jLabel1.setBounds(386,91,250,250);
        ImageIcon imageIcon = LoadImage.load("imgs/imagempet.png");
        jLabel1.setIcon(imageIcon);
        verFotoPet.add(jLabel1, java.awt.BorderLayout.CENTER);
        javax.swing.GroupLayout VerPetPanelLayout = new javax.swing.GroupLayout(VerPetPanel);
        VerPetPanel.setLayout(VerPetPanelLayout);
        VerPetPanelLayout.setHorizontalGroup(
                VerPetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(VerPetPanelLayout.createSequentialGroup()
                                .addGroup(VerPetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(VerPetPanelLayout.createSequentialGroup()
                                                .addGap(462, 462, 462)
                                                .addComponent(PetNameView))
                                        .addGroup(VerPetPanelLayout.createSequentialGroup()
                                                .addGap(386, 386, 386)
                                                .addGroup(VerPetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(verFotoPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(VerPetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(VerPetPanelLayout.createSequentialGroup()
                                                                        .addComponent(racePet)
                                                                        .addGap(56, 56, 56)
                                                                        .addComponent(CuidadorPetView, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jTextField1))))
                                .addContainerGap(388, Short.MAX_VALUE))
        );
        VerPetPanelLayout.setVerticalGroup(
                VerPetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(VerPetPanelLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(verFotoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PetNameView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VerPetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(racePet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CuidadorPetView, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(348, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(VerPetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(VerPetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JLabel CuidadorPetView;
    private javax.swing.JLabel PetNameView;
    private javax.swing.JPanel VerPetPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel racePet;
    private javax.swing.JPanel verFotoPet;
    // End of variables declaration
}