package com.example.checklistversion8.Controller;

import com.example.checklistversion8.FileIn;
import com.example.checklistversion8.FileOut;
import com.example.checklistversion8.Tracker;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.File;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class February implements Initializable {

    public Button btnFeb1;
    public Button btnFeb2;
    public Button btnFeb3;
    public Button btnFeb4;
    public Button btnFeb5;
    public Button btnFeb6;
    public Button btnFeb7;
    public Button btnFeb8;
    public Button btnFeb9;
    public Button btnFeb10;
    public Button btnFeb11;
    public Button btnFeb12;
    public Button btnFeb13;
    public Button btnFeb14;
    public Button btnFeb15;
    public Button btnFeb16;
    public Button btnFeb17;
    public Button btnFeb18;
    public Button btnFeb19;
    public Button btnFeb20;
    public Button btnFeb21;
    public Button btnFeb22;
    public Button btnFeb23;
    public Button btnFeb24;
    public Button btnFeb25;
    public Button btnFeb26;
    public Button btnFeb27;
    public Button btnFeb28;
    public Button btnFeb29;

    private Tracker Feb1 = new Tracker("btnFeb1");
    private Tracker Feb2 = new Tracker("btnFeb2");
    private Tracker Feb3 = new Tracker("btnFeb3");
    private Tracker Feb4 = new Tracker("btnFeb4");
    private Tracker Feb5 = new Tracker("btnFeb5");
    private Tracker Feb6= new Tracker("btnFeb6");
    private Tracker Feb7= new Tracker("btnFeb7");
    private Tracker Feb8= new Tracker("btnFeb8");
    private Tracker Feb9= new Tracker("btnFeb9");
    private Tracker Feb10= new Tracker("btnFeb10");
    private Tracker Feb11= new Tracker("btnFeb11");
    private Tracker Feb12= new Tracker("btnFeb12");
    private Tracker Feb13= new Tracker("btnFeb13");
    private Tracker Feb14= new Tracker("btnFeb14");
    private Tracker Feb15= new Tracker("btnFeb15");
    private Tracker Feb16= new Tracker("btnFeb16");
    private Tracker Feb17= new Tracker("btnFeb17");
    private Tracker Feb18= new Tracker("btnFeb18");
    private Tracker Feb19= new Tracker("btnFeb19");
    private Tracker Feb20= new Tracker("btnFeb20");
    private Tracker Feb21= new Tracker("btnFeb21");
    private Tracker Feb22= new Tracker("btnFeb22");
    private Tracker Feb23= new Tracker("btnFeb23");
    private Tracker Feb24= new Tracker("btnFeb24");
    private Tracker Feb25= new Tracker("btnFeb25");
    private Tracker Feb26= new Tracker("btnFeb26");
    private Tracker Feb27= new Tracker("btnFeb27");
    private Tracker Feb28= new Tracker("btnFeb28");
    private Tracker Feb29= new Tracker("btnFeb29");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    //private Tracker[] trackers = new Tracker[30];
    //private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttonsFeb = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMapFeb = new HashMap<>();
    //use hashmap

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttonsFeb.add(btnFeb1);
        buttonsFeb.add(btnFeb2);
        buttonsFeb.add(btnFeb3);
        buttonsFeb.add(btnFeb4);
        buttonsFeb.add(btnFeb5);
        buttonsFeb.add(btnFeb6);
        buttonsFeb.add(btnFeb7);
        buttonsFeb.add(btnFeb8);
        buttonsFeb.add(btnFeb9);
        buttonsFeb.add(btnFeb10);
        buttonsFeb.add(btnFeb11);
        buttonsFeb.add(btnFeb12);
        buttonsFeb.add(btnFeb13);
        buttonsFeb.add(btnFeb14);
        buttonsFeb.add(btnFeb15);
        buttonsFeb.add(btnFeb16);
        buttonsFeb.add(btnFeb17);
        buttonsFeb.add(btnFeb18);
        buttonsFeb.add(btnFeb19);
        buttonsFeb.add(btnFeb20);
        buttonsFeb.add(btnFeb21);
        buttonsFeb.add(btnFeb22);
        buttonsFeb.add(btnFeb23);
        buttonsFeb.add(btnFeb24);
        buttonsFeb.add(btnFeb25);
        buttonsFeb.add(btnFeb26);
        buttonsFeb.add(btnFeb27);
        buttonsFeb.add(btnFeb28);
        buttonsFeb.add(btnFeb29);

        trackerHashMapFeb.put("btnFeb1",Feb1);
        trackerHashMapFeb.put("btnFeb2",Feb2);
        trackerHashMapFeb.put("btnFeb3",Feb3);
        trackerHashMapFeb.put("btnFeb4",Feb4);
        trackerHashMapFeb.put("btnFeb5",Feb5);
        trackerHashMapFeb.put("btnFeb6",Feb6);
        trackerHashMapFeb.put("btnFeb7",Feb7);
        trackerHashMapFeb.put("btnFeb8",Feb8);
        trackerHashMapFeb.put("btnFeb9",Feb9);
        trackerHashMapFeb.put("btnFeb10",Feb10);
        trackerHashMapFeb.put("btnFeb11",Feb11);
        trackerHashMapFeb.put("btnFeb12",Feb12);
        trackerHashMapFeb.put("btnFeb13",Feb13);
        trackerHashMapFeb.put("btnFeb14",Feb14);
        trackerHashMapFeb.put("btnFeb15",Feb15);
        trackerHashMapFeb.put("btnFeb16",Feb16);
        trackerHashMapFeb.put("btnFeb17",Feb17);
        trackerHashMapFeb.put("btnFeb18",Feb18);
        trackerHashMapFeb.put("btnFeb19",Feb19);
        trackerHashMapFeb.put("btnFeb20",Feb20);
        trackerHashMapFeb.put("btnFeb21",Feb21);
        trackerHashMapFeb.put("btnFeb22",Feb22);
        trackerHashMapFeb.put("btnFeb23",Feb23);
        trackerHashMapFeb.put("btnFeb24",Feb24);
        trackerHashMapFeb.put("btnFeb25",Feb25);
        trackerHashMapFeb.put("btnFeb26",Feb26);
        trackerHashMapFeb.put("btnFeb27",Feb27);
        trackerHashMapFeb.put("btnFeb28",Feb28);
        trackerHashMapFeb.put("btnFeb29",Feb29);

        if((Year.now().getValue())%4==0){
            btnFeb29.setVisible(false);
        }

        System.out.println(trackerHashMapFeb);

        //System.out.println("Trackers in initialize: " +trackers);
        File file = new File("/fileFeb.ser");

        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapFeb();
            System.out.println("NewHM: " + newHM);
            replaceHashMap(newHM);
            loadbuttonsFebHashMap(trackerHashMapFeb);

        }
    }


    private void loadbuttonsFebHashMap(HashMap<String,Tracker> hm){
        System.out.println("trackerHashMapFeb at start of loadbuttonsFeb: " + trackerHashMapFeb);
        for(Map.Entry<String,Tracker> entry:hm.entrySet()){
            if(entry.getValue().getChecked()){
                findButtonHashMap(entry.getValue().getButtonName());
            }
        }
    }

    private void findButtonHashMap(String name){
        for(Button button:buttonsFeb){
            if(button.getId().equals(name)){
                button.setStyle("-fx-background-color: #CE2029");
            }
        }
    }

    private void replaceHashMap(HashMap<String,Tracker> newHM){
        trackerHashMapFeb.clear();
        for(Map.Entry<String,Tracker> entry: newHM.entrySet()){
            trackerHashMapFeb.put(entry.getKey(), entry.getValue());
        }
    }

    @FXML
    private void Feb1Clicked(){
        if(trackerHashMapFeb.get("btnFeb1").getChecked()){
            btnFeb1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb1.setChecked(false);
            trackerHashMapFeb.replace("btnFeb1",Feb1);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }else{
            btnFeb1.setStyle("-fx-background-color: #CE2029");
            Feb1.setChecked(true);
            trackerHashMapFeb.replace("btnFeb1",Feb1);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb2Clicked(){
        if (trackerHashMapFeb.get("btnFeb2").getChecked()) {
            //set to not checked
            btnFeb2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb2.setChecked(false);
            trackerHashMapFeb.replace("btnFeb2",Feb2);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb2.setStyle("-fx-background-color: #CE2029");
            Feb2.setChecked(true);
            trackerHashMapFeb.replace("btnFeb2",Feb2);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }

    @FXML
    private void Feb3Clicked(){
        if (trackerHashMapFeb.get("btnFeb3").getChecked()) {
            //set to not checked
            btnFeb3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb3.setChecked(false);
            trackerHashMapFeb.replace("btnFeb3",Feb3);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb3.setStyle("-fx-background-color: #CE2029");
            Feb3.setChecked(true);
            trackerHashMapFeb.replace("btnFeb3",Feb3);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }

    @FXML
    private void Feb4Clicked(){
        if (trackerHashMapFeb.get("btnFeb4").getChecked()) {
            //set to not checked
            btnFeb4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb4.setChecked(false);
            trackerHashMapFeb.replace("btnFeb4",Feb4);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb4.setStyle("-fx-background-color: #CE2029");
            Feb4.setChecked(true);
            trackerHashMapFeb.replace("btnFeb4",Feb4);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb5Clicked(){
        if (trackerHashMapFeb.get("btnFeb5").getChecked()) {
            //set to not checked
            btnFeb5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb5.setChecked(false);
            trackerHashMapFeb.replace("btnFeb5",Feb5);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb5.setStyle("-fx-background-color: #CE2029");
            Feb5.setChecked(true);
            trackerHashMapFeb.replace("btnFeb5",Feb5);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb6Clicked(){
        if (trackerHashMapFeb.get("btnFeb6").getChecked()) {
            //set to not checked
            btnFeb6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb6.setChecked(false);
            trackerHashMapFeb.replace("btnFeb6",Feb6);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb6.setStyle("-fx-background-color: #CE2029");
            Feb6.setChecked(true);
            trackerHashMapFeb.replace("btnFeb6",Feb6);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb7Clicked(){
        if (trackerHashMapFeb.get("btnFeb7").getChecked()) {
            //set to not checked
            btnFeb7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb7.setChecked(false);
            trackerHashMapFeb.replace("btnFeb7",Feb7);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb7.setStyle("-fx-background-color: #CE2029");
            Feb7.setChecked(true);
            trackerHashMapFeb.replace("btnFeb7",Feb7);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb8Clicked(){
        if (trackerHashMapFeb.get("btnFeb8").getChecked()) {
            //set to not checked
            btnFeb8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb8.setChecked(false);
            trackerHashMapFeb.replace("btnFeb8",Feb8);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb8.setStyle("-fx-background-color: #CE2029");
            Feb8.setChecked(true);
            trackerHashMapFeb.replace("btnFeb8",Feb8);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb9Clicked(){
        if (trackerHashMapFeb.get("btnFeb9").getChecked()) {
            //set to not checked
            btnFeb9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb9.setChecked(false);
            trackerHashMapFeb.replace("btnFeb9",Feb9);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb9.setStyle("-fx-background-color: #CE2029");
            Feb9.setChecked(true);
            trackerHashMapFeb.replace("btnFeb9",Feb9);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb10Clicked(){
        if (trackerHashMapFeb.get("btnFeb10").getChecked()) {
            //set to not checked
            btnFeb10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb10.setChecked(false);
            trackerHashMapFeb.replace("btnFeb10",Feb10);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb10.setStyle("-fx-background-color: #CE2029");
            Feb10.setChecked(true);
            trackerHashMapFeb.replace("btnFeb10",Feb10);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb11Clicked(){
        if (trackerHashMapFeb.get("btnFeb11").getChecked()) {
            //set to not checked
            btnFeb11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb11.setChecked(false);
            trackerHashMapFeb.replace("btnFeb11",Feb11);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb11.setStyle("-fx-background-color: #CE2029");
            Feb11.setChecked(true);
            trackerHashMapFeb.replace("btnFeb11",Feb11);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb12Clicked(){
        if (trackerHashMapFeb.get("btnFeb12").getChecked()) {
            //set to not checked
            btnFeb12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb12.setChecked(false);
            trackerHashMapFeb.replace("btnFeb12",Feb12);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb12.setStyle("-fx-background-color: #CE2029");
            Feb12.setChecked(true);
            trackerHashMapFeb.replace("btnFeb12",Feb12);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb13Clicked(){
        if (trackerHashMapFeb.get("btnFeb13").getChecked()) {
            //set to not checked
            btnFeb13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb13.setChecked(false);
            trackerHashMapFeb.replace("btnFeb13",Feb13);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb13.setStyle("-fx-background-color: #CE2029");
            Feb13.setChecked(true);
            trackerHashMapFeb.replace("btnFeb13",Feb13);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb14Clicked(){
        if (trackerHashMapFeb.get("btnFeb14").getChecked()) {
            //set to not checked
            btnFeb14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb14.setChecked(false);
            trackerHashMapFeb.replace("btnFeb14",Feb14);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb14.setStyle("-fx-background-color: #CE2029");
            Feb14.setChecked(true);
            trackerHashMapFeb.replace("btnFeb14",Feb14);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb15Clicked(){
        if (trackerHashMapFeb.get("btnFeb15").getChecked()) {
            //set to not checked
            btnFeb15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb15.setChecked(false);
            trackerHashMapFeb.replace("btnFeb15",Feb15);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb15.setStyle("-fx-background-color: #CE2029");
            Feb15.setChecked(true);
            trackerHashMapFeb.replace("btnFeb15",Feb15);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb16Clicked(){
        if (trackerHashMapFeb.get("btnFeb16").getChecked()) {
            //set to not checked
            btnFeb16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb16.setChecked(false);
            trackerHashMapFeb.replace("btnFeb16",Feb16);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb16.setStyle("-fx-background-color: #CE2029");
            Feb16.setChecked(true);
            trackerHashMapFeb.replace("btnFeb16",Feb16);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb17Clicked(){
        if (trackerHashMapFeb.get("btnFeb17").getChecked()) {
            //set to not checked
            btnFeb17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb17.setChecked(false);
            trackerHashMapFeb.replace("btnFeb17",Feb17);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb17.setStyle("-fx-background-color: #CE2029");
            Feb17.setChecked(true);
            trackerHashMapFeb.replace("btnFeb17",Feb17);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb18Clicked(){
        if (trackerHashMapFeb.get("btnFeb18").getChecked()) {
            //set to not checked
            btnFeb18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb18.setChecked(false);
            trackerHashMapFeb.replace("btnFeb18",Feb18);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb18.setStyle("-fx-background-color: #CE2029");
            Feb18.setChecked(true);
            trackerHashMapFeb.replace("btnFeb18",Feb18);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb19Clicked(){
        if (trackerHashMapFeb.get("btnFeb19").getChecked()) {
            //set to not checked
            btnFeb19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb19.setChecked(false);
            trackerHashMapFeb.replace("btnFeb19",Feb19);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb19.setStyle("-fx-background-color: #CE2029");
            Feb19.setChecked(true);
            trackerHashMapFeb.replace("btnFeb19",Feb19);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb20Clicked(){
        if (trackerHashMapFeb.get("btnFeb20").getChecked()) {
            //set to not checked
            btnFeb20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb20.setChecked(false);
            trackerHashMapFeb.replace("btnFeb20",Feb20);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb20.setStyle("-fx-background-color: #CE2029");
            Feb20.setChecked(true);
            trackerHashMapFeb.replace("btnFeb20",Feb20);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb21Clicked(){
        if (trackerHashMapFeb.get("btnFeb21").getChecked()) {
            //set to not checked
            btnFeb21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb21.setChecked(false);
            trackerHashMapFeb.replace("btnFeb21",Feb21);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb21.setStyle("-fx-background-color: #CE2029");
            Feb21.setChecked(true);
            trackerHashMapFeb.replace("btnFeb21",Feb21);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb22Clicked(){
        if (trackerHashMapFeb.get("btnFeb22").getChecked()) {
            //set to not checked
            btnFeb22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb22.setChecked(false);
            trackerHashMapFeb.replace("btnFeb22",Feb22);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb22.setStyle("-fx-background-color: #CE2029");
            Feb22.setChecked(true);
            trackerHashMapFeb.replace("btnFeb22",Feb22);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb23Clicked(){
        if (trackerHashMapFeb.get("btnFeb23").getChecked()) {
            //set to not checked
            btnFeb23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb23.setChecked(false);
            trackerHashMapFeb.replace("btnFeb23",Feb23);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb23.setStyle("-fx-background-color: #CE2029");
            Feb23.setChecked(true);
            trackerHashMapFeb.replace("btnFeb23",Feb23);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb24Clicked(){
        if (trackerHashMapFeb.get("btnFeb24").getChecked()) {
            //set to not checked
            btnFeb24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb24.setChecked(false);
            trackerHashMapFeb.replace("btnFeb24",Feb24);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb24.setStyle("-fx-background-color: #CE2029");
            Feb24.setChecked(true);
            trackerHashMapFeb.replace("btnFeb24",Feb24);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb25Clicked(){
        if (trackerHashMapFeb.get("btnFeb25").getChecked()) {
            //set to not checked
            btnFeb25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb25.setChecked(false);
            trackerHashMapFeb.replace("btnFeb25",Feb25);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb25.setStyle("-fx-background-color: #CE2029");
            Feb25.setChecked(true);
            trackerHashMapFeb.replace("btnFeb25",Feb25);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb26Clicked(){
        if (trackerHashMapFeb.get("btnFeb26").getChecked()) {
            //set to not checked
            btnFeb26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb26.setChecked(false);
            trackerHashMapFeb.replace("btnFeb26",Feb26);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb26.setStyle("-fx-background-color: #CE2029");
            Feb26.setChecked(true);
            trackerHashMapFeb.replace("btnFeb26",Feb26);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb27Clicked(){
        if (trackerHashMapFeb.get("btnFeb27").getChecked()) {
            //set to not checked
            btnFeb27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb27.setChecked(false);
            trackerHashMapFeb.replace("btnFeb27",Feb27);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb27.setStyle("-fx-background-color: #CE2029");
            Feb27.setChecked(true);
            trackerHashMapFeb.replace("btnFeb27",Feb27);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb28Clicked(){
        if (trackerHashMapFeb.get("btnFeb28").getChecked()) {
            //set to not checked
            btnFeb28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb28.setChecked(false);
            trackerHashMapFeb.replace("btnFeb28",Feb28);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb28.setStyle("-fx-background-color: #CE2029");
            Feb28.setChecked(true);
            trackerHashMapFeb.replace("btnFeb28",Feb28);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
    @FXML
    private void Feb29Clicked(){
        if (trackerHashMapFeb.get("btnFeb29").getChecked()) {
            //set to not checked
            btnFeb29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Feb29.setChecked(false);
            trackerHashMapFeb.replace("btnFeb29",Feb29);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        } else {
            //set to checked
            btnFeb29.setStyle("-fx-background-color: #CE2029");
            Feb29.setChecked(true);
            trackerHashMapFeb.replace("btnFeb29",Feb29);
            fileOut.saveHashmapFeb(trackerHashMapFeb);
        }
    }
}
