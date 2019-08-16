package com.view;

import java.io.File;

import com.MainApp;
import com.model.Estudiante;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
	

	
	public void setMainApp(MainApp mainApp) {
		this.mainApp=mainApp;
		
		tablaEstudiantes.setItems(mainApp.getStudentData());
	}
}
