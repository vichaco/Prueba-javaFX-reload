package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *Unico controlador de la aplicacion.
 * 
 * @author miguel
 */
public class OneController {
	
	//not using yet
	@FXML
	private ImageView imageRaw;

    // Reference to the main application
    private Main mainApp;

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

	/**
     * abre la ventana secundaria
     */
    
    public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/OtherStage.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.getIcons().add(new Image("file:view/wifi.jpg"));
            sendStage.setTitle("OtherStage");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * metodo para abrir la segunda ventana
     */
    
    @FXML
    private void handleSend() {
    	showSendProfile();
    }

    /**
     * cierra la aplicacion 
     */
    @FXML
    private void handleClose() {
   	        System.exit(0);
    }
    }

