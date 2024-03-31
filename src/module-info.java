/**
 * 
 */
/**
 * 
 */
module projetoDeExtensao {
	requires java.base;
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;

	opens calculo to javafx.graphics,javafx.fxml;
	exports calculo;
	
}