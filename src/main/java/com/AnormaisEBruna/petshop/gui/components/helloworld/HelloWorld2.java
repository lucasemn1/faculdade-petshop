package com.AnormaisEBruna.petshop.gui.components.helloworld;

import com.AnormaisEBruna.petshop.contracts.gui.GUIManager;
import com.AnormaisEBruna.petshop.contracts.gui.UIScreen;

import javax.swing.*;

public class HelloWorld2 implements UIScreen {
    private JPanel panel1;
    public JPanel mainPanel;

    public HelloWorld2(GUIManager application) {}

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
