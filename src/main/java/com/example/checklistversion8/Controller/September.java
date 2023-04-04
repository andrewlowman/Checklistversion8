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

public class September implements Initializable {
    public Button btnSept1;
    public Button btnSept2;
    public Button btnSept3;
    public Button btnSept4;
    public Button btnSept5;
    public Button btnSept6;
    public Button btnSept7;
    public Button btnSept8;
    public Button btnSept9;
    public Button btnSept10;
    public Button btnSept11;
    public Button btnSept12;
    public Button btnSept13;
    public Button btnSept14;
    public Button btnSept15;
    public Button btnSept16;
    public Button btnSept17;
    public Button btnSept18;
    public Button btnSept19;
    public Button btnSept20;
    public Button btnSept21;
    public Button btnSept22;
    public Button btnSept23;
    public Button btnSept24;
    public Button btnSept25;
    public Button btnSept26;
    public Button btnSept27;
    public Button btnSept28;
    public Button btnSept29;
    public Button btnSept30;

    private Tracker Sept1 = new Tracker("btnSept1");
    private Tracker Sept2 = new Tracker("btnSept2");
    private Tracker Sept3 = new Tracker("btnSept3");
    private Tracker Sept4 = new Tracker("btnSept4");
    private Tracker Sept5 = new Tracker("btnSept5");
    private Tracker Sept6= new Tracker("btnSept6");
    private Tracker Sept7= new Tracker("btnSept7");
    private Tracker Sept8= new Tracker("btnSept8");
    private Tracker Sept9= new Tracker("btnSept9");
    private Tracker Sept10= new Tracker("btnSept10");
    private Tracker Sept11= new Tracker("btnSept11");
    private Tracker Sept12= new Tracker("btnSept12");
    private Tracker Sept13= new Tracker("btnSept13");
    private Tracker Sept14= new Tracker("btnSept14");
    private Tracker Sept15= new Tracker("btnSept15");
    private Tracker Sept16= new Tracker("btnSept16");
    private Tracker Sept17= new Tracker("btnSept17");
    private Tracker Sept18= new Tracker("btnSept18");
    private Tracker Sept19= new Tracker("btnSept19");
    private Tracker Sept20= new Tracker("btnSept20");
    private Tracker Sept21= new Tracker("btnSept21");
    private Tracker Sept22= new Tracker("btnSept22");
    private Tracker Sept23= new Tracker("btnSept23");
    private Tracker Sept24= new Tracker("btnSept24");
    private Tracker Sept25= new Tracker("btnSept25");
    private Tracker Sept26= new Tracker("btnSept26");
    private Tracker Sept27= new Tracker("btnSept27");
    private Tracker Sept28= new Tracker("btnSept28");
    private Tracker Sept29= new Tracker("btnSept29");
    private Tracker Sept30= new Tracker("btnSept30");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMap = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttons.add(btnSept1);
        buttons.add(btnSept2);
        buttons.add(btnSept3);
        buttons.add(btnSept4);
        buttons.add(btnSept5);
        buttons.add(btnSept6);
        buttons.add(btnSept7);
        buttons.add(btnSept8);
        buttons.add(btnSept9);
        buttons.add(btnSept10);
        buttons.add(btnSept11);
        buttons.add(btnSept12);
        buttons.add(btnSept13);
        buttons.add(btnSept14);
        buttons.add(btnSept15);
        buttons.add(btnSept16);
        buttons.add(btnSept17);
        buttons.add(btnSept18);
        buttons.add(btnSept19);
        buttons.add(btnSept20);
        buttons.add(btnSept21);
        buttons.add(btnSept22);
        buttons.add(btnSept23);
        buttons.add(btnSept24);
        buttons.add(btnSept25);
        buttons.add(btnSept26);
        buttons.add(btnSept27);
        buttons.add(btnSept28);
        buttons.add(btnSept29);
        buttons.add(btnSept30);

        trackerHashMap.put("btnSept1",Sept1);
        trackerHashMap.put("btnSept2",Sept2);
        trackerHashMap.put("btnSept3",Sept3);
        trackerHashMap.put("btnSept4",Sept4);
        trackerHashMap.put("btnSept5",Sept5);
        trackerHashMap.put("btnSept6",Sept6);
        trackerHashMap.put("btnSept7",Sept7);
        trackerHashMap.put("btnSept8",Sept8);
        trackerHashMap.put("btnSept9",Sept9);
        trackerHashMap.put("btnSept10",Sept10);
        trackerHashMap.put("btnSept11",Sept11);
        trackerHashMap.put("btnSept12",Sept12);
        trackerHashMap.put("btnSept13",Sept13);
        trackerHashMap.put("btnSept14",Sept14);
        trackerHashMap.put("btnSept15",Sept15);
        trackerHashMap.put("btnSept16",Sept16);
        trackerHashMap.put("btnSept17",Sept17);
        trackerHashMap.put("btnSept18",Sept18);
        trackerHashMap.put("btnSept19",Sept19);
        trackerHashMap.put("btnSept20",Sept20);
        trackerHashMap.put("btnSept21",Sept21);
        trackerHashMap.put("btnSept22",Sept22);
        trackerHashMap.put("btnSept23",Sept23);
        trackerHashMap.put("btnSept24",Sept24);
        trackerHashMap.put("btnSept25",Sept25);
        trackerHashMap.put("btnSept26",Sept26);
        trackerHashMap.put("btnSept27",Sept27);
        trackerHashMap.put("btnSept28",Sept28);
        trackerHashMap.put("btnSept29",Sept29);
        trackerHashMap.put("btnSept30",Sept30);

        File file = new File("/fileSept.ser");


        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapSept();
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
    private void Sept1Clicked(){
        if(trackerHashMap.get("btnSept1").getChecked()){
            btnSept1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept1.setChecked(false);
            trackerHashMap.replace("btnSept1",Sept1);
            fileOut.saveHashmapSept(trackerHashMap);
        }else{
            btnSept1.setStyle("-fx-background-color: #CE2029");
            Sept1.setChecked(true);
            trackerHashMap.replace("btnSept1",Sept1);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept2Clicked(){
        if (trackerHashMap.get("btnSept2").getChecked()) {
            //set to not checked
            btnSept2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept2.setChecked(false);
            trackerHashMap.replace("btnSept2",Sept2);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept2.setStyle("-fx-background-color: #CE2029");
            Sept2.setChecked(true);
            trackerHashMap.replace("btnSept2",Sept2);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }

    @FXML
    private void Sept3Clicked(){
        if (trackerHashMap.get("btnSept3").getChecked()) {
            //set to not checked
            btnSept3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept3.setChecked(false);
            trackerHashMap.replace("btnSept3",Sept3);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept3.setStyle("-fx-background-color: #CE2029");
            Sept3.setChecked(true);
            trackerHashMap.replace("btnSept3",Sept3);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }

    @FXML
    private void Sept4Clicked(){
        if (trackerHashMap.get("btnSept4").getChecked()) {
            //set to not checked
            btnSept4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept4.setChecked(false);
            trackerHashMap.replace("btnSept4",Sept4);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept4.setStyle("-fx-background-color: #CE2029");
            Sept4.setChecked(true);
            trackerHashMap.replace("btnSept4",Sept4);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept5Clicked(){
        if (trackerHashMap.get("btnSept5").getChecked()) {
            //set to not checked
            btnSept5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept5.setChecked(false);
            trackerHashMap.replace("btnSept5",Sept5);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept5.setStyle("-fx-background-color: #CE2029");
            Sept5.setChecked(true);
            trackerHashMap.replace("btnSept5",Sept5);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept6Clicked(){
        if (trackerHashMap.get("btnSept6").getChecked()) {
            //set to not checked
            btnSept6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept6.setChecked(false);
            trackerHashMap.replace("btnSept6",Sept6);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept6.setStyle("-fx-background-color: #CE2029");
            Sept6.setChecked(true);
            trackerHashMap.replace("btnSept6",Sept6);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept7Clicked(){
        if (trackerHashMap.get("btnSept7").getChecked()) {
            //set to not checked
            btnSept7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept7.setChecked(false);
            trackerHashMap.replace("btnSept7",Sept7);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept7.setStyle("-fx-background-color: #CE2029");
            Sept7.setChecked(true);
            trackerHashMap.replace("btnSept7",Sept7);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept8Clicked(){
        if (trackerHashMap.get("btnSept8").getChecked()) {
            //set to not checked
            btnSept8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept8.setChecked(false);
            trackerHashMap.replace("btnSept8",Sept8);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept8.setStyle("-fx-background-color: #CE2029");
            Sept8.setChecked(true);
            trackerHashMap.replace("btnSept8",Sept8);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept9Clicked(){
        if (trackerHashMap.get("btnSept9").getChecked()) {
            //set to not checked
            btnSept9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept9.setChecked(false);
            trackerHashMap.replace("btnSept9",Sept9);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept9.setStyle("-fx-background-color: #CE2029");
            Sept9.setChecked(true);
            trackerHashMap.replace("btnSept9",Sept9);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept10Clicked(){
        if (trackerHashMap.get("btnSept10").getChecked()) {
            //set to not checked
            btnSept10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept10.setChecked(false);
            trackerHashMap.replace("btnSept10",Sept10);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept10.setStyle("-fx-background-color: #CE2029");
            Sept10.setChecked(true);
            trackerHashMap.replace("btnSept10",Sept10);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept11Clicked(){
        if (trackerHashMap.get("btnSept11").getChecked()) {
            //set to not checked
            btnSept11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept11.setChecked(false);
            trackerHashMap.replace("btnSept11",Sept11);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept11.setStyle("-fx-background-color: #CE2029");
            Sept11.setChecked(true);
            trackerHashMap.replace("btnSept11",Sept11);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept12Clicked(){
        if (trackerHashMap.get("btnSept12").getChecked()) {
            //set to not checked
            btnSept12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept12.setChecked(false);
            trackerHashMap.replace("btnSept12",Sept12);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept12.setStyle("-fx-background-color: #CE2029");
            Sept12.setChecked(true);
            trackerHashMap.replace("btnSept12",Sept12);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept13Clicked(){
        if (trackerHashMap.get("btnSept13").getChecked()) {
            //set to not checked
            btnSept13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept13.setChecked(false);
            trackerHashMap.replace("btnSept13",Sept13);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept13.setStyle("-fx-background-color: #CE2029");
            Sept13.setChecked(true);
            trackerHashMap.replace("btnSept13",Sept13);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept14Clicked(){
        if (trackerHashMap.get("btnSept14").getChecked()) {
            //set to not checked
            btnSept14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept14.setChecked(false);
            trackerHashMap.replace("btnSept14",Sept14);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept14.setStyle("-fx-background-color: #CE2029");
            Sept14.setChecked(true);
            trackerHashMap.replace("btnSept14",Sept14);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept15Clicked(){
        if (trackerHashMap.get("btnSept15").getChecked()) {
            //set to not checked
            btnSept15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept15.setChecked(false);
            trackerHashMap.replace("btnSept15",Sept15);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept15.setStyle("-fx-background-color: #CE2029");
            Sept15.setChecked(true);
            trackerHashMap.replace("btnSept15",Sept15);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept16Clicked(){
        if (trackerHashMap.get("btnSept16").getChecked()) {
            //set to not checked
            btnSept16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept16.setChecked(false);
            trackerHashMap.replace("btnSept16",Sept16);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept16.setStyle("-fx-background-color: #CE2029");
            Sept16.setChecked(true);
            trackerHashMap.replace("btnSept16",Sept16);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept17Clicked(){
        if (trackerHashMap.get("btnSept17").getChecked()) {
            //set to not checked
            btnSept17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept17.setChecked(false);
            trackerHashMap.replace("btnSept17",Sept17);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept17.setStyle("-fx-background-color: #CE2029");
            Sept17.setChecked(true);
            trackerHashMap.replace("btnSept17",Sept17);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept18Clicked(){
        if (trackerHashMap.get("btnSept18").getChecked()) {
            //set to not checked
            btnSept18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept18.setChecked(false);
            trackerHashMap.replace("btnSept18",Sept18);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept18.setStyle("-fx-background-color: #CE2029");
            Sept18.setChecked(true);
            trackerHashMap.replace("btnSept18",Sept18);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept19Clicked(){
        if (trackerHashMap.get("btnSept19").getChecked()) {
            //set to not checked
            btnSept19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept19.setChecked(false);
            trackerHashMap.replace("btnSept19",Sept19);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept19.setStyle("-fx-background-color: #CE2029");
            Sept19.setChecked(true);
            trackerHashMap.replace("btnSept19",Sept19);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept20Clicked(){
        if (trackerHashMap.get("btnSept20").getChecked()) {
            //set to not checked
            btnSept20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept20.setChecked(false);
            trackerHashMap.replace("btnSept20",Sept20);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept20.setStyle("-fx-background-color: #CE2029");
            Sept20.setChecked(true);
            trackerHashMap.replace("btnSept20",Sept20);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept21Clicked(){
        if (trackerHashMap.get("btnSept21").getChecked()) {
            //set to not checked
            btnSept21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept21.setChecked(false);
            trackerHashMap.replace("btnSept21",Sept21);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept21.setStyle("-fx-background-color: #CE2029");
            Sept21.setChecked(true);
            trackerHashMap.replace("btnSept21",Sept21);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept22Clicked(){
        if (trackerHashMap.get("btnSept22").getChecked()) {
            //set to not checked
            btnSept22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept22.setChecked(false);
            trackerHashMap.replace("btnSept22",Sept22);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept22.setStyle("-fx-background-color: #CE2029");
            Sept22.setChecked(true);
            trackerHashMap.replace("btnSept22",Sept22);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept23Clicked(){
        if (trackerHashMap.get("btnSept23").getChecked()) {
            //set to not checked
            btnSept23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept23.setChecked(false);
            trackerHashMap.replace("btnSept23",Sept23);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept23.setStyle("-fx-background-color: #CE2029");
            Sept23.setChecked(true);
            trackerHashMap.replace("btnSept23",Sept23);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept24Clicked(){
        if (trackerHashMap.get("btnSept24").getChecked()) {
            //set to not checked
            btnSept24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept24.setChecked(false);
            trackerHashMap.replace("btnSept24",Sept24);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept24.setStyle("-fx-background-color: #CE2029");
            Sept24.setChecked(true);
            trackerHashMap.replace("btnSept24",Sept24);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept25Clicked(){
        if (trackerHashMap.get("btnSept25").getChecked()) {
            //set to not checked
            btnSept25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept25.setChecked(false);
            trackerHashMap.replace("btnSept25",Sept25);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept25.setStyle("-fx-background-color: #CE2029");
            Sept25.setChecked(true);
            trackerHashMap.replace("btnSept25",Sept25);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept26Clicked(){
        if (trackerHashMap.get("btnSept26").getChecked()) {
            //set to not checked
            btnSept26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept26.setChecked(false);
            trackerHashMap.replace("btnSept26",Sept26);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept26.setStyle("-fx-background-color: #CE2029");
            Sept26.setChecked(true);
            trackerHashMap.replace("btnSept26",Sept26);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept27Clicked(){
        if (trackerHashMap.get("btnSept27").getChecked()) {
            //set to not checked
            btnSept27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept27.setChecked(false);
            trackerHashMap.replace("btnSept27",Sept27);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept27.setStyle("-fx-background-color: #CE2029");
            Sept27.setChecked(true);
            trackerHashMap.replace("btnSept27",Sept27);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept28Clicked(){
        if (trackerHashMap.get("btnSept28").getChecked()) {
            //set to not checked
            btnSept28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept28.setChecked(false);
            trackerHashMap.replace("btnSept28",Sept28);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept28.setStyle("-fx-background-color: #CE2029");
            Sept28.setChecked(true);
            trackerHashMap.replace("btnSept28",Sept28);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept29Clicked(){
        if (trackerHashMap.get("btnSept29").getChecked()) {
            //set to not checked
            btnSept29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept29.setChecked(false);
            trackerHashMap.replace("btnSept29",Sept29);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept29.setStyle("-fx-background-color: #CE2029");
            Sept29.setChecked(true);
            trackerHashMap.replace("btnSept29",Sept29);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
    @FXML
    private void Sept30Clicked(){
        if (trackerHashMap.get("btnSept30").getChecked()) {
            //set to not checked
            btnSept30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Sept30.setChecked(false);
            trackerHashMap.replace("btnSept30",Sept30);
            fileOut.saveHashmapSept(trackerHashMap);
        } else {
            //set to checked
            btnSept30.setStyle("-fx-background-color: #CE2029");
            Sept30.setChecked(true);
            trackerHashMap.replace("btnSept30",Sept30);
            fileOut.saveHashmapSept(trackerHashMap);
        }
    }
}
