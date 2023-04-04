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

public class August implements Initializable {
    public Button btnAug1;
    public Button btnAug2;
    public Button btnAug3;
    public Button btnAug4;
    public Button btnAug5;
    public Button btnAug6;
    public Button btnAug7;
    public Button btnAug8;
    public Button btnAug9;
    public Button btnAug10;
    public Button btnAug11;
    public Button btnAug12;
    public Button btnAug13;
    public Button btnAug14;
    public Button btnAug15;
    public Button btnAug16;
    public Button btnAug17;
    public Button btnAug18;
    public Button btnAug19;
    public Button btnAug20;
    public Button btnAug21;
    public Button btnAug22;
    public Button btnAug23;
    public Button btnAug24;
    public Button btnAug25;
    public Button btnAug26;
    public Button btnAug27;
    public Button btnAug28;
    public Button btnAug29;
    public Button btnAug30;
    public Button btnAug31;

    private Tracker Aug1 = new Tracker("btnAug1");
    private Tracker Aug2 = new Tracker("btnAug2");
    private Tracker Aug3 = new Tracker("btnAug3");
    private Tracker Aug4 = new Tracker("btnAug4");
    private Tracker Aug5 = new Tracker("btnAug5");
    private Tracker Aug6= new Tracker("btnAug6");
    private Tracker Aug7= new Tracker("btnAug7");
    private Tracker Aug8= new Tracker("btnAug8");
    private Tracker Aug9= new Tracker("btnAug9");
    private Tracker Aug10= new Tracker("btnAug10");
    private Tracker Aug11= new Tracker("btnAug11");
    private Tracker Aug12= new Tracker("btnAug12");
    private Tracker Aug13= new Tracker("btnAug13");
    private Tracker Aug14= new Tracker("btnAug14");
    private Tracker Aug15= new Tracker("btnAug15");
    private Tracker Aug16= new Tracker("btnAug16");
    private Tracker Aug17= new Tracker("btnAug17");
    private Tracker Aug18= new Tracker("btnAug18");
    private Tracker Aug19= new Tracker("btnAug19");
    private Tracker Aug20= new Tracker("btnAug20");
    private Tracker Aug21= new Tracker("btnAug21");
    private Tracker Aug22= new Tracker("btnAug22");
    private Tracker Aug23= new Tracker("btnAug23");
    private Tracker Aug24= new Tracker("btnAug24");
    private Tracker Aug25= new Tracker("btnAug25");
    private Tracker Aug26= new Tracker("btnAug26");
    private Tracker Aug27= new Tracker("btnAug27");
    private Tracker Aug28= new Tracker("btnAug28");
    private Tracker Aug29= new Tracker("btnAug29");
    private Tracker Aug30= new Tracker("btnAug30");
    private Tracker Aug31= new Tracker("btnAug31");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMap = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttons.add(btnAug1);
        buttons.add(btnAug2);
        buttons.add(btnAug3);
        buttons.add(btnAug4);
        buttons.add(btnAug5);
        buttons.add(btnAug6);
        buttons.add(btnAug7);
        buttons.add(btnAug8);
        buttons.add(btnAug9);
        buttons.add(btnAug10);
        buttons.add(btnAug11);
        buttons.add(btnAug12);
        buttons.add(btnAug13);
        buttons.add(btnAug14);
        buttons.add(btnAug15);
        buttons.add(btnAug16);
        buttons.add(btnAug17);
        buttons.add(btnAug18);
        buttons.add(btnAug19);
        buttons.add(btnAug20);
        buttons.add(btnAug21);
        buttons.add(btnAug22);
        buttons.add(btnAug23);
        buttons.add(btnAug24);
        buttons.add(btnAug25);
        buttons.add(btnAug26);
        buttons.add(btnAug27);
        buttons.add(btnAug28);
        buttons.add(btnAug29);
        buttons.add(btnAug30);
        buttons.add(btnAug31);

        trackerHashMap.put("btnAug1",Aug1);
        trackerHashMap.put("btnAug2",Aug2);
        trackerHashMap.put("btnAug3",Aug3);
        trackerHashMap.put("btnAug4",Aug4);
        trackerHashMap.put("btnAug5",Aug5);
        trackerHashMap.put("btnAug6",Aug6);
        trackerHashMap.put("btnAug7",Aug7);
        trackerHashMap.put("btnAug8",Aug8);
        trackerHashMap.put("btnAug9",Aug9);
        trackerHashMap.put("btnAug10",Aug10);
        trackerHashMap.put("btnAug11",Aug11);
        trackerHashMap.put("btnAug12",Aug12);
        trackerHashMap.put("btnAug13",Aug13);
        trackerHashMap.put("btnAug14",Aug14);
        trackerHashMap.put("btnAug15",Aug15);
        trackerHashMap.put("btnAug16",Aug16);
        trackerHashMap.put("btnAug17",Aug17);
        trackerHashMap.put("btnAug18",Aug18);
        trackerHashMap.put("btnAug19",Aug19);
        trackerHashMap.put("btnAug20",Aug20);
        trackerHashMap.put("btnAug21",Aug21);
        trackerHashMap.put("btnAug22",Aug22);
        trackerHashMap.put("btnAug23",Aug23);
        trackerHashMap.put("btnAug24",Aug24);
        trackerHashMap.put("btnAug25",Aug25);
        trackerHashMap.put("btnAug26",Aug26);
        trackerHashMap.put("btnAug27",Aug27);
        trackerHashMap.put("btnAug28",Aug28);
        trackerHashMap.put("btnAug29",Aug29);
        trackerHashMap.put("btnAug30",Aug30);
        trackerHashMap.put("btnAug31",Aug31);

        File file = new File("/fileAug.ser");


        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapAug();
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
    private void Aug1Clicked(){
        if(trackerHashMap.get("btnAug1").getChecked()){
            btnAug1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug1.setChecked(false);
            trackerHashMap.replace("btnAug1",Aug1);
            fileOut.saveHashmapAug(trackerHashMap);
        }else{
            btnAug1.setStyle("-fx-background-color: #CE2029");
            Aug1.setChecked(true);
            trackerHashMap.replace("btnAug1",Aug1);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug2Clicked(){
        if (trackerHashMap.get("btnAug2").getChecked()) {
            //set to not checked
            btnAug2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug2.setChecked(false);
            trackerHashMap.replace("btnAug2",Aug2);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug2.setStyle("-fx-background-color: #CE2029");
            Aug2.setChecked(true);
            trackerHashMap.replace("btnAug2",Aug2);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }

    @FXML
    private void Aug3Clicked(){
        if (trackerHashMap.get("btnAug3").getChecked()) {
            //set to not checked
            btnAug3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug3.setChecked(false);
            trackerHashMap.replace("btnAug3",Aug3);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug3.setStyle("-fx-background-color: #CE2029");
            Aug3.setChecked(true);
            trackerHashMap.replace("btnAug3",Aug3);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }

    @FXML
    private void Aug4Clicked(){
        if (trackerHashMap.get("btnAug4").getChecked()) {
            //set to not checked
            btnAug4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug4.setChecked(false);
            trackerHashMap.replace("btnAug4",Aug4);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug4.setStyle("-fx-background-color: #CE2029");
            Aug4.setChecked(true);
            trackerHashMap.replace("btnAug4",Aug4);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug5Clicked(){
        if (trackerHashMap.get("btnAug5").getChecked()) {
            //set to not checked
            btnAug5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug5.setChecked(false);
            trackerHashMap.replace("btnAug5",Aug5);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug5.setStyle("-fx-background-color: #CE2029");
            Aug5.setChecked(true);
            trackerHashMap.replace("btnAug5",Aug5);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug6Clicked(){
        if (trackerHashMap.get("btnAug6").getChecked()) {
            //set to not checked
            btnAug6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug6.setChecked(false);
            trackerHashMap.replace("btnAug6",Aug6);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug6.setStyle("-fx-background-color: #CE2029");
            Aug6.setChecked(true);
            trackerHashMap.replace("btnAug6",Aug6);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug7Clicked(){
        if (trackerHashMap.get("btnAug7").getChecked()) {
            //set to not checked
            btnAug7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug7.setChecked(false);
            trackerHashMap.replace("btnAug7",Aug7);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug7.setStyle("-fx-background-color: #CE2029");
            Aug7.setChecked(true);
            trackerHashMap.replace("btnAug7",Aug7);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug8Clicked(){
        if (trackerHashMap.get("btnAug8").getChecked()) {
            //set to not checked
            btnAug8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug8.setChecked(false);
            trackerHashMap.replace("btnAug8",Aug8);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug8.setStyle("-fx-background-color: #CE2029");
            Aug8.setChecked(true);
            trackerHashMap.replace("btnAug8",Aug8);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug9Clicked(){
        if (trackerHashMap.get("btnAug9").getChecked()) {
            //set to not checked
            btnAug9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug9.setChecked(false);
            trackerHashMap.replace("btnAug9",Aug9);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug9.setStyle("-fx-background-color: #CE2029");
            Aug9.setChecked(true);
            trackerHashMap.replace("btnAug9",Aug9);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug10Clicked(){
        if (trackerHashMap.get("btnAug10").getChecked()) {
            //set to not checked
            btnAug10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug10.setChecked(false);
            trackerHashMap.replace("btnAug10",Aug10);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug10.setStyle("-fx-background-color: #CE2029");
            Aug10.setChecked(true);
            trackerHashMap.replace("btnAug10",Aug10);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug11Clicked(){
        if (trackerHashMap.get("btnAug11").getChecked()) {
            //set to not checked
            btnAug11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug11.setChecked(false);
            trackerHashMap.replace("btnAug11",Aug11);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug11.setStyle("-fx-background-color: #CE2029");
            Aug11.setChecked(true);
            trackerHashMap.replace("btnAug11",Aug11);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug12Clicked(){
        if (trackerHashMap.get("btnAug12").getChecked()) {
            //set to not checked
            btnAug12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug12.setChecked(false);
            trackerHashMap.replace("btnAug12",Aug12);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug12.setStyle("-fx-background-color: #CE2029");
            Aug12.setChecked(true);
            trackerHashMap.replace("btnAug12",Aug12);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug13Clicked(){
        if (trackerHashMap.get("btnAug13").getChecked()) {
            //set to not checked
            btnAug13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug13.setChecked(false);
            trackerHashMap.replace("btnAug13",Aug13);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug13.setStyle("-fx-background-color: #CE2029");
            Aug13.setChecked(true);
            trackerHashMap.replace("btnAug13",Aug13);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug14Clicked(){
        if (trackerHashMap.get("btnAug14").getChecked()) {
            //set to not checked
            btnAug14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug14.setChecked(false);
            trackerHashMap.replace("btnAug14",Aug14);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug14.setStyle("-fx-background-color: #CE2029");
            Aug14.setChecked(true);
            trackerHashMap.replace("btnAug14",Aug14);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug15Clicked(){
        if (trackerHashMap.get("btnAug15").getChecked()) {
            //set to not checked
            btnAug15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug15.setChecked(false);
            trackerHashMap.replace("btnAug15",Aug15);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug15.setStyle("-fx-background-color: #CE2029");
            Aug15.setChecked(true);
            trackerHashMap.replace("btnAug15",Aug15);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug16Clicked(){
        if (trackerHashMap.get("btnAug16").getChecked()) {
            //set to not checked
            btnAug16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug16.setChecked(false);
            trackerHashMap.replace("btnAug16",Aug16);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug16.setStyle("-fx-background-color: #CE2029");
            Aug16.setChecked(true);
            trackerHashMap.replace("btnAug16",Aug16);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug17Clicked(){
        if (trackerHashMap.get("btnAug17").getChecked()) {
            //set to not checked
            btnAug17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug17.setChecked(false);
            trackerHashMap.replace("btnAug17",Aug17);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug17.setStyle("-fx-background-color: #CE2029");
            Aug17.setChecked(true);
            trackerHashMap.replace("btnAug17",Aug17);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug18Clicked(){
        if (trackerHashMap.get("btnAug18").getChecked()) {
            //set to not checked
            btnAug18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug18.setChecked(false);
            trackerHashMap.replace("btnAug18",Aug18);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug18.setStyle("-fx-background-color: #CE2029");
            Aug18.setChecked(true);
            trackerHashMap.replace("btnAug18",Aug18);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug19Clicked(){
        if (trackerHashMap.get("btnAug19").getChecked()) {
            //set to not checked
            btnAug19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug19.setChecked(false);
            trackerHashMap.replace("btnAug19",Aug19);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug19.setStyle("-fx-background-color: #CE2029");
            Aug19.setChecked(true);
            trackerHashMap.replace("btnAug19",Aug19);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug20Clicked(){
        if (trackerHashMap.get("btnAug20").getChecked()) {
            //set to not checked
            btnAug20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug20.setChecked(false);
            trackerHashMap.replace("btnAug20",Aug20);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug20.setStyle("-fx-background-color: #CE2029");
            Aug20.setChecked(true);
            trackerHashMap.replace("btnAug20",Aug20);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug21Clicked(){
        if (trackerHashMap.get("btnAug21").getChecked()) {
            //set to not checked
            btnAug21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug21.setChecked(false);
            trackerHashMap.replace("btnAug21",Aug21);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug21.setStyle("-fx-background-color: #CE2029");
            Aug21.setChecked(true);
            trackerHashMap.replace("btnAug21",Aug21);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug22Clicked(){
        if (trackerHashMap.get("btnAug22").getChecked()) {
            //set to not checked
            btnAug22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug22.setChecked(false);
            trackerHashMap.replace("btnAug22",Aug22);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug22.setStyle("-fx-background-color: #CE2029");
            Aug22.setChecked(true);
            trackerHashMap.replace("btnAug22",Aug22);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug23Clicked(){
        if (trackerHashMap.get("btnAug23").getChecked()) {
            //set to not checked
            btnAug23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug23.setChecked(false);
            trackerHashMap.replace("btnAug23",Aug23);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug23.setStyle("-fx-background-color: #CE2029");
            Aug23.setChecked(true);
            trackerHashMap.replace("btnAug23",Aug23);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug24Clicked(){
        if (trackerHashMap.get("btnAug24").getChecked()) {
            //set to not checked
            btnAug24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug24.setChecked(false);
            trackerHashMap.replace("btnAug24",Aug24);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug24.setStyle("-fx-background-color: #CE2029");
            Aug24.setChecked(true);
            trackerHashMap.replace("btnAug24",Aug24);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug25Clicked(){
        if (trackerHashMap.get("btnAug25").getChecked()) {
            //set to not checked
            btnAug25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug25.setChecked(false);
            trackerHashMap.replace("btnAug25",Aug25);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug25.setStyle("-fx-background-color: #CE2029");
            Aug25.setChecked(true);
            trackerHashMap.replace("btnAug25",Aug25);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug26Clicked(){
        if (trackerHashMap.get("btnAug26").getChecked()) {
            //set to not checked
            btnAug26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug26.setChecked(false);
            trackerHashMap.replace("btnAug26",Aug26);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug26.setStyle("-fx-background-color: #CE2029");
            Aug26.setChecked(true);
            trackerHashMap.replace("btnAug26",Aug26);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug27Clicked(){
        if (trackerHashMap.get("btnAug27").getChecked()) {
            //set to not checked
            btnAug27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug27.setChecked(false);
            trackerHashMap.replace("btnAug27",Aug27);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug27.setStyle("-fx-background-color: #CE2029");
            Aug27.setChecked(true);
            trackerHashMap.replace("btnAug27",Aug27);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug28Clicked(){
        if (trackerHashMap.get("btnAug28").getChecked()) {
            //set to not checked
            btnAug28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug28.setChecked(false);
            trackerHashMap.replace("btnAug28",Aug28);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug28.setStyle("-fx-background-color: #CE2029");
            Aug28.setChecked(true);
            trackerHashMap.replace("btnAug28",Aug28);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug29Clicked(){
        if (trackerHashMap.get("btnAug29").getChecked()) {
            //set to not checked
            btnAug29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug29.setChecked(false);
            trackerHashMap.replace("btnAug29",Aug29);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug29.setStyle("-fx-background-color: #CE2029");
            Aug29.setChecked(true);
            trackerHashMap.replace("btnAug29",Aug29);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug30Clicked(){
        if (trackerHashMap.get("btnAug30").getChecked()) {
            //set to not checked
            btnAug30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug30.setChecked(false);
            trackerHashMap.replace("btnAug30",Aug30);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug30.setStyle("-fx-background-color: #CE2029");
            Aug30.setChecked(true);
            trackerHashMap.replace("btnAug30",Aug30);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
    @FXML
    private void Aug31Clicked(){
        if (trackerHashMap.get("btnAug31").getChecked()) {
            //set to not checked
            btnAug31.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Aug31.setChecked(false);
            trackerHashMap.replace("btnAug31",Aug31);
            fileOut.saveHashmapAug(trackerHashMap);
        } else {
            //set to checked
            btnAug31.setStyle("-fx-background-color: #CE2029");
            Aug31.setChecked(true);
            trackerHashMap.replace("btnAug31",Aug31);
            fileOut.saveHashmapAug(trackerHashMap);
        }
    }
}
