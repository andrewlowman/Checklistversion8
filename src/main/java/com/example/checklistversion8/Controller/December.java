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

public class December implements Initializable {
    public Button btnDec1;
    public Button btnDec2;
    public Button btnDec3;
    public Button btnDec4;
    public Button btnDec5;
    public Button btnDec6;
    public Button btnDec7;
    public Button btnDec8;
    public Button btnDec9;
    public Button btnDec10;
    public Button btnDec11;
    public Button btnDec12;
    public Button btnDec13;
    public Button btnDec14;
    public Button btnDec15;
    public Button btnDec16;
    public Button btnDec17;
    public Button btnDec18;
    public Button btnDec19;
    public Button btnDec20;
    public Button btnDec21;
    public Button btnDec22;
    public Button btnDec23;
    public Button btnDec24;
    public Button btnDec25;
    public Button btnDec26;
    public Button btnDec27;
    public Button btnDec28;
    public Button btnDec29;
    public Button btnDec30;
    public Button btnDec31;

    private Tracker Dec1 = new Tracker("btnDec1");
    private Tracker Dec2 = new Tracker("btnDec2");
    private Tracker Dec3 = new Tracker("btnDec3");
    private Tracker Dec4 = new Tracker("btnDec4");
    private Tracker Dec5 = new Tracker("btnDec5");
    private Tracker Dec6= new Tracker("btnDec6");
    private Tracker Dec7= new Tracker("btnDec7");
    private Tracker Dec8= new Tracker("btnDec8");
    private Tracker Dec9= new Tracker("btnDec9");
    private Tracker Dec10= new Tracker("btnDec10");
    private Tracker Dec11= new Tracker("btnDec11");
    private Tracker Dec12= new Tracker("btnDec12");
    private Tracker Dec13= new Tracker("btnDec13");
    private Tracker Dec14= new Tracker("btnDec14");
    private Tracker Dec15= new Tracker("btnDec15");
    private Tracker Dec16= new Tracker("btnDec16");
    private Tracker Dec17= new Tracker("btnDec17");
    private Tracker Dec18= new Tracker("btnDec18");
    private Tracker Dec19= new Tracker("btnDec19");
    private Tracker Dec20= new Tracker("btnDec20");
    private Tracker Dec21= new Tracker("btnDec21");
    private Tracker Dec22= new Tracker("btnDec22");
    private Tracker Dec23= new Tracker("btnDec23");
    private Tracker Dec24= new Tracker("btnDec24");
    private Tracker Dec25= new Tracker("btnDec25");
    private Tracker Dec26= new Tracker("btnDec26");
    private Tracker Dec27= new Tracker("btnDec27");
    private Tracker Dec28= new Tracker("btnDec28");
    private Tracker Dec29= new Tracker("btnDec29");
    private Tracker Dec30= new Tracker("btnDec30");
    private Tracker Dec31= new Tracker("btnDec31");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMap = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttons.add(btnDec1);
        buttons.add(btnDec2);
        buttons.add(btnDec3);
        buttons.add(btnDec4);
        buttons.add(btnDec5);
        buttons.add(btnDec6);
        buttons.add(btnDec7);
        buttons.add(btnDec8);
        buttons.add(btnDec9);
        buttons.add(btnDec10);
        buttons.add(btnDec11);
        buttons.add(btnDec12);
        buttons.add(btnDec13);
        buttons.add(btnDec14);
        buttons.add(btnDec15);
        buttons.add(btnDec16);
        buttons.add(btnDec17);
        buttons.add(btnDec18);
        buttons.add(btnDec19);
        buttons.add(btnDec20);
        buttons.add(btnDec21);
        buttons.add(btnDec22);
        buttons.add(btnDec23);
        buttons.add(btnDec24);
        buttons.add(btnDec25);
        buttons.add(btnDec26);
        buttons.add(btnDec27);
        buttons.add(btnDec28);
        buttons.add(btnDec29);
        buttons.add(btnDec30);
        buttons.add(btnDec31);

        trackerHashMap.put("btnDec1",Dec1);
        trackerHashMap.put("btnDec2",Dec2);
        trackerHashMap.put("btnDec3",Dec3);
        trackerHashMap.put("btnDec4",Dec4);
        trackerHashMap.put("btnDec5",Dec5);
        trackerHashMap.put("btnDec6",Dec6);
        trackerHashMap.put("btnDec7",Dec7);
        trackerHashMap.put("btnDec8",Dec8);
        trackerHashMap.put("btnDec9",Dec9);
        trackerHashMap.put("btnDec10",Dec10);
        trackerHashMap.put("btnDec11",Dec11);
        trackerHashMap.put("btnDec12",Dec12);
        trackerHashMap.put("btnDec13",Dec13);
        trackerHashMap.put("btnDec14",Dec14);
        trackerHashMap.put("btnDec15",Dec15);
        trackerHashMap.put("btnDec16",Dec16);
        trackerHashMap.put("btnDec17",Dec17);
        trackerHashMap.put("btnDec18",Dec18);
        trackerHashMap.put("btnDec19",Dec19);
        trackerHashMap.put("btnDec20",Dec20);
        trackerHashMap.put("btnDec21",Dec21);
        trackerHashMap.put("btnDec22",Dec22);
        trackerHashMap.put("btnDec23",Dec23);
        trackerHashMap.put("btnDec24",Dec24);
        trackerHashMap.put("btnDec25",Dec25);
        trackerHashMap.put("btnDec26",Dec26);
        trackerHashMap.put("btnDec27",Dec27);
        trackerHashMap.put("btnDec28",Dec28);
        trackerHashMap.put("btnDec29",Dec29);
        trackerHashMap.put("btnDec30",Dec30);
        trackerHashMap.put("btnDec31",Dec31);

        File file = new File("/fileDec.ser");


        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapDec();
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
    private void Dec1Clicked(){
        if(trackerHashMap.get("btnDec1").getChecked()){
            btnDec1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec1.setChecked(false);
            trackerHashMap.replace("btnDec1",Dec1);
            fileOut.saveHashmapDec(trackerHashMap);
        }else{
            btnDec1.setStyle("-fx-background-color: #CE2029");
            Dec1.setChecked(true);
            trackerHashMap.replace("btnDec1",Dec1);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec2Clicked(){
        if (trackerHashMap.get("btnDec2").getChecked()) {
            //set to not checked
            btnDec2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec2.setChecked(false);
            trackerHashMap.replace("btnDec2",Dec2);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec2.setStyle("-fx-background-color: #CE2029");
            Dec2.setChecked(true);
            trackerHashMap.replace("btnDec2",Dec2);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }

    @FXML
    private void Dec3Clicked(){
        if (trackerHashMap.get("btnDec3").getChecked()) {
            //set to not checked
            btnDec3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec3.setChecked(false);
            trackerHashMap.replace("btnDec3",Dec3);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec3.setStyle("-fx-background-color: #CE2029");
            Dec3.setChecked(true);
            trackerHashMap.replace("btnDec3",Dec3);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }

    @FXML
    private void Dec4Clicked(){
        if (trackerHashMap.get("btnDec4").getChecked()) {
            //set to not checked
            btnDec4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec4.setChecked(false);
            trackerHashMap.replace("btnDec4",Dec4);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec4.setStyle("-fx-background-color: #CE2029");
            Dec4.setChecked(true);
            trackerHashMap.replace("btnDec4",Dec4);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec5Clicked(){
        if (trackerHashMap.get("btnDec5").getChecked()) {
            //set to not checked
            btnDec5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec5.setChecked(false);
            trackerHashMap.replace("btnDec5",Dec5);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec5.setStyle("-fx-background-color: #CE2029");
            Dec5.setChecked(true);
            trackerHashMap.replace("btnDec5",Dec5);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec6Clicked(){
        if (trackerHashMap.get("btnDec6").getChecked()) {
            //set to not checked
            btnDec6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec6.setChecked(false);
            trackerHashMap.replace("btnDec6",Dec6);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec6.setStyle("-fx-background-color: #CE2029");
            Dec6.setChecked(true);
            trackerHashMap.replace("btnDec6",Dec6);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec7Clicked(){
        if (trackerHashMap.get("btnDec7").getChecked()) {
            //set to not checked
            btnDec7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec7.setChecked(false);
            trackerHashMap.replace("btnDec7",Dec7);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec7.setStyle("-fx-background-color: #CE2029");
            Dec7.setChecked(true);
            trackerHashMap.replace("btnDec7",Dec7);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec8Clicked(){
        if (trackerHashMap.get("btnDec8").getChecked()) {
            //set to not checked
            btnDec8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec8.setChecked(false);
            trackerHashMap.replace("btnDec8",Dec8);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec8.setStyle("-fx-background-color: #CE2029");
            Dec8.setChecked(true);
            trackerHashMap.replace("btnDec8",Dec8);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec9Clicked(){
        if (trackerHashMap.get("btnDec9").getChecked()) {
            //set to not checked
            btnDec9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec9.setChecked(false);
            trackerHashMap.replace("btnDec9",Dec9);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec9.setStyle("-fx-background-color: #CE2029");
            Dec9.setChecked(true);
            trackerHashMap.replace("btnDec9",Dec9);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec10Clicked(){
        if (trackerHashMap.get("btnDec10").getChecked()) {
            //set to not checked
            btnDec10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec10.setChecked(false);
            trackerHashMap.replace("btnDec10",Dec10);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec10.setStyle("-fx-background-color: #CE2029");
            Dec10.setChecked(true);
            trackerHashMap.replace("btnDec10",Dec10);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec11Clicked(){
        if (trackerHashMap.get("btnDec11").getChecked()) {
            //set to not checked
            btnDec11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec11.setChecked(false);
            trackerHashMap.replace("btnDec11",Dec11);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec11.setStyle("-fx-background-color: #CE2029");
            Dec11.setChecked(true);
            trackerHashMap.replace("btnDec11",Dec11);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec12Clicked(){
        if (trackerHashMap.get("btnDec12").getChecked()) {
            //set to not checked
            btnDec12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec12.setChecked(false);
            trackerHashMap.replace("btnDec12",Dec12);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec12.setStyle("-fx-background-color: #CE2029");
            Dec12.setChecked(true);
            trackerHashMap.replace("btnDec12",Dec12);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec13Clicked(){
        if (trackerHashMap.get("btnDec13").getChecked()) {
            //set to not checked
            btnDec13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec13.setChecked(false);
            trackerHashMap.replace("btnDec13",Dec13);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec13.setStyle("-fx-background-color: #CE2029");
            Dec13.setChecked(true);
            trackerHashMap.replace("btnDec13",Dec13);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec14Clicked(){
        if (trackerHashMap.get("btnDec14").getChecked()) {
            //set to not checked
            btnDec14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec14.setChecked(false);
            trackerHashMap.replace("btnDec14",Dec14);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec14.setStyle("-fx-background-color: #CE2029");
            Dec14.setChecked(true);
            trackerHashMap.replace("btnDec14",Dec14);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec15Clicked(){
        if (trackerHashMap.get("btnDec15").getChecked()) {
            //set to not checked
            btnDec15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec15.setChecked(false);
            trackerHashMap.replace("btnDec15",Dec15);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec15.setStyle("-fx-background-color: #CE2029");
            Dec15.setChecked(true);
            trackerHashMap.replace("btnDec15",Dec15);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec16Clicked(){
        if (trackerHashMap.get("btnDec16").getChecked()) {
            //set to not checked
            btnDec16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec16.setChecked(false);
            trackerHashMap.replace("btnDec16",Dec16);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec16.setStyle("-fx-background-color: #CE2029");
            Dec16.setChecked(true);
            trackerHashMap.replace("btnDec16",Dec16);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec17Clicked(){
        if (trackerHashMap.get("btnDec17").getChecked()) {
            //set to not checked
            btnDec17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec17.setChecked(false);
            trackerHashMap.replace("btnDec17",Dec17);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec17.setStyle("-fx-background-color: #CE2029");
            Dec17.setChecked(true);
            trackerHashMap.replace("btnDec17",Dec17);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec18Clicked(){
        if (trackerHashMap.get("btnDec18").getChecked()) {
            //set to not checked
            btnDec18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec18.setChecked(false);
            trackerHashMap.replace("btnDec18",Dec18);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec18.setStyle("-fx-background-color: #CE2029");
            Dec18.setChecked(true);
            trackerHashMap.replace("btnDec18",Dec18);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec19Clicked(){
        if (trackerHashMap.get("btnDec19").getChecked()) {
            //set to not checked
            btnDec19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec19.setChecked(false);
            trackerHashMap.replace("btnDec19",Dec19);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec19.setStyle("-fx-background-color: #CE2029");
            Dec19.setChecked(true);
            trackerHashMap.replace("btnDec19",Dec19);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec20Clicked(){
        if (trackerHashMap.get("btnDec20").getChecked()) {
            //set to not checked
            btnDec20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec20.setChecked(false);
            trackerHashMap.replace("btnDec20",Dec20);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec20.setStyle("-fx-background-color: #CE2029");
            Dec20.setChecked(true);
            trackerHashMap.replace("btnDec20",Dec20);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec21Clicked(){
        if (trackerHashMap.get("btnDec21").getChecked()) {
            //set to not checked
            btnDec21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec21.setChecked(false);
            trackerHashMap.replace("btnDec21",Dec21);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec21.setStyle("-fx-background-color: #CE2029");
            Dec21.setChecked(true);
            trackerHashMap.replace("btnDec21",Dec21);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec22Clicked(){
        if (trackerHashMap.get("btnDec22").getChecked()) {
            //set to not checked
            btnDec22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec22.setChecked(false);
            trackerHashMap.replace("btnDec22",Dec22);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec22.setStyle("-fx-background-color: #CE2029");
            Dec22.setChecked(true);
            trackerHashMap.replace("btnDec22",Dec22);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec23Clicked(){
        if (trackerHashMap.get("btnDec23").getChecked()) {
            //set to not checked
            btnDec23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec23.setChecked(false);
            trackerHashMap.replace("btnDec23",Dec23);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec23.setStyle("-fx-background-color: #CE2029");
            Dec23.setChecked(true);
            trackerHashMap.replace("btnDec23",Dec23);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec24Clicked(){
        if (trackerHashMap.get("btnDec24").getChecked()) {
            //set to not checked
            btnDec24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec24.setChecked(false);
            trackerHashMap.replace("btnDec24",Dec24);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec24.setStyle("-fx-background-color: #CE2029");
            Dec24.setChecked(true);
            trackerHashMap.replace("btnDec24",Dec24);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec25Clicked(){
        if (trackerHashMap.get("btnDec25").getChecked()) {
            //set to not checked
            btnDec25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec25.setChecked(false);
            trackerHashMap.replace("btnDec25",Dec25);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec25.setStyle("-fx-background-color: #CE2029");
            Dec25.setChecked(true);
            trackerHashMap.replace("btnDec25",Dec25);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec26Clicked(){
        if (trackerHashMap.get("btnDec26").getChecked()) {
            //set to not checked
            btnDec26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec26.setChecked(false);
            trackerHashMap.replace("btnDec26",Dec26);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec26.setStyle("-fx-background-color: #CE2029");
            Dec26.setChecked(true);
            trackerHashMap.replace("btnDec26",Dec26);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec27Clicked(){
        if (trackerHashMap.get("btnDec27").getChecked()) {
            //set to not checked
            btnDec27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec27.setChecked(false);
            trackerHashMap.replace("btnDec27",Dec27);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec27.setStyle("-fx-background-color: #CE2029");
            Dec27.setChecked(true);
            trackerHashMap.replace("btnDec27",Dec27);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec28Clicked(){
        if (trackerHashMap.get("btnDec28").getChecked()) {
            //set to not checked
            btnDec28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec28.setChecked(false);
            trackerHashMap.replace("btnDec28",Dec28);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec28.setStyle("-fx-background-color: #CE2029");
            Dec28.setChecked(true);
            trackerHashMap.replace("btnDec28",Dec28);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec29Clicked(){
        if (trackerHashMap.get("btnDec29").getChecked()) {
            //set to not checked
            btnDec29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec29.setChecked(false);
            trackerHashMap.replace("btnDec29",Dec29);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec29.setStyle("-fx-background-color: #CE2029");
            Dec29.setChecked(true);
            trackerHashMap.replace("btnDec29",Dec29);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec30Clicked(){
        if (trackerHashMap.get("btnDec30").getChecked()) {
            //set to not checked
            btnDec30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec30.setChecked(false);
            trackerHashMap.replace("btnDec30",Dec30);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec30.setStyle("-fx-background-color: #CE2029");
            Dec30.setChecked(true);
            trackerHashMap.replace("btnDec30",Dec30);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
    @FXML
    private void Dec31Clicked(){
        if (trackerHashMap.get("btnDec31").getChecked()) {
            //set to not checked
            btnDec31.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            Dec31.setChecked(false);
            trackerHashMap.replace("btnDec31",Dec31);
            fileOut.saveHashmapDec(trackerHashMap);
        } else {
            //set to checked
            btnDec31.setStyle("-fx-background-color: #CE2029");
            Dec31.setChecked(true);
            trackerHashMap.replace("btnDec31",Dec31);
            fileOut.saveHashmapDec(trackerHashMap);
        }
    }
}
