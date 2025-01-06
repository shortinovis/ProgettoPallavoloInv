package com.example.progettopallavoloinfo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    private Squadra sq1=new Squadra();
    private Squadra sq2=new Squadra();
    private int setVintiLocali=0;
    private int setVintiOspiti=0;


    private int puntisq1=0;
    private int set=1;
    private int puntisq2=0;
    private int FormSq1=0;
    private int FormSq2=0;
    boolean rotazione1=false;
    boolean rotazione2=true;
    @FXML
    private Label welcomeText;
    @FXML
    private Label Punteggio;
    @FXML
    private Label puntiLocali;
    @FXML
    private Label puntiOspiti;
    @FXML
    private TextField Vittoria;
    @FXML
    private TextField Nome;
    @FXML
    private TextField ruolo;
    @FXML
    private TextField eta;
    @FXML
    private TextField capitano;
    @FXML
    private TextField squadra;
    @FXML
    private TextArea OppostoMio;
    @FXML
    private TextArea OppostoSuo;
    @FXML
    private TextArea CentraleMio;
    @FXML
    private TextArea CentraleSuo;
    @FXML
    private TextArea LiberoCentroMio;
    @FXML
    private TextArea LiberoCentroSuo;
    @FXML
    private TextArea Banda1Mia;
    @FXML
    private TextArea Banda2Mia;
    @FXML
    private TextArea Banda1Sua;
    @FXML
    private TextArea Banda2Sua;
    @FXML
    private TextArea PalleggiatoreMio;
    @FXML
    private TextArea PalleggiatoreSuo;
    @FXML
    private Button aggiunta;
    @FXML
    private Button punto;
    @FXML
    private Button Squad;
    @FXML
    private TextField squadra1;
    @FXML
    private TextField squadra2;
    @FXML
    private CheckBox ospiti;
    @FXML
    private CheckBox locali;


    @FXML
    protected void Aggiunta() {
        if(squadra.getText().equalsIgnoreCase("ospiti")) {
            sq2.aggiuntaGiocatore(Nome.getText(), Integer.parseInt(eta.getText()), ruolo.getText(), Boolean.parseBoolean(capitano.getText()));
        }else if(squadra.getText().equalsIgnoreCase("locali")) {
            sq1.aggiuntaGiocatore(Nome.getText(), Integer.parseInt(eta.getText()), ruolo.getText(), Boolean.parseBoolean(capitano.getText()));
        }
        Nome.setText("");
        squadra.setText("");
        capitano.setText("");
        eta.setText("");
        ruolo.setText("");
    }
    @FXML
    protected void AssegnaPunto(){
        if(ospiti.isSelected()&& !locali.isSelected()){
            puntisq2++;
           puntiOspiti.setText(Integer.toString(puntisq2));
           ospiti.setSelected(false);
           locali.setSelected(false);
           if(puntisq2==25){
               Punteggio.setText(Integer.toString(set));
               set++;
               puntisq1=0;
               puntisq2=0;
               puntiLocali.setText(Integer.toString(puntisq1));
               puntiOspiti.setText(Integer.toString(puntisq2));
               setVintiOspiti++;
               if(setVintiOspiti==3){
                    Vittoria.setVisible(true);
                    Vittoria.setText("Vittoria degli Ospiti");
               }
           }
           if(rotazione2){
               rotazione2=false;
               rotazione1=true;

               if(FormSq2==1){
                   FormSq2++;
                   OppostoSuo.setLayoutX(260);
                   OppostoSuo.setLayoutY(57);
                   Banda2Sua.setLayoutX(163);
                   Banda2Sua.setLayoutY(33);
                   LiberoCentroSuo.setLayoutX(74);
                   LiberoCentroSuo.setLayoutY(0);
                   PalleggiatoreSuo.setLayoutX(108);
                   PalleggiatoreSuo.setLayoutY(137);
                   Banda1Sua.setLayoutX(163);
                   Banda1Sua.setLayoutY(137);
                   CentraleSuo.setLayoutX(219);
                   CentraleSuo.setLayoutY(137);
               }else if(FormSq2==2){
                   FormSq2++;
                   OppostoSuo.setLayoutX(163);
                   OppostoSuo.setLayoutY(33);
                   Banda2Sua.setLayoutX(74);
                   Banda2Sua.setLayoutY(0);
                   LiberoCentroSuo.setLayoutX(108);
                   LiberoCentroSuo.setLayoutY(137);
                   PalleggiatoreSuo.setLayoutX(163);
                   PalleggiatoreSuo.setLayoutY(137);
                   Banda1Sua.setLayoutX(219);
                   Banda1Sua.setLayoutY(137);
                   CentraleSuo.setLayoutX(260);
                   CentraleSuo.setLayoutY(57);
               }else if(FormSq2==3){
                   FormSq2++;
                   OppostoSuo.setLayoutX(74);
                   OppostoSuo.setLayoutY(0);
                   Banda2Sua.setLayoutX(108);
                   Banda2Sua.setLayoutY(137);
                   LiberoCentroSuo.setLayoutX(163);
                   LiberoCentroSuo.setLayoutY(137);
                   PalleggiatoreSuo.setLayoutX(219);
                   PalleggiatoreSuo.setLayoutY(137);
                   Banda1Sua.setLayoutX(260);
                   Banda1Sua.setLayoutY(57);
                   CentraleSuo.setLayoutX(163);
                   CentraleSuo.setLayoutY(33);
               } else if(FormSq2==4){
                   FormSq2++;
                   OppostoSuo.setLayoutX(108);
                   OppostoSuo.setLayoutY(137);
                   Banda2Sua.setLayoutX(163);
                   Banda2Sua.setLayoutY(137);
                   LiberoCentroSuo.setLayoutX(219);
                   LiberoCentroSuo.setLayoutY(137);
                   PalleggiatoreSuo.setLayoutX(260);
                   PalleggiatoreSuo.setLayoutY(57);
                   Banda1Sua.setLayoutX(163);
                   Banda1Sua.setLayoutY(33);
                   CentraleSuo.setLayoutX(74);
                   CentraleSuo.setLayoutY(0);
               }else if(FormSq2==5){
                   FormSq2++;
                   OppostoSuo.setLayoutX(163);
                   OppostoSuo.setLayoutY(137);
                   Banda2Sua.setLayoutX(219);
                   Banda2Sua.setLayoutY(137);
                   LiberoCentroSuo.setLayoutX(260);
                   LiberoCentroSuo.setLayoutY(57);
                   PalleggiatoreSuo.setLayoutX(163);
                   PalleggiatoreSuo.setLayoutY(33);
                   Banda1Sua.setLayoutX(74);
                   Banda1Sua.setLayoutY(0);
                   CentraleSuo.setLayoutX(108);
                   CentraleSuo.setLayoutY(137);
               }else if(FormSq2==6){
                   FormSq2=1;
                   OppostoSuo.setLayoutX(219);
                   OppostoSuo.setLayoutY(137);
                   Banda2Sua.setLayoutX(260);
                   Banda2Sua.setLayoutY(57);
                   LiberoCentroSuo.setLayoutX(163);
                   LiberoCentroSuo.setLayoutY(33);
                   PalleggiatoreSuo.setLayoutX(74);
                   PalleggiatoreSuo.setLayoutY(0);
                   Banda1Sua.setLayoutX(108);
                   Banda1Sua.setLayoutY(137);
                   CentraleSuo.setLayoutX(163);
                   CentraleSuo.setLayoutY(137);
               }
               if(FormSq1==1){
                   FormSq1++;
                   OppostoMio.setLayoutX(89);
                   OppostoMio.setLayoutY(143);
                   PalleggiatoreMio.setLayoutX(281);
                   PalleggiatoreMio.setLayoutY(7);
                   CentraleMio.setLayoutX(7);
                   CentraleMio.setLayoutY(26);
                   Banda1Mia.setLayoutX(57);
                   Banda1Mia.setLayoutY(94);
                   Banda2Mia.setLayoutX(163);
                   Banda2Mia.setLayoutY(113);
                   LiberoCentroMio.setLayoutX(260);
                   LiberoCentroMio.setLayoutY(94);
               }else if(FormSq1==2){
                   FormSq1++;
                   OppostoMio.setLayoutX(228);
                   OppostoMio.setLayoutY(143);
                   PalleggiatoreMio.setLayoutX(256);
                   PalleggiatoreMio.setLayoutY(7);
                   CentraleMio.setLayoutX(163);
                   CentraleMio.setLayoutY(124);
                   Banda1Mia.setLayoutX(69);
                   Banda1Mia.setLayoutY(95);
                   Banda2Mia.setLayoutX(269);
                   Banda2Mia.setLayoutY(95);
                   LiberoCentroMio.setLayoutX(310);
                   LiberoCentroMio.setLayoutY(26);
               }else if(FormSq1==3){
                   FormSq1++;
                   OppostoMio.setLayoutX(312);
                   OppostoMio.setLayoutY(143);
                   PalleggiatoreMio.setLayoutX(1);
                   PalleggiatoreMio.setLayoutY(7);
                   CentraleMio.setLayoutX(260);
                   CentraleMio.setLayoutY(95);
                   Banda1Mia.setLayoutX(163);
                   Banda1Mia.setLayoutY(124);
                   Banda2Mia.setLayoutX(79);
                   Banda2Mia.setLayoutY(105);
                   LiberoCentroMio.setLayoutX(48);
                   LiberoCentroMio.setLayoutY(14);
               }else if(FormSq1==4){
                   FormSq1++;
                   OppostoMio.setLayoutX(312);
                   OppostoMio.setLayoutY(14);
                   PalleggiatoreMio.setLayoutX(100);
                   PalleggiatoreMio.setLayoutY(26);
                   CentraleMio.setLayoutX(260);
                   CentraleMio.setLayoutY(95);
                   Banda1Mia.setLayoutX(163);
                   Banda1Mia.setLayoutY(124);
                   Banda2Mia.setLayoutX(79);
                   Banda2Mia.setLayoutY(105);
                   LiberoCentroMio.setLayoutX(22);
                   LiberoCentroMio.setLayoutY(14);
               }else if(FormSq1==5){
                   FormSq1++;
                   OppostoMio.setLayoutX(260);
                   OppostoMio.setLayoutY(7);
                   Banda2Mia.setLayoutX(79);
                   Banda2Mia.setLayoutY(105);
                   LiberoCentroMio.setLayoutX(164);
                   LiberoCentroMio.setLayoutY(124);
                   PalleggiatoreMio.setLayoutX(213);
                   PalleggiatoreMio.setLayoutY(14);
                   Banda1Mia.setLayoutX(260);
                   Banda1Mia.setLayoutY(94);
                   CentraleMio.setLayoutX(312);
                   CentraleMio.setLayoutY(26);
               }else if(FormSq1==6){
                   FormSq1=1;
                   OppostoMio.setLayoutX(14);
                   OppostoMio.setLayoutY(57);
                   PalleggiatoreMio.setLayoutX(312);
                   PalleggiatoreMio.setLayoutY(143);
                   CentraleMio.setLayoutX(163);
                   CentraleMio.setLayoutY(26);
                   Banda1Mia.setLayoutX(260);
                   Banda1Mia.setLayoutY(94);
                   Banda2Mia.setLayoutX(79);
                   Banda2Mia.setLayoutY(105);
                   LiberoCentroMio.setLayoutX(164);
                   LiberoCentroMio.setLayoutY(124);
               }
           }
        }else if(!ospiti.isSelected() &&locali.isSelected()){
            puntisq1++;
            puntiLocali.setText(Integer.toString(puntisq1));
            ospiti.setSelected(false);
            locali.setSelected(false);
            if(puntisq1==25){
                Punteggio.setText(Integer.toString(set));
                set++;
                puntisq1=0;
                puntisq2=0;
                puntiLocali.setText(Integer.toString(puntisq1));
                puntiOspiti.setText(Integer.toString(puntisq2));
                setVintiLocali++;
                if(setVintiLocali==3){
                    Vittoria.setVisible(true);
                    Vittoria.setText("Vittoria dei Locali");
                }

            }
            if(rotazione1){
                rotazione1=false;
                rotazione2=true;
                if(FormSq1==1){
                    FormSq1++;
                    OppostoMio.setLayoutX(63);
                    OppostoMio.setLayoutY(99);
                    PalleggiatoreMio.setLayoutX(218);
                    PalleggiatoreMio.setLayoutY(14);
                    CentraleMio.setLayoutX(112);
                    CentraleMio.setLayoutY(14);
                    Banda1Mia.setLayoutX(164);
                    Banda1Mia.setLayoutY(14);
                    Banda2Mia.setLayoutX(164);
                    Banda2Mia.setLayoutY(118);
                    LiberoCentroMio.setLayoutX(259);
                    LiberoCentroMio.setLayoutY(151);
                }else if(FormSq1==2){
                    FormSq1++;
                    OppostoMio.setLayoutX(163);
                    OppostoMio.setLayoutY(118);
                    PalleggiatoreMio.setLayoutX(163);
                    PalleggiatoreMio.setLayoutY(14);
                    CentraleMio.setLayoutX(66);
                    CentraleMio.setLayoutY(99);
                    Banda1Mia.setLayoutX(107);
                    Banda1Mia.setLayoutY(14);
                    Banda2Mia.setLayoutX(253);
                    Banda2Mia.setLayoutY(151);
                    LiberoCentroMio.setLayoutX(219);
                    LiberoCentroMio.setLayoutY(14);
                }else if(FormSq1==3){
                    FormSq1++;
                    OppostoMio.setLayoutX(260);
                    OppostoMio.setLayoutY(151);
                    PalleggiatoreMio.setLayoutX(109);
                    PalleggiatoreMio.setLayoutY(14);
                    CentraleMio.setLayoutX(163);
                    CentraleMio.setLayoutY(113);
                    Banda1Mia.setLayoutX(68);
                    Banda1Mia.setLayoutY(80);
                    Banda2Mia.setLayoutX(219);
                    Banda2Mia.setLayoutY(14);
                    LiberoCentroMio.setLayoutX(163);
                    LiberoCentroMio.setLayoutY(14);
                }else if(FormSq1==4){
                    FormSq1++;
                    OppostoMio.setLayoutX(219);
                    OppostoMio.setLayoutY(14);
                    PalleggiatoreMio.setLayoutX(69);
                    PalleggiatoreMio.setLayoutY(76);
                    CentraleMio.setLayoutX(260);
                    CentraleMio.setLayoutY(151);
                    Banda1Mia.setLayoutX(163);
                    Banda1Mia.setLayoutY(113);
                    Banda2Mia.setLayoutX(163);
                    Banda2Mia.setLayoutY(14);
                    LiberoCentroMio.setLayoutX(110);
                    LiberoCentroMio.setLayoutY(14);
                }else if(FormSq1==5){
                    FormSq1++;
                    OppostoMio.setLayoutX(163);
                    OppostoMio.setLayoutY(14);
                    Banda2Mia.setLayoutX(109);
                    Banda2Mia.setLayoutY(14);
                    LiberoCentroMio.setLayoutX(68);
                    LiberoCentroMio.setLayoutY(76);
                    PalleggiatoreMio.setLayoutX(163);
                    PalleggiatoreMio.setLayoutY(13);
                    Banda1Mia.setLayoutX(260);
                    Banda1Mia.setLayoutY(151);
                    CentraleMio.setLayoutX(219);
                    CentraleMio.setLayoutY(14);
                }else if(FormSq1==6){
                    FormSq1=1;
                    OppostoMio.setLayoutX(112);
                    OppostoMio.setLayoutY(14);
                    PalleggiatoreMio.setLayoutX(264);
                    PalleggiatoreMio.setLayoutY(151);
                    CentraleMio.setLayoutX(163);
                    CentraleMio.setLayoutY(14);
                    Banda1Mia.setLayoutX(212);
                    Banda1Mia.setLayoutY(14);
                    Banda2Mia.setLayoutX(56);
                    Banda2Mia.setLayoutY(95);
                    LiberoCentroMio.setLayoutX(143);
                    LiberoCentroMio.setLayoutY(118);
                }
                if(FormSq2==1){
                    FormSq2++;
                    OppostoSuo.setLayoutX(240);
                    OppostoSuo.setLayoutY(12);
                    Banda2Sua.setLayoutX(163);
                    Banda2Sua.setLayoutY(38);
                    LiberoCentroSuo.setLayoutX(67);
                    LiberoCentroSuo.setLayoutY(50);
                    PalleggiatoreSuo.setLayoutX(67);
                    PalleggiatoreSuo.setLayoutY(147);
                    Banda1Sua.setLayoutX(274);
                    Banda1Sua.setLayoutY(57);
                    CentraleSuo.setLayoutX(326);
                    CentraleSuo.setLayoutY(128);
                }else if(FormSq2==2){
                    FormSq2++;
                    OppostoSuo.setLayoutX(240);
                    OppostoSuo.setLayoutY(12);
                    Banda2Sua.setLayoutX(163);
                    Banda2Sua.setLayoutY(38);
                    LiberoCentroSuo.setLayoutX(25);
                    LiberoCentroSuo.setLayoutY(128);
                    PalleggiatoreSuo.setLayoutX(74);
                    PalleggiatoreSuo.setLayoutY(147);
                    Banda1Sua.setLayoutX(274);
                    Banda1Sua.setLayoutY(57);
                    CentraleSuo.setLayoutX(326);
                    CentraleSuo.setLayoutY(128);
                }else if(FormSq2==3){
                    FormSq2++;
                    OppostoSuo.setLayoutX(14);
                    OppostoSuo.setLayoutY(14);
                    Banda2Sua.setLayoutX(265);
                    Banda2Sua.setLayoutY(43);
                    LiberoCentroSuo.setLayoutX(300);
                    LiberoCentroSuo.setLayoutY(147);
                    PalleggiatoreSuo.setLayoutX(74);
                    PalleggiatoreSuo.setLayoutY(50);
                    Banda1Sua.setLayoutX(163);
                    Banda1Sua.setLayoutY(24);
                    CentraleSuo.setLayoutX(245);
                    CentraleSuo.setLayoutY(128);
                } else if(FormSq2==4){
                    FormSq2++;
                    OppostoSuo.setLayoutX(6);
                    OppostoSuo.setLayoutY(137);
                    Banda2Sua.setLayoutX(265);
                    Banda2Sua.setLayoutY(43);
                    LiberoCentroSuo.setLayoutX(300);
                    LiberoCentroSuo.setLayoutY(147);
                    PalleggiatoreSuo.setLayoutX(245);
                    PalleggiatoreSuo.setLayoutY(128);
                    Banda1Sua.setLayoutX(163);
                    Banda1Sua.setLayoutY(24);
                    CentraleSuo.setLayoutX(74);
                    CentraleSuo.setLayoutY(50);
                }else if(FormSq2==5){
                    FormSq2++;
                    OppostoSuo.setLayoutX(108);
                    OppostoSuo.setLayoutY(147);
                    Banda2Sua.setLayoutX(265);
                    Banda2Sua.setLayoutY(43);
                    LiberoCentroSuo.setLayoutX(170);
                    LiberoCentroSuo.setLayoutY(31);
                    PalleggiatoreSuo.setLayoutX(150);
                    PalleggiatoreSuo.setLayoutY(128);
                    Banda1Sua.setLayoutX(69);
                    Banda1Sua.setLayoutY(95);
                    CentraleSuo.setLayoutX(55);
                    CentraleSuo.setLayoutY(137);
                }else if(FormSq2==6){
                    FormSq2=1;
                    OppostoSuo.setLayoutX(306);
                    OppostoSuo.setLayoutY(88);
                    Banda2Sua.setLayoutX(265);
                    Banda2Sua.setLayoutY(43);
                    LiberoCentroSuo.setLayoutX(170);
                    LiberoCentroSuo.setLayoutY(31);
                    PalleggiatoreSuo.setLayoutX(14);
                    PalleggiatoreSuo.setLayoutY(12);
                    Banda1Sua.setLayoutX(69);
                    Banda1Sua.setLayoutY(95);
                    CentraleSuo.setLayoutX(163);
                    CentraleSuo.setLayoutY(124);
                }
            }
        }

    }
    @FXML
    protected void SelezioneFormazione(){
        Vittoria.setVisible(false);
        Squad.setVisible(false);
        squadra1.setVisible(false);
        squadra2.setVisible(false);
        Nome.setVisible(false);
        eta.setVisible(false);
        ruolo.setVisible(false);
        capitano.setVisible(false);
        squadra.setVisible(false);
        aggiunta.setVisible(false);

        if(squadra1.getText().equalsIgnoreCase("p1")){
            FormSq1=1;
            OppostoMio.setLayoutX(112);
            OppostoMio.setLayoutY(14);
            PalleggiatoreMio.setLayoutX(264);
            PalleggiatoreMio.setLayoutY(151);
            CentraleMio.setLayoutX(163);
            CentraleMio.setLayoutY(14);
            Banda1Mia.setLayoutX(212);
            Banda1Mia.setLayoutY(14);
            Banda2Mia.setLayoutX(56);
            Banda2Mia.setLayoutY(95);
            LiberoCentroMio.setLayoutX(143);
            LiberoCentroMio.setLayoutY(118);
        }
        if(squadra1.getText().equalsIgnoreCase("p2")){
            FormSq1=2;
            OppostoMio.setLayoutX(63);
            OppostoMio.setLayoutY(99);
            PalleggiatoreMio.setLayoutX(218);
            PalleggiatoreMio.setLayoutY(14);
            CentraleMio.setLayoutX(112);
            CentraleMio.setLayoutY(14);
            Banda1Mia.setLayoutX(164);
            Banda1Mia.setLayoutY(14);
            Banda2Mia.setLayoutX(164);
            Banda2Mia.setLayoutY(118);
            LiberoCentroMio.setLayoutX(259);
            LiberoCentroMio.setLayoutY(151);
        }
        if(squadra1.getText().equalsIgnoreCase("p3")){
            FormSq1=3;
            OppostoMio.setLayoutX(163);
            OppostoMio.setLayoutY(118);
            PalleggiatoreMio.setLayoutX(163);
            PalleggiatoreMio.setLayoutY(14);
            CentraleMio.setLayoutX(66);
            CentraleMio.setLayoutY(99);
            Banda1Mia.setLayoutX(107);
            Banda1Mia.setLayoutY(14);
            Banda2Mia.setLayoutX(253);
            Banda2Mia.setLayoutY(151);
            LiberoCentroMio.setLayoutX(219);
            LiberoCentroMio.setLayoutY(14);
        }
        if(squadra1.getText().equalsIgnoreCase("p4")){
            FormSq1=4;
            OppostoMio.setLayoutX(260);
            OppostoMio.setLayoutY(151);
            PalleggiatoreMio.setLayoutX(109);
            PalleggiatoreMio.setLayoutY(14);
            CentraleMio.setLayoutX(163);
            CentraleMio.setLayoutY(113);
            Banda1Mia.setLayoutX(68);
            Banda1Mia.setLayoutY(80);
            Banda2Mia.setLayoutX(219);
            Banda2Mia.setLayoutY(14);
            LiberoCentroMio.setLayoutX(163);
            LiberoCentroMio.setLayoutY(14);
        }
        if(squadra1.getText().equalsIgnoreCase("p5")) {
            FormSq1 = 5;
            OppostoMio.setLayoutX(219);
            OppostoMio.setLayoutY(14);
            PalleggiatoreMio.setLayoutX(69);
            PalleggiatoreMio.setLayoutY(76);
            CentraleMio.setLayoutX(260);
            CentraleMio.setLayoutY(151);
            Banda1Mia.setLayoutX(163);
            Banda1Mia.setLayoutY(113);
            Banda2Mia.setLayoutX(163);
            Banda2Mia.setLayoutY(14);
            LiberoCentroMio.setLayoutX(110);
            LiberoCentroMio.setLayoutY(14);
        }
        if(squadra1.getText().equalsIgnoreCase("p6")){
            FormSq1=6;
                OppostoMio.setLayoutX(163);
                OppostoMio.setLayoutY(14);
                Banda2Mia.setLayoutX(109);
                Banda2Mia.setLayoutY(14);
                LiberoCentroMio.setLayoutX(68);
                LiberoCentroMio.setLayoutY(76);
                PalleggiatoreMio.setLayoutX(163);
                PalleggiatoreMio.setLayoutY(13);
                Banda1Mia.setLayoutX(260);
                Banda1Mia.setLayoutY(151);
                CentraleMio.setLayoutX(219);
                CentraleMio.setLayoutY(14);
        }
        if(squadra2.getText().equalsIgnoreCase("p2")){
            FormSq2=2;
            OppostoSuo.setLayoutX(240);
            OppostoSuo.setLayoutY(12);
            Banda2Sua.setLayoutX(163);
            Banda2Sua.setLayoutY(38);
            LiberoCentroSuo.setLayoutX(67);
            LiberoCentroSuo.setLayoutY(50);
            PalleggiatoreSuo.setLayoutX(67);
            PalleggiatoreSuo.setLayoutY(147);
            Banda1Sua.setLayoutX(274);
            Banda1Sua.setLayoutY(57);
            CentraleSuo.setLayoutX(326);
            CentraleSuo.setLayoutY(128);
        }
        if(squadra2.getText().equalsIgnoreCase("p3")){
            FormSq2=3;
            OppostoSuo.setLayoutX(240);
            OppostoSuo.setLayoutY(12);
            Banda2Sua.setLayoutX(163);
            Banda2Sua.setLayoutY(38);
            LiberoCentroSuo.setLayoutX(25);
            LiberoCentroSuo.setLayoutY(128);
            PalleggiatoreSuo.setLayoutX(74);
            PalleggiatoreSuo.setLayoutY(147);
            Banda1Sua.setLayoutX(274);
            Banda1Sua.setLayoutY(57);
            CentraleSuo.setLayoutX(326);
            CentraleSuo.setLayoutY(128);
        }
        if(squadra2.getText().equalsIgnoreCase("p4")){
            FormSq2=4;
            OppostoSuo.setLayoutX(14);
            OppostoSuo.setLayoutY(14);
            Banda2Sua.setLayoutX(265);
            Banda2Sua.setLayoutY(43);
            LiberoCentroSuo.setLayoutX(300);
            LiberoCentroSuo.setLayoutY(147);
            PalleggiatoreSuo.setLayoutX(74);
            PalleggiatoreSuo.setLayoutY(50);
            Banda1Sua.setLayoutX(163);
            Banda1Sua.setLayoutY(24);
            CentraleSuo.setLayoutX(245);
            CentraleSuo.setLayoutY(128);
        }
        if(squadra2.getText().equalsIgnoreCase("p5")){
            FormSq2=5;
            OppostoSuo.setLayoutX(6);
            OppostoSuo.setLayoutY(137);
            Banda2Sua.setLayoutX(265);
            Banda2Sua.setLayoutY(43);
            LiberoCentroSuo.setLayoutX(300);
            LiberoCentroSuo.setLayoutY(147);
            PalleggiatoreSuo.setLayoutX(245);
            PalleggiatoreSuo.setLayoutY(128);
            Banda1Sua.setLayoutX(163);
            Banda1Sua.setLayoutY(24);
            CentraleSuo.setLayoutX(74);
            CentraleSuo.setLayoutY(50);
        }
        if(squadra2.getText().equalsIgnoreCase("p6")){
            FormSq2=6;
            OppostoSuo.setLayoutX(108);
            OppostoSuo.setLayoutY(147);
            Banda2Sua.setLayoutX(265);
            Banda2Sua.setLayoutY(43);
            LiberoCentroSuo.setLayoutX(170);
            LiberoCentroSuo.setLayoutY(31);
            PalleggiatoreSuo.setLayoutX(150);
            PalleggiatoreSuo.setLayoutY(128);
            Banda1Sua.setLayoutX(69);
            Banda1Sua.setLayoutY(95);
            CentraleSuo.setLayoutX(55);
            CentraleSuo.setLayoutY(137);
        }
        if(squadra2.getText().equalsIgnoreCase("p1")){
            FormSq2=1;
            OppostoSuo.setLayoutX(306);
            OppostoSuo.setLayoutY(88);
            Banda2Sua.setLayoutX(265);
            Banda2Sua.setLayoutY(43);
            LiberoCentroSuo.setLayoutX(170);
            LiberoCentroSuo.setLayoutY(31);
            PalleggiatoreSuo.setLayoutX(14);
            PalleggiatoreSuo.setLayoutY(12);
            Banda1Sua.setLayoutX(69);
            Banda1Sua.setLayoutY(95);
            CentraleSuo.setLayoutX(163);
            CentraleSuo.setLayoutY(124);
        }
    }
}