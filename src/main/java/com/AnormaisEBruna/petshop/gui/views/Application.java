package com.AnormaisEBruna.petshop.gui.views;

import com.AnormaisEBruna.petshop.contracts.gui.GUIManager;
import com.AnormaisEBruna.petshop.utils.Route;
import com.formdev.flatlaf.FlatLightLaf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.swing.*;
import java.util.ArrayList;

@Component
public class Application implements GUIManager {
    private ArrayList<Route> routes;
    public JFrame frame;

    private LoginView loginPage;
    private MainView mainView;

    @Autowired
    public Application(MainView mainView, LoginView loginPage) {
        FlatLightLaf.setup();

        this.mainView = mainView;
        this.loginPage = loginPage;

        this.loadRoutes();

        this.frame = new JFrame();
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void loadRoutes() {
        this.routes = new ArrayList();
        this.routes.add(new Route("MainView", "Painel Principal", mainView.getMainPanel()));
        this.routes.add(new Route("LoginView", "Painel de Login", loginPage.getMainPanel()));
    }

    private Route getRouteInstance(String routeName) throws Exception {
        for (Route route: this.routes) {
            if (route.getName().equals((routeName))) {
                return route;
            }
        }

        throw new Exception();
    }

    private void setFrameTitle(String title) {
        this.frame.setTitle("Petshop - " + title);
    }

    public void goToRoute(String routeName)  {
        try {
            this.frame.getContentPane().setVisible(false);
            Route route = this.getRouteInstance(routeName);
            this.setFrameTitle(route.getTitle());

            JPanel panel = route.getPanel();
            panel.setVisible(true);
            this.setPanel(panel);
        } catch (Exception error) {
            System.out.println(error.toString());
        }
    }

    private void setPanel(JPanel panel) {
        this.frame.setContentPane(panel);
    }

    public void show() {
        this.frame.setVisible(true);
    }

    public void hide() {
        this.frame.setVisible(false);
    }
}
