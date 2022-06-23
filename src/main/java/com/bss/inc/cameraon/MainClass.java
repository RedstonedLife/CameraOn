package com.bss.inc.cameraon;

import com.bss.inc.cameraon.display.DialogManager;
import com.bss.inc.cameraon.i18n.I18n;
import javafx.application.Application;
import javafx.stage.Stage;

import java.time.LocalDateTime;

public class MainClass extends Application {

    public static final LocalDateTime _INIT_TIME = LocalDateTime.now();
    private static DialogManager WindowManager;
    private transiet I18n _i18n = new I18n(this);

    @Override
    public void start(Stage stage) {}
    @Override
    public void stop() {}

    public static void main(String[] args) {
        this._i18n
        launch();
    }

    public static DialogManager getWindowManager() {
        return null;
    }
}
