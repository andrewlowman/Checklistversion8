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

public class April implements Initializable {
    public Button btnApril1;
    public Button btnApril2;
    public Button btnApril3;
    public Button btnApril4;
    public Button btnApril5;
    public Button btnApril6;
    public Button btnApril7;
    public Button btnApril8;
    public Button btnApril9;
    public Button btnApril10;
    public Button btnApril11;
    public Button btnApril12;
    public Button btnApril13;
    public Button btnApril14;
    public Button btnApril15;
    public Button btnApril16;
    public Button btnApril17;
    public Button btnApril18;
    public Button btnApril19;
    public Button btnApril20;
    public Button btnApril21;
    public Button btnApril22;
    public Button btnApril23;
    public Button btnApril24;
    public Button btnApril25;
    public Button btnApril26;
    public Button btnApril27;
    public Button btnApril28;
    public Button btnApril29;
    public Button btnApril30;

    private Tracker April1 = new Tracker("btnApril1");
    private Tracker April2 = new Tracker("btnApril2");
    private Tracker April3 = new Tracker("btnApril3");
    private Tracker April4 = new Tracker("btnApril4");
    private Tracker April5 = new Tracker("btnApril5");
    private Tracker April6= new Tracker("btnApril6");
    private Tracker April7= new Tracker("btnApril7");
    private Tracker April8= new Tracker("btnApril8");
    private Tracker April9= new Tracker("btnApril9");
    private Tracker April10= new Tracker("btnApril10");
    private Tracker April11= new Tracker("btnApril11");
    private Tracker April12= new Tracker("btnApril12");
    private Tracker April13= new Tracker("btnApril13");
    private Tracker April14= new Tracker("btnApril14");
    private Tracker April15= new Tracker("btnApril15");
    private Tracker April16= new Tracker("btnApril16");
    private Tracker April17= new Tracker("btnApril17");
    private Tracker April18= new Tracker("btnApril18");
    private Tracker April19= new Tracker("btnApril19");
    private Tracker April20= new Tracker("btnApril20");
    private Tracker April21= new Tracker("btnApril21");
    private Tracker April22= new Tracker("btnApril22");
    private Tracker April23= new Tracker("btnApril23");
    private Tracker April24= new Tracker("btnApril24");
    private Tracker April25= new Tracker("btnApril25");
    private Tracker April26= new Tracker("btnApril26");
    private Tracker April27= new Tracker("btnApril27");
    private Tracker April28= new Tracker("btnApril28");
    private Tracker April29= new Tracker("btnApril29");
    private Tracker April30 =new Tracker("btnApril30");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    //private Tracker[] trackers = new Tracker[30];
    //private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttonsApril = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMapApril = new HashMap<>();
    //use hashmap

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttonsApril.add(btnApril1);
        buttonsApril.add(btnApril2);
        buttonsApril.add(btnApril3);
        buttonsApril.add(btnApril4);
        buttonsApril.add(btnApril5);
        buttonsApril.add(btnApril6);
        buttonsApril.add(btnApril7);
        buttonsApril.add(btnApril8);
        buttonsApril.add(btnApril9);
        buttonsApril.add(btnApril10);
        buttonsApril.add(btnApril11);
        buttonsApril.add(btnApril12);
        buttonsApril.add(btnApril13);
        buttonsApril.add(btnApril14);
        buttonsApril.add(btnApril15);
        buttonsApril.add(btnApril16);
        buttonsApril.add(btnApril17);
        buttonsApril.add(btnApril18);
        buttonsApril.add(btnApril19);
        buttonsApril.add(btnApril20);
        buttonsApril.add(btnApril21);
        buttonsApril.add(btnApril22);
        buttonsApril.add(btnApril23);
        buttonsApril.add(btnApril24);
        buttonsApril.add(btnApril25);
        buttonsApril.add(btnApril26);
        buttonsApril.add(btnApril27);
        buttonsApril.add(btnApril28);
        buttonsApril.add(btnApril29);
        buttonsApril.add(btnApril30);

        trackerHashMapApril.put("btnApril1",April1);
        trackerHashMapApril.put("btnApril2",April2);
        trackerHashMapApril.put("btnApril3",April3);
        trackerHashMapApril.put("btnApril4",April4);
        trackerHashMapApril.put("btnApril5",April5);
        trackerHashMapApril.put("btnApril6",April6);
        trackerHashMapApril.put("btnApril7",April7);
        trackerHashMapApril.put("btnApril8",April8);
        trackerHashMapApril.put("btnApril9",April9);
        trackerHashMapApril.put("btnApril10",April10);
        trackerHashMapApril.put("btnApril11",April11);
        trackerHashMapApril.put("btnApril12",April12);
        trackerHashMapApril.put("btnApril13",April13);
        trackerHashMapApril.put("btnApril14",April14);
        trackerHashMapApril.put("btnApril15",April15);
        trackerHashMapApril.put("btnApril16",April16);
        trackerHashMapApril.put("btnApril17",April17);
        trackerHashMapApril.put("btnApril18",April18);
        trackerHashMapApril.put("btnApril19",April19);
        trackerHashMapApril.put("btnApril20",April20);
        trackerHashMapApril.put("btnApril21",April21);
        trackerHashMapApril.put("btnApril22",April22);
        trackerHashMapApril.put("btnApril23",April23);
        trackerHashMapApril.put("btnApril24",April24);
        trackerHashMapApril.put("btnApril25",April25);
        trackerHashMapApril.put("btnApril26",April26);
        trackerHashMapApril.put("btnApril27",April27);
        trackerHashMapApril.put("btnApril28",April28);
        trackerHashMapApril.put("btnApril29",April29);
        trackerHashMapApril.put("btnApril30",April30);

        //System.out.println(trackerHashMapApril);

        //System.out.println("Trackers in initialize: " +trackers);
        File file = new File("/fileApril2.ser");

        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapApril();
            System.out.println("NewHM April: " + newHM);
            replaceHashMap(newHM);
            loadbuttonsAprilHashMap(trackerHashMapApril);

        }
    }


    private void loadbuttonsAprilHashMap(HashMap<String,Tracker> hm){
        System.out.println("trackerHashMapApril at start of loadbuttonsApril: " + trackerHashMapApril);
        for(Map.Entry<String,Tracker> entry:hm.entrySet()){
            if(entry.getValue().getChecked()){
                findButtonHashMap(entry.getValue().getButtonName());
            }
        }
    }

    private void findButtonHashMap(String name){
        for(Button button:buttonsApril){
            if(button.getId().equals(name)){
                button.setStyle("-fx-background-color: #CE2029");
            }
        }
    }

    private void replaceHashMap(HashMap<String,Tracker> newHM){
        trackerHashMapApril.clear();
        for(Map.Entry<String,Tracker> entry: newHM.entrySet()){
            trackerHashMapApril.put(entry.getKey(), entry.getValue());
        }
    }

    @FXML
    private void April1Clicked(){
        if(trackerHashMapApril.get("btnApril1").getChecked()){
            btnApril1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April1.setChecked(false);
            trackerHashMapApril.replace("btnApril1",April1);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }else{
            btnApril1.setStyle("-fx-background-color: #CE2029");
            April1.setChecked(true);
            trackerHashMapApril.replace("btnApril1",April1);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April2Clicked(){
        if (trackerHashMapApril.get("btnApril2").getChecked()) {
            //set to not checked
            btnApril2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April2.setChecked(false);
            trackerHashMapApril.replace("btnApril2",April2);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril2.setStyle("-fx-background-color: #CE2029");
            April2.setChecked(true);
            trackerHashMapApril.replace("btnApril2",April2);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }

    @FXML
    private void April3Clicked(){
        if (trackerHashMapApril.get("btnApril3").getChecked()) {
            //set to not checked
            btnApril3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April3.setChecked(false);
            trackerHashMapApril.replace("btnApril3",April3);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril3.setStyle("-fx-background-color: #CE2029");
            April3.setChecked(true);
            trackerHashMapApril.replace("btnApril3",April3);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }

    @FXML
    private void April4Clicked(){
        if (trackerHashMapApril.get("btnApril4").getChecked()) {
            //set to not checked
            btnApril4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April4.setChecked(false);
            trackerHashMapApril.replace("btnApril4",April4);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril4.setStyle("-fx-background-color: #CE2029");
            April4.setChecked(true);
            trackerHashMapApril.replace("btnApril4",April4);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April5Clicked(){
        if (trackerHashMapApril.get("btnApril5").getChecked()) {
            //set to not checked
            btnApril5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April5.setChecked(false);
            trackerHashMapApril.replace("btnApril5",April5);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril5.setStyle("-fx-background-color: #CE2029");
            April5.setChecked(true);
            trackerHashMapApril.replace("btnApril5",April5);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April6Clicked(){
        if (trackerHashMapApril.get("btnApril6").getChecked()) {
            //set to not checked
            btnApril6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April6.setChecked(false);
            trackerHashMapApril.replace("btnApril6",April6);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril6.setStyle("-fx-background-color: #CE2029");
            April6.setChecked(true);
            trackerHashMapApril.replace("btnApril6",April6);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April7Clicked(){
        if (trackerHashMapApril.get("btnApril7").getChecked()) {
            //set to not checked
            btnApril7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April7.setChecked(false);
            trackerHashMapApril.replace("btnApril7",April7);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril7.setStyle("-fx-background-color: #CE2029");
            April7.setChecked(true);
            trackerHashMapApril.replace("btnApril7",April7);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April8Clicked(){
        if (trackerHashMapApril.get("btnApril8").getChecked()) {
            //set to not checked
            btnApril8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April8.setChecked(false);
            trackerHashMapApril.replace("btnApril8",April8);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril8.setStyle("-fx-background-color: #CE2029");
            April8.setChecked(true);
            trackerHashMapApril.replace("btnApril8",April8);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April9Clicked(){
        if (trackerHashMapApril.get("btnApril9").getChecked()) {
            //set to not checked
            btnApril9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April9.setChecked(false);
            trackerHashMapApril.replace("btnApril9",April9);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril9.setStyle("-fx-background-color: #CE2029");
            April9.setChecked(true);
            trackerHashMapApril.replace("btnApril9",April9);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April10Clicked(){
        if (trackerHashMapApril.get("btnApril10").getChecked()) {
            //set to not checked
            btnApril10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April10.setChecked(false);
            trackerHashMapApril.replace("btnApril10",April10);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril10.setStyle("-fx-background-color: #CE2029");
            April10.setChecked(true);
            trackerHashMapApril.replace("btnApril10",April10);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April11Clicked(){
        if (trackerHashMapApril.get("btnApril11").getChecked()) {
            //set to not checked
            btnApril11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April11.setChecked(false);
            trackerHashMapApril.replace("btnApril11",April11);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril11.setStyle("-fx-background-color: #CE2029");
            April11.setChecked(true);
            trackerHashMapApril.replace("btnApril11",April11);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April12Clicked(){
        if (trackerHashMapApril.get("btnApril12").getChecked()) {
            //set to not checked
            btnApril12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April12.setChecked(false);
            trackerHashMapApril.replace("btnApril12",April12);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril12.setStyle("-fx-background-color: #CE2029");
            April12.setChecked(true);
            trackerHashMapApril.replace("btnApril12",April12);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April13Clicked(){
        if (trackerHashMapApril.get("btnApril13").getChecked()) {
            //set to not checked
            btnApril13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April13.setChecked(false);
            trackerHashMapApril.replace("btnApril13",April13);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril13.setStyle("-fx-background-color: #CE2029");
            April13.setChecked(true);
            trackerHashMapApril.replace("btnApril13",April13);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April14Clicked(){
        if (trackerHashMapApril.get("btnApril14").getChecked()) {
            //set to not checked
            btnApril14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April14.setChecked(false);
            trackerHashMapApril.replace("btnApril14",April14);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril14.setStyle("-fx-background-color: #CE2029");
            April14.setChecked(true);
            trackerHashMapApril.replace("btnApril14",April14);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April15Clicked(){
        if (trackerHashMapApril.get("btnApril15").getChecked()) {
            //set to not checked
            btnApril15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April15.setChecked(false);
            trackerHashMapApril.replace("btnApril15",April15);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril15.setStyle("-fx-background-color: #CE2029");
            April15.setChecked(true);
            trackerHashMapApril.replace("btnApril15",April15);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April16Clicked(){
        if (trackerHashMapApril.get("btnApril16").getChecked()) {
            //set to not checked
            btnApril16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April16.setChecked(false);
            trackerHashMapApril.replace("btnApril16",April16);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril16.setStyle("-fx-background-color: #CE2029");
            April16.setChecked(true);
            trackerHashMapApril.replace("btnApril16",April16);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April17Clicked(){
        if (trackerHashMapApril.get("btnApril17").getChecked()) {
            //set to not checked
            btnApril17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April17.setChecked(false);
            trackerHashMapApril.replace("btnApril17",April17);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril17.setStyle("-fx-background-color: #CE2029");
            April17.setChecked(true);
            trackerHashMapApril.replace("btnApril17",April17);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April18Clicked(){
        if (trackerHashMapApril.get("btnApril18").getChecked()) {
            //set to not checked
            btnApril18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April18.setChecked(false);
            trackerHashMapApril.replace("btnApril18",April18);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril18.setStyle("-fx-background-color: #CE2029");
            April18.setChecked(true);
            trackerHashMapApril.replace("btnApril18",April18);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April19Clicked(){
        if (trackerHashMapApril.get("btnApril19").getChecked()) {
            //set to not checked
            btnApril19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April19.setChecked(false);
            trackerHashMapApril.replace("btnApril19",April19);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril19.setStyle("-fx-background-color: #CE2029");
            April19.setChecked(true);
            trackerHashMapApril.replace("btnApril19",April19);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April20Clicked(){
        if (trackerHashMapApril.get("btnApril20").getChecked()) {
            //set to not checked
            btnApril20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April20.setChecked(false);
            trackerHashMapApril.replace("btnApril20",April20);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril20.setStyle("-fx-background-color: #CE2029");
            April20.setChecked(true);
            trackerHashMapApril.replace("btnApril20",April20);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April21Clicked(){
        if (trackerHashMapApril.get("btnApril21").getChecked()) {
            //set to not checked
            btnApril21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April21.setChecked(false);
            trackerHashMapApril.replace("btnApril21",April21);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril21.setStyle("-fx-background-color: #CE2029");
            April21.setChecked(true);
            trackerHashMapApril.replace("btnApril21",April21);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April22Clicked(){
        if (trackerHashMapApril.get("btnApril22").getChecked()) {
            //set to not checked
            btnApril22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April22.setChecked(false);
            trackerHashMapApril.replace("btnApril22",April22);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril22.setStyle("-fx-background-color: #CE2029");
            April22.setChecked(true);
            trackerHashMapApril.replace("btnApril22",April22);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April23Clicked(){
        if (trackerHashMapApril.get("btnApril23").getChecked()) {
            //set to not checked
            btnApril23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April23.setChecked(false);
            trackerHashMapApril.replace("btnApril23",April23);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril23.setStyle("-fx-background-color: #CE2029");
            April23.setChecked(true);
            trackerHashMapApril.replace("btnApril23",April23);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April24Clicked(){
        if (trackerHashMapApril.get("btnApril24").getChecked()) {
            //set to not checked
            btnApril24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April24.setChecked(false);
            trackerHashMapApril.replace("btnApril24",April24);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril24.setStyle("-fx-background-color: #CE2029");
            April24.setChecked(true);
            trackerHashMapApril.replace("btnApril24",April24);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April25Clicked(){
        if (trackerHashMapApril.get("btnApril25").getChecked()) {
            //set to not checked
            btnApril25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April25.setChecked(false);
            trackerHashMapApril.replace("btnApril25",April25);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril25.setStyle("-fx-background-color: #CE2029");
            April25.setChecked(true);
            trackerHashMapApril.replace("btnApril25",April25);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April26Clicked(){
        if (trackerHashMapApril.get("btnApril26").getChecked()) {
            //set to not checked
            btnApril26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April26.setChecked(false);
            trackerHashMapApril.replace("btnApril26",April26);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril26.setStyle("-fx-background-color: #CE2029");
            April26.setChecked(true);
            trackerHashMapApril.replace("btnApril26",April26);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April27Clicked(){
        if (trackerHashMapApril.get("btnApril27").getChecked()) {
            //set to not checked
            btnApril27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April27.setChecked(false);
            trackerHashMapApril.replace("btnApril27",April27);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril27.setStyle("-fx-background-color: #CE2029");
            April27.setChecked(true);
            trackerHashMapApril.replace("btnApril27",April27);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April28Clicked(){
        if (trackerHashMapApril.get("btnApril28").getChecked()) {
            //set to not checked
            btnApril28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April28.setChecked(false);
            trackerHashMapApril.replace("btnApril28",April28);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril28.setStyle("-fx-background-color: #CE2029");
            April28.setChecked(true);
            trackerHashMapApril.replace("btnApril28",April28);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April29Clicked(){
        if (trackerHashMapApril.get("btnApril29").getChecked()) {
            //set to not checked
            btnApril29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April29.setChecked(false);
            trackerHashMapApril.replace("btnApril29",April29);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril29.setStyle("-fx-background-color: #CE2029");
            April29.setChecked(true);
            trackerHashMapApril.replace("btnApril29",April29);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
    @FXML
    private void April30Clicked(){
        if (trackerHashMapApril.get("btnApril30").getChecked()) {
            //set to not checked
            btnApril30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
            April30.setChecked(false);
            trackerHashMapApril.replace("btnApril30",April30);
            fileOut.saveHashmapApril(trackerHashMapApril);
        } else {
            //set to checked
            btnApril30.setStyle("-fx-background-color: #CE2029");
            April30.setChecked(true);
            trackerHashMapApril.replace("btnApril30",April30);
            fileOut.saveHashmapApril(trackerHashMapApril);
        }
    }
}
