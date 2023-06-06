package com.AnormaisEBruna.petshop.utils;

import javax.swing.*;

public class Route {
    private String name;
    private JPanel panel;
    private String title;

    public Route(String name, String title, JPanel panel) {
        this.name = name;
        this.title = title;
        this.panel = panel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
}
