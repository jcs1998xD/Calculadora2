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
import javafx.scene.text.Text;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {

    String hace = "";
    double num1 = 0, num2 = 0;
    boolean entrar = true;

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
    private Text historico;
    @FXML
    private Button coma;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == coma) {
            if (entrar) {
                this.resultado.setText("0.");
            } else {
                this.resultado.appendText(".");
            }
            entrar = false;
        } else if (event.getSource() == cero) {
            if (entrar) {
                this.resultado.setText("0");
            } else {
                this.resultado.appendText("0");
            }
            entrar = false;

        } else if (event.getSource() == uno) {
            if (entrar) {
                this.resultado.setText("1");
            } else {
                this.resultado.appendText("1");
            }
            entrar = false;

        } else if (event.getSource() == dos) {
            if (entrar) {
                this.resultado.setText("2");
            } else {
                this.resultado.appendText("2");
            }
            entrar = false;

        } else if (event.getSource() == tres) {
            if (entrar) {
                this.resultado.setText("3");
            } else {
                this.resultado.appendText("3");
            }
            entrar = false;

        } else if (event.getSource() == cuatro) {
            if (entrar) {
                this.resultado.setText("4");
            } else {
                this.resultado.appendText("4");
            }
            entrar = false;

        } else if (event.getSource() == cinco) {
            if (entrar) {
                this.resultado.setText("5");
            } else {
                this.resultado.appendText("5");
            }
            entrar = false;

        } else if (event.getSource() == seis) {
            if (entrar) {
                this.resultado.setText("6");
            } else {
                this.resultado.appendText("6");
            }
            entrar = false;

        } else if (event.getSource() == siete) {
            if (entrar) {
                this.resultado.setText("7");
            } else {
                this.resultado.appendText("7");
            }
            entrar = false;

        } else if (event.getSource() == ocho) {
            if (entrar) {
                this.resultado.setText("8");
            } else {
                this.resultado.appendText("8");
            }
            entrar = false;

        } else if (event.getSource() == nueve) {
            if (entrar) {
                this.resultado.setText("9");
            } else {
                this.resultado.appendText("9");
            }
            entrar = false;

        } else if (event.getSource() == suma) {
            antes();
            this.historico.setText(this.historico.getText() + this.resultado.getText() + " + ");
            hace = "sumar";

        } else if (event.getSource() == resta) {
            antes();
            this.historico.setText(this.historico.getText() + this.resultado.getText() + " - ");
            hace = "restar";

        } else if (event.getSource() == multiplicacion) {
            antes();
            this.historico.setText(this.historico.getText() + this.resultado.getText() + " * ");
            hace = "multiplicar";

        } else if (event.getSource() == division) {
            antes();
            this.historico.setText(this.historico.getText() + this.resultado.getText() + " / ");
            hace = "dividir";

        } else if (event.getSource() == igual) {
            this.historico.setText("");
            antes();
            this.resultado.setText(String.valueOf(num1));
            hace = "";
            num1 = 0;

        } else if (event.getSource() == limpiar) {
            this.resultado.setText("0");
        }

    }

    private void antes() {
        entrar = true;
        if (hace.isEmpty()) {
            num1 = Double.parseDouble(this.resultado.getText());
        } else {
            num1 = operacion(hace, num1);
        }
    }

    private double operacion(String operacion, double num1) {
        double resultado = 0;
        num2 = Double.parseDouble(this.resultado.getText());
        switch (operacion) {
            case "sumar":
                resultado = num1 + num2;
                break;
            case "restar":
                resultado = num1 - num2;
                break;
            case "multiplicar":
                resultado = num1 * num2;
                break;
            case "dividir":
                resultado = num1 / num2;
                break;
            default:
                break;
        }
        return resultado;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
