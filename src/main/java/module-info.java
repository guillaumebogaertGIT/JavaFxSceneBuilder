module com.example.jaxafxscenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jaxafxscenebuilder to javafx.fxml;
    exports com.example.jaxafxscenebuilder;
}