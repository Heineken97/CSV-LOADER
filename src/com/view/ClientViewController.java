package com.view;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.MainApp;
import com.model.Estudiante;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ClientViewController {
	@FXML
	private TableView<Estudiante> tablaEstudiantes;
	
	//@FXML
	//private TableColumn<Estudiante,String> idColumn;
	
	@FXML
	private TableColumn<Estudiante,String> fullNameColumn;
	
	//@FXML
	//private Label id;
	
	@FXML
	private Label fullname;
	
	@FXML
	private AnchorPane anchorpane;
	
	private MainApp mainApp;
	
	
	public ClientViewController() {
		
	}
	@FXML
	private void initialize() {
		//idColumn.setCellValueFactory(cellData ->cellData.getValue().getId().asObject());
		fullNameColumn.setCellValueFactory(cellData->new ReadOnlyStringWrapper(cellData.getValue().getFullname()));
	}
	@FXML
	public void buttonOnAction(ActionEvent event) throws IOException {
		FileChooser fileChooser=new FileChooser();
		Stage stage= (Stage) anchorpane.getScene().getWindow();
		File file =fileChooser.showOpenDialog(stage);
		fileChooser.setTitle("CSV File");
		fileChooser.getExtensionFilters().addAll(
				new FileChooser.ExtensionFilter("CSV", "*.csv"));						
		if(file!=null) {
			Desktop desktop=Desktop.getDesktop();
			desktop.open(file);
		}
	
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp=mainApp;
		
		tablaEstudiantes.setItems(mainApp.getStudentData());
	}
}
