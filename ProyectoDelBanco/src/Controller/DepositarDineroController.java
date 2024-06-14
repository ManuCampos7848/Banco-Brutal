package Controller;

import java.io.IOException;

import Model.Cliente;
import Model.Cuenta;
import Model.MetodosBanco;
import Model.MetodosCuenta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DepositarDineroController {
	
	/*
	 * Atributo que nos permite saber ese cliente en especifico
	 */
	private Cliente cliente = MetodosCuenta.obtenerCliente();
	//_________________________________________________________________________

	/*
	 * Atributos del FXML
	 */
    @FXML
    private Button btnDepositarDinero;

    @FXML
    private Button btnVolver;

    @FXML
    private Label labelNombre;

    @FXML
    private TextField txtDineroDepositar;
	//_________________________________________________________________________

    /*
     * Metodo que nos permite hacer un deposito de dinero comprobandi el dinero 
     * del cliente con el dinero a retirar. En el caso que el dinero ha retirar
     * sea menor o igual que el dinero actual, se descontara este dinero y se volvera
     * a la interfaz del cliente. Tener en cuenta que este controlador pertenece
     * al cliente que este usando la aplicacion.
     */
    @FXML
    void btnDepositarDineroEvent(ActionEvent event) {

		double txtDineroDepositar = Double.parseDouble(this.txtDineroDepositar.getText());

    	if(this.txtDineroDepositar.getText().equals("")) {
    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
        	alert.setHeaderText(null);
        	alert.setTitle("Notificacion");
        	alert.setContentText("Agregue el valor que desea depositar.");
        	alert.showAndWait();
    	}else if(verificarDinero(txtDineroDepositar)){
    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
        	alert.setHeaderText(null);
        	alert.setTitle("Notificacion");
        	alert.setContentText("El valor a depositar no puede ser menor o igual a 0.");
        	alert.showAndWait();
    	}else {

        	Double dinero = MetodosCuenta.banco.getCliente().getDefCuenta().getSaldo();
        	
        	Double agregarDinero = MetodosCuenta.banco.getCliente().getDefCuenta().setSaldo(dinero + txtDineroDepositar);
        	
        	this.cliente.getDefCuenta().setSaldo(agregarDinero);
        	
        	Alert alert = new Alert(Alert.AlertType.INFORMATION);
        	alert.setHeaderText(null);
        	alert.setTitle("Notificacion");
        	alert.setContentText("Dinero depositado" + " " + txtDineroDepositar);
        	alert.showAndWait();
        	
        	try {

    			FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/MenuCliente.fxml"));
    			Parent root = loader.load();

    			MenuClienteController controlador = loader.getController();
    			Scene scene = new Scene(root);
    			Stage stage = new Stage();
    			controlador.init();
    			stage.initModality(Modality.APPLICATION_MODAL); 
    			stage.setTitle("Menu del Cliente");
    			stage.getIcons().add(new Image(getClass().getResourceAsStream("/Resources/LogoBanco.png")));
    			stage.setScene(scene);
    			stage.show();
    			stage.setResizable(false);
    			Stage myStage = (Stage) this.btnDepositarDinero.getScene().getWindow();
    			myStage.close();

        	} catch (IOException ex) {

        		alert = new Alert(Alert.AlertType.ERROR);
        		alert.setHeaderText(null);
        		alert.setTitle("Error");
        		alert.setContentText(ex.getMessage());
        		alert.showAndWait();
        	}
    	}
    }
    
    private boolean verificarDinero(double txtDineroDepositar) {
    	if(txtDineroDepositar <= 0) {
    		return true;
    	}
    	return false;
    }
    
    public static boolean esNumerico(String cadena) {
        // Intenta convertir la cadena a double
        try {
            double numero = Double.parseDouble(cadena);
            return true;  // Si se puede convertir, es numérico
        } catch (NumberFormatException e) {
            return false; // Si ocurre una excepción, no es numérico
        }
    }
    //_________________________________________________________________________


    /*
     * Metodo que permite que volver al menu principal del cliente
     */
    @FXML
    void volver(ActionEvent event) {

    	try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/MenuCliente.fxml"));
			Parent root = loader.load();

			MenuClienteController controlador = loader.getController();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			controlador.init();
			stage.initModality(Modality.APPLICATION_MODAL); 
			stage.setTitle("Menu del Cliente");
			stage.getIcons().add(new Image(getClass().getResourceAsStream("/Resources/LogoBanco.png")));
			stage.setScene(scene);
			stage.show();
			stage.setResizable(false);
			Stage myStage = (Stage) this.btnDepositarDinero.getScene().getWindow();
			myStage.close();

		} catch (IOException ex) {

			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
    }
  //_________________________________________________________________________
    
    
    /*
     * Metodo que permite traer ese cliente en especifico de interfaz en interfaz
     * y cambiar el Label central por el nombre del cliente.
     */
    public void init() {
    	labelNombre.setText(cliente.getNombre().toUpperCase());
	}
  //_________________________________________________________________________
}