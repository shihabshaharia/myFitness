//package com.myfitness.shihab.myfitness;
//
//public class AddTrack {
//}

package com.myfitness.shihab.myfitness;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class AddTrack {

    @FXML
    private ToggleGroup activity; // Group for activity selection

    @FXML
    private RadioButton rSteps; // Steps RadioButton

    @FXML
    private RadioButton rExercise; // Exercise RadioButton

    @FXML
    private RadioButton rWater; // Water RadioButton

    @FXML
    private TextField numberInput; // Input for activity value

    @FXML
    private Button saveBtn; // Save button

    @FXML
    private void initialize() {
        // Set default activity to "Steps"
        rSteps.setSelected(true);

        // Action event when any RadioButton is selected
        activity.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            RadioButton selectedActivity = (RadioButton) newValue;
            System.out.println("Selected activity: " + selectedActivity.getText());
        });
    }

    // Method to handle "Save" button click
    @FXML
    private void swithToHelloScene() {
        // Get selected activity
        RadioButton selectedActivity = (RadioButton) activity.getSelectedToggle();
        String activityType = selectedActivity.getText();

        // Get the input value from the TextField
        String inputValue = numberInput.getText();

        // Validation: Check if the input is not empty and is a number
        if (inputValue.matches("\\d+")) {
            System.out.println("Activity: " + activityType + ", Value: " + inputValue);

            // Implement the saving logic here (e.g., saving to the database)

            // Switch back to the main scene or reset the input fields as needed
            resetForm();
        } else {
            System.out.println("Invalid input: Please enter a valid number.");
        }
    }

    // Helper method to reset the form after saving
    private void resetForm() {
        numberInput.clear();
        rSteps.setSelected(true); // Reset the default activity to "Steps"
    }
}
