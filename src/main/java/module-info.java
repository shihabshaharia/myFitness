module com.myfitness.shihab.myfitness {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.myfitness.shihab.myfitness to javafx.fxml;
    exports com.myfitness.shihab.myfitness;
}