package com.AnormaisEBruna.petshop.gui.components.helloworld;

import com.AnormaisEBruna.petshop.contracts.gui.GUIManager;
import com.AnormaisEBruna.petshop.contracts.gui.UIScreen;

import javax.swing.*;

public class HelloWorld implements UIScreen {
    public JPanel mainPanel;
    private JButton irParaA2Button;

    public HelloWorld(GUIManager application) {
        this.irParaA2Button.addActionListener((event) -> {
            JOptionPane.showMessageDialog(null, "A ROTA MUDOU");
            application.goToRoute("Hello2");
        });
    }

    @Override
    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    @Override
    public void startMainPanel() {
    }

    @Override
    public void finishMainPanel() {
    }
}
