package com.group.multiplayer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;b

    @FXML
    protected void onButtonClick() {
        welcomeText.setText("<Dice Roll Argument here>");
    }
}