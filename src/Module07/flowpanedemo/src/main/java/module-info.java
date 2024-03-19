module org.example.flowpanedemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.flowpanedemo to javafx.fxml;
    exports org.example.flowpanedemo;
}