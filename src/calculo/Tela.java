package calculo;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Tela extends Application {
@Override
public void start(Stage primaryStage) throws Exception {
	URL arquivoFXML = getClass().getResource("/xmlFiles/Tela1.fxml");
	Parent root = FXMLLoader.load(arquivoFXML);
	Scene cena = new Scene(root, 300, 400);
	cena.getStylesheets().add(getClass().getResource("/calculo/style.css").toExternalForm());
	primaryStage.setTitle("Cálculo");
	primaryStage.setScene(cena);
	primaryStage.show();
}
public static void main(String[] args) {
	launch(args);
}
}
