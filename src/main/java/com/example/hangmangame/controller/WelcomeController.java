package com.example.hangmangame.controller;

import com.example.hangmangame.view.GameStage;
import com.example.hangmangame.view.alert.AlertBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class WelcomeController {
    @FXML
    private TextField wordTextField;

    char[] chars;

    @FXML
    void onHandleButtonPlay(ActionEvent event) throws IOException {
        String word = wordTextField.getText();
        chars = word.toCharArray(); //Convierte la palabra en un array de caracteres

        int valido = 0;

        for (int i = 0; i < chars.length; i++) { //ciclo para verificar si cada caracter es una letra
            int valorASCII = (int) chars[i]; //convertidor cada caracter en un entero con la representación númerica de un carácter ASCII
            if ((valorASCII < 64 || valorASCII > 90) && (valorASCII < 96 || valorASCII > 123)) { //verificara si el caracter cumple las condiciones
                valido++;
            }
        }
        if (valido > 0) { //si es una letra saldra un alert box
            String title = "Alerta";
            String header = "Error";
            String content = "No puedes ingresar simbolos o numeros, solo numeros";
            new AlertBox().showMessage(title, header, content);
        } else {
            GameStage.getInstance();
        }

    }
}
