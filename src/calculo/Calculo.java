package calculo;

import java.text.DecimalFormat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Calculo {
	@FXML
	private TextField custo;
	@FXML
	private TextField unidade;
	@FXML
	private TextField unidadeVendida;
	@FXML
	private Label total;
	@FXML
	private Button botaoVoltar;
	
	@FXML
	public void calcularBebida() {
		String c = custo.getText();
		String u = unidade.getText();
		String uV = unidadeVendida.getText();
		if (c.isEmpty() || u.isEmpty() || uV.isEmpty()) {
			total.setText("Faltam informações");
		}
		else {
		try {
			Double custoC = Double.parseDouble(c);
			int custoU = Integer.parseInt(u);
			Double custoUV = Double.parseDouble(uV);
			
			DecimalFormat dF = new DecimalFormat("##.#");
			double totalReceita = custoUV * custoU;
			double custoTotal = totalReceita - custoC;
			total.setText( "R$" + dF.format(custoTotal).toString() + " em todas as bebidas");
		} catch (NumberFormatException e) {
			total.setText("Uma informação está incorreta");
		}
		
	}}

	@FXML
	public void calculoPizza() {
	String pT = custo.getText().toString();
	String qP = unidade.getText().toString();
	String pP = unidadeVendida.getText().toString();

	if (pT.isEmpty() || qP.isEmpty() || pP.isEmpty()) {
		total.setText("Faltam informações");
	}
	else {
	try {
		int precoConvertido =  Integer.parseInt(pT);
		int quantidadeConvertido =  Integer.parseInt(qP);
		double pizzaConvertido = Double.parseDouble(pP);

		double custo = precoConvertido / quantidadeConvertido;
		double lucro = pizzaConvertido - custo;
		DecimalFormat dF = new DecimalFormat("##.#");
		total.setText("R$" + dF.format(lucro).toString() + " por Pizza");
	} catch (NumberFormatException e) {
		total.setText("Uma informação está incorreta");
	}
	}
	}
	@FXML
	public void calculoBatata() {
	String pT = custo.getText().toString();
	String qP = unidade.getText().toString();
	String pP = unidadeVendida.getText().toString();

	if (pT.isEmpty() || qP.isEmpty() || pP.isEmpty()) {
		total.setText("Faltam informações");
	}
	else {
	try {
		double precoBatata =  Double.parseDouble(pT);
		int quantidadeConvertido =  Integer.parseInt(qP);
		double batataConvertido = Double.parseDouble(pP);

		double custo = precoBatata / quantidadeConvertido;
		double lucro =batataConvertido - custo;
		DecimalFormat dF = new DecimalFormat("##.#");
		total.setText("R$" + dF.format(lucro).toString() + " por Marmita");
	} catch (NumberFormatException e) {
		total.setText("Uma informação está incorreta");
	}
	}
	}
	
	@FXML
	public void calculoPastel() {
		String pT = custo.getText().toString();
		String qP = unidade.getText().toString();
		String pP = unidadeVendida.getText().toString();

		if (pT.isEmpty() || qP.isEmpty() || pP.isEmpty()) {
			total.setText("Faltam informações");
		}
		else {
		try {
			int precoConvertido =  Integer.parseInt(pT);
			int quantidadeConvertido =  Integer.parseInt(qP);
			double pastelConvertido = Double.parseDouble(pP);
            double custo = precoConvertido / quantidadeConvertido;
 			double lucro = pastelConvertido - custo;
			DecimalFormat dF = new DecimalFormat("##.#");
			total.setText("R$" + dF.format(lucro).toString() + " por Pastel");
		} catch (NumberFormatException e) {
			total.setText("Uma informação está incorreta");
		}
		}
		}
	@FXML
	public void voltar() throws Exception{
		Stage primaryStage = (Stage)botaoVoltar.getScene().getWindow();
		Tela tela = new Tela();
		tela.start(primaryStage);
		
	}
	}

