package com.mod1.examen_practico;
/*
Put header here


 */

import java.net.URL;
import java.time.zone.ZoneRulesException;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.lang.Thread;
import java.io.*;

public class FXMLController implements Initializable {
    
    @FXML
    private Label lblOut;
    @FXML
    private TextField txtUsuario;
    @FXML
    private Button btnClick;
    @FXML
    private Line linea;
    @FXML
    private Circle circulo;
    
    Stage stage;
    
    @FXML
    private void btnClickAction(ActionEvent event) {
        
    	/// Solucion 1
    	
    	TranslateTransition translate = new TranslateTransition();
    	translate.setNode(circulo);
        translate.setDuration(Duration.millis(2000));
        translate.setAutoReverse(true);
        //translate.play();
        //translate = new TranslateTransition();
        translate.setCycleCount(2);
        translate.setByY(-320);
        //translate.play();
	    
        for(int i=1;i<10;i++) {
        	translate.play();
        	try {Thread.sleep(30);} catch(InterruptedException e) {System.out.println(e);}
        	System.out.println(i);
        }
        
    	
    	/*System.out.println(lblOut.getText());
    	System.out.println(circulo.getLayoutX());
    	System.out.println(circulo.getLayoutY());
    	
    	//circulo.setLayoutX(300);
    	//circulo.setLayoutY(500);
    	
    	for(int j=1;j<5;j++) {
    		lblOut.setText(lblOut.getText()+"1");
    		this.circulo.setLayoutY(this.circulo.getLayoutY()-1);
    		for(int i=1; i<10;i++) {
        		try {Thread.sleep(10);
	        		System.out.println(this.circulo.getLayoutY());
	        		this.circulo.setLayoutY(this.circulo.getLayoutY()-1);
        		}
        		catch(InterruptedException e) {System.out.println(e);}
        	}
    		
    	}*/        
        
    }
    
    @FXML
    void btnDibujarLinea(ActionEvent event) {
    	linea.setStartX(50);
    	linea.setStartY(50);
    	linea.setEndX(100);
    	linea.setEndY(200);
    	linea.setStrokeWidth(10);
    	linea.setStroke(Color.RED);
    	linea.setOpacity(0.5);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
