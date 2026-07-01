import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        // Obtiene la versión de Java y JavaFX desde el sistema
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        
        // Crea una etiqueta de texto con la información (Estilo Hola Mundo Oficial)
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        
        // Coloca la etiqueta en un panel contenedor centrado
        Scene scene = new Scene(new StackPane(l), 640, 480);
        
        // Configura y muestra la ventana
        stage.setScene(scene);
        stage.setTitle("JavaFX Oficial Hello World");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
