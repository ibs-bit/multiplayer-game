module com{
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires java.desktop;

    exports gui;
    opens gui to javafx.fxml;
}