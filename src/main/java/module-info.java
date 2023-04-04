module com.example.checklistversion8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.checklistversion8 to javafx.fxml;
    exports com.example.checklistversion8;
    exports com.example.checklistversion8.Controller;
    opens com.example.checklistversion8.Controller to javafx.fxml;
}