package com.bss.inc.cameraon.display;

import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.logging.Level;
import com.bss.inc.cameraon.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class Dialog {
    private double offsetX,offsetY;
    private static final Stage parent = new Stage();
    private boolean isEnabled = false;
    private boolean isFocused;
    private double width, height;
    private String dialogName;

    private Scene currentScene;
    private HashMap<URL, Scene> scenes = new HashMap<URL, Scene>();

    public Dialog(double w, double h, String name, URL[] files) {
        parent.setResizable(false);
        parent.initStyle(StageStyle.UNDECORATED);
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
                parent.setScene(scene);
            } catch (IOException e) {
                Logger.getLogger("BNC").error("Could not initialize Dialog-{}-({N})".replace("{}", dialogName).replace("{N}", file.getFile()), e);
                e.printStackTrace();
            }
        }
    }

    public Dialog(final Stage mainStange, double w, double h, String name, URL[] files) {
        //parent = mainStange;
        parent.setResizable(false);
        parent.setTitle("CameraOn");
        parent.initStyle(StageStyle.UNDECORATED);
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
                Logger.getLogger("BNC").error("Could not initialize Dialog-{}-({N})".replace("{}", dialogName).replace("{N}", file.getFile()), e);
            }
        }
    }

    public void openDialog() {this.isEnabled=true;this.parent.show();}
    public void closeDialog() {this.isEnabled=false;this.parent.close();}
    public void changeScene(URL file) {
        Logger.getLogger("BNC")
                .info("Changing dialog-"+this.dialogName +" scene to " + file.toString());
        currentScene = scenes.get(file);
        parent.setScene(scenes.get(file));
    }

    public void changeScene(Scene scene) {
        currentScene = scene;
        parent.setScene(scene);
    }

    public Scene getCurrentScene() {return currentScene;}
    public void minimize() {this.parent.setIconified(true);}
    public String getDialogName() {return this.dialogName;}
    public Stage getParent() {return parent;}
    public boolean isEnabled() {return isEnabled;}
    public void setEnabled(boolean v) {this.isEnabled=v;}

    public HashMap<URL, Scene> getScenes() {
        return scenes;
    }
}
