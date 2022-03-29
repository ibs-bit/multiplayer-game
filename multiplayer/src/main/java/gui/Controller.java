package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;


public class Controller extends AnchorPane {

    @FXML
    private Button button;
    @FXML
    private ImageView rightImage;
    @FXML
    private ImageView leftImage;


    @FXML
    void onButtonClick(ActionEvent event) {
        button.setDisable(true);
        Thread thread = new Thread() {
            public void run() {
                try {
                    for (int i = 0; i < 15; i++) {
                        final int v = (int) (Math.random() * 6 + 1);
                        final int v2 = (int) (Math.random() * 6 + 1);
                        File dice = new File("src/main/resources/images/dice" + v + ".png");
                        File dice2 = new File("src/main/resources/images/dice" + v2 + ".png");
                        rightImage.setImage(new Image(dice.toURI().toString()));
                        leftImage.setImage(new Image(dice2.toURI().toString()));
                        Thread.sleep(10);
                    }
                    button.setDisable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        };
        thread.start();
    }
}