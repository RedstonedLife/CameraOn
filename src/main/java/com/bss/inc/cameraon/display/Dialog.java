package com.bss.inc.cameraon.display;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.HashMap;

public class Dialog {
    private double offsetX,offsetY;
    private static Stage parent;
    private boolean isEnabled = false;
    private boolean isFocused;
    private double width, height;
    private String dialogName;
    private HashMap<URL, Scene> scenes = new HashMap<URL, Scene>();

    static {
        parent = new Stage();
        parent.setResizable(false);
        parent.initStyle(StageStyle.UNDECORATED);
    }

    public Dialog(double w, double h, String name, URL[] files) {
        this.width = w;
        this.height = h;
        this.dialogName = name;
    }

}
