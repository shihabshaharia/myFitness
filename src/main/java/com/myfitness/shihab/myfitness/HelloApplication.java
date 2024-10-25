//package com.myfitness.shihab.myfitness;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.util.Objects;
//
//public class HelloApplication extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        String css = Objects.requireNonNull(this.getClass().getResource("style.css")).toExternalForm();
//        scene.getStylesheets().add(css);
//        stage.show();
//
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//}

package com.myfitness.shihab.myfitness;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            // Load the FXML file for the main UI
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

            // Set the scene size based on FXML preferred dimensions (700x500)
            Scene scene = new Scene(fxmlLoader.load(), 500, 700);

            // Set the title of the stage (main window)
            stage.setTitle("My Fitness Tracker");

            // Load and apply the CSS stylesheet
            String css = Objects.requireNonNull(this.getClass().getResource("style.css")).toExternalForm();
            scene.getStylesheets().add(css);

            // Set the scene to the stage and display the window
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to load FXML or CSS file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch();
    }
}
