import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class HelloFX extends Application {
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("¡Hola Mundo!");
        l.setStyle("-fx-text-fill: linear-gradient(to right, #4facfe 0%, #00f2fe 45%, #9b51e0 100%); " +
                   "-fx-font-size: 60px; " +
                   "-fx-font-weight: bold; " +
                   "-fx-font-family: 'Segoe UI', Arial;");
        StackPane root = new StackPane(l);
        root.setStyle("-fx-background-color: linear-gradient(to bottom right, #0f2027, #203a43, #2c5364);");
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setTitle("JavaFX Oficial Hello World");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
