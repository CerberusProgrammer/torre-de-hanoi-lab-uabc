package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private Label textNotices;

    @FXML
    private Rectangle disk0;
    @FXML
    private Rectangle disk1;
    @FXML
    private Rectangle disk2;
    @FXML
    private Rectangle disk3;
    @FXML
    private Rectangle disk4;
    @FXML
    private Rectangle disk5;
    @FXML
    private Rectangle disk6;

    @FXML
    private VBox towerA;
    @FXML
    private VBox towerB;
    @FXML
    private VBox towerC;

    @FXML
    void move(MouseEvent event) {
        Dragboard dragboard = ((Rectangle)event.getSource()).startDragAndDrop(TransferMode.ANY);
        ClipboardContent clipboardContent = new ClipboardContent();
        clipboardContent.putString(((Rectangle)event.getSource()).getId());

        dragboard.setContent(clipboardContent);
        event.consume();
    }

    @FXML
    void addTowerA(DragEvent event) {
        String str = event.getDragboard().getString();
        switch (str){
            case "disk0":
                towerA.getChildren().add(towerA.getChildren().size(), disk0);
                break;
            case "disk1":
                towerA.getChildren().add(towerA.getChildren().size(), disk1);
                break;
            case "disk2":
                towerA.getChildren().add(towerA.getChildren().size(), disk2);
                break;
            case "disk3":
                towerA.getChildren().add(towerA.getChildren().size(), disk3);
                break;
            case "disk4":
                towerA.getChildren().add(towerA.getChildren().size(), disk4);
                break;
            case "disk5":
                towerA.getChildren().add(towerA.getChildren().size(), disk5);
                break;
            case "disk6":
                towerA.getChildren().add(towerA.getChildren().size(), disk6);
                break;
        }
    }

    @FXML
    void removeTowerA(DragEvent event) {
        System.out.println("addTowerA");
        if (event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void addTowerB(DragEvent event) {
        String str = event.getDragboard().getString();
        System.out.println(str);
        switch (str){
            case "disk6":
                towerB.getChildren().add(disk6);
                break;
        }
    }

    @FXML
    void removeTowerB(DragEvent event) {
        if (event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

}
