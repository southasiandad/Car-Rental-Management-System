module com.example.crms {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.crms to javafx.fxml;
    exports com.example.crms;
}