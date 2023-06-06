package com.AnormaisEBruna.petshop.gui.views;

import com.AnormaisEBruna.petshop.contracts.gui.GUIManager;
import com.AnormaisEBruna.petshop.gui.components.helloworld.HelloWorld;
import com.AnormaisEBruna.petshop.gui.components.helloworld.HelloWorld2;
import com.AnormaisEBruna.petshop.utils.Route;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.ArrayList;

@Component
public class Application implements GUIManager {
    private ArrayList<Route> routes;
    public JFrame frame;

    public Application() {
        FlatMacDarkLaf.setup();

        this.loadRoutes();

        this.frame = new JFrame();
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void loadRoutes() {
        this.routes = new ArrayList();
        this.routes.add(new Route("Hello", "Hello World", new HelloWorld(this).mainPanel));
        this.routes.add(new Route("Hello2", "Hello World 2", new HelloWorld2(this).mainPanel));
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
