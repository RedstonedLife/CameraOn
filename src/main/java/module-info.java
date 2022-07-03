module com.redsoftware.ltd.bnc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires org.jetbrains.annotations;
    requires java.base;
    requires org.json;
    requires sdp.xsd;
    requires cxf.services.wsn.api;
    requires java.xml.bind;
    requires java.xml.soap;
    requires commons.codec;
    requires com.github.oshi;
    requires com.sun.jna;
    requires java.prefs;
    opens com.bss.inc.cameraon to javafx.fxml;
    opens com.bss.inc.cameraon.display.controllers to javafx.fxml;
    opens com.redsoftware.ltd.bnc.utils to javafx.fxml;
    exports com.bss.inc.cameraon;
    exports com.bss.inc.cameraon.utils.net.angryscan;
}