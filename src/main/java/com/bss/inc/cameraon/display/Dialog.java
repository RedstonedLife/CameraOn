package com.bss.inc.cameraon.display;

import com.bss.inc.cameraon.constants.FrontendPaths;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
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
        for(URL file : files) {
            try {
                Scene scene = new Scene(FXMLLoader.load(file), w, h);
                scene.getStylesheets().add(FrontendPaths.APP_CSS);
                scene.setOnMousePressed(mouseEvent -> {
                    offsetX = mouseEvent.getSceneX();
                    offsetY = mouseEvent.getSceneY();
                });

                scene.setOnMouseDragged(mouseEvent -> {
                    parent.setX(mouseEvent.getScreenX() - offsetX);
                    parent.setY(mouseEvent.getScreenY() - offsetY);
                });
                scenes.put(file, scene);
            } catch (IOException e) {

            }
        }
    }

}
