package com.group.multiplayer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;


public class Controller extends AnchorPane {

    @FXML
    private TextArea text;
    @FXML
    private Button button;


    public void initialize() {
        button.setOnAction(event -> this.onButtonClick());
    }

    @FXML
    private void onButtonClick() {
        final int v = (int) (Math.random() * 6 + 1);
        text.setText(String.valueOf(v));
    }

}