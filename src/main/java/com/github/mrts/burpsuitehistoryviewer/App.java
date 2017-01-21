package com.github.mrts.burpsuitehistoryviewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application {

    private static String[] args;

    public static String[] getArgs() {
        return args;
    }

    public void start(Stage primaryStage) throws Exception {
        final FXMLLoader loader = new FXMLLoader(App.class.getResource("HttpLogTable.fxml"));
        final AnchorPane page = (AnchorPane) loader.load();
        final Scene scene = new Scene(page);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        App.args = args;
        try {
            launch(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
