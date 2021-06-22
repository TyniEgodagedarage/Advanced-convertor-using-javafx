/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor;


import java.util.function.UnaryOperator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author HP
 */
public class FXMLDocumentController  {
   float h;
   float l;
   float w;
   float vol;
    @FXML
    private Label label;

    @FXML
    private Label l1;

    @FXML
    private TextField t1;
    

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button bm;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button bkm;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Button bv;

    @FXML
    private Button b0;

    @FXML
    private Button bcl;

    @FXML
    private Button bf;

    @FXML
    private Button bc;
    
    @FXML
    private Button binr;
    
    @FXML
    private Button bh;

    @FXML
    private Button bl;

    @FXML
    private Button bw;
    
    


    @FXML
    void handleButtonAction(ActionEvent event) {
        
        
        
       if(event.getSource()== b1){
            t1.setText(t1.getText()+"1");
        }
        if(event.getSource()== b2){
            t1.setText(t1.getText()+"2");
        }
        if(event.getSource()== b3){
            t1.setText(t1.getText()+"3");
        }
        if(event.getSource()== b4){
            t1.setText(t1.getText()+"4");
        }
        if(event.getSource()== b5){
            t1.setText(t1.getText()+"5");
        }
        if(event.getSource()== b6){
            t1.setText(t1.getText()+"6");
        }
        if(event.getSource()== b7){
            t1.setText(t1.getText()+"7");
        }
        if(event.getSource()== b8){
            t1.setText(t1.getText()+"8");
        }
        if(event.getSource()== b9){
            t1.setText(t1.getText()+"9");
        }
        if(event.getSource()== b0){
            t1.setText(t1.getText()+"0");
        }
        if(event.getSource()== bcl){
            t1.setText(" ");}
        if(event.getSource()== bf){
           double centigrade = Double.parseDouble(t1.getText());
           double fahrenheit =(centigrade*(9/5)+32);
           t1.setText(String.format("%2.1f \u00b0F",fahrenheit)); 
        }
        if(event.getSource()== bc){
           double fahrenheit  = Double.parseDouble(t1.getText());
           double centigrade=((fahrenheit-32)*(5/9));
           t1.setText(String.format("%2.1f \u00b0C",centigrade)); 
        }
        if(event.getSource()== bm){
            float ans =Float.parseFloat(t1.getText()) ;  
            float cal= (ans*1000);
            t1.setText(String.valueOf(cal+"m")); }
       
        
        if(event.getSource()== bkm){
          float ans =Float.parseFloat(t1.getText()) ;
          float cal= (ans/1000);
          t1.setText(String.valueOf(cal+"km")); 
        }
         if(event.getSource()== bv){
             vol=h*l*w;
            
             t1.setText(String.valueOf(vol)); 
          }
        
         
         if(event.getSource()== binr){
          float ans =Float.parseFloat(t1.getText()) ;
          float cal= (float) (ans*(73.03));
          t1.setText(String.valueOf("IRS."+cal)); 
        }
       
        if(event.getSource()== bh){
             h =Float.parseFloat(t1.getText());
              t1.setText("");
               
        }
         if(event.getSource()== bl){
             l =Float.parseFloat(t1.getText());
              t1.setText("");
               
        }
          if(event.getSource()== bw){
             w =Float.parseFloat(t1.getText());
              t1.setText("");
               
        }
          
          
          
          
          
          
          
        
         }


    }

    
    
    

