module es.ieslosmontecillos.tooltipcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tooltipcss to javafx.fxml;
    exports es.ieslosmontecillos.tooltipcss;
}