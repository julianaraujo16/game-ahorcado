package com.example.hangmangame.view;

import com.example.hangmangame.controller.GameController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameStage extends Stage {
    private GameController gameController;

    public GameStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/hangmangame/game-view.fxml"));

        Parent root = loader.load();
        gameController = loader.getController();
        setTitle("Ventana juego de craps");
        Scene scene = new Scene(root);
        setScene(scene);
        setResizable(false);
        show();
    }

    public static GameStage getInstance() throws IOException{
        return GameStageHolder.INSTANCE = new GameStage();
    }

    private static class GameStageHolder {
        private static GameStage INSTANCE;
    }
}