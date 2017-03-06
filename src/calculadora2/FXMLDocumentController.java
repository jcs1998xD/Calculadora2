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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
    int contador = 0;

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
    private Text operaciones;
    @FXML
    private Button coma;
    @FXML
    private TextArea historicoText;
    @FXML
    private CheckBox historicocheck;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == coma) {
            if (this.resultado.getText().charAt(this.resultado.getText().length() - 1) != '.') {
                if (entrar) {
                    this.resultado.setText("0.");
                } else {
                    this.resultado.appendText(".");
                }
                entrar = false;
            }
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
            if (comprobar("+")) {

                if (entrar) {
                    this.operaciones.setText(this.operaciones.getText().substring(0, this.operaciones.getText().length() - 3) + " + ");
                    hace = "sumar";
                } else {
                    this.operaciones.setText(this.operaciones.getText() + this.resultado.getText() + " + ");
                    antes(false);
                    hace = "sumar";
                }

            }

        } else if (event.getSource() == multiplicacion) {
            if (comprobar("*")) {

                if (entrar) {
                    this.operaciones.setText(this.operaciones.getText().substring(0, this.operaciones.getText().length() - 3) + " * ");
                    hace = "multiplicar";
                } else {
                    this.operaciones.setText(this.operaciones.getText() + this.resultado.getText() + " * ");
                    antes(true);
                    hace = "multiplicar";
                }

            }

        } else if (event.getSource() == division) {
            if (comprobar("/")) {

                if (entrar) {
                    this.operaciones.setText(this.operaciones.getText().substring(0, this.operaciones.getText().length() - 3) + " / ");
                    hace = "dividir";
                } else {
                    this.operaciones.setText(this.operaciones.getText() + this.resultado.getText() + " / ");
                    antes(true);
                    hace = "dividir";
                }

            }

        } else if (event.getSource() == igual) {
            contador++;
            this.historicoText.appendText(contador + " --> " + this.operaciones.getText() + this.resultado.getText() + " = ");
            this.operaciones.setText("");
            antes(false);
            this.resultado.setText(String.valueOf(num1));
            this.historicoText.appendText(String.valueOf(num1) + "\n");
            hace = "";
            num1 = 0;

        } else if (event.getSource() == limpiar) {
            this.resultado.setText("0");
            entrar = true;
        }

    }

    private void antes(boolean preferencia) {

        if (hace.isEmpty()) {
            num1 = Double.parseDouble(this.resultado.getText());
        } else {
            num1 = operacion(hace, num1);
            this.resultado.setText(String.valueOf(num1));
        }
        entrar = true;
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

    private boolean comprobar(String operacion) {
        String operaciones = this.operaciones.getText();
        if (operaciones.isEmpty() || operaciones.substring(operaciones.length() - 2) != operacion
                || (operaciones.substring(operaciones.length() - 2) == operacion && this.entrar == false)) {
            return true;
        } else {
            return false;
        }

    }

    @FXML
    private void restar(ActionEvent event) {
        if (comprobar("-")) {

            if (entrar) {
                this.operaciones.setText(this.operaciones.getText().substring(0, this.operaciones.getText().length() - 3) + " - ");
                hace = "restar";
            } else {
                this.operaciones.setText(this.operaciones.getText() + this.resultado.getText() + " - ");
                antes(false);
                hace = "restar";
            }

        }
    }

    @FXML
    private void historico(ActionEvent event) {
        if (this.historicocheck.isSelected()) {
            this.historicoText.setVisible(true);
        } else {
            this.historicoText.setVisible(false);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
