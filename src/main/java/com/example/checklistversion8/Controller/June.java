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

public class June implements Initializable {
    public Button btnJune1;
    public Button btnJune2;
    public Button btnJune3;
    public Button btnJune4;
    public Button btnJune5;
    public Button btnJune6;
    public Button btnJune7;
    public Button btnJune8;
    public Button btnJune9;
    public Button btnJune10;
    public Button btnJune11;
    public Button btnJune12;
    public Button btnJune13;
    public Button btnJune14;
    public Button btnJune15;
    public Button btnJune16;
    public Button btnJune17;
    public Button btnJune18;
    public Button btnJune19;
    public Button btnJune20;
    public Button btnJune21;
    public Button btnJune22;
    public Button btnJune23;
    public Button btnJune24;
    public Button btnJune25;
    public Button btnJune26;
    public Button btnJune27;
    public Button btnJune28;
    public Button btnJune29;
    public Button btnJune30;
    public Button btnJune31;

    private Tracker June1 = new Tracker("btnJune1");
    private Tracker June2 = new Tracker("btnJune2");
    private Tracker June3 = new Tracker("btnJune3");
    private Tracker June4 = new Tracker("btnJune4");
    private Tracker June5 = new Tracker("btnJune5");
    private Tracker June6= new Tracker("btnJune6");
    private Tracker June7= new Tracker("btnJune7");
    private Tracker June8= new Tracker("btnJune8");
    private Tracker June9= new Tracker("btnJune9");
    private Tracker June10= new Tracker("btnJune10");
    private Tracker June11= new Tracker("btnJune11");
    private Tracker June12= new Tracker("btnJune12");
    private Tracker June13= new Tracker("btnJune13");
    private Tracker June14= new Tracker("btnJune14");
    private Tracker June15= new Tracker("btnJune15");
    private Tracker June16= new Tracker("btnJune16");
    private Tracker June17= new Tracker("btnJune17");
    private Tracker June18= new Tracker("btnJune18");
    private Tracker June19= new Tracker("btnJune19");
    private Tracker June20= new Tracker("btnJune20");
    private Tracker June21= new Tracker("btnJune21");
    private Tracker June22= new Tracker("btnJune22");
    private Tracker June23= new Tracker("btnJune23");
    private Tracker June24= new Tracker("btnJune24");
    private Tracker June25= new Tracker("btnJune25");
    private Tracker June26= new Tracker("btnJune26");
    private Tracker June27= new Tracker("btnJune27");
    private Tracker June28= new Tracker("btnJune28");
    private Tracker June29= new Tracker("btnJune29");
    private Tracker June30= new Tracker("btnJune30");
    private Tracker June31= new Tracker("btnJune31");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMap = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttons.add(btnJune1);
        buttons.add(btnJune2);
        buttons.add(btnJune3);
        buttons.add(btnJune4);
        buttons.add(btnJune5);
        buttons.add(btnJune6);
        buttons.add(btnJune7);
        buttons.add(btnJune8);
        buttons.add(btnJune9);
        buttons.add(btnJune10);
        buttons.add(btnJune11);
        buttons.add(btnJune12);
        buttons.add(btnJune13);
        buttons.add(btnJune14);
        buttons.add(btnJune15);
        buttons.add(btnJune16);
        buttons.add(btnJune17);
        buttons.add(btnJune18);
        buttons.add(btnJune19);
        buttons.add(btnJune20);
        buttons.add(btnJune21);
        buttons.add(btnJune22);
        buttons.add(btnJune23);
        buttons.add(btnJune24);
        buttons.add(btnJune25);
        buttons.add(btnJune26);
        buttons.add(btnJune27);
        buttons.add(btnJune28);
        buttons.add(btnJune29);
        buttons.add(btnJune30);

        trackerHashMap.put("btnJune1",June1);
        trackerHashMap.put("btnJune2",June2);
        trackerHashMap.put("btnJune3",June3);
        trackerHashMap.put("btnJune4",June4);
        trackerHashMap.put("btnJune5",June5);
        trackerHashMap.put("btnJune6",June6);
        trackerHashMap.put("btnJune7",June7);
        trackerHashMap.put("btnJune8",June8);
        trackerHashMap.put("btnJune9",June9);
        trackerHashMap.put("btnJune10",June10);
        trackerHashMap.put("btnJune11",June11);
        trackerHashMap.put("btnJune12",June12);
        trackerHashMap.put("btnJune13",June13);
        trackerHashMap.put("btnJune14",June14);
        trackerHashMap.put("btnJune15",June15);
        trackerHashMap.put("btnJune16",June16);
        trackerHashMap.put("btnJune17",June17);
        trackerHashMap.put("btnJune18",June18);
        trackerHashMap.put("btnJune19",June19);
        trackerHashMap.put("btnJune20",June20);
        trackerHashMap.put("btnJune21",June21);
        trackerHashMap.put("btnJune22",June22);
        trackerHashMap.put("btnJune23",June23);
        trackerHashMap.put("btnJune24",June24);
        trackerHashMap.put("btnJune25",June25);
        trackerHashMap.put("btnJune26",June26);
        trackerHashMap.put("btnJune27",June27);
        trackerHashMap.put("btnJune28",June28);
        trackerHashMap.put("btnJune29",June29);
        trackerHashMap.put("btnJune30",June30);


        File file = new File("/fileJune.ser");


        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapJune();
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
    private void June1Clicked(){
        if(trackerHashMap.get("btnJune1").getChecked()){
            btnJune1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June1.setChecked(false);
            trackerHashMap.replace("btnJune1",June1);
            fileOut.saveHashmapJune(trackerHashMap);
        }else{
            btnJune1.setStyle("-fx-background-color: #CE2029");
            June1.setChecked(true);
            trackerHashMap.replace("btnJune1",June1);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June2Clicked(){
        if (trackerHashMap.get("btnJune2").getChecked()) {
            //set to not checked
            btnJune2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June2.setChecked(false);
            trackerHashMap.replace("btnJune2",June2);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune2.setStyle("-fx-background-color: #CE2029");
            June2.setChecked(true);
            trackerHashMap.replace("btnJune2",June2);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }

    @FXML
    private void June3Clicked(){
        if (trackerHashMap.get("btnJune3").getChecked()) {
            //set to not checked
            btnJune3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June3.setChecked(false);
            trackerHashMap.replace("btnJune3",June3);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune3.setStyle("-fx-background-color: #CE2029");
            June3.setChecked(true);
            trackerHashMap.replace("btnJune3",June3);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }

    @FXML
    private void June4Clicked(){
        if (trackerHashMap.get("btnJune4").getChecked()) {
            //set to not checked
            btnJune4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June4.setChecked(false);
            trackerHashMap.replace("btnJune4",June4);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune4.setStyle("-fx-background-color: #CE2029");
            June4.setChecked(true);
            trackerHashMap.replace("btnJune4",June4);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June5Clicked(){
        if (trackerHashMap.get("btnJune5").getChecked()) {
            //set to not checked
            btnJune5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June5.setChecked(false);
            trackerHashMap.replace("btnJune5",June5);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune5.setStyle("-fx-background-color: #CE2029");
            June5.setChecked(true);
            trackerHashMap.replace("btnJune5",June5);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June6Clicked(){
        if (trackerHashMap.get("btnJune6").getChecked()) {
            //set to not checked
            btnJune6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June6.setChecked(false);
            trackerHashMap.replace("btnJune6",June6);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune6.setStyle("-fx-background-color: #CE2029");
            June6.setChecked(true);
            trackerHashMap.replace("btnJune6",June6);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June7Clicked(){
        if (trackerHashMap.get("btnJune7").getChecked()) {
            //set to not checked
            btnJune7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June7.setChecked(false);
            trackerHashMap.replace("btnJune7",June7);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune7.setStyle("-fx-background-color: #CE2029");
            June7.setChecked(true);
            trackerHashMap.replace("btnJune7",June7);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June8Clicked(){
        if (trackerHashMap.get("btnJune8").getChecked()) {
            //set to not checked
            btnJune8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June8.setChecked(false);
            trackerHashMap.replace("btnJune8",June8);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune8.setStyle("-fx-background-color: #CE2029");
            June8.setChecked(true);
            trackerHashMap.replace("btnJune8",June8);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June9Clicked(){
        if (trackerHashMap.get("btnJune9").getChecked()) {
            //set to not checked
            btnJune9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June9.setChecked(false);
            trackerHashMap.replace("btnJune9",June9);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune9.setStyle("-fx-background-color: #CE2029");
            June9.setChecked(true);
            trackerHashMap.replace("btnJune9",June9);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June10Clicked(){
        if (trackerHashMap.get("btnJune10").getChecked()) {
            //set to not checked
            btnJune10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June10.setChecked(false);
            trackerHashMap.replace("btnJune10",June10);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune10.setStyle("-fx-background-color: #CE2029");
            June10.setChecked(true);
            trackerHashMap.replace("btnJune10",June10);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June11Clicked(){
        if (trackerHashMap.get("btnJune11").getChecked()) {
            //set to not checked
            btnJune11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June11.setChecked(false);
            trackerHashMap.replace("btnJune11",June11);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune11.setStyle("-fx-background-color: #CE2029");
            June11.setChecked(true);
            trackerHashMap.replace("btnJune11",June11);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June12Clicked(){
        if (trackerHashMap.get("btnJune12").getChecked()) {
            //set to not checked
            btnJune12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June12.setChecked(false);
            trackerHashMap.replace("btnJune12",June12);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune12.setStyle("-fx-background-color: #CE2029");
            June12.setChecked(true);
            trackerHashMap.replace("btnJune12",June12);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June13Clicked(){
        if (trackerHashMap.get("btnJune13").getChecked()) {
            //set to not checked
            btnJune13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June13.setChecked(false);
            trackerHashMap.replace("btnJune13",June13);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune13.setStyle("-fx-background-color: #CE2029");
            June13.setChecked(true);
            trackerHashMap.replace("btnJune13",June13);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June14Clicked(){
        if (trackerHashMap.get("btnJune14").getChecked()) {
            //set to not checked
            btnJune14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June14.setChecked(false);
            trackerHashMap.replace("btnJune14",June14);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune14.setStyle("-fx-background-color: #CE2029");
            June14.setChecked(true);
            trackerHashMap.replace("btnJune14",June14);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June15Clicked(){
        if (trackerHashMap.get("btnJune15").getChecked()) {
            //set to not checked
            btnJune15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June15.setChecked(false);
            trackerHashMap.replace("btnJune15",June15);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune15.setStyle("-fx-background-color: #CE2029");
            June15.setChecked(true);
            trackerHashMap.replace("btnJune15",June15);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June16Clicked(){
        if (trackerHashMap.get("btnJune16").getChecked()) {
            //set to not checked
            btnJune16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June16.setChecked(false);
            trackerHashMap.replace("btnJune16",June16);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune16.setStyle("-fx-background-color: #CE2029");
            June16.setChecked(true);
            trackerHashMap.replace("btnJune16",June16);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June17Clicked(){
        if (trackerHashMap.get("btnJune17").getChecked()) {
            //set to not checked
            btnJune17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June17.setChecked(false);
            trackerHashMap.replace("btnJune17",June17);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune17.setStyle("-fx-background-color: #CE2029");
            June17.setChecked(true);
            trackerHashMap.replace("btnJune17",June17);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June18Clicked(){
        if (trackerHashMap.get("btnJune18").getChecked()) {
            //set to not checked
            btnJune18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June18.setChecked(false);
            trackerHashMap.replace("btnJune18",June18);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune18.setStyle("-fx-background-color: #CE2029");
            June18.setChecked(true);
            trackerHashMap.replace("btnJune18",June18);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June19Clicked(){
        if (trackerHashMap.get("btnJune19").getChecked()) {
            //set to not checked
            btnJune19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June19.setChecked(false);
            trackerHashMap.replace("btnJune19",June19);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune19.setStyle("-fx-background-color: #CE2029");
            June19.setChecked(true);
            trackerHashMap.replace("btnJune19",June19);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June20Clicked(){
        if (trackerHashMap.get("btnJune20").getChecked()) {
            //set to not checked
            btnJune20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June20.setChecked(false);
            trackerHashMap.replace("btnJune20",June20);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune20.setStyle("-fx-background-color: #CE2029");
            June20.setChecked(true);
            trackerHashMap.replace("btnJune20",June20);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June21Clicked(){
        if (trackerHashMap.get("btnJune21").getChecked()) {
            //set to not checked
            btnJune21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June21.setChecked(false);
            trackerHashMap.replace("btnJune21",June21);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune21.setStyle("-fx-background-color: #CE2029");
            June21.setChecked(true);
            trackerHashMap.replace("btnJune21",June21);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June22Clicked(){
        if (trackerHashMap.get("btnJune22").getChecked()) {
            //set to not checked
            btnJune22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June22.setChecked(false);
            trackerHashMap.replace("btnJune22",June22);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune22.setStyle("-fx-background-color: #CE2029");
            June22.setChecked(true);
            trackerHashMap.replace("btnJune22",June22);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June23Clicked(){
        if (trackerHashMap.get("btnJune23").getChecked()) {
            //set to not checked
            btnJune23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June23.setChecked(false);
            trackerHashMap.replace("btnJune23",June23);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune23.setStyle("-fx-background-color: #CE2029");
            June23.setChecked(true);
            trackerHashMap.replace("btnJune23",June23);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June24Clicked(){
        if (trackerHashMap.get("btnJune24").getChecked()) {
            //set to not checked
            btnJune24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June24.setChecked(false);
            trackerHashMap.replace("btnJune24",June24);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune24.setStyle("-fx-background-color: #CE2029");
            June24.setChecked(true);
            trackerHashMap.replace("btnJune24",June24);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June25Clicked(){
        if (trackerHashMap.get("btnJune25").getChecked()) {
            //set to not checked
            btnJune25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June25.setChecked(false);
            trackerHashMap.replace("btnJune25",June25);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune25.setStyle("-fx-background-color: #CE2029");
            June25.setChecked(true);
            trackerHashMap.replace("btnJune25",June25);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June26Clicked(){
        if (trackerHashMap.get("btnJune26").getChecked()) {
            //set to not checked
            btnJune26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June26.setChecked(false);
            trackerHashMap.replace("btnJune26",June26);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune26.setStyle("-fx-background-color: #CE2029");
            June26.setChecked(true);
            trackerHashMap.replace("btnJune26",June26);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June27Clicked(){
        if (trackerHashMap.get("btnJune27").getChecked()) {
            //set to not checked
            btnJune27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June27.setChecked(false);
            trackerHashMap.replace("btnJune27",June27);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune27.setStyle("-fx-background-color: #CE2029");
            June27.setChecked(true);
            trackerHashMap.replace("btnJune27",June27);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June28Clicked(){
        if (trackerHashMap.get("btnJune28").getChecked()) {
            //set to not checked
            btnJune28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June28.setChecked(false);
            trackerHashMap.replace("btnJune28",June28);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune28.setStyle("-fx-background-color: #CE2029");
            June28.setChecked(true);
            trackerHashMap.replace("btnJune28",June28);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June29Clicked(){
        if (trackerHashMap.get("btnJune29").getChecked()) {
            //set to not checked
            btnJune29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June29.setChecked(false);
            trackerHashMap.replace("btnJune29",June29);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune29.setStyle("-fx-background-color: #CE2029");
            June29.setChecked(true);
            trackerHashMap.replace("btnJune29",June29);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
    @FXML
    private void June30Clicked(){
        if (trackerHashMap.get("btnJune30").getChecked()) {
            //set to not checked
            btnJune30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            June30.setChecked(false);
            trackerHashMap.replace("btnJune30",June30);
            fileOut.saveHashmapJune(trackerHashMap);
        } else {
            //set to checked
            btnJune30.setStyle("-fx-background-color: #CE2029");
            June30.setChecked(true);
            trackerHashMap.replace("btnJune30",June30);
            fileOut.saveHashmapJune(trackerHashMap);
        }
    }
}
