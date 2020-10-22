package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

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
    void resolve(ActionEvent event) {

    }

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
                if (towerA.getChildren().isEmpty())
                    towerA.getChildren().add(towerA.getChildren().size(), disk0);
                else if (disk0.getWidth() < ((Rectangle)towerA.getChildren().get(towerA.getChildren().size() - 1)).getWidth())
                    towerA.getChildren().add(towerA.getChildren().size(), disk0);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk1":
                if (towerA.getChildren().isEmpty())
                    towerA.getChildren().add(towerA.getChildren().size(), disk1);
                else if (disk1.getWidth() < ((Rectangle)towerA.getChildren().get(towerA.getChildren().size() - 1)).getWidth())
                    towerA.getChildren().add(towerA.getChildren().size(), disk1);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk2":
                if (towerA.getChildren().isEmpty())
                    towerA.getChildren().add(towerA.getChildren().size(), disk2);
                else if (disk2.getWidth() < ((Rectangle)towerA.getChildren().get(towerA.getChildren().size() - 1)).getWidth())
                    towerA.getChildren().add(towerA.getChildren().size(), disk2);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk3":
                if (towerA.getChildren().isEmpty())
                    towerA.getChildren().add(towerA.getChildren().size(), disk3);
                else if (disk3.getWidth() < ((Rectangle)towerA.getChildren().get(towerA.getChildren().size() - 1)).getWidth())
                    towerA.getChildren().add(towerA.getChildren().size(), disk3);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk4":
                if (towerA.getChildren().isEmpty())
                    towerA.getChildren().add(towerA.getChildren().size(), disk4);
                else if (disk4.getWidth() < ((Rectangle)towerA.getChildren().get(towerA.getChildren().size() - 1)).getWidth())
                    towerA.getChildren().add(towerA.getChildren().size(), disk4);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk5":
                if (towerA.getChildren().isEmpty())
                    towerA.getChildren().add(towerA.getChildren().size(), disk5);
                else if (disk5.getWidth() < ((Rectangle)towerA.getChildren().get(towerA.getChildren().size() - 1)).getWidth())
                    towerA.getChildren().add(towerA.getChildren().size(), disk5);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk6":
                if (towerA.getChildren().isEmpty())
                    towerA.getChildren().add(towerA.getChildren().size(), disk6);
                else if (disk6.getWidth() < ((Rectangle)towerA.getChildren().get(towerA.getChildren().size() - 1)).getWidth())
                    towerA.getChildren().add(towerA.getChildren().size(), disk6);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
        }
    }

    @FXML
    void addTowerB(DragEvent event) {
        String str = event.getDragboard().getString();

        switch (str){
            case "disk0":
                if (towerB.getChildren().isEmpty())
                    towerB.getChildren().add(towerB.getChildren().size(), disk0);
                else if (disk0.getWidth() < ((Rectangle)towerB.getChildren().get(towerB.getChildren().size() - 1)).getWidth())
                    towerB.getChildren().add(towerB.getChildren().size(), disk0);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk1":
                if (towerB.getChildren().isEmpty())
                    towerB.getChildren().add(towerB.getChildren().size(), disk1);
                else if (disk1.getWidth() < ((Rectangle)towerB.getChildren().get(towerB.getChildren().size() - 1)).getWidth())
                    towerB.getChildren().add(towerB.getChildren().size(), disk1);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk2":
                if (towerB.getChildren().isEmpty())
                    towerB.getChildren().add(towerB.getChildren().size(), disk2);
                else if (disk2.getWidth() < ((Rectangle)towerB.getChildren().get(towerB.getChildren().size() - 1)).getWidth())
                    towerB.getChildren().add(towerB.getChildren().size(), disk2);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk3":
                if (towerB.getChildren().isEmpty())
                    towerB.getChildren().add(towerB.getChildren().size(), disk3);
                else if (disk3.getWidth() < ((Rectangle)towerB.getChildren().get(towerB.getChildren().size() - 1)).getWidth())
                    towerB.getChildren().add(towerB.getChildren().size(), disk3);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk4":
                if (towerB.getChildren().isEmpty())
                    towerB.getChildren().add(towerB.getChildren().size(), disk4);
                else if (disk4.getWidth() < ((Rectangle)towerB.getChildren().get(towerB.getChildren().size() - 1)).getWidth())
                    towerB.getChildren().add(towerB.getChildren().size(), disk4);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk5":
                if (towerB.getChildren().isEmpty())
                    towerB.getChildren().add(towerB.getChildren().size(), disk5);
                else if (disk5.getWidth() < ((Rectangle)towerB.getChildren().get(towerB.getChildren().size() - 1)).getWidth())
                    towerB.getChildren().add(towerB.getChildren().size(), disk5);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk6":
                if (towerB.getChildren().isEmpty())
                    towerB.getChildren().add(towerB.getChildren().size(), disk6);
                else if (disk6.getWidth() < ((Rectangle)towerB.getChildren().get(towerB.getChildren().size() - 1)).getWidth())
                    towerB.getChildren().add(towerB.getChildren().size(), disk6);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
        }
    }

    @FXML
    void addTowerC(DragEvent event) {
        String str = event.getDragboard().getString();

        if (towerC.getChildren().size() == 6)
            textNotices.setText("¡Felicidades! ¡Has ganado!");

        switch (str){
            case "disk0":
                if (towerC.getChildren().isEmpty())
                    towerC.getChildren().add(towerC.getChildren().size(), disk0);
                else if (disk0.getWidth() < ((Rectangle)towerC.getChildren().get(towerC.getChildren().size() - 1)).getWidth())
                    towerC.getChildren().add(towerC.getChildren().size(), disk0);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk1":
                if (towerC.getChildren().isEmpty())
                    towerC.getChildren().add(towerC.getChildren().size(), disk1);
                else if (disk1.getWidth() < ((Rectangle)towerC.getChildren().get(towerC.getChildren().size() - 1)).getWidth())
                    towerC.getChildren().add(towerC.getChildren().size(), disk1);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk2":
                if (towerC.getChildren().isEmpty())
                    towerC.getChildren().add(towerC.getChildren().size(), disk2);
                else if (disk2.getWidth() < ((Rectangle)towerC.getChildren().get(towerC.getChildren().size() - 1)).getWidth())
                    towerC.getChildren().add(towerC.getChildren().size(), disk2);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk3":
                if (towerC.getChildren().isEmpty())
                    towerC.getChildren().add(towerC.getChildren().size(), disk3);
                else if (disk3.getWidth() < ((Rectangle)towerC.getChildren().get(towerC.getChildren().size() - 1)).getWidth())
                    towerC.getChildren().add(towerC.getChildren().size(), disk3);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk4":
                if (towerC.getChildren().isEmpty())
                    towerC.getChildren().add(towerC.getChildren().size(), disk4);
                else if (disk4.getWidth() < ((Rectangle)towerC.getChildren().get(towerC.getChildren().size() - 1)).getWidth())
                    towerC.getChildren().add(towerC.getChildren().size(), disk4);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk5":
                if (towerC.getChildren().isEmpty())
                    towerC.getChildren().add(towerC.getChildren().size(), disk5);
                else if (disk5.getWidth() < ((Rectangle)towerC.getChildren().get(towerC.getChildren().size() - 1)).getWidth())
                    towerC.getChildren().add(towerC.getChildren().size(), disk5);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
            case "disk6":
                if (towerC.getChildren().isEmpty())
                    towerC.getChildren().add(towerC.getChildren().size(), disk6);
                else if (disk6.getWidth() < ((Rectangle)towerC.getChildren().get(towerC.getChildren().size() - 1)).getWidth())
                    towerC.getChildren().add(towerC.getChildren().size(), disk6);
                else
                    textNotices.setText("El disco es mas grande que el otro, debe ser uno mas chico.");
                break;
        }
    }

    @FXML
    void removeTowerA(DragEvent event) {
        if (event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void removeTowerB(DragEvent event) {
        if (event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    void removeTowerC(DragEvent event) {
        if (event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }
}
