package com.example.checklistversion8.Controller;

import com.example.checklistversion8.FileIn;
import com.example.checklistversion8.FileOut;
import com.example.checklistversion8.Tracker;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class March implements Initializable {
    public Button btnMarch1;
    public Button btnMarch2;
    public Button btnMarch3;
    public Button btnMarch4;
    public Button btnMarch5;
    public Button btnMarch6;
    public Button btnMarch7;
    public Button btnMarch8;
    public Button btnMarch9;
    public Button btnMarch10;
    public Button btnMarch11;
    public Button btnMarch12;
    public Button btnMarch13;
    public Button btnMarch14;
    public Button btnMarch15;
    public Button btnMarch16;
    public Button btnMarch17;
    public Button btnMarch18;
    public Button btnMarch19;
    public Button btnMarch20;
    public Button btnMarch21;
    public Button btnMarch22;
    public Button btnMarch23;
    public Button btnMarch24;
    public Button btnMarch25;
    public Button btnMarch26;
    public Button btnMarch27;
    public Button btnMarch28;
    public Button btnMarch29;
    public Button btnMarch30;
    public Button btnMarch31;

    private Tracker March1 = new Tracker("btnMarch1");
    private Tracker March2 = new Tracker("btnMarch2");
    private Tracker March3 = new Tracker("btnMarch3");
    private Tracker March4 = new Tracker("btnMarch4");
    private Tracker March5 = new Tracker("btnMarch5");
    private Tracker March6= new Tracker("btnMarch6");
    private Tracker March7= new Tracker("btnMarch7");
    private Tracker March8= new Tracker("btnMarch8");
    private Tracker March9= new Tracker("btnMarch9");
    private Tracker March10= new Tracker("btnMarch10");
    private Tracker March11= new Tracker("btnMarch11");
    private Tracker March12= new Tracker("btnMarch12");
    private Tracker March13= new Tracker("btnMarch13");
    private Tracker March14= new Tracker("btnMarch14");
    private Tracker March15= new Tracker("btnMarch15");
    private Tracker March16= new Tracker("btnMarch16");
    private Tracker March17= new Tracker("btnMarch17");
    private Tracker March18= new Tracker("btnMarch18");
    private Tracker March19= new Tracker("btnMarch19");
    private Tracker March20= new Tracker("btnMarch20");
    private Tracker March21= new Tracker("btnMarch21");
    private Tracker March22= new Tracker("btnMarch22");
    private Tracker March23= new Tracker("btnMarch23");
    private Tracker March24= new Tracker("btnMarch24");
    private Tracker March25= new Tracker("btnMarch25");
    private Tracker March26= new Tracker("btnMarch26");
    private Tracker March27= new Tracker("btnMarch27");
    private Tracker March28= new Tracker("btnMarch28");
    private Tracker March29= new Tracker("btnMarch29");
    private Tracker March30= new Tracker("btnMarch30");
    private Tracker March31= new Tracker("btnMarch31");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMap = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttons.add(btnMarch1);
        buttons.add(btnMarch2);
        buttons.add(btnMarch3);
        buttons.add(btnMarch4);
        buttons.add(btnMarch5);
        buttons.add(btnMarch6);
        buttons.add(btnMarch7);
        buttons.add(btnMarch8);
        buttons.add(btnMarch9);
        buttons.add(btnMarch10);
        buttons.add(btnMarch11);
        buttons.add(btnMarch12);
        buttons.add(btnMarch13);
        buttons.add(btnMarch14);
        buttons.add(btnMarch15);
        buttons.add(btnMarch16);
        buttons.add(btnMarch17);
        buttons.add(btnMarch18);
        buttons.add(btnMarch19);
        buttons.add(btnMarch20);
        buttons.add(btnMarch21);
        buttons.add(btnMarch22);
        buttons.add(btnMarch23);
        buttons.add(btnMarch24);
        buttons.add(btnMarch25);
        buttons.add(btnMarch26);
        buttons.add(btnMarch27);
        buttons.add(btnMarch28);
        buttons.add(btnMarch29);
        buttons.add(btnMarch30);
        buttons.add(btnMarch31);

        trackerHashMap.put("btnMarch1",March1);
        trackerHashMap.put("btnMarch2",March2);
        trackerHashMap.put("btnMarch3",March3);
        trackerHashMap.put("btnMarch4",March4);
        trackerHashMap.put("btnMarch5",March5);
        trackerHashMap.put("btnMarch6",March6);
        trackerHashMap.put("btnMarch7",March7);
        trackerHashMap.put("btnMarch8",March8);
        trackerHashMap.put("btnMarch9",March9);
        trackerHashMap.put("btnMarch10",March10);
        trackerHashMap.put("btnMarch11",March11);
        trackerHashMap.put("btnMarch12",March12);
        trackerHashMap.put("btnMarch13",March13);
        trackerHashMap.put("btnMarch14",March14);
        trackerHashMap.put("btnMarch15",March15);
        trackerHashMap.put("btnMarch16",March16);
        trackerHashMap.put("btnMarch17",March17);
        trackerHashMap.put("btnMarch18",March18);
        trackerHashMap.put("btnMarch19",March19);
        trackerHashMap.put("btnMarch20",March20);
        trackerHashMap.put("btnMarch21",March21);
        trackerHashMap.put("btnMarch22",March22);
        trackerHashMap.put("btnMarch23",March23);
        trackerHashMap.put("btnMarch24",March24);
        trackerHashMap.put("btnMarch25",March25);
        trackerHashMap.put("btnMarch26",March26);
        trackerHashMap.put("btnMarch27",March27);
        trackerHashMap.put("btnMarch28",March28);
        trackerHashMap.put("btnMarch29",March29);
        trackerHashMap.put("btnMarch30",March30);
        trackerHashMap.put("btnMarch31",March31);

        File file = new File("/fileMarch.ser");


        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapMarch();
            // System.out.println("NewHM: " + newHM);
            replaceHashMap(newHM);
            loadButtonsHashMap(trackerHashMap);

        }
    }

    private void loadButtonsHashMap(HashMap<String,Tracker> hm){
        //System.out.println("TrackerHashMap at start of loadbuttons: " + trackerHashMap);
        for(Map.Entry<String,Tracker> entry:hm.entrySet()){
            if(entry.getValue().getChecked()){
                findButtonHashMap(entry.getValue().getButtonName());
            }
        }
    }

    private void findButtonHashMap(String name){
        for(Button button:buttons){
            if(button.getId().equals(name)){
                button.setStyle("-fx-background-color: #CE2029");
            }
        }
    }

    private void replaceHashMap(HashMap<String,Tracker> newHM){
        trackerHashMap.clear();
        for(Map.Entry<String,Tracker> entry: newHM.entrySet()){
            trackerHashMap.put(entry.getKey(), entry.getValue());
        }
    }

    @FXML
    private void March1Clicked(){
        if(trackerHashMap.get("btnMarch1").getChecked()){
            btnMarch1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March1.setChecked(false);
            trackerHashMap.replace("btnMarch1",March1);
            fileOut.saveHashmapMarch(trackerHashMap);
        }else{
            btnMarch1.setStyle("-fx-background-color: #CE2029");
            March1.setChecked(true);
            trackerHashMap.replace("btnMarch1",March1);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March2Clicked(){
        if (trackerHashMap.get("btnMarch2").getChecked()) {
            //set to not checked
            btnMarch2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March2.setChecked(false);
            trackerHashMap.replace("btnMarch2",March2);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch2.setStyle("-fx-background-color: #CE2029");
            March2.setChecked(true);
            trackerHashMap.replace("btnMarch2",March2);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }

    @FXML
    private void March3Clicked(){
        if (trackerHashMap.get("btnMarch3").getChecked()) {
            //set to not checked
            btnMarch3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March3.setChecked(false);
            trackerHashMap.replace("btnMarch3",March3);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch3.setStyle("-fx-background-color: #CE2029");
            March3.setChecked(true);
            trackerHashMap.replace("btnMarch3",March3);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }

    @FXML
    private void March4Clicked(){
        if (trackerHashMap.get("btnMarch4").getChecked()) {
            //set to not checked
            btnMarch4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March4.setChecked(false);
            trackerHashMap.replace("btnMarch4",March4);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch4.setStyle("-fx-background-color: #CE2029");
            March4.setChecked(true);
            trackerHashMap.replace("btnMarch4",March4);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March5Clicked(){
        if (trackerHashMap.get("btnMarch5").getChecked()) {
            //set to not checked
            btnMarch5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March5.setChecked(false);
            trackerHashMap.replace("btnMarch5",March5);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch5.setStyle("-fx-background-color: #CE2029");
            March5.setChecked(true);
            trackerHashMap.replace("btnMarch5",March5);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March6Clicked(){
        if (trackerHashMap.get("btnMarch6").getChecked()) {
            //set to not checked
            btnMarch6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March6.setChecked(false);
            trackerHashMap.replace("btnMarch6",March6);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch6.setStyle("-fx-background-color: #CE2029");
            March6.setChecked(true);
            trackerHashMap.replace("btnMarch6",March6);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March7Clicked(){
        if (trackerHashMap.get("btnMarch7").getChecked()) {
            //set to not checked
            btnMarch7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March7.setChecked(false);
            trackerHashMap.replace("btnMarch7",March7);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch7.setStyle("-fx-background-color: #CE2029");
            March7.setChecked(true);
            trackerHashMap.replace("btnMarch7",March7);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March8Clicked(){
        if (trackerHashMap.get("btnMarch8").getChecked()) {
            //set to not checked
            btnMarch8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March8.setChecked(false);
            trackerHashMap.replace("btnMarch8",March8);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch8.setStyle("-fx-background-color: #CE2029");
            March8.setChecked(true);
            trackerHashMap.replace("btnMarch8",March8);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March9Clicked(){
        if (trackerHashMap.get("btnMarch9").getChecked()) {
            //set to not checked
            btnMarch9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March9.setChecked(false);
            trackerHashMap.replace("btnMarch9",March9);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch9.setStyle("-fx-background-color: #CE2029");
            March9.setChecked(true);
            trackerHashMap.replace("btnMarch9",March9);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March10Clicked(){
        if (trackerHashMap.get("btnMarch10").getChecked()) {
            //set to not checked
            btnMarch10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March10.setChecked(false);
            trackerHashMap.replace("btnMarch10",March10);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch10.setStyle("-fx-background-color: #CE2029");
            March10.setChecked(true);
            trackerHashMap.replace("btnMarch10",March10);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March11Clicked(){
        if (trackerHashMap.get("btnMarch11").getChecked()) {
            //set to not checked
            btnMarch11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March11.setChecked(false);
            trackerHashMap.replace("btnMarch11",March11);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch11.setStyle("-fx-background-color: #CE2029");
            March11.setChecked(true);
            trackerHashMap.replace("btnMarch11",March11);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March12Clicked(){
        if (trackerHashMap.get("btnMarch12").getChecked()) {
            //set to not checked
            btnMarch12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March12.setChecked(false);
            trackerHashMap.replace("btnMarch12",March12);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch12.setStyle("-fx-background-color: #CE2029");
            March12.setChecked(true);
            trackerHashMap.replace("btnMarch12",March12);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March13Clicked(){
        if (trackerHashMap.get("btnMarch13").getChecked()) {
            //set to not checked
            btnMarch13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March13.setChecked(false);
            trackerHashMap.replace("btnMarch13",March13);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch13.setStyle("-fx-background-color: #CE2029");
            March13.setChecked(true);
            trackerHashMap.replace("btnMarch13",March13);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March14Clicked(){
        if (trackerHashMap.get("btnMarch14").getChecked()) {
            //set to not checked
            btnMarch14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March14.setChecked(false);
            trackerHashMap.replace("btnMarch14",March14);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch14.setStyle("-fx-background-color: #CE2029");
            March14.setChecked(true);
            trackerHashMap.replace("btnMarch14",March14);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March15Clicked(){
        if (trackerHashMap.get("btnMarch15").getChecked()) {
            //set to not checked
            btnMarch15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March15.setChecked(false);
            trackerHashMap.replace("btnMarch15",March15);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch15.setStyle("-fx-background-color: #CE2029");
            March15.setChecked(true);
            trackerHashMap.replace("btnMarch15",March15);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March16Clicked(){
        if (trackerHashMap.get("btnMarch16").getChecked()) {
            //set to not checked
            btnMarch16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March16.setChecked(false);
            trackerHashMap.replace("btnMarch16",March16);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch16.setStyle("-fx-background-color: #CE2029");
            March16.setChecked(true);
            trackerHashMap.replace("btnMarch16",March16);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March17Clicked(){
        if (trackerHashMap.get("btnMarch17").getChecked()) {
            //set to not checked
            btnMarch17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March17.setChecked(false);
            trackerHashMap.replace("btnMarch17",March17);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch17.setStyle("-fx-background-color: #CE2029");
            March17.setChecked(true);
            trackerHashMap.replace("btnMarch17",March17);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March18Clicked(){
        if (trackerHashMap.get("btnMarch18").getChecked()) {
            //set to not checked
            btnMarch18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March18.setChecked(false);
            trackerHashMap.replace("btnMarch18",March18);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch18.setStyle("-fx-background-color: #CE2029");
            March18.setChecked(true);
            trackerHashMap.replace("btnMarch18",March18);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March19Clicked(){
        if (trackerHashMap.get("btnMarch19").getChecked()) {
            //set to not checked
            btnMarch19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March19.setChecked(false);
            trackerHashMap.replace("btnMarch19",March19);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch19.setStyle("-fx-background-color: #CE2029");
            March19.setChecked(true);
            trackerHashMap.replace("btnMarch19",March19);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March20Clicked(){
        if (trackerHashMap.get("btnMarch20").getChecked()) {
            //set to not checked
            btnMarch20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March20.setChecked(false);
            trackerHashMap.replace("btnMarch20",March20);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch20.setStyle("-fx-background-color: #CE2029");
            March20.setChecked(true);
            trackerHashMap.replace("btnMarch20",March20);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March21Clicked(){
        if (trackerHashMap.get("btnMarch21").getChecked()) {
            //set to not checked
            btnMarch21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March21.setChecked(false);
            trackerHashMap.replace("btnMarch21",March21);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch21.setStyle("-fx-background-color: #CE2029");
            March21.setChecked(true);
            trackerHashMap.replace("btnMarch21",March21);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March22Clicked(){
        if (trackerHashMap.get("btnMarch22").getChecked()) {
            //set to not checked
            btnMarch22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March22.setChecked(false);
            trackerHashMap.replace("btnMarch22",March22);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch22.setStyle("-fx-background-color: #CE2029");
            March22.setChecked(true);
            trackerHashMap.replace("btnMarch22",March22);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March23Clicked(){
        if (trackerHashMap.get("btnMarch23").getChecked()) {
            //set to not checked
            btnMarch23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March23.setChecked(false);
            trackerHashMap.replace("btnMarch23",March23);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch23.setStyle("-fx-background-color: #CE2029");
            March23.setChecked(true);
            trackerHashMap.replace("btnMarch23",March23);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March24Clicked(){
        if (trackerHashMap.get("btnMarch24").getChecked()) {
            //set to not checked
            btnMarch24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March24.setChecked(false);
            trackerHashMap.replace("btnMarch24",March24);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch24.setStyle("-fx-background-color: #CE2029");
            March24.setChecked(true);
            trackerHashMap.replace("btnMarch24",March24);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March25Clicked(){
        if (trackerHashMap.get("btnMarch25").getChecked()) {
            //set to not checked
            btnMarch25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March25.setChecked(false);
            trackerHashMap.replace("btnMarch25",March25);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch25.setStyle("-fx-background-color: #CE2029");
            March25.setChecked(true);
            trackerHashMap.replace("btnMarch25",March25);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March26Clicked(){
        if (trackerHashMap.get("btnMarch26").getChecked()) {
            //set to not checked
            btnMarch26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March26.setChecked(false);
            trackerHashMap.replace("btnMarch26",March26);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch26.setStyle("-fx-background-color: #CE2029");
            March26.setChecked(true);
            trackerHashMap.replace("btnMarch26",March26);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March27Clicked(){
        if (trackerHashMap.get("btnMarch27").getChecked()) {
            //set to not checked
            btnMarch27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March27.setChecked(false);
            trackerHashMap.replace("btnMarch27",March27);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch27.setStyle("-fx-background-color: #CE2029");
            March27.setChecked(true);
            trackerHashMap.replace("btnMarch27",March27);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March28Clicked(){
        if (trackerHashMap.get("btnMarch28").getChecked()) {
            //set to not checked
            btnMarch28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March28.setChecked(false);
            trackerHashMap.replace("btnMarch28",March28);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch28.setStyle("-fx-background-color: #CE2029");
            March28.setChecked(true);
            trackerHashMap.replace("btnMarch28",March28);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March29Clicked(){
        if (trackerHashMap.get("btnMarch29").getChecked()) {
            //set to not checked
            btnMarch29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March29.setChecked(false);
            trackerHashMap.replace("btnMarch29",March29);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch29.setStyle("-fx-background-color: #CE2029");
            March29.setChecked(true);
            trackerHashMap.replace("btnMarch29",March29);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March30Clicked(){
        if (trackerHashMap.get("btnMarch30").getChecked()) {
            //set to not checked
            btnMarch30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March30.setChecked(false);
            trackerHashMap.replace("btnMarch30",March30);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch30.setStyle("-fx-background-color: #CE2029");
            March30.setChecked(true);
            trackerHashMap.replace("btnMarch30",March30);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
    @FXML
    private void March31Clicked(){
        if (trackerHashMap.get("btnMarch31").getChecked()) {
            //set to not checked
            btnMarch31.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            March31.setChecked(false);
            trackerHashMap.replace("btnMarch31",March31);
            fileOut.saveHashmapMarch(trackerHashMap);
        } else {
            //set to checked
            btnMarch31.setStyle("-fx-background-color: #CE2029");
            March31.setChecked(true);
            trackerHashMap.replace("btnMarch31",March31);
            fileOut.saveHashmapMarch(trackerHashMap);
        }
    }
}

