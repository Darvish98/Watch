package sample;

import javafx.fxml.FXML;
import javafx.scene.shape.Line;

import javax.print.DocFlavor;
import java.util.ResourceBundle;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private DocFlavor.URL location;

    @FXML
    private Line Min;

    @FXML
    private Line Hours;

    @FXML
    void initialize() {
        assert Min != null : "fx:id=\"Min\" was not injected: check your FXML file 'sample.fxml'.";
        assert Hours != null : "fx:id=\"Hours\" was not injected: check your FXML file 'sample.fxml'.";

    }
}


