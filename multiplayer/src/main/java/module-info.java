module com.group.multiplayer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;

    opens com.group.multiplayer to javafx.fxml;
    exports com.group.multiplayer;
}