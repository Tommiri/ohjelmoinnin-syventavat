module com.example.dayshelper {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;


    opens com.example.dayshelper to javafx.fxml;
    exports com.example.dayshelper;
}