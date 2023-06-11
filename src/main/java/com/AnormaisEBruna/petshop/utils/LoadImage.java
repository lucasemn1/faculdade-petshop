package com.AnormaisEBruna.petshop.utils;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

import javax.swing.*;
import java.io.IOException;

public class LoadImage {
    public static ImageIcon load(String path) throws IOException {
        ResourceLoader resourceLoader = new DefaultResourceLoader();

        return new ImageIcon(resourceLoader.getResource(path).getURI().getPath());
    }
}
