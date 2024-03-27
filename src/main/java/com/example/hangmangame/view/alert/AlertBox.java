package com.example.hangmangame.view.alert;

import javafx.scene.control.Alert;

public class AlertBox implements IAlertBox {

    @Override
    public void showMessage(String title, String header, String content){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}