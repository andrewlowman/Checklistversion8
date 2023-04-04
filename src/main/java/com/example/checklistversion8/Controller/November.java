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

public class November implements Initializable {
    public Button btnNov1;
    public Button btnNov2;
    public Button btnNov3;
    public Button btnNov4;
    public Button btnNov5;
    public Button btnNov6;
    public Button btnNov7;
    public Button btnNov8;
    public Button btnNov9;
    public Button btnNov10;
    public Button btnNov11;
    public Button btnNov12;
    public Button btnNov13;
    public Button btnNov14;
    public Button btnNov15;
    public Button btnNov16;
    public Button btnNov17;
    public Button btnNov18;
    public Button btnNov19;
    public Button btnNov20;
    public Button btnNov21;
    public Button btnNov22;
    public Button btnNov23;
    public Button btnNov24;
    public Button btnNov25;
    public Button btnNov26;
    public Button btnNov27;
    public Button btnNov28;
    public Button btnNov29;
    public Button btnNov30;

    private Tracker Nov1 = new Tracker("btnNov1");
    private Tracker Nov2 = new Tracker("btnNov2");
    private Tracker Nov3 = new Tracker("btnNov3");
    private Tracker Nov4 = new Tracker("btnNov4");
    private Tracker Nov5 = new Tracker("btnNov5");
    private Tracker Nov6= new Tracker("btnNov6");
    private Tracker Nov7= new Tracker("btnNov7");
    private Tracker Nov8= new Tracker("btnNov8");
    private Tracker Nov9= new Tracker("btnNov9");
    private Tracker Nov10= new Tracker("btnNov10");
    private Tracker Nov11= new Tracker("btnNov11");
    private Tracker Nov12= new Tracker("btnNov12");
    private Tracker Nov13= new Tracker("btnNov13");
    private Tracker Nov14= new Tracker("btnNov14");
    private Tracker Nov15= new Tracker("btnNov15");
    private Tracker Nov16= new Tracker("btnNov16");
    private Tracker Nov17= new Tracker("btnNov17");
    private Tracker Nov18= new Tracker("btnNov18");
    private Tracker Nov19= new Tracker("btnNov19");
    private Tracker Nov20= new Tracker("btnNov20");
    private Tracker Nov21= new Tracker("btnNov21");
    private Tracker Nov22= new Tracker("btnNov22");
    private Tracker Nov23= new Tracker("btnNov23");
    private Tracker Nov24= new Tracker("btnNov24");
    private Tracker Nov25= new Tracker("btnNov25");
    private Tracker Nov26= new Tracker("btnNov26");
    private Tracker Nov27= new Tracker("btnNov27");
    private Tracker Nov28= new Tracker("btnNov28");
    private Tracker Nov29= new Tracker("btnNov29");
    private Tracker Nov30= new Tracker("btnNov30");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMap = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttons.add(btnNov1);
        buttons.add(btnNov2);
        buttons.add(btnNov3);
        buttons.add(btnNov4);
        buttons.add(btnNov5);
        buttons.add(btnNov6);
        buttons.add(btnNov7);
        buttons.add(btnNov8);
        buttons.add(btnNov9);
        buttons.add(btnNov10);
        buttons.add(btnNov11);
        buttons.add(btnNov12);
        buttons.add(btnNov13);
        buttons.add(btnNov14);
        buttons.add(btnNov15);
        buttons.add(btnNov16);
        buttons.add(btnNov17);
        buttons.add(btnNov18);
        buttons.add(btnNov19);
        buttons.add(btnNov20);
        buttons.add(btnNov21);
        buttons.add(btnNov22);
        buttons.add(btnNov23);
        buttons.add(btnNov24);
        buttons.add(btnNov25);
        buttons.add(btnNov26);
        buttons.add(btnNov27);
        buttons.add(btnNov28);
        buttons.add(btnNov29);
        buttons.add(btnNov30);

        trackerHashMap.put("btnNov1",Nov1);
        trackerHashMap.put("btnNov2",Nov2);
        trackerHashMap.put("btnNov3",Nov3);
        trackerHashMap.put("btnNov4",Nov4);
        trackerHashMap.put("btnNov5",Nov5);
        trackerHashMap.put("btnNov6",Nov6);
        trackerHashMap.put("btnNov7",Nov7);
        trackerHashMap.put("btnNov8",Nov8);
        trackerHashMap.put("btnNov9",Nov9);
        trackerHashMap.put("btnNov10",Nov10);
        trackerHashMap.put("btnNov11",Nov11);
        trackerHashMap.put("btnNov12",Nov12);
        trackerHashMap.put("btnNov13",Nov13);
        trackerHashMap.put("btnNov14",Nov14);
        trackerHashMap.put("btnNov15",Nov15);
        trackerHashMap.put("btnNov16",Nov16);
        trackerHashMap.put("btnNov17",Nov17);
        trackerHashMap.put("btnNov18",Nov18);
        trackerHashMap.put("btnNov19",Nov19);
        trackerHashMap.put("btnNov20",Nov20);
        trackerHashMap.put("btnNov21",Nov21);
        trackerHashMap.put("btnNov22",Nov22);
        trackerHashMap.put("btnNov23",Nov23);
        trackerHashMap.put("btnNov24",Nov24);
        trackerHashMap.put("btnNov25",Nov25);
        trackerHashMap.put("btnNov26",Nov26);
        trackerHashMap.put("btnNov27",Nov27);
        trackerHashMap.put("btnNov28",Nov28);
        trackerHashMap.put("btnNov29",Nov29);
        trackerHashMap.put("btnNov30",Nov30);

        File file = new File("/fileNov.ser");


        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapNov();
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
    private void Nov1Clicked(){
        if(trackerHashMap.get("btnNov1").getChecked()){
            btnNov1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov1.setChecked(false);
            trackerHashMap.replace("btnNov1",Nov1);
            fileOut.saveHashmapNov(trackerHashMap);
        }else{
            btnNov1.setStyle("-fx-background-color: #CE2029");
            Nov1.setChecked(true);
            trackerHashMap.replace("btnNov1",Nov1);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov2Clicked(){
        if (trackerHashMap.get("btnNov2").getChecked()) {
            //set to not checked
            btnNov2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov2.setChecked(false);
            trackerHashMap.replace("btnNov2",Nov2);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov2.setStyle("-fx-background-color: #CE2029");
            Nov2.setChecked(true);
            trackerHashMap.replace("btnNov2",Nov2);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }

    @FXML
    private void Nov3Clicked(){
        if (trackerHashMap.get("btnNov3").getChecked()) {
            //set to not checked
            btnNov3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov3.setChecked(false);
            trackerHashMap.replace("btnNov3",Nov3);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov3.setStyle("-fx-background-color: #CE2029");
            Nov3.setChecked(true);
            trackerHashMap.replace("btnNov3",Nov3);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }

    @FXML
    private void Nov4Clicked(){
        if (trackerHashMap.get("btnNov4").getChecked()) {
            //set to not checked
            btnNov4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov4.setChecked(false);
            trackerHashMap.replace("btnNov4",Nov4);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov4.setStyle("-fx-background-color: #CE2029");
            Nov4.setChecked(true);
            trackerHashMap.replace("btnNov4",Nov4);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov5Clicked(){
        if (trackerHashMap.get("btnNov5").getChecked()) {
            //set to not checked
            btnNov5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov5.setChecked(false);
            trackerHashMap.replace("btnNov5",Nov5);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov5.setStyle("-fx-background-color: #CE2029");
            Nov5.setChecked(true);
            trackerHashMap.replace("btnNov5",Nov5);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov6Clicked(){
        if (trackerHashMap.get("btnNov6").getChecked()) {
            //set to not checked
            btnNov6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov6.setChecked(false);
            trackerHashMap.replace("btnNov6",Nov6);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov6.setStyle("-fx-background-color: #CE2029");
            Nov6.setChecked(true);
            trackerHashMap.replace("btnNov6",Nov6);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov7Clicked(){
        if (trackerHashMap.get("btnNov7").getChecked()) {
            //set to not checked
            btnNov7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov7.setChecked(false);
            trackerHashMap.replace("btnNov7",Nov7);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov7.setStyle("-fx-background-color: #CE2029");
            Nov7.setChecked(true);
            trackerHashMap.replace("btnNov7",Nov7);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov8Clicked(){
        if (trackerHashMap.get("btnNov8").getChecked()) {
            //set to not checked
            btnNov8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov8.setChecked(false);
            trackerHashMap.replace("btnNov8",Nov8);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov8.setStyle("-fx-background-color: #CE2029");
            Nov8.setChecked(true);
            trackerHashMap.replace("btnNov8",Nov8);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov9Clicked(){
        if (trackerHashMap.get("btnNov9").getChecked()) {
            //set to not checked
            btnNov9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov9.setChecked(false);
            trackerHashMap.replace("btnNov9",Nov9);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov9.setStyle("-fx-background-color: #CE2029");
            Nov9.setChecked(true);
            trackerHashMap.replace("btnNov9",Nov9);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov10Clicked(){
        if (trackerHashMap.get("btnNov10").getChecked()) {
            //set to not checked
            btnNov10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov10.setChecked(false);
            trackerHashMap.replace("btnNov10",Nov10);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov10.setStyle("-fx-background-color: #CE2029");
            Nov10.setChecked(true);
            trackerHashMap.replace("btnNov10",Nov10);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov11Clicked(){
        if (trackerHashMap.get("btnNov11").getChecked()) {
            //set to not checked
            btnNov11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov11.setChecked(false);
            trackerHashMap.replace("btnNov11",Nov11);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov11.setStyle("-fx-background-color: #CE2029");
            Nov11.setChecked(true);
            trackerHashMap.replace("btnNov11",Nov11);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov12Clicked(){
        if (trackerHashMap.get("btnNov12").getChecked()) {
            //set to not checked
            btnNov12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov12.setChecked(false);
            trackerHashMap.replace("btnNov12",Nov12);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov12.setStyle("-fx-background-color: #CE2029");
            Nov12.setChecked(true);
            trackerHashMap.replace("btnNov12",Nov12);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov13Clicked(){
        if (trackerHashMap.get("btnNov13").getChecked()) {
            //set to not checked
            btnNov13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov13.setChecked(false);
            trackerHashMap.replace("btnNov13",Nov13);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov13.setStyle("-fx-background-color: #CE2029");
            Nov13.setChecked(true);
            trackerHashMap.replace("btnNov13",Nov13);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov14Clicked(){
        if (trackerHashMap.get("btnNov14").getChecked()) {
            //set to not checked
            btnNov14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov14.setChecked(false);
            trackerHashMap.replace("btnNov14",Nov14);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov14.setStyle("-fx-background-color: #CE2029");
            Nov14.setChecked(true);
            trackerHashMap.replace("btnNov14",Nov14);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov15Clicked(){
        if (trackerHashMap.get("btnNov15").getChecked()) {
            //set to not checked
            btnNov15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov15.setChecked(false);
            trackerHashMap.replace("btnNov15",Nov15);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov15.setStyle("-fx-background-color: #CE2029");
            Nov15.setChecked(true);
            trackerHashMap.replace("btnNov15",Nov15);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov16Clicked(){
        if (trackerHashMap.get("btnNov16").getChecked()) {
            //set to not checked
            btnNov16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov16.setChecked(false);
            trackerHashMap.replace("btnNov16",Nov16);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov16.setStyle("-fx-background-color: #CE2029");
            Nov16.setChecked(true);
            trackerHashMap.replace("btnNov16",Nov16);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov17Clicked(){
        if (trackerHashMap.get("btnNov17").getChecked()) {
            //set to not checked
            btnNov17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov17.setChecked(false);
            trackerHashMap.replace("btnNov17",Nov17);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov17.setStyle("-fx-background-color: #CE2029");
            Nov17.setChecked(true);
            trackerHashMap.replace("btnNov17",Nov17);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov18Clicked(){
        if (trackerHashMap.get("btnNov18").getChecked()) {
            //set to not checked
            btnNov18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov18.setChecked(false);
            trackerHashMap.replace("btnNov18",Nov18);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov18.setStyle("-fx-background-color: #CE2029");
            Nov18.setChecked(true);
            trackerHashMap.replace("btnNov18",Nov18);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov19Clicked(){
        if (trackerHashMap.get("btnNov19").getChecked()) {
            //set to not checked
            btnNov19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov19.setChecked(false);
            trackerHashMap.replace("btnNov19",Nov19);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov19.setStyle("-fx-background-color: #CE2029");
            Nov19.setChecked(true);
            trackerHashMap.replace("btnNov19",Nov19);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov20Clicked(){
        if (trackerHashMap.get("btnNov20").getChecked()) {
            //set to not checked
            btnNov20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov20.setChecked(false);
            trackerHashMap.replace("btnNov20",Nov20);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov20.setStyle("-fx-background-color: #CE2029");
            Nov20.setChecked(true);
            trackerHashMap.replace("btnNov20",Nov20);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov21Clicked(){
        if (trackerHashMap.get("btnNov21").getChecked()) {
            //set to not checked
            btnNov21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov21.setChecked(false);
            trackerHashMap.replace("btnNov21",Nov21);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov21.setStyle("-fx-background-color: #CE2029");
            Nov21.setChecked(true);
            trackerHashMap.replace("btnNov21",Nov21);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov22Clicked(){
        if (trackerHashMap.get("btnNov22").getChecked()) {
            //set to not checked
            btnNov22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov22.setChecked(false);
            trackerHashMap.replace("btnNov22",Nov22);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov22.setStyle("-fx-background-color: #CE2029");
            Nov22.setChecked(true);
            trackerHashMap.replace("btnNov22",Nov22);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov23Clicked(){
        if (trackerHashMap.get("btnNov23").getChecked()) {
            //set to not checked
            btnNov23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov23.setChecked(false);
            trackerHashMap.replace("btnNov23",Nov23);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov23.setStyle("-fx-background-color: #CE2029");
            Nov23.setChecked(true);
            trackerHashMap.replace("btnNov23",Nov23);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov24Clicked(){
        if (trackerHashMap.get("btnNov24").getChecked()) {
            //set to not checked
            btnNov24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov24.setChecked(false);
            trackerHashMap.replace("btnNov24",Nov24);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov24.setStyle("-fx-background-color: #CE2029");
            Nov24.setChecked(true);
            trackerHashMap.replace("btnNov24",Nov24);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov25Clicked(){
        if (trackerHashMap.get("btnNov25").getChecked()) {
            //set to not checked
            btnNov25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov25.setChecked(false);
            trackerHashMap.replace("btnNov25",Nov25);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov25.setStyle("-fx-background-color: #CE2029");
            Nov25.setChecked(true);
            trackerHashMap.replace("btnNov25",Nov25);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov26Clicked(){
        if (trackerHashMap.get("btnNov26").getChecked()) {
            //set to not checked
            btnNov26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov26.setChecked(false);
            trackerHashMap.replace("btnNov26",Nov26);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov26.setStyle("-fx-background-color: #CE2029");
            Nov26.setChecked(true);
            trackerHashMap.replace("btnNov26",Nov26);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov27Clicked(){
        if (trackerHashMap.get("btnNov27").getChecked()) {
            //set to not checked
            btnNov27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov27.setChecked(false);
            trackerHashMap.replace("btnNov27",Nov27);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov27.setStyle("-fx-background-color: #CE2029");
            Nov27.setChecked(true);
            trackerHashMap.replace("btnNov27",Nov27);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov28Clicked(){
        if (trackerHashMap.get("btnNov28").getChecked()) {
            //set to not checked
            btnNov28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov28.setChecked(false);
            trackerHashMap.replace("btnNov28",Nov28);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov28.setStyle("-fx-background-color: #CE2029");
            Nov28.setChecked(true);
            trackerHashMap.replace("btnNov28",Nov28);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov29Clicked(){
        if (trackerHashMap.get("btnNov29").getChecked()) {
            //set to not checked
            btnNov29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov29.setChecked(false);
            trackerHashMap.replace("btnNov29",Nov29);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov29.setStyle("-fx-background-color: #CE2029");
            Nov29.setChecked(true);
            trackerHashMap.replace("btnNov29",Nov29);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }
    @FXML
    private void Nov30Clicked(){
        if (trackerHashMap.get("btnNov30").getChecked()) {
            //set to not checked
            btnNov30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Nov30.setChecked(false);
            trackerHashMap.replace("btnNov30",Nov30);
            fileOut.saveHashmapNov(trackerHashMap);
        } else {
            //set to checked
            btnNov30.setStyle("-fx-background-color: #CE2029");
            Nov30.setChecked(true);
            trackerHashMap.replace("btnNov30",Nov30);
            fileOut.saveHashmapNov(trackerHashMap);
        }
    }

}
