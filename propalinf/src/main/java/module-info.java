module com.example.propalinf {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.propalinf to javafx.fxml;
    exports com.example.propalinf;
}