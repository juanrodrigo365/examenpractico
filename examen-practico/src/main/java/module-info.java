module com.mod1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
	requires javafx.graphics;
    opens com.mod1.examen_practico to javafx.fxml;
    exports com.mod1.examen_practico;
}