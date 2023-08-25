module com.example.lovecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lovecalculator to javafx.fxml;
    exports com.example.lovecalculator;
}