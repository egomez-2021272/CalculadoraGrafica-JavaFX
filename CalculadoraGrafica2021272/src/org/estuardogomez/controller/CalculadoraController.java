    package org.estuardogomez.controller;

    import java.io.IOException;
    import java.net.URL;
    import java.util.ResourceBundle;
    import javafx.event.ActionEvent;
    import javafx.event.EventHandler;
    import javafx.fxml.FXML;
    import javafx.fxml.Initializable;
    import javafx.scene.control.Button;
    import javafx.scene.control.TextField;
    import javafx.scene.image.ImageView;
    import javafx.scene.input.KeyEvent;
    import java.math.*;

    public class CalculadoraController implements Initializable {//controlar la vista
        @FXML private Button btnMasMenos;
        @FXML private Button btnCero;
        @FXML private Button btnPunto;
        @FXML private Button btnIgual;
        @FXML private Button btnUno;
        @FXML private Button btnDos;
        @FXML private Button btnTres;
        @FXML private Button btnMas;
        @FXML private Button btnCuatro;
        @FXML private Button btnCinco;
        @FXML private Button btnSeis;
        @FXML private Button btnMenos;
        @FXML private Button btnSiete;
        @FXML private Button btnDivision;
        @FXML private Button btnRaiz;
        @FXML private Button btnOcho;
        @FXML private Button btnNueve;
        @FXML private Button btnMultiplicacion;
        @FXML private Button btnFraccion;
        @FXML private Button btnCuadrado;
        @FXML private Button btnPorcentaje;
        @FXML private Button btnCE;
        @FXML private Button btnC;
        @FXML private Button btnApagar;
        @FXML private TextField txtValor;
        private String punto;
        double dato1, dato2, resultado, acumulador = 0;
        private int op, valor;
        private double porcentaje = 0;
        @FXML
        private void handleButtonAction(ActionEvent event)throws Exception{
            if(event.getSource() == btnUno)// identifica el componente que disparo el objeto
                txtValor.setText(txtValor.getText()+"1");// si el evento que entra es del boton 1 entonches
            else if(event.getSource() == btnDos)
                txtValor.setText(txtValor.getText()+"2");
            else if(event.getSource() == btnTres)
                txtValor.setText(txtValor.getText()+"3");
            else if(event.getSource() == btnCuatro)
                txtValor.setText(txtValor.getText()+"4");
            else if(event.getSource() == btnCinco)
                txtValor.setText(txtValor.getText()+"5");
            else if(event.getSource() == btnSeis)
                txtValor.setText(txtValor.getText()+"6");
            else if(event.getSource() == btnSiete)
                txtValor.setText(txtValor.getText()+"7");
            else if(event.getSource() == btnOcho)
                txtValor.setText(txtValor.getText()+"8");
            else if(event.getSource() == btnNueve)
                txtValor.setText(txtValor.getText()+"9");
            else if(event.getSource() == btnCero)
                txtValor.setText(txtValor.getText()+"0");
            
            else if(event.getSource() == btnMas){  
                // isEmpty lee caracteres que están vacíos
                if(txtValor.getText().isEmpty()){
                }else{
                dato1 = Double.parseDouble(txtValor.getText());// Double es un objeto (clase) con . se accede al metodo
                acumulador = acumulador + dato1;
                txtValor.clear();
                op = 1;
                }
            }else if(event.getSource() == btnMenos){
                if(txtValor.getText().isEmpty()){
                }else{
                dato1 = Double.parseDouble(txtValor.getText());
                dato1 *= -1;
                acumulador = acumulador - dato1;  
                txtValor.clear();
                op = 2;
                }
                
            }else if(event.getSource() == btnMultiplicacion){
                if(txtValor.getText().isEmpty()){
                }else{
                dato1 = Double.parseDouble(txtValor.getText());
                txtValor.clear();
                op = 3;
                }
                
            }else if(event.getSource() ==  btnDivision){
                if(txtValor.getText().isEmpty()){
                }else{
                dato1 = Double.parseDouble(txtValor.getText());
                txtValor.clear();
                op = 4;
                }
                
            }else if(event.getSource() ==  btnC){
                txtValor.clear();

            }else if(event.getSource() == btnCE){
                txtValor.setText("");
                
            }else if(event.getSource() == btnCuadrado){
                if(txtValor.getText().isEmpty()){
                }else{
                dato1 = Double.parseDouble(txtValor.getText());
                txtValor.clear();
                resultado = dato1*dato1;
                txtValor.setText(String.valueOf(resultado));
                }
            }else if(event.getSource() == btnRaiz){
                if(txtValor.getText().isEmpty()){
                }else{
                dato1 = Double.parseDouble(txtValor.getText());
                txtValor.clear();
                resultado = Math.sqrt(dato1);
                txtValor.setText(String.valueOf(resultado));
                }

            }else if(event.getSource() == btnFraccion){
                if(txtValor.getText().isEmpty()){
                }else{
                dato1 = Double.parseDouble(txtValor.getText());
                txtValor.clear();
                resultado = 1/dato1;
                txtValor.setText(String.valueOf(resultado));}
                
            }else if(event.getSource() == btnPorcentaje){
                if(txtValor.getText().isEmpty()){
                }else{
                porcentaje = dato1/100;
                dato1 = Double.parseDouble(txtValor.getText());  

                txtValor.clear();
                //porcentaje = dato1/100;
                resultado = dato1 * porcentaje;
                txtValor.setText(String.valueOf(resultado));}

            }else if(event.getSource() == btnPunto){
             
                punto = txtValor.getText();
                if(punto.length() <=0){
                    txtValor.setText("0.");

                }else if(!punto.contains(".")){
                    txtValor.setText(punto + ".");
                }
                    
            }else if(event.getSource() == btnMasMenos){
                if(txtValor.getText().isEmpty()){
                }else{
                dato1 = Double.parseDouble(txtValor.getText());
                if(dato1 > 0){
                    valor = (int)dato1;
                    txtValor.setText("-"+(valor)); 
                }else if(dato1 < 0){
                    
                    resultado = dato1* -1;
                    txtValor.setText(String.valueOf(resultado));
                 }
                }
            }else if(event.getSource() == btnApagar){
               System.exit(0);

            }else if(event.getSource() == btnIgual){
                
                dato2 = Double.parseDouble(txtValor.getText());

                switch(op){
                    case 1:
                        acumulador = acumulador + dato2;
                        txtValor.setText(String.valueOf(acumulador));
                        dato1 = acumulador;
                        acumulador = 0;

                        break;
                    case 2:
                        acumulador = acumulador - dato2;
                        txtValor.setText(String.valueOf(acumulador));
                        acumulador = 0;
                        break;

                    case 3:
                        resultado = dato1 * dato2;
                        txtValor.setText(String.valueOf(resultado));
                        break;

                    case 4:
                        resultado = dato1 / dato2;
                        txtValor.setText(String.valueOf(resultado));
                        break;
                }
             }  
            }
            
        @Override
        public void initialize(URL url, ResourceBundle rb) {

        }

    }
