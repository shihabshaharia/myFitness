package com.myfitness.shihab.myfitness;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label welcomeText;

    @FXML
    private ComboBox<String> timePeriodDropdown;

    @FXML
    private Label stepsLabel;

    @FXML
    private Label caloriesLabel;

    @FXML
    private Label waterIntakeLabel;

    // Initialize method for ComboBox setup
//    public void initialize() {
//        // Preselect "Daily" in ComboBox
//        timePeriodDropdown.setValue("Daily");
//
//        // ComboBox onAction logic
//        timePeriodDropdown.setOnAction(event -> {
//            String selectedOption = timePeriodDropdown.getValue();
//            System.out.println("Selected time period: " + selectedOption);
//
//            switch (selectedOption) {
//                case "Daily":
//                    updateUIForDaily();
//                    break;
//                case "Weekly":
//                    updateUIForWeekly();
//                    break;
//                case "Monthly":
//                    updateUIForMonthly();
//                    break;
//            }
//        });
//    }

    public void initialize() {
        timePeriodDropdown.getItems().addAll("Daily", "Weekly", "Monthly");
        timePeriodDropdown.setValue("Daily");
        timePeriodDropdown.setOnAction(event -> {
            String selectedOption = timePeriodDropdown.getValue();
            System.out.println("Selected time period: " + selectedOption);

            switch (selectedOption) {
                case "Daily":
                    updateUIForDaily();
                    break;
                case "Weekly":
                    updateUIForWeekly();
                    break;
                case "Monthly":
                    updateUIForMonthly();
                    break;
            }
        });
    }

    // Update UI elements based on selected frequency
    private void updateUIForDaily() {
        stepsLabel.setText("420");
        caloriesLabel.setText("420 cal");
        waterIntakeLabel.setText("2L");
        System.out.println("Daily stats updated.");
    }

    private void updateUIForWeekly() {
        stepsLabel.setText("2940");
        caloriesLabel.setText("2940 cal");
        waterIntakeLabel.setText("14L");
        System.out.println("Weekly stats updated.");
    }

    private void updateUIForMonthly() {
        stepsLabel.setText("12600");
        caloriesLabel.setText("12600 cal");
        waterIntakeLabel.setText("60L");
        System.out.println("Monthly stats updated.");
    }

    // Navigation method to switch to Hello Scene
    public void switchToHelloScene(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Navigation method to switch to Track Scene
    public void switchToTrackScene(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("add-track.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Action handler for the welcome button click
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
