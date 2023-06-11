package com.AnormaisEBruna.petshop.gui.components.pages;

import com.AnormaisEBruna.petshop.contracts.gui.GUIManager;
import com.AnormaisEBruna.petshop.contracts.gui.UIScreen;
import com.AnormaisEBruna.petshop.gui.views.*;


import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class InitialPage implements UIScreen {
    public JPanel mainPanel;
    private JButton buttonExit;
    public JPanel panelSideBar; // tornar panelSideBar um membro da classe
    String nomelogin="bruna"; // alterar para o nome de quem estiver utilizando de acordo com o login
    public InitialPage(GUIManager application) {
        initComponents(); // chamar o initComponents
        this.buttonExit.addActionListener((event) -> {
            JOptionPane.showMessageDialog(null, "Voce saiu");
            application.goToRoute("Painel de Login");
        });
        /*this.buttonUser.addActionListener((event) ->{
            application.goToRoute("Usuarios");
            getsidebar();
        });*/
    }

    @Override
    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    @Override
    public void startMainPanel() {
        // Implementação pendente
    }

    @Override
    public void finishMainPanel() {
        // Implementação pendente
    }

    public void setconfpanel(JPanel p){
        p.setSize(2000,150000);
        p.setLocation(210,0 ); // abre o painel já no local desejado
        mainPanel.add(p);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public void getsidebar(){
        mainPanel.add(panelSideBar);
    }


    @SuppressWarnings("unchecked")
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

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jSpinner1 = new JSpinner();
        mainPanel = new JPanel();
        panelSideBar = new JPanel();
        panelFotoPetshop =  new RoundedPanel(200);
        buttonUser = new JButton();
        buttonPets = new JButton();
        buttonSells = new JButton();
        buttonService = new JButton();
        buttonServiceType = new JButton();
        buttonExit = new JButton();
        buttonCuidador = new JButton();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        mainLabel = new JLabel();


        mainPanel.setBackground(new Color(255, 255, 255));
        mainPanel.setBorder(BorderFactory.createCompoundBorder());
        mainPanel.setForeground(new Color(255, 255, 255));
        mainPanel.setPreferredSize(new Dimension(1440, 1024));

        panelSideBar.setBackground(new Color(51, 0, 0));

        panelFotoPetshop.setBackground(new Color(51, 0, 0));
        panelFotoPetshop.setForeground(new Color(51, 0, 0));

        GroupLayout panelFotoPetshopLayout = new GroupLayout(panelFotoPetshop);
        panelFotoPetshop.setLayout(panelFotoPetshopLayout);
        panelFotoPetshopLayout.setHorizontalGroup(
                panelFotoPetshopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 200, Short.MAX_VALUE)
        );
        panelFotoPetshopLayout.setVerticalGroup(
                panelFotoPetshopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 200, Short.MAX_VALUE)
        );

        buttonUser.setBackground(new Color(51, 0, 0));
        buttonUser.setForeground(new Color(255, 255, 255));
        buttonUser.setText("Usuários");
        buttonUser.setBorderPainted(false);
        buttonUser.setHorizontalAlignment(SwingConstants.LEFT);
        buttonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUserActionPerformed(evt);
            }
        });

        buttonPets.setBackground(new Color(51, 0, 0));
        buttonPets.setForeground(new Color(255, 255, 255));
        buttonPets.setText("Pets");
        buttonPets.setBorderPainted(false);
        buttonPets.setHorizontalAlignment(SwingConstants.LEFT);
        buttonPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPetsActionPerformed(evt);
            }
        });

        buttonSells.setBackground(new Color(51, 0, 0));
        buttonSells.setForeground(new Color(255, 255, 255));
        buttonSells.setText("Vendas");
        buttonSells.setBorderPainted(false);
        buttonSells.setHorizontalAlignment(SwingConstants.LEFT);
        buttonSells.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSellsActionPerformed(evt);
            }
        });

        buttonService.setBackground(new Color(51, 0, 0));
        buttonService.setForeground(new Color(255, 255, 255));
        buttonService.setText("Serviços");
        buttonService.setBorderPainted(false);
        buttonService.setHorizontalAlignment(SwingConstants.LEFT);
        buttonService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonServiceActionPerformed(evt);
            }
        });

        buttonServiceType.setBackground(new Color(51, 0, 0));
        buttonServiceType.setForeground(new Color(255, 255, 255));
        buttonServiceType.setText("Tipos de Serviços");
        buttonServiceType.setBorderPainted(false);
        buttonServiceType.setHorizontalAlignment(SwingConstants.LEFT);
        buttonServiceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonServiceTypeActionPerformed(evt);
            }
        });

        buttonExit.setBackground(new Color(255, 255, 255, 74));
        buttonExit.setForeground(new Color(255, 255, 255));
        buttonExit.setText("Sair da sessão");
        buttonExit.setBorderPainted(false);
        buttonExit.setHorizontalAlignment(SwingConstants.LEFT);


        buttonCuidador.setBackground(new Color(51, 0, 0));
        buttonCuidador.setForeground(new Color(255, 255, 255));
        buttonCuidador.setText("Cuidadores");
        buttonCuidador.setBorderPainted(false);
        buttonCuidador.setHorizontalAlignment(SwingConstants.LEFT);
        buttonCuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonCuidadorActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jLabel4.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Olá, "+nomelogin+"!");

        jLabel5.setFont(new Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Bem-vindo!");

        mainLabel.setForeground(new Color(255, 255, 255));
        mainLabel.setText("___________________________________________________");

        GroupLayout panelSideBarLayout = new GroupLayout(panelSideBar);
        panelSideBar.setLayout(panelSideBarLayout);

        panelSideBarLayout.setHorizontalGroup(
                panelSideBarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelSideBarLayout.createSequentialGroup()
                                .addContainerGap(53, Short.MAX_VALUE)
                                .addGroup(panelSideBarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelSideBarLayout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelSideBarLayout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel5))
                                        .addGroup(panelSideBarLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(mainLabel, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(buttonUser, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonCuidador, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonPets, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonSells, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonServiceType, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelSideBarLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(panelFotoPetshop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(buttonService, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonExit, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))
        );
        panelSideBarLayout.setVerticalGroup(
                panelSideBarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelSideBarLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(panelFotoPetshop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(mainLabel)
                                .addGap(72, 72, 72)
                                .addComponent(buttonUser, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(buttonCuidador, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(buttonPets, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(buttonSells, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(buttonServiceType, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(buttonService, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(buttonExit, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(116, Short.MAX_VALUE))
        );

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(panelSideBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1024, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelSideBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


    }// </editor-fold>

    private void buttonUserActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Usuarios layoutusuario = new Usuarios();
        mainPanel.removeAll();
        getsidebar();
        setconfpanel(layoutusuario);
    }

    private void buttonPetsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Pet layoutpet = new Pet();
        mainPanel.removeAll();
        getsidebar();
        setconfpanel(layoutpet);
    }

    private void buttonSellsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Vendas layoutvendas = new Vendas();
        mainPanel.removeAll();
        getsidebar();
        setconfpanel(layoutvendas);
    }

    private void buttonServiceActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Serviços layoutservice = new Serviços();
        mainPanel.removeAll();
        getsidebar();
        setconfpanel(layoutservice);
    }

    private void buttonServiceTypeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        TiposDeServiço layouttypeservice = new TiposDeServiço();
        mainPanel.removeAll();
        getsidebar();
        setconfpanel(layouttypeservice);
    }

    private void buttonCuidadorActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
        Cuidador layoutcuidador = new Cuidador();
        mainPanel.removeAll();
        getsidebar();
        setconfpanel(layoutcuidador);
    }


    // Variables declaration - do not modify
    private JButton buttonCuidador;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel mainLabel;
    private JSpinner jSpinner1;
    private JPanel panelFotoPetshop;
    private JButton buttonPets;
    private JButton buttonService;
    private JButton buttonServiceType;
    public JButton buttonUser;
    private JButton buttonSells;
    // End of variables declaration
}

