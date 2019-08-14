package com;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	public List ReadCSV(String pathfile,String column) throws Exception{
		CsvReader csvReader=null;
		try {
			
			File file= new File(pathfile);
			FileReader freader= new FileReader(file);
			
			csvReader= new CsvReader(freader,column.charAt(0));
			
			String[] rubros=null;
			List registrosEstudiantes=new ArrayList();
			
			if(csvReader.readHeaders()) {
				rubros=csvReader.getHeaders();
			}
			
			while(csvReader.readRecord()) {
				
			}
			
			
			return registrosEstudiantes;	
			
		}catch(Exception e) {
			throw e;
		}finally {
			if(csvReader!=null) {
				csvReader.close();
			}
		}
		
		
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("CSV Checker");
		
		initRootLayout();
		
		showPersonOverview();
		
	}
	
	public void initRootLayout() {
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showPersonOverview() {
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ClientView.fxml"));
			AnchorPane personOverview =(AnchorPane) loader.load();
			
			rootLayout.setCenter(personOverview);
			}catch(IOException e){
				e.printStackTrace();
			}
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
