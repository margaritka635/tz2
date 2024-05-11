module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.commons.io;


    opens arithmeticTest to javafx.fxml;
    exports arithmeticTest;
}