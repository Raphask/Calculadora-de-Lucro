package calculo;


import java.net.URL;
import java.text.DecimalFormat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controle {
@FXML
private Button botaoPizza;
@FXML
private Button botaoBebida;
@FXML
private Button botaoBatata;
@FXML
private Button botaoPastel;
@FXML
public void telaBebidas() throws Exception {
	URL arquivoFXML = getClass().getResource("/xmlFiles/TelaBebidas.fxml");
	Parent root = FXMLLoader.load(arquivoFXML);
	Scene cena = new Scene(root, 300, 400);
	cena.getStylesheets().add(getClass().getResource("/calculo/style.css").toExternalForm());
	Stage stage2 = (Stage) botaoBebida.getScene().getWindow();
	stage2.setScene(cena);
	stage2.show();
}
@FXML
public void telaPizzas() throws Exception {
	URL arquivoFXML = getClass().getResource("/xmlFiles/TelaPizza.fxml");
	Parent root = FXMLLoader.load(arquivoFXML);
	Scene cena = new Scene(root, 300, 400);
	cena.getStylesheets().add(getClass().getResource("/calculo/style.css").toExternalForm());
	Stage stage3 = (Stage) botaoPizza.getScene().getWindow();
	stage3.setScene(cena);
	stage3.show();
}
@FXML
public void telaBatata() throws Exception {
	 URL arquivoFXML = getClass().getResource("/xmlFiles/TelaBatata.fxml");
		Parent root = FXMLLoader.load(arquivoFXML);
		Scene cena = new Scene(root, 300, 400);
		cena.getStylesheets().add(getClass().getResource("/calculo/style.css").toExternalForm());
		Stage stagebatata = (Stage) botaoBatata.getScene().getWindow();
		stagebatata.setScene(cena);
		stagebatata.show();
}
@FXML
public void telaPastel() throws Exception{
	 URL arquivoFXML = getClass().getResource("/xmlFiles/TelaPastel.fxml");
		Parent root = FXMLLoader.load(arquivoFXML);
		Scene cena = new Scene(root, 300, 400);
		cena.getStylesheets().add(getClass().getResource("/calculo/style.css").toExternalForm());
		Stage stagePastel = (Stage) botaoPastel.getScene().getWindow();
		stagePastel.setScene(cena);
		stagePastel.show();
}

}


