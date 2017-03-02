/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField resultado;
    @FXML
    private Button siete;
    @FXML
    private Button ocho;
    @FXML
    private Button nueve;
    @FXML
    private Button division;
    @FXML
    private Button cuatro;
    @FXML
    private Button multiplicacion;
    @FXML
    private Button seis;
    @FXML
    private Button cinco;
    @FXML
    private Button uno;
    @FXML
    private Button suma;
    @FXML
    private Button igual;
    @FXML
    private Button cero;
    @FXML
    private Button tres;
    @FXML
    private Button dos;
    @FXML
    private Button limpiar;
    @FXML
    private Button resta;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == cero){
            this.resultado.appendText("0");
        } else if (event.getSource() == uno){
            this.resultado.appendText("1");
        } else if (event.getSource() == dos){
            this.resultado.appendText("2");
        } else if (event.getSource() == tres){
            this.resultado.appendText("3");
        } else if (event.getSource() == cuatro){
            this.resultado.appendText("4");
        } else if (event.getSource() == cinco){
            this.resultado.appendText("5");
        } else if (event.getSource() == seis){
            this.resultado.appendText("6");
        } else if (event.getSource() == siete){
            this.resultado.appendText("7");
        } else if (event.getSource() == ocho){
            this.resultado.appendText("8");
        } else if (event.getSource() == nueve){
            this.resultado.appendText("9");
            
        } else if (event.getSource() == suma){
            double dato = Double.parseDouble(this.resultado.getText());
            this.resultado.appendText(" + ");
        } else if (event.getSource() == resta){
            double dato = Double.parseDouble(this.resultado.getText());
            this.resultado.appendText(" - ");
        } else if (event.getSource() == multiplicacion){
            double dato = Double.parseDouble(this.resultado.getText());
            this.resultado.appendText(" * ");
        } else if (event.getSource() == division){
            double dato = Double.parseDouble(this.resultado.getText());
            this.resultado.appendText(" / ");
            
        } else if (event.getSource() == igual){
            StringTokenizer s = new StringTokenizer( this.resultado.getText(), "+/-*" ); 
            while( s.hasMoreTokens() == true ){
             //si hay mas trozos System.out.println( s.nextToken() );
            }
            double dato2 = Double.parseDouble();
            
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
