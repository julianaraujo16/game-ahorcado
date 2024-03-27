package com.example.hangmangame.view;

import com.example.hangmangame.controller.WelcomeController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeStage extends Stage {

    private WelcomeController welcomeController;

    public WelcomeStage () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/com/example/hangmangame/welcome-view.fxml"));
        Parent root = loader.load();
        setTitle("Juego Ahorcado - Bienvenido");
        Scene scene = new Scene(root);
        getIcons().add(
                new Image(
                        String.valueOf(getClass().getResource("/com/example/hangmangame/images/favicon.png"))));
        setScene(scene);
        setResizable(false);
        show();
    }

    public WelcomeController getWelcomeController(){
        return welcomeController;
    }


    public static WelcomeStage getInstance() throws IOException{
        return WelcomeStageHolder.INSTANCE = new WelcomeStage();
    }

    private static class WelcomeStageHolder {
        private static WelcomeStage INSTANCE;
    }
}
