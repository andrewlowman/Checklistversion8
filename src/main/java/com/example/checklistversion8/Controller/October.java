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

public class October implements Initializable {
    public Button btnOct1;
    public Button btnOct2;
    public Button btnOct3;
    public Button btnOct4;
    public Button btnOct5;
    public Button btnOct6;
    public Button btnOct7;
    public Button btnOct8;
    public Button btnOct9;
    public Button btnOct10;
    public Button btnOct11;
    public Button btnOct12;
    public Button btnOct13;
    public Button btnOct14;
    public Button btnOct15;
    public Button btnOct16;
    public Button btnOct17;
    public Button btnOct18;
    public Button btnOct19;
    public Button btnOct20;
    public Button btnOct21;
    public Button btnOct22;
    public Button btnOct23;
    public Button btnOct24;
    public Button btnOct25;
    public Button btnOct26;
    public Button btnOct27;
    public Button btnOct28;
    public Button btnOct29;
    public Button btnOct30;
    public Button btnOct31;

    private Tracker Oct1 = new Tracker("btnOct1");
    private Tracker Oct2 = new Tracker("btnOct2");
    private Tracker Oct3 = new Tracker("btnOct3");
    private Tracker Oct4 = new Tracker("btnOct4");
    private Tracker Oct5 = new Tracker("btnOct5");
    private Tracker Oct6= new Tracker("btnOct6");
    private Tracker Oct7= new Tracker("btnOct7");
    private Tracker Oct8= new Tracker("btnOct8");
    private Tracker Oct9= new Tracker("btnOct9");
    private Tracker Oct10= new Tracker("btnOct10");
    private Tracker Oct11= new Tracker("btnOct11");
    private Tracker Oct12= new Tracker("btnOct12");
    private Tracker Oct13= new Tracker("btnOct13");
    private Tracker Oct14= new Tracker("btnOct14");
    private Tracker Oct15= new Tracker("btnOct15");
    private Tracker Oct16= new Tracker("btnOct16");
    private Tracker Oct17= new Tracker("btnOct17");
    private Tracker Oct18= new Tracker("btnOct18");
    private Tracker Oct19= new Tracker("btnOct19");
    private Tracker Oct20= new Tracker("btnOct20");
    private Tracker Oct21= new Tracker("btnOct21");
    private Tracker Oct22= new Tracker("btnOct22");
    private Tracker Oct23= new Tracker("btnOct23");
    private Tracker Oct24= new Tracker("btnOct24");
    private Tracker Oct25= new Tracker("btnOct25");
    private Tracker Oct26= new Tracker("btnOct26");
    private Tracker Oct27= new Tracker("btnOct27");
    private Tracker Oct28= new Tracker("btnOct28");
    private Tracker Oct29= new Tracker("btnOct29");
    private Tracker Oct30= new Tracker("btnOct30");
    private Tracker Oct31= new Tracker("btnOct31");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMap = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttons.add(btnOct1);
        buttons.add(btnOct2);
        buttons.add(btnOct3);
        buttons.add(btnOct4);
        buttons.add(btnOct5);
        buttons.add(btnOct6);
        buttons.add(btnOct7);
        buttons.add(btnOct8);
        buttons.add(btnOct9);
        buttons.add(btnOct10);
        buttons.add(btnOct11);
        buttons.add(btnOct12);
        buttons.add(btnOct13);
        buttons.add(btnOct14);
        buttons.add(btnOct15);
        buttons.add(btnOct16);
        buttons.add(btnOct17);
        buttons.add(btnOct18);
        buttons.add(btnOct19);
        buttons.add(btnOct20);
        buttons.add(btnOct21);
        buttons.add(btnOct22);
        buttons.add(btnOct23);
        buttons.add(btnOct24);
        buttons.add(btnOct25);
        buttons.add(btnOct26);
        buttons.add(btnOct27);
        buttons.add(btnOct28);
        buttons.add(btnOct29);
        buttons.add(btnOct30);
        buttons.add(btnOct31);

        trackerHashMap.put("btnOct1",Oct1);
        trackerHashMap.put("btnOct2",Oct2);
        trackerHashMap.put("btnOct3",Oct3);
        trackerHashMap.put("btnOct4",Oct4);
        trackerHashMap.put("btnOct5",Oct5);
        trackerHashMap.put("btnOct6",Oct6);
        trackerHashMap.put("btnOct7",Oct7);
        trackerHashMap.put("btnOct8",Oct8);
        trackerHashMap.put("btnOct9",Oct9);
        trackerHashMap.put("btnOct10",Oct10);
        trackerHashMap.put("btnOct11",Oct11);
        trackerHashMap.put("btnOct12",Oct12);
        trackerHashMap.put("btnOct13",Oct13);
        trackerHashMap.put("btnOct14",Oct14);
        trackerHashMap.put("btnOct15",Oct15);
        trackerHashMap.put("btnOct16",Oct16);
        trackerHashMap.put("btnOct17",Oct17);
        trackerHashMap.put("btnOct18",Oct18);
        trackerHashMap.put("btnOct19",Oct19);
        trackerHashMap.put("btnOct20",Oct20);
        trackerHashMap.put("btnOct21",Oct21);
        trackerHashMap.put("btnOct22",Oct22);
        trackerHashMap.put("btnOct23",Oct23);
        trackerHashMap.put("btnOct24",Oct24);
        trackerHashMap.put("btnOct25",Oct25);
        trackerHashMap.put("btnOct26",Oct26);
        trackerHashMap.put("btnOct27",Oct27);
        trackerHashMap.put("btnOct28",Oct28);
        trackerHashMap.put("btnOct29",Oct29);
        trackerHashMap.put("btnOct30",Oct30);
        trackerHashMap.put("btnOct31",Oct31);

        File file = new File("/fileOct.ser");


        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapOct();
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
    private void Oct1Clicked(){
        if(trackerHashMap.get("btnOct1").getChecked()){
            btnOct1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct1.setChecked(false);
            trackerHashMap.replace("btnOct1",Oct1);
            fileOut.saveHashmapOct(trackerHashMap);
        }else{
            btnOct1.setStyle("-fx-background-color: #CE2029");
            Oct1.setChecked(true);
            trackerHashMap.replace("btnOct1",Oct1);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct2Clicked(){
        if (trackerHashMap.get("btnOct2").getChecked()) {
            //set to not checked
            btnOct2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct2.setChecked(false);
            trackerHashMap.replace("btnOct2",Oct2);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct2.setStyle("-fx-background-color: #CE2029");
            Oct2.setChecked(true);
            trackerHashMap.replace("btnOct2",Oct2);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }

    @FXML
    private void Oct3Clicked(){
        if (trackerHashMap.get("btnOct3").getChecked()) {
            //set to not checked
            btnOct3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct3.setChecked(false);
            trackerHashMap.replace("btnOct3",Oct3);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct3.setStyle("-fx-background-color: #CE2029");
            Oct3.setChecked(true);
            trackerHashMap.replace("btnOct3",Oct3);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }

    @FXML
    private void Oct4Clicked(){
        if (trackerHashMap.get("btnOct4").getChecked()) {
            //set to not checked
            btnOct4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct4.setChecked(false);
            trackerHashMap.replace("btnOct4",Oct4);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct4.setStyle("-fx-background-color: #CE2029");
            Oct4.setChecked(true);
            trackerHashMap.replace("btnOct4",Oct4);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct5Clicked(){
        if (trackerHashMap.get("btnOct5").getChecked()) {
            //set to not checked
            btnOct5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct5.setChecked(false);
            trackerHashMap.replace("btnOct5",Oct5);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct5.setStyle("-fx-background-color: #CE2029");
            Oct5.setChecked(true);
            trackerHashMap.replace("btnOct5",Oct5);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct6Clicked(){
        if (trackerHashMap.get("btnOct6").getChecked()) {
            //set to not checked
            btnOct6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct6.setChecked(false);
            trackerHashMap.replace("btnOct6",Oct6);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct6.setStyle("-fx-background-color: #CE2029");
            Oct6.setChecked(true);
            trackerHashMap.replace("btnOct6",Oct6);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct7Clicked(){
        if (trackerHashMap.get("btnOct7").getChecked()) {
            //set to not checked
            btnOct7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct7.setChecked(false);
            trackerHashMap.replace("btnOct7",Oct7);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct7.setStyle("-fx-background-color: #CE2029");
            Oct7.setChecked(true);
            trackerHashMap.replace("btnOct7",Oct7);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct8Clicked(){
        if (trackerHashMap.get("btnOct8").getChecked()) {
            //set to not checked
            btnOct8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct8.setChecked(false);
            trackerHashMap.replace("btnOct8",Oct8);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct8.setStyle("-fx-background-color: #CE2029");
            Oct8.setChecked(true);
            trackerHashMap.replace("btnOct8",Oct8);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct9Clicked(){
        if (trackerHashMap.get("btnOct9").getChecked()) {
            //set to not checked
            btnOct9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct9.setChecked(false);
            trackerHashMap.replace("btnOct9",Oct9);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct9.setStyle("-fx-background-color: #CE2029");
            Oct9.setChecked(true);
            trackerHashMap.replace("btnOct9",Oct9);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct10Clicked(){
        if (trackerHashMap.get("btnOct10").getChecked()) {
            //set to not checked
            btnOct10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct10.setChecked(false);
            trackerHashMap.replace("btnOct10",Oct10);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct10.setStyle("-fx-background-color: #CE2029");
            Oct10.setChecked(true);
            trackerHashMap.replace("btnOct10",Oct10);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct11Clicked(){
        if (trackerHashMap.get("btnOct11").getChecked()) {
            //set to not checked
            btnOct11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct11.setChecked(false);
            trackerHashMap.replace("btnOct11",Oct11);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct11.setStyle("-fx-background-color: #CE2029");
            Oct11.setChecked(true);
            trackerHashMap.replace("btnOct11",Oct11);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct12Clicked(){
        if (trackerHashMap.get("btnOct12").getChecked()) {
            //set to not checked
            btnOct12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct12.setChecked(false);
            trackerHashMap.replace("btnOct12",Oct12);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct12.setStyle("-fx-background-color: #CE2029");
            Oct12.setChecked(true);
            trackerHashMap.replace("btnOct12",Oct12);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct13Clicked(){
        if (trackerHashMap.get("btnOct13").getChecked()) {
            //set to not checked
            btnOct13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct13.setChecked(false);
            trackerHashMap.replace("btnOct13",Oct13);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct13.setStyle("-fx-background-color: #CE2029");
            Oct13.setChecked(true);
            trackerHashMap.replace("btnOct13",Oct13);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct14Clicked(){
        if (trackerHashMap.get("btnOct14").getChecked()) {
            //set to not checked
            btnOct14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct14.setChecked(false);
            trackerHashMap.replace("btnOct14",Oct14);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct14.setStyle("-fx-background-color: #CE2029");
            Oct14.setChecked(true);
            trackerHashMap.replace("btnOct14",Oct14);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct15Clicked(){
        if (trackerHashMap.get("btnOct15").getChecked()) {
            //set to not checked
            btnOct15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct15.setChecked(false);
            trackerHashMap.replace("btnOct15",Oct15);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct15.setStyle("-fx-background-color: #CE2029");
            Oct15.setChecked(true);
            trackerHashMap.replace("btnOct15",Oct15);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct16Clicked(){
        if (trackerHashMap.get("btnOct16").getChecked()) {
            //set to not checked
            btnOct16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct16.setChecked(false);
            trackerHashMap.replace("btnOct16",Oct16);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct16.setStyle("-fx-background-color: #CE2029");
            Oct16.setChecked(true);
            trackerHashMap.replace("btnOct16",Oct16);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct17Clicked(){
        if (trackerHashMap.get("btnOct17").getChecked()) {
            //set to not checked
            btnOct17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct17.setChecked(false);
            trackerHashMap.replace("btnOct17",Oct17);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct17.setStyle("-fx-background-color: #CE2029");
            Oct17.setChecked(true);
            trackerHashMap.replace("btnOct17",Oct17);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct18Clicked(){
        if (trackerHashMap.get("btnOct18").getChecked()) {
            //set to not checked
            btnOct18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct18.setChecked(false);
            trackerHashMap.replace("btnOct18",Oct18);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct18.setStyle("-fx-background-color: #CE2029");
            Oct18.setChecked(true);
            trackerHashMap.replace("btnOct18",Oct18);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct19Clicked(){
        if (trackerHashMap.get("btnOct19").getChecked()) {
            //set to not checked
            btnOct19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct19.setChecked(false);
            trackerHashMap.replace("btnOct19",Oct19);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct19.setStyle("-fx-background-color: #CE2029");
            Oct19.setChecked(true);
            trackerHashMap.replace("btnOct19",Oct19);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct20Clicked(){
        if (trackerHashMap.get("btnOct20").getChecked()) {
            //set to not checked
            btnOct20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct20.setChecked(false);
            trackerHashMap.replace("btnOct20",Oct20);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct20.setStyle("-fx-background-color: #CE2029");
            Oct20.setChecked(true);
            trackerHashMap.replace("btnOct20",Oct20);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct21Clicked(){
        if (trackerHashMap.get("btnOct21").getChecked()) {
            //set to not checked
            btnOct21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct21.setChecked(false);
            trackerHashMap.replace("btnOct21",Oct21);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct21.setStyle("-fx-background-color: #CE2029");
            Oct21.setChecked(true);
            trackerHashMap.replace("btnOct21",Oct21);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct22Clicked(){
        if (trackerHashMap.get("btnOct22").getChecked()) {
            //set to not checked
            btnOct22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct22.setChecked(false);
            trackerHashMap.replace("btnOct22",Oct22);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct22.setStyle("-fx-background-color: #CE2029");
            Oct22.setChecked(true);
            trackerHashMap.replace("btnOct22",Oct22);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct23Clicked(){
        if (trackerHashMap.get("btnOct23").getChecked()) {
            //set to not checked
            btnOct23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct23.setChecked(false);
            trackerHashMap.replace("btnOct23",Oct23);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct23.setStyle("-fx-background-color: #CE2029");
            Oct23.setChecked(true);
            trackerHashMap.replace("btnOct23",Oct23);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct24Clicked(){
        if (trackerHashMap.get("btnOct24").getChecked()) {
            //set to not checked
            btnOct24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct24.setChecked(false);
            trackerHashMap.replace("btnOct24",Oct24);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct24.setStyle("-fx-background-color: #CE2029");
            Oct24.setChecked(true);
            trackerHashMap.replace("btnOct24",Oct24);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct25Clicked(){
        if (trackerHashMap.get("btnOct25").getChecked()) {
            //set to not checked
            btnOct25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct25.setChecked(false);
            trackerHashMap.replace("btnOct25",Oct25);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct25.setStyle("-fx-background-color: #CE2029");
            Oct25.setChecked(true);
            trackerHashMap.replace("btnOct25",Oct25);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct26Clicked(){
        if (trackerHashMap.get("btnOct26").getChecked()) {
            //set to not checked
            btnOct26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct26.setChecked(false);
            trackerHashMap.replace("btnOct26",Oct26);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct26.setStyle("-fx-background-color: #CE2029");
            Oct26.setChecked(true);
            trackerHashMap.replace("btnOct26",Oct26);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct27Clicked(){
        if (trackerHashMap.get("btnOct27").getChecked()) {
            //set to not checked
            btnOct27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct27.setChecked(false);
            trackerHashMap.replace("btnOct27",Oct27);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct27.setStyle("-fx-background-color: #CE2029");
            Oct27.setChecked(true);
            trackerHashMap.replace("btnOct27",Oct27);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct28Clicked(){
        if (trackerHashMap.get("btnOct28").getChecked()) {
            //set to not checked
            btnOct28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct28.setChecked(false);
            trackerHashMap.replace("btnOct28",Oct28);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct28.setStyle("-fx-background-color: #CE2029");
            Oct28.setChecked(true);
            trackerHashMap.replace("btnOct28",Oct28);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct29Clicked(){
        if (trackerHashMap.get("btnOct29").getChecked()) {
            //set to not checked
            btnOct29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct29.setChecked(false);
            trackerHashMap.replace("btnOct29",Oct29);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct29.setStyle("-fx-background-color: #CE2029");
            Oct29.setChecked(true);
            trackerHashMap.replace("btnOct29",Oct29);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct30Clicked(){
        if (trackerHashMap.get("btnOct30").getChecked()) {
            //set to not checked
            btnOct30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct30.setChecked(false);
            trackerHashMap.replace("btnOct30",Oct30);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct30.setStyle("-fx-background-color: #CE2029");
            Oct30.setChecked(true);
            trackerHashMap.replace("btnOct30",Oct30);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
    @FXML
    private void Oct31Clicked(){
        if (trackerHashMap.get("btnOct31").getChecked()) {
            //set to not checked
            btnOct31.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Oct31.setChecked(false);
            trackerHashMap.replace("btnOct31",Oct31);
            fileOut.saveHashmapOct(trackerHashMap);
        } else {
            //set to checked
            btnOct31.setStyle("-fx-background-color: #CE2029");
            Oct31.setChecked(true);
            trackerHashMap.replace("btnOct31",Oct31);
            fileOut.saveHashmapOct(trackerHashMap);
        }
    }
}
