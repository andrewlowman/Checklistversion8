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

public class May implements Initializable {
    public Button btnMay1;
    public Button btnMay2;
    public Button btnMay3;
    public Button btnMay4;
    public Button btnMay5;
    public Button btnMay6;
    public Button btnMay7;
    public Button btnMay8;
    public Button btnMay9;
    public Button btnMay10;
    public Button btnMay11;
    public Button btnMay12;
    public Button btnMay13;
    public Button btnMay14;
    public Button btnMay15;
    public Button btnMay16;
    public Button btnMay17;
    public Button btnMay18;
    public Button btnMay19;
    public Button btnMay20;
    public Button btnMay21;
    public Button btnMay22;
    public Button btnMay23;
    public Button btnMay24;
    public Button btnMay25;
    public Button btnMay26;
    public Button btnMay27;
    public Button btnMay28;
    public Button btnMay29;
    public Button btnMay30;
    public Button btnMay31;

    private Tracker May1 = new Tracker("btnMay1");
    private Tracker May2 = new Tracker("btnMay2");
    private Tracker May3 = new Tracker("btnMay3");
    private Tracker May4 = new Tracker("btnMay4");
    private Tracker May5 = new Tracker("btnMay5");
    private Tracker May6= new Tracker("btnMay6");
    private Tracker May7= new Tracker("btnMay7");
    private Tracker May8= new Tracker("btnMay8");
    private Tracker May9= new Tracker("btnMay9");
    private Tracker May10= new Tracker("btnMay10");
    private Tracker May11= new Tracker("btnMay11");
    private Tracker May12= new Tracker("btnMay12");
    private Tracker May13= new Tracker("btnMay13");
    private Tracker May14= new Tracker("btnMay14");
    private Tracker May15= new Tracker("btnMay15");
    private Tracker May16= new Tracker("btnMay16");
    private Tracker May17= new Tracker("btnMay17");
    private Tracker May18= new Tracker("btnMay18");
    private Tracker May19= new Tracker("btnMay19");
    private Tracker May20= new Tracker("btnMay20");
    private Tracker May21= new Tracker("btnMay21");
    private Tracker May22= new Tracker("btnMay22");
    private Tracker May23= new Tracker("btnMay23");
    private Tracker May24= new Tracker("btnMay24");
    private Tracker May25= new Tracker("btnMay25");
    private Tracker May26= new Tracker("btnMay26");
    private Tracker May27= new Tracker("btnMay27");
    private Tracker May28= new Tracker("btnMay28");
    private Tracker May29= new Tracker("btnMay29");
    private Tracker May30= new Tracker("btnMay30");
    private Tracker May31= new Tracker("btnMay31");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMap = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttons.add(btnMay1);
        buttons.add(btnMay2);
        buttons.add(btnMay3);
        buttons.add(btnMay4);
        buttons.add(btnMay5);
        buttons.add(btnMay6);
        buttons.add(btnMay7);
        buttons.add(btnMay8);
        buttons.add(btnMay9);
        buttons.add(btnMay10);
        buttons.add(btnMay11);
        buttons.add(btnMay12);
        buttons.add(btnMay13);
        buttons.add(btnMay14);
        buttons.add(btnMay15);
        buttons.add(btnMay16);
        buttons.add(btnMay17);
        buttons.add(btnMay18);
        buttons.add(btnMay19);
        buttons.add(btnMay20);
        buttons.add(btnMay21);
        buttons.add(btnMay22);
        buttons.add(btnMay23);
        buttons.add(btnMay24);
        buttons.add(btnMay25);
        buttons.add(btnMay26);
        buttons.add(btnMay27);
        buttons.add(btnMay28);
        buttons.add(btnMay29);
        buttons.add(btnMay30);
        buttons.add(btnMay31);

        trackerHashMap.put("btnMay1",May1);
        trackerHashMap.put("btnMay2",May2);
        trackerHashMap.put("btnMay3",May3);
        trackerHashMap.put("btnMay4",May4);
        trackerHashMap.put("btnMay5",May5);
        trackerHashMap.put("btnMay6",May6);
        trackerHashMap.put("btnMay7",May7);
        trackerHashMap.put("btnMay8",May8);
        trackerHashMap.put("btnMay9",May9);
        trackerHashMap.put("btnMay10",May10);
        trackerHashMap.put("btnMay11",May11);
        trackerHashMap.put("btnMay12",May12);
        trackerHashMap.put("btnMay13",May13);
        trackerHashMap.put("btnMay14",May14);
        trackerHashMap.put("btnMay15",May15);
        trackerHashMap.put("btnMay16",May16);
        trackerHashMap.put("btnMay17",May17);
        trackerHashMap.put("btnMay18",May18);
        trackerHashMap.put("btnMay19",May19);
        trackerHashMap.put("btnMay20",May20);
        trackerHashMap.put("btnMay21",May21);
        trackerHashMap.put("btnMay22",May22);
        trackerHashMap.put("btnMay23",May23);
        trackerHashMap.put("btnMay24",May24);
        trackerHashMap.put("btnMay25",May25);
        trackerHashMap.put("btnMay26",May26);
        trackerHashMap.put("btnMay27",May27);
        trackerHashMap.put("btnMay28",May28);
        trackerHashMap.put("btnMay29",May29);
        trackerHashMap.put("btnMay30",May30);
        trackerHashMap.put("btnMay31",May31);

        File file = new File("/fileMay.ser");


        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapMay();
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
    private void May1Clicked(){
        if(trackerHashMap.get("btnMay1").getChecked()){
            btnMay1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May1.setChecked(false);
            trackerHashMap.replace("btnMay1",May1);
            fileOut.saveHashmapMay(trackerHashMap);
        }else{
            btnMay1.setStyle("-fx-background-color: #CE2029");
            May1.setChecked(true);
            trackerHashMap.replace("btnMay1",May1);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May2Clicked(){
        if (trackerHashMap.get("btnMay2").getChecked()) {
            //set to not checked
            btnMay2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May2.setChecked(false);
            trackerHashMap.replace("btnMay2",May2);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay2.setStyle("-fx-background-color: #CE2029");
            May2.setChecked(true);
            trackerHashMap.replace("btnMay2",May2);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }

    @FXML
    private void May3Clicked(){
        if (trackerHashMap.get("btnMay3").getChecked()) {
            //set to not checked
            btnMay3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May3.setChecked(false);
            trackerHashMap.replace("btnMay3",May3);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay3.setStyle("-fx-background-color: #CE2029");
            May3.setChecked(true);
            trackerHashMap.replace("btnMay3",May3);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }

    @FXML
    private void May4Clicked(){
        if (trackerHashMap.get("btnMay4").getChecked()) {
            //set to not checked
            btnMay4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May4.setChecked(false);
            trackerHashMap.replace("btnMay4",May4);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay4.setStyle("-fx-background-color: #CE2029");
            May4.setChecked(true);
            trackerHashMap.replace("btnMay4",May4);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May5Clicked(){
        if (trackerHashMap.get("btnMay5").getChecked()) {
            //set to not checked
            btnMay5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May5.setChecked(false);
            trackerHashMap.replace("btnMay5",May5);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay5.setStyle("-fx-background-color: #CE2029");
            May5.setChecked(true);
            trackerHashMap.replace("btnMay5",May5);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May6Clicked(){
        if (trackerHashMap.get("btnMay6").getChecked()) {
            //set to not checked
            btnMay6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May6.setChecked(false);
            trackerHashMap.replace("btnMay6",May6);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay6.setStyle("-fx-background-color: #CE2029");
            May6.setChecked(true);
            trackerHashMap.replace("btnMay6",May6);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May7Clicked(){
        if (trackerHashMap.get("btnMay7").getChecked()) {
            //set to not checked
            btnMay7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May7.setChecked(false);
            trackerHashMap.replace("btnMay7",May7);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay7.setStyle("-fx-background-color: #CE2029");
            May7.setChecked(true);
            trackerHashMap.replace("btnMay7",May7);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May8Clicked(){
        if (trackerHashMap.get("btnMay8").getChecked()) {
            //set to not checked
            btnMay8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May8.setChecked(false);
            trackerHashMap.replace("btnMay8",May8);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay8.setStyle("-fx-background-color: #CE2029");
            May8.setChecked(true);
            trackerHashMap.replace("btnMay8",May8);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May9Clicked(){
        if (trackerHashMap.get("btnMay9").getChecked()) {
            //set to not checked
            btnMay9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May9.setChecked(false);
            trackerHashMap.replace("btnMay9",May9);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay9.setStyle("-fx-background-color: #CE2029");
            May9.setChecked(true);
            trackerHashMap.replace("btnMay9",May9);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May10Clicked(){
        if (trackerHashMap.get("btnMay10").getChecked()) {
            //set to not checked
            btnMay10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May10.setChecked(false);
            trackerHashMap.replace("btnMay10",May10);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay10.setStyle("-fx-background-color: #CE2029");
            May10.setChecked(true);
            trackerHashMap.replace("btnMay10",May10);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May11Clicked(){
        if (trackerHashMap.get("btnMay11").getChecked()) {
            //set to not checked
            btnMay11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May11.setChecked(false);
            trackerHashMap.replace("btnMay11",May11);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay11.setStyle("-fx-background-color: #CE2029");
            May11.setChecked(true);
            trackerHashMap.replace("btnMay11",May11);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May12Clicked(){
        if (trackerHashMap.get("btnMay12").getChecked()) {
            //set to not checked
            btnMay12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May12.setChecked(false);
            trackerHashMap.replace("btnMay12",May12);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay12.setStyle("-fx-background-color: #CE2029");
            May12.setChecked(true);
            trackerHashMap.replace("btnMay12",May12);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May13Clicked(){
        if (trackerHashMap.get("btnMay13").getChecked()) {
            //set to not checked
            btnMay13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May13.setChecked(false);
            trackerHashMap.replace("btnMay13",May13);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay13.setStyle("-fx-background-color: #CE2029");
            May13.setChecked(true);
            trackerHashMap.replace("btnMay13",May13);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May14Clicked(){
        if (trackerHashMap.get("btnMay14").getChecked()) {
            //set to not checked
            btnMay14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May14.setChecked(false);
            trackerHashMap.replace("btnMay14",May14);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay14.setStyle("-fx-background-color: #CE2029");
            May14.setChecked(true);
            trackerHashMap.replace("btnMay14",May14);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May15Clicked(){
        if (trackerHashMap.get("btnMay15").getChecked()) {
            //set to not checked
            btnMay15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May15.setChecked(false);
            trackerHashMap.replace("btnMay15",May15);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay15.setStyle("-fx-background-color: #CE2029");
            May15.setChecked(true);
            trackerHashMap.replace("btnMay15",May15);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May16Clicked(){
        if (trackerHashMap.get("btnMay16").getChecked()) {
            //set to not checked
            btnMay16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May16.setChecked(false);
            trackerHashMap.replace("btnMay16",May16);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay16.setStyle("-fx-background-color: #CE2029");
            May16.setChecked(true);
            trackerHashMap.replace("btnMay16",May16);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May17Clicked(){
        if (trackerHashMap.get("btnMay17").getChecked()) {
            //set to not checked
            btnMay17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May17.setChecked(false);
            trackerHashMap.replace("btnMay17",May17);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay17.setStyle("-fx-background-color: #CE2029");
            May17.setChecked(true);
            trackerHashMap.replace("btnMay17",May17);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May18Clicked(){
        if (trackerHashMap.get("btnMay18").getChecked()) {
            //set to not checked
            btnMay18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May18.setChecked(false);
            trackerHashMap.replace("btnMay18",May18);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay18.setStyle("-fx-background-color: #CE2029");
            May18.setChecked(true);
            trackerHashMap.replace("btnMay18",May18);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May19Clicked(){
        if (trackerHashMap.get("btnMay19").getChecked()) {
            //set to not checked
            btnMay19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May19.setChecked(false);
            trackerHashMap.replace("btnMay19",May19);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay19.setStyle("-fx-background-color: #CE2029");
            May19.setChecked(true);
            trackerHashMap.replace("btnMay19",May19);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May20Clicked(){
        if (trackerHashMap.get("btnMay20").getChecked()) {
            //set to not checked
            btnMay20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May20.setChecked(false);
            trackerHashMap.replace("btnMay20",May20);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay20.setStyle("-fx-background-color: #CE2029");
            May20.setChecked(true);
            trackerHashMap.replace("btnMay20",May20);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May21Clicked(){
        if (trackerHashMap.get("btnMay21").getChecked()) {
            //set to not checked
            btnMay21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May21.setChecked(false);
            trackerHashMap.replace("btnMay21",May21);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay21.setStyle("-fx-background-color: #CE2029");
            May21.setChecked(true);
            trackerHashMap.replace("btnMay21",May21);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May22Clicked(){
        if (trackerHashMap.get("btnMay22").getChecked()) {
            //set to not checked
            btnMay22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May22.setChecked(false);
            trackerHashMap.replace("btnMay22",May22);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay22.setStyle("-fx-background-color: #CE2029");
            May22.setChecked(true);
            trackerHashMap.replace("btnMay22",May22);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May23Clicked(){
        if (trackerHashMap.get("btnMay23").getChecked()) {
            //set to not checked
            btnMay23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May23.setChecked(false);
            trackerHashMap.replace("btnMay23",May23);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay23.setStyle("-fx-background-color: #CE2029");
            May23.setChecked(true);
            trackerHashMap.replace("btnMay23",May23);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May24Clicked(){
        if (trackerHashMap.get("btnMay24").getChecked()) {
            //set to not checked
            btnMay24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May24.setChecked(false);
            trackerHashMap.replace("btnMay24",May24);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay24.setStyle("-fx-background-color: #CE2029");
            May24.setChecked(true);
            trackerHashMap.replace("btnMay24",May24);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May25Clicked(){
        if (trackerHashMap.get("btnMay25").getChecked()) {
            //set to not checked
            btnMay25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May25.setChecked(false);
            trackerHashMap.replace("btnMay25",May25);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay25.setStyle("-fx-background-color: #CE2029");
            May25.setChecked(true);
            trackerHashMap.replace("btnMay25",May25);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May26Clicked(){
        if (trackerHashMap.get("btnMay26").getChecked()) {
            //set to not checked
            btnMay26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May26.setChecked(false);
            trackerHashMap.replace("btnMay26",May26);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay26.setStyle("-fx-background-color: #CE2029");
            May26.setChecked(true);
            trackerHashMap.replace("btnMay26",May26);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May27Clicked(){
        if (trackerHashMap.get("btnMay27").getChecked()) {
            //set to not checked
            btnMay27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May27.setChecked(false);
            trackerHashMap.replace("btnMay27",May27);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay27.setStyle("-fx-background-color: #CE2029");
            May27.setChecked(true);
            trackerHashMap.replace("btnMay27",May27);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May28Clicked(){
        if (trackerHashMap.get("btnMay28").getChecked()) {
            //set to not checked
            btnMay28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May28.setChecked(false);
            trackerHashMap.replace("btnMay28",May28);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay28.setStyle("-fx-background-color: #CE2029");
            May28.setChecked(true);
            trackerHashMap.replace("btnMay28",May28);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May29Clicked(){
        if (trackerHashMap.get("btnMay29").getChecked()) {
            //set to not checked
            btnMay29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May29.setChecked(false);
            trackerHashMap.replace("btnMay29",May29);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay29.setStyle("-fx-background-color: #CE2029");
            May29.setChecked(true);
            trackerHashMap.replace("btnMay29",May29);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May30Clicked(){
        if (trackerHashMap.get("btnMay30").getChecked()) {
            //set to not checked
            btnMay30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May30.setChecked(false);
            trackerHashMap.replace("btnMay30",May30);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay30.setStyle("-fx-background-color: #CE2029");
            May30.setChecked(true);
            trackerHashMap.replace("btnMay30",May30);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
    @FXML
    private void May31Clicked(){
        if (trackerHashMap.get("btnMay31").getChecked()) {
            //set to not checked
            btnMay31.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            May31.setChecked(false);
            trackerHashMap.replace("btnMay31",May31);
            fileOut.saveHashmapMay(trackerHashMap);
        } else {
            //set to checked
            btnMay31.setStyle("-fx-background-color: #CE2029");
            May31.setChecked(true);
            trackerHashMap.replace("btnMay31",May31);
            fileOut.saveHashmapMay(trackerHashMap);
        }
    }
}
