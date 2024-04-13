module lambdaexpression {
    requires javafx.controls;
    requires javafx.fxml;

    opens lambdaexpression to javafx.fxml;
    exports lambdaexpression;
}
