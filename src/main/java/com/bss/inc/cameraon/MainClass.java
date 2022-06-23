package com.bss.inc.cameraon;

import com.bss.inc.cameraon.display.DialogManager;
import javafx.application.Application;
import javafx.stage.Stage;

import java.time.LocalDateTime;

public class MainClass extends Application {

    public static final LocalDateTime _INIT_TIME = LocalDateTime.now();
    private static DialogManager WindowManager;
    private 

    @Override
    public void start(Stage stage) {}
    @Override
    public void stop() {}

    public static void main(String[] args) {
        launch();
    }

    public static DialogManager getWindowManager() {
        return null;
    }
}
