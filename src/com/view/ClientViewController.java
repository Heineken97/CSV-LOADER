package com.view;

import java.io.File;

import com.MainApp;
import com.model.Estudiante;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;

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
	
	private MainApp mainApp;
	
	public ClientViewController() {
		
	}
	@FXML
	private void initialize() {
		//idColumn.setCellValueFactory(cellData ->cellData.getValue().getId().asObject());
		fullNameColumn.setCellValueFactory(cellData->new ReadOnlyStringWrapper(cellData.getValue().getFullname()));
	}
	@FXML
	public void buttonOnAction() {
		FileChooser fileChooser=new FileChooser();
		File file=fileChooser.showOpenDialog(null);
		fileChooser.setTitle("CSV File");
		fileChooser.getExtensionFilters().addAll(
				new FileChooser.ExtensionFilter("CSV", "*.csv"));						
			}
	

	
	public void setMainApp(MainApp mainApp) {
		this.mainApp=mainApp;
		
		tablaEstudiantes.setItems(mainApp.getStudentData());
	}
}
