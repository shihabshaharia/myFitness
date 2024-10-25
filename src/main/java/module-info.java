module com.myfitness.shihab.myfitness {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.myfitness.shihab.myfitness to javafx.fxml;
    exports com.myfitness.shihab.myfitness;
}