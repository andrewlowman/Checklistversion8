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

public class July implements Initializable {
    public Button btnJuly1;
    public Button btnJuly2;
    public Button btnJuly3;
    public Button btnJuly4;
    public Button btnJuly5;
    public Button btnJuly6;
    public Button btnJuly7;
    public Button btnJuly8;
    public Button btnJuly9;
    public Button btnJuly10;
    public Button btnJuly11;
    public Button btnJuly12;
    public Button btnJuly13;
    public Button btnJuly14;
    public Button btnJuly15;
    public Button btnJuly16;
    public Button btnJuly17;
    public Button btnJuly18;
    public Button btnJuly19;
    public Button btnJuly20;
    public Button btnJuly21;
    public Button btnJuly22;
    public Button btnJuly23;
    public Button btnJuly24;
    public Button btnJuly25;
    public Button btnJuly26;
    public Button btnJuly27;
    public Button btnJuly28;
    public Button btnJuly29;
    public Button btnJuly30;
    public Button btnJuly31;

    private Tracker July1 = new Tracker("btnJuly1");
    private Tracker July2 = new Tracker("btnJuly2");
    private Tracker July3 = new Tracker("btnJuly3");
    private Tracker July4 = new Tracker("btnJuly4");
    private Tracker July5 = new Tracker("btnJuly5");
    private Tracker July6= new Tracker("btnJuly6");
    private Tracker July7= new Tracker("btnJuly7");
    private Tracker July8= new Tracker("btnJuly8");
    private Tracker July9= new Tracker("btnJuly9");
    private Tracker July10= new Tracker("btnJuly10");
    private Tracker July11= new Tracker("btnJuly11");
    private Tracker July12= new Tracker("btnJuly12");
    private Tracker July13= new Tracker("btnJuly13");
    private Tracker July14= new Tracker("btnJuly14");
    private Tracker July15= new Tracker("btnJuly15");
    private Tracker July16= new Tracker("btnJuly16");
    private Tracker July17= new Tracker("btnJuly17");
    private Tracker July18= new Tracker("btnJuly18");
    private Tracker July19= new Tracker("btnJuly19");
    private Tracker July20= new Tracker("btnJuly20");
    private Tracker July21= new Tracker("btnJuly21");
    private Tracker July22= new Tracker("btnJuly22");
    private Tracker July23= new Tracker("btnJuly23");
    private Tracker July24= new Tracker("btnJuly24");
    private Tracker July25= new Tracker("btnJuly25");
    private Tracker July26= new Tracker("btnJuly26");
    private Tracker July27= new Tracker("btnJuly27");
    private Tracker July28= new Tracker("btnJuly28");
    private Tracker July29= new Tracker("btnJuly29");
    private Tracker July30= new Tracker("btnJuly30");
    private Tracker July31= new Tracker("btnJuly31");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMap = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttons.add(btnJuly1);
        buttons.add(btnJuly2);
        buttons.add(btnJuly3);
        buttons.add(btnJuly4);
        buttons.add(btnJuly5);
        buttons.add(btnJuly6);
        buttons.add(btnJuly7);
        buttons.add(btnJuly8);
        buttons.add(btnJuly9);
        buttons.add(btnJuly10);
        buttons.add(btnJuly11);
        buttons.add(btnJuly12);
        buttons.add(btnJuly13);
        buttons.add(btnJuly14);
        buttons.add(btnJuly15);
        buttons.add(btnJuly16);
        buttons.add(btnJuly17);
        buttons.add(btnJuly18);
        buttons.add(btnJuly19);
        buttons.add(btnJuly20);
        buttons.add(btnJuly21);
        buttons.add(btnJuly22);
        buttons.add(btnJuly23);
        buttons.add(btnJuly24);
        buttons.add(btnJuly25);
        buttons.add(btnJuly26);
        buttons.add(btnJuly27);
        buttons.add(btnJuly28);
        buttons.add(btnJuly29);
        buttons.add(btnJuly30);
        buttons.add(btnJuly31);

        trackerHashMap.put("btnJuly1",July1);
        trackerHashMap.put("btnJuly2",July2);
        trackerHashMap.put("btnJuly3",July3);
        trackerHashMap.put("btnJuly4",July4);
        trackerHashMap.put("btnJuly5",July5);
        trackerHashMap.put("btnJuly6",July6);
        trackerHashMap.put("btnJuly7",July7);
        trackerHashMap.put("btnJuly8",July8);
        trackerHashMap.put("btnJuly9",July9);
        trackerHashMap.put("btnJuly10",July10);
        trackerHashMap.put("btnJuly11",July11);
        trackerHashMap.put("btnJuly12",July12);
        trackerHashMap.put("btnJuly13",July13);
        trackerHashMap.put("btnJuly14",July14);
        trackerHashMap.put("btnJuly15",July15);
        trackerHashMap.put("btnJuly16",July16);
        trackerHashMap.put("btnJuly17",July17);
        trackerHashMap.put("btnJuly18",July18);
        trackerHashMap.put("btnJuly19",July19);
        trackerHashMap.put("btnJuly20",July20);
        trackerHashMap.put("btnJuly21",July21);
        trackerHashMap.put("btnJuly22",July22);
        trackerHashMap.put("btnJuly23",July23);
        trackerHashMap.put("btnJuly24",July24);
        trackerHashMap.put("btnJuly25",July25);
        trackerHashMap.put("btnJuly26",July26);
        trackerHashMap.put("btnJuly27",July27);
        trackerHashMap.put("btnJuly28",July28);
        trackerHashMap.put("btnJuly29",July29);
        trackerHashMap.put("btnJuly30",July30);
        trackerHashMap.put("btnJuly31",July31);

        File file = new File("/fileJuly.ser");


        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapJuly();
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
    private void July1Clicked(){
        if(trackerHashMap.get("btnJuly1").getChecked()){
            btnJuly1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July1.setChecked(false);
            trackerHashMap.replace("btnJuly1",July1);
            fileOut.saveHashmapJuly(trackerHashMap);
        }else{
            btnJuly1.setStyle("-fx-background-color: #CE2029");
            July1.setChecked(true);
            trackerHashMap.replace("btnJuly1",July1);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July2Clicked(){
        if (trackerHashMap.get("btnJuly2").getChecked()) {
            //set to not checked
            btnJuly2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July2.setChecked(false);
            trackerHashMap.replace("btnJuly2",July2);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly2.setStyle("-fx-background-color: #CE2029");
            July2.setChecked(true);
            trackerHashMap.replace("btnJuly2",July2);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }

    @FXML
    private void July3Clicked(){
        if (trackerHashMap.get("btnJuly3").getChecked()) {
            //set to not checked
            btnJuly3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July3.setChecked(false);
            trackerHashMap.replace("btnJuly3",July3);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly3.setStyle("-fx-background-color: #CE2029");
            July3.setChecked(true);
            trackerHashMap.replace("btnJuly3",July3);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }

    @FXML
    private void July4Clicked(){
        if (trackerHashMap.get("btnJuly4").getChecked()) {
            //set to not checked
            btnJuly4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July4.setChecked(false);
            trackerHashMap.replace("btnJuly4",July4);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly4.setStyle("-fx-background-color: #CE2029");
            July4.setChecked(true);
            trackerHashMap.replace("btnJuly4",July4);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July5Clicked(){
        if (trackerHashMap.get("btnJuly5").getChecked()) {
            //set to not checked
            btnJuly5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July5.setChecked(false);
            trackerHashMap.replace("btnJuly5",July5);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly5.setStyle("-fx-background-color: #CE2029");
            July5.setChecked(true);
            trackerHashMap.replace("btnJuly5",July5);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July6Clicked(){
        if (trackerHashMap.get("btnJuly6").getChecked()) {
            //set to not checked
            btnJuly6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July6.setChecked(false);
            trackerHashMap.replace("btnJuly6",July6);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly6.setStyle("-fx-background-color: #CE2029");
            July6.setChecked(true);
            trackerHashMap.replace("btnJuly6",July6);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July7Clicked(){
        if (trackerHashMap.get("btnJuly7").getChecked()) {
            //set to not checked
            btnJuly7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July7.setChecked(false);
            trackerHashMap.replace("btnJuly7",July7);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly7.setStyle("-fx-background-color: #CE2029");
            July7.setChecked(true);
            trackerHashMap.replace("btnJuly7",July7);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July8Clicked(){
        if (trackerHashMap.get("btnJuly8").getChecked()) {
            //set to not checked
            btnJuly8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July8.setChecked(false);
            trackerHashMap.replace("btnJuly8",July8);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly8.setStyle("-fx-background-color: #CE2029");
            July8.setChecked(true);
            trackerHashMap.replace("btnJuly8",July8);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July9Clicked(){
        if (trackerHashMap.get("btnJuly9").getChecked()) {
            //set to not checked
            btnJuly9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July9.setChecked(false);
            trackerHashMap.replace("btnJuly9",July9);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly9.setStyle("-fx-background-color: #CE2029");
            July9.setChecked(true);
            trackerHashMap.replace("btnJuly9",July9);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July10Clicked(){
        if (trackerHashMap.get("btnJuly10").getChecked()) {
            //set to not checked
            btnJuly10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July10.setChecked(false);
            trackerHashMap.replace("btnJuly10",July10);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly10.setStyle("-fx-background-color: #CE2029");
            July10.setChecked(true);
            trackerHashMap.replace("btnJuly10",July10);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July11Clicked(){
        if (trackerHashMap.get("btnJuly11").getChecked()) {
            //set to not checked
            btnJuly11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July11.setChecked(false);
            trackerHashMap.replace("btnJuly11",July11);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly11.setStyle("-fx-background-color: #CE2029");
            July11.setChecked(true);
            trackerHashMap.replace("btnJuly11",July11);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July12Clicked(){
        if (trackerHashMap.get("btnJuly12").getChecked()) {
            //set to not checked
            btnJuly12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July12.setChecked(false);
            trackerHashMap.replace("btnJuly12",July12);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly12.setStyle("-fx-background-color: #CE2029");
            July12.setChecked(true);
            trackerHashMap.replace("btnJuly12",July12);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July13Clicked(){
        if (trackerHashMap.get("btnJuly13").getChecked()) {
            //set to not checked
            btnJuly13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July13.setChecked(false);
            trackerHashMap.replace("btnJuly13",July13);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly13.setStyle("-fx-background-color: #CE2029");
            July13.setChecked(true);
            trackerHashMap.replace("btnJuly13",July13);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July14Clicked(){
        if (trackerHashMap.get("btnJuly14").getChecked()) {
            //set to not checked
            btnJuly14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July14.setChecked(false);
            trackerHashMap.replace("btnJuly14",July14);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly14.setStyle("-fx-background-color: #CE2029");
            July14.setChecked(true);
            trackerHashMap.replace("btnJuly14",July14);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July15Clicked(){
        if (trackerHashMap.get("btnJuly15").getChecked()) {
            //set to not checked
            btnJuly15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July15.setChecked(false);
            trackerHashMap.replace("btnJuly15",July15);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly15.setStyle("-fx-background-color: #CE2029");
            July15.setChecked(true);
            trackerHashMap.replace("btnJuly15",July15);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July16Clicked(){
        if (trackerHashMap.get("btnJuly16").getChecked()) {
            //set to not checked
            btnJuly16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July16.setChecked(false);
            trackerHashMap.replace("btnJuly16",July16);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly16.setStyle("-fx-background-color: #CE2029");
            July16.setChecked(true);
            trackerHashMap.replace("btnJuly16",July16);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July17Clicked(){
        if (trackerHashMap.get("btnJuly17").getChecked()) {
            //set to not checked
            btnJuly17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July17.setChecked(false);
            trackerHashMap.replace("btnJuly17",July17);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly17.setStyle("-fx-background-color: #CE2029");
            July17.setChecked(true);
            trackerHashMap.replace("btnJuly17",July17);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July18Clicked(){
        if (trackerHashMap.get("btnJuly18").getChecked()) {
            //set to not checked
            btnJuly18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July18.setChecked(false);
            trackerHashMap.replace("btnJuly18",July18);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly18.setStyle("-fx-background-color: #CE2029");
            July18.setChecked(true);
            trackerHashMap.replace("btnJuly18",July18);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July19Clicked(){
        if (trackerHashMap.get("btnJuly19").getChecked()) {
            //set to not checked
            btnJuly19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July19.setChecked(false);
            trackerHashMap.replace("btnJuly19",July19);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly19.setStyle("-fx-background-color: #CE2029");
            July19.setChecked(true);
            trackerHashMap.replace("btnJuly19",July19);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July20Clicked(){
        if (trackerHashMap.get("btnJuly20").getChecked()) {
            //set to not checked
            btnJuly20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July20.setChecked(false);
            trackerHashMap.replace("btnJuly20",July20);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly20.setStyle("-fx-background-color: #CE2029");
            July20.setChecked(true);
            trackerHashMap.replace("btnJuly20",July20);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July21Clicked(){
        if (trackerHashMap.get("btnJuly21").getChecked()) {
            //set to not checked
            btnJuly21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July21.setChecked(false);
            trackerHashMap.replace("btnJuly21",July21);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly21.setStyle("-fx-background-color: #CE2029");
            July21.setChecked(true);
            trackerHashMap.replace("btnJuly21",July21);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July22Clicked(){
        if (trackerHashMap.get("btnJuly22").getChecked()) {
            //set to not checked
            btnJuly22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July22.setChecked(false);
            trackerHashMap.replace("btnJuly22",July22);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly22.setStyle("-fx-background-color: #CE2029");
            July22.setChecked(true);
            trackerHashMap.replace("btnJuly22",July22);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July23Clicked(){
        if (trackerHashMap.get("btnJuly23").getChecked()) {
            //set to not checked
            btnJuly23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July23.setChecked(false);
            trackerHashMap.replace("btnJuly23",July23);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly23.setStyle("-fx-background-color: #CE2029");
            July23.setChecked(true);
            trackerHashMap.replace("btnJuly23",July23);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July24Clicked(){
        if (trackerHashMap.get("btnJuly24").getChecked()) {
            //set to not checked
            btnJuly24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July24.setChecked(false);
            trackerHashMap.replace("btnJuly24",July24);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly24.setStyle("-fx-background-color: #CE2029");
            July24.setChecked(true);
            trackerHashMap.replace("btnJuly24",July24);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July25Clicked(){
        if (trackerHashMap.get("btnJuly25").getChecked()) {
            //set to not checked
            btnJuly25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July25.setChecked(false);
            trackerHashMap.replace("btnJuly25",July25);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly25.setStyle("-fx-background-color: #CE2029");
            July25.setChecked(true);
            trackerHashMap.replace("btnJuly25",July25);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July26Clicked(){
        if (trackerHashMap.get("btnJuly26").getChecked()) {
            //set to not checked
            btnJuly26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July26.setChecked(false);
            trackerHashMap.replace("btnJuly26",July26);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly26.setStyle("-fx-background-color: #CE2029");
            July26.setChecked(true);
            trackerHashMap.replace("btnJuly26",July26);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July27Clicked(){
        if (trackerHashMap.get("btnJuly27").getChecked()) {
            //set to not checked
            btnJuly27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July27.setChecked(false);
            trackerHashMap.replace("btnJuly27",July27);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly27.setStyle("-fx-background-color: #CE2029");
            July27.setChecked(true);
            trackerHashMap.replace("btnJuly27",July27);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July28Clicked(){
        if (trackerHashMap.get("btnJuly28").getChecked()) {
            //set to not checked
            btnJuly28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July28.setChecked(false);
            trackerHashMap.replace("btnJuly28",July28);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly28.setStyle("-fx-background-color: #CE2029");
            July28.setChecked(true);
            trackerHashMap.replace("btnJuly28",July28);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July29Clicked(){
        if (trackerHashMap.get("btnJuly29").getChecked()) {
            //set to not checked
            btnJuly29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July29.setChecked(false);
            trackerHashMap.replace("btnJuly29",July29);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly29.setStyle("-fx-background-color: #CE2029");
            July29.setChecked(true);
            trackerHashMap.replace("btnJuly29",July29);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July30Clicked(){
        if (trackerHashMap.get("btnJuly30").getChecked()) {
            //set to not checked
            btnJuly30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July30.setChecked(false);
            trackerHashMap.replace("btnJuly30",July30);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly30.setStyle("-fx-background-color: #CE2029");
            July30.setChecked(true);
            trackerHashMap.replace("btnJuly30",July30);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
    @FXML
    private void July31Clicked(){
        if (trackerHashMap.get("btnJuly31").getChecked()) {
            //set to not checked
            btnJuly31.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            July31.setChecked(false);
            trackerHashMap.replace("btnJuly31",July31);
            fileOut.saveHashmapJuly(trackerHashMap);
        } else {
            //set to checked
            btnJuly31.setStyle("-fx-background-color: #CE2029");
            July31.setChecked(true);
            trackerHashMap.replace("btnJuly31",July31);
            fileOut.saveHashmapJuly(trackerHashMap);
        }
    }
}
