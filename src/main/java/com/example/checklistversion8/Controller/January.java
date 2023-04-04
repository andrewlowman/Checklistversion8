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

public class January implements Initializable {
    public Button btnJan1;
    public Button btnJan2;
    public Button btnJan3;
    public Button btnJan4;
    public Button btnJan5;
    public Button btnJan6;
    public Button btnJan7;
    public Button btnJan8;
    public Button btnJan9;
    public Button btnJan10;
    public Button btnJan11;
    public Button btnJan12;
    public Button btnJan13;
    public Button btnJan14;
    public Button btnJan15;
    public Button btnJan16;
    public Button btnJan17;
    public Button btnJan18;
    public Button btnJan19;
    public Button btnJan20;
    public Button btnJan21;
    public Button btnJan22;
    public Button btnJan23;
    public Button btnJan24;
    public Button btnJan25;
    public Button btnJan26;
    public Button btnJan27;
    public Button btnJan28;
    public Button btnJan29;
    public Button btnJan30;
    public Button btnJan31;

    private Tracker Jan1 = new Tracker("btnJan1");
    private Tracker Jan2 = new Tracker("btnJan2");
    private Tracker Jan3 = new Tracker("btnJan3");
    private Tracker Jan4 = new Tracker("btnJan4");
    private Tracker Jan5 = new Tracker("btnJan5");
    private Tracker Jan6= new Tracker("btnJan6");
    private Tracker Jan7= new Tracker("btnJan7");
    private Tracker Jan8= new Tracker("btnJan8");
    private Tracker Jan9= new Tracker("btnJan9");
    private Tracker Jan10= new Tracker("btnJan10");
    private Tracker Jan11= new Tracker("btnJan11");
    private Tracker Jan12= new Tracker("btnJan12");
    private Tracker Jan13= new Tracker("btnJan13");
    private Tracker Jan14= new Tracker("btnJan14");
    private Tracker Jan15= new Tracker("btnJan15");
    private Tracker Jan16= new Tracker("btnJan16");
    private Tracker Jan17= new Tracker("btnJan17");
    private Tracker Jan18= new Tracker("btnJan18");
    private Tracker Jan19= new Tracker("btnJan19");
    private Tracker Jan20= new Tracker("btnJan20");
    private Tracker Jan21= new Tracker("btnJan21");
    private Tracker Jan22= new Tracker("btnJan22");
    private Tracker Jan23= new Tracker("btnJan23");
    private Tracker Jan24= new Tracker("btnJan24");
    private Tracker Jan25= new Tracker("btnJan25");
    private Tracker Jan26= new Tracker("btnJan26");
    private Tracker Jan27= new Tracker("btnJan27");
    private Tracker Jan28= new Tracker("btnJan28");
    private Tracker Jan29= new Tracker("btnJan29");
    private Tracker Jan30= new Tracker("btnJan30");
    private Tracker Jan31= new Tracker("btnJan31");

    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();

    //private Tracker[] trackers = new Tracker[30];
    private ArrayList<Tracker> trackers = new ArrayList<Tracker>();
    private ArrayList<Button> buttons = new ArrayList<>();
    private HashMap<String,Tracker> trackerHashMap = new HashMap<>();
    //use hashmap

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*for(int i=1; i<=31; i++){
            trackers[i] = new Tracker();
        }*/
        //Jan1 = new Tracker("btnJan1");

        /*trackers.add(Jan1);
        trackers.add(Jan2);
        trackers.add(Jan3);
        trackers.add(Jan4);
        trackers.add(Jan5);
        trackers.add(Jan6);
        trackers.add(Jan7);
        trackers.add(Jan8);
        trackers.add(Jan9);
        trackers.add(Jan10);
        trackers.add(Jan11);
        trackers.add(Jan12);
        trackers.add(Jan13);
        trackers.add(Jan14);
        trackers.add(Jan15);
        trackers.add(Jan16);
        trackers.add(Jan17);
        trackers.add(Jan18);
        trackers.add(Jan19);
        trackers.add(Jan20);
        trackers.add(Jan21);
        trackers.add(Jan22);
        trackers.add(Jan23);
        trackers.add(Jan24);
        trackers.add(Jan25);
        trackers.add(Jan26);
        trackers.add(Jan27);
        trackers.add(Jan28);
        trackers.add(Jan29);
        trackers.add(Jan30);
        trackers.add(Jan31);*/

        buttons.add(btnJan1);
        buttons.add(btnJan2);
        buttons.add(btnJan3);
        buttons.add(btnJan4);
        buttons.add(btnJan5);
        buttons.add(btnJan6);
        buttons.add(btnJan7);
        buttons.add(btnJan8);
        buttons.add(btnJan9);
        buttons.add(btnJan10);
        buttons.add(btnJan11);
        buttons.add(btnJan12);
        buttons.add(btnJan13);
        buttons.add(btnJan14);
        buttons.add(btnJan15);
        buttons.add(btnJan16);
        buttons.add(btnJan17);
        buttons.add(btnJan18);
        buttons.add(btnJan19);
        buttons.add(btnJan20);
        buttons.add(btnJan21);
        buttons.add(btnJan22);
        buttons.add(btnJan23);
        buttons.add(btnJan24);
        buttons.add(btnJan25);
        buttons.add(btnJan26);
        buttons.add(btnJan27);
        buttons.add(btnJan28);
        buttons.add(btnJan29);
        buttons.add(btnJan30);
        buttons.add(btnJan31);

        trackerHashMap.put("btnJan1",Jan1);
        trackerHashMap.put("btnJan2",Jan2);
        trackerHashMap.put("btnJan3",Jan3);
        trackerHashMap.put("btnJan4",Jan4);
        trackerHashMap.put("btnJan5",Jan5);
        trackerHashMap.put("btnJan6",Jan6);
        trackerHashMap.put("btnJan7",Jan7);
        trackerHashMap.put("btnJan8",Jan8);
        trackerHashMap.put("btnJan9",Jan9);
        trackerHashMap.put("btnJan10",Jan10);
        trackerHashMap.put("btnJan11",Jan11);
        trackerHashMap.put("btnJan12",Jan12);
        trackerHashMap.put("btnJan13",Jan13);
        trackerHashMap.put("btnJan14",Jan14);
        trackerHashMap.put("btnJan15",Jan15);
        trackerHashMap.put("btnJan16",Jan16);
        trackerHashMap.put("btnJan17",Jan17);
        trackerHashMap.put("btnJan18",Jan18);
        trackerHashMap.put("btnJan19",Jan19);
        trackerHashMap.put("btnJan20",Jan20);
        trackerHashMap.put("btnJan21",Jan21);
        trackerHashMap.put("btnJan22",Jan22);
        trackerHashMap.put("btnJan23",Jan23);
        trackerHashMap.put("btnJan24",Jan24);
        trackerHashMap.put("btnJan25",Jan25);
        trackerHashMap.put("btnJan26",Jan26);
        trackerHashMap.put("btnJan27",Jan27);
        trackerHashMap.put("btnJan28",Jan28);
        trackerHashMap.put("btnJan29",Jan29);
        trackerHashMap.put("btnJan30",Jan30);
        trackerHashMap.put("btnJan31",Jan31);

        //System.out.println(trackerHashMap);


        //System.out.println("Trackers in initialize: " +trackers);
        File file = new File("/fileJan.ser");

        /*if(file.exists()){
            //System.out.println("File exists");
            ArrayList<Tracker> newList = fileIn.load();
            System.out.println("Newlist: " + newList);
            trackers.clear();
            trackers.addAll(newList);
            System.out.println("Trackers in if file exists: " + trackers);
            loadButtons(newList);
            //System.out.println(newList);
            //loadButtons(trackers);
        }*/

        if(file.exists()){
            HashMap<String,Tracker> newHM = fileIn.loadHashmapJan();
           // System.out.println("NewHM: " + newHM);
            replaceHashMap(newHM);
            loadButtonsHashMap(trackerHashMap);

        }
    }

    /*private void loadButtons(ArrayList<Tracker> tempTrackers){
        //System.out.println("Ran loadbuttons");
        System.out.println("Trackers at the start of loadbuttons: " +trackers);
        for(Tracker tracker:trackers){
            System.out.println("Tracker ahead of if statement: " + tracker.getButtonName() + " " + tracker.toString());
            if(tracker.getChecked()){
                System.out.println("Tracker in if statement: " + tracker.getButtonName());
                findButton(tracker.getButtonName());
            }
        }
    }*/

    private void loadButtonsHashMap(HashMap<String,Tracker> hm){
        //System.out.println("TrackerHashMap at start of loadbuttons: " + trackerHashMap);
        for(Map.Entry<String,Tracker> entry:hm.entrySet()){
            if(entry.getValue().getChecked()){
                findButtonHashMap(entry.getValue().getButtonName());
            }
        }
    }
    /*private void findButton(String buttonName){
        //System.out.println("Ran findbutton");
        for(Button button:buttons){
            System.out.println("Button outside if: " + button.getId());
            if(button.getId().equals(buttonName)){
                System.out.println("Button inside if: " + button.getId());
                button.setStyle("-fx-background-color: #CE2029");
                //break;
            }
        }
    }*/

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

    //all the clicked methods
    /*@FXML
    private void jan1Clicked(){
        if (trackers.get(0).getChecked()) {
            //set to not checked
            btnJan1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            //trackers.remove(0);
            //trackers.add(0,Jan1);
            //System.out.println(trackers);
            //System.out.println("Before changing checked: " + Jan1.getChecked());
            Jan1.setChecked(false);
            //System.out.println(Jan1.getChecked());
            trackers.remove(0);
            trackers.add(0,Jan1);
           // System.out.println("Checked From Arraylist: " + trackers.get(0).getChecked());
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan1.setStyle("-fx-background-color: #CE2029");
            //System.out.println(trackers);
            //System.out.println("Before changing checked: " + Jan1.getChecked());
            Jan1.setChecked(true);
            //System.out.println(Jan1.getChecked());
            trackers.remove(0);
            trackers.add(0, Jan1);
           // System.out.println("Not checked From Arraylist: " + trackers.get(0).getChecked());
            fileOut.save(trackers);
        }
    }*/

    @FXML
    private void jan1Clicked(){
        if(trackerHashMap.get("btnJan1").getChecked()){
            btnJan1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan1.setChecked(false);
            trackerHashMap.replace("btnJan1",Jan1);
            fileOut.saveHashmapJan(trackerHashMap);
        }else{
            btnJan1.setStyle("-fx-background-color: #CE2029");
            Jan1.setChecked(true);
            trackerHashMap.replace("btnJan1",Jan1);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan2Clicked(){
        if (trackerHashMap.get("btnJan2").getChecked()) {
            //set to not checked
            btnJan2.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan2.setChecked(false);
            trackerHashMap.replace("btnJan2",Jan2);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan2.setStyle("-fx-background-color: #CE2029");
            Jan2.setChecked(true);
            trackerHashMap.replace("btnJan2",Jan2);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }

    @FXML
    private void jan3Clicked(){
        if (trackerHashMap.get("btnJan3").getChecked()) {
            //set to not checked
            btnJan3.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan3.setChecked(false);
            trackerHashMap.replace("btnJan3",Jan3);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan3.setStyle("-fx-background-color: #CE2029");
            Jan3.setChecked(true);
            trackerHashMap.replace("btnJan3",Jan3);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }

    @FXML
    private void jan4Clicked(){
        if (trackerHashMap.get("btnJan4").getChecked()) {
            //set to not checked
            btnJan4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan4.setChecked(false);
            trackerHashMap.replace("btnJan4",Jan4);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan4.setStyle("-fx-background-color: #CE2029");
            Jan4.setChecked(true);
            trackerHashMap.replace("btnJan4",Jan4);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan5Clicked(){
        if (trackerHashMap.get("btnJan5").getChecked()) {
            //set to not checked
            btnJan5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan5.setChecked(false);
            trackerHashMap.replace("btnJan5",Jan5);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan5.setStyle("-fx-background-color: #CE2029");
            Jan5.setChecked(true);
            trackerHashMap.replace("btnJan5",Jan5);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan6Clicked(){
        if (trackerHashMap.get("btnJan6").getChecked()) {
            //set to not checked
            btnJan6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan6.setChecked(false);
            trackerHashMap.replace("btnJan6",Jan6);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan6.setStyle("-fx-background-color: #CE2029");
            Jan6.setChecked(true);
            trackerHashMap.replace("btnJan6",Jan6);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan7Clicked(){
        if (trackerHashMap.get("btnJan7").getChecked()) {
            //set to not checked
            btnJan7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan7.setChecked(false);
            trackerHashMap.replace("btnJan7",Jan7);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan7.setStyle("-fx-background-color: #CE2029");
            Jan7.setChecked(true);
            trackerHashMap.replace("btnJan7",Jan7);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan8Clicked(){
        if (trackerHashMap.get("btnJan8").getChecked()) {
            //set to not checked
            btnJan8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan8.setChecked(false);
            trackerHashMap.replace("btnJan8",Jan8);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan8.setStyle("-fx-background-color: #CE2029");
            Jan8.setChecked(true);
            trackerHashMap.replace("btnJan8",Jan8);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan9Clicked(){
        if (trackerHashMap.get("btnJan9").getChecked()) {
            //set to not checked
            btnJan9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan9.setChecked(false);
            trackerHashMap.replace("btnJan9",Jan9);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan9.setStyle("-fx-background-color: #CE2029");
            Jan9.setChecked(true);
            trackerHashMap.replace("btnJan9",Jan9);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan10Clicked(){
        if (trackerHashMap.get("btnJan10").getChecked()) {
            //set to not checked
            btnJan10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan10.setChecked(false);
            trackerHashMap.replace("btnJan10",Jan10);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan10.setStyle("-fx-background-color: #CE2029");
            Jan10.setChecked(true);
            trackerHashMap.replace("btnJan10",Jan10);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan11Clicked(){
        if (trackerHashMap.get("btnJan11").getChecked()) {
            //set to not checked
            btnJan11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan11.setChecked(false);
            trackerHashMap.replace("btnJan11",Jan11);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan11.setStyle("-fx-background-color: #CE2029");
            Jan11.setChecked(true);
            trackerHashMap.replace("btnJan11",Jan11);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan12Clicked(){
        if (trackerHashMap.get("btnJan12").getChecked()) {
            //set to not checked
            btnJan12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan12.setChecked(false);
            trackerHashMap.replace("btnJan12",Jan12);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan12.setStyle("-fx-background-color: #CE2029");
            Jan12.setChecked(true);
            trackerHashMap.replace("btnJan12",Jan12);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan13Clicked(){
        if (trackerHashMap.get("btnJan13").getChecked()) {
            //set to not checked
            btnJan13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan13.setChecked(false);
            trackerHashMap.replace("btnJan13",Jan13);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan13.setStyle("-fx-background-color: #CE2029");
            Jan13.setChecked(true);
            trackerHashMap.replace("btnJan13",Jan13);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan14Clicked(){
        if (trackerHashMap.get("btnJan14").getChecked()) {
            //set to not checked
            btnJan14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan14.setChecked(false);
            trackerHashMap.replace("btnJan14",Jan14);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan14.setStyle("-fx-background-color: #CE2029");
            Jan14.setChecked(true);
            trackerHashMap.replace("btnJan14",Jan14);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan15Clicked(){
        if (trackerHashMap.get("btnJan15").getChecked()) {
            //set to not checked
            btnJan15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan15.setChecked(false);
            trackerHashMap.replace("btnJan15",Jan15);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan15.setStyle("-fx-background-color: #CE2029");
            Jan15.setChecked(true);
            trackerHashMap.replace("btnJan15",Jan15);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan16Clicked(){
        if (trackerHashMap.get("btnJan16").getChecked()) {
            //set to not checked
            btnJan16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan16.setChecked(false);
            trackerHashMap.replace("btnJan16",Jan16);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan16.setStyle("-fx-background-color: #CE2029");
            Jan16.setChecked(true);
            trackerHashMap.replace("btnJan16",Jan16);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan17Clicked(){
        if (trackerHashMap.get("btnJan17").getChecked()) {
            //set to not checked
            btnJan17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan17.setChecked(false);
            trackerHashMap.replace("btnJan17",Jan17);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan17.setStyle("-fx-background-color: #CE2029");
            Jan17.setChecked(true);
            trackerHashMap.replace("btnJan17",Jan17);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan18Clicked(){
        if (trackerHashMap.get("btnJan18").getChecked()) {
            //set to not checked
            btnJan18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan18.setChecked(false);
            trackerHashMap.replace("btnJan18",Jan18);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan18.setStyle("-fx-background-color: #CE2029");
            Jan18.setChecked(true);
            trackerHashMap.replace("btnJan18",Jan18);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan19Clicked(){
        if (trackerHashMap.get("btnJan19").getChecked()) {
            //set to not checked
            btnJan19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan19.setChecked(false);
            trackerHashMap.replace("btnJan19",Jan19);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan19.setStyle("-fx-background-color: #CE2029");
            Jan19.setChecked(true);
            trackerHashMap.replace("btnJan19",Jan19);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan20Clicked(){
        if (trackerHashMap.get("btnJan20").getChecked()) {
            //set to not checked
            btnJan20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan20.setChecked(false);
            trackerHashMap.replace("btnJan20",Jan20);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan20.setStyle("-fx-background-color: #CE2029");
            Jan20.setChecked(true);
            trackerHashMap.replace("btnJan20",Jan20);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan21Clicked(){
        if (trackerHashMap.get("btnJan21").getChecked()) {
            //set to not checked
            btnJan21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan21.setChecked(false);
            trackerHashMap.replace("btnJan21",Jan21);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan21.setStyle("-fx-background-color: #CE2029");
            Jan21.setChecked(true);
            trackerHashMap.replace("btnJan21",Jan21);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan22Clicked(){
        if (trackerHashMap.get("btnJan22").getChecked()) {
            //set to not checked
            btnJan22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan22.setChecked(false);
            trackerHashMap.replace("btnJan22",Jan22);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan22.setStyle("-fx-background-color: #CE2029");
            Jan22.setChecked(true);
            trackerHashMap.replace("btnJan22",Jan22);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan23Clicked(){
        if (trackerHashMap.get("btnJan23").getChecked()) {
            //set to not checked
            btnJan23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan23.setChecked(false);
            trackerHashMap.replace("btnJan23",Jan23);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan23.setStyle("-fx-background-color: #CE2029");
            Jan23.setChecked(true);
            trackerHashMap.replace("btnJan23",Jan23);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan24Clicked(){
        if (trackerHashMap.get("btnJan24").getChecked()) {
            //set to not checked
            btnJan24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan24.setChecked(false);
            trackerHashMap.replace("btnJan24",Jan24);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan24.setStyle("-fx-background-color: #CE2029");
            Jan24.setChecked(true);
            trackerHashMap.replace("btnJan24",Jan24);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan25Clicked(){
        if (trackerHashMap.get("btnJan25").getChecked()) {
            //set to not checked
            btnJan25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan25.setChecked(false);
            trackerHashMap.replace("btnJan25",Jan25);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan25.setStyle("-fx-background-color: #CE2029");
            Jan25.setChecked(true);
            trackerHashMap.replace("btnJan25",Jan25);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan26Clicked(){
        if (trackerHashMap.get("btnJan26").getChecked()) {
            //set to not checked
            btnJan26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan26.setChecked(false);
            trackerHashMap.replace("btnJan26",Jan26);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan26.setStyle("-fx-background-color: #CE2029");
            Jan26.setChecked(true);
            trackerHashMap.replace("btnJan26",Jan26);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan27Clicked(){
        if (trackerHashMap.get("btnJan27").getChecked()) {
            //set to not checked
            btnJan27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan27.setChecked(false);
            trackerHashMap.replace("btnJan27",Jan27);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan27.setStyle("-fx-background-color: #CE2029");
            Jan27.setChecked(true);
            trackerHashMap.replace("btnJan27",Jan27);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan28Clicked(){
        if (trackerHashMap.get("btnJan28").getChecked()) {
            //set to not checked
            btnJan28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan28.setChecked(false);
            trackerHashMap.replace("btnJan28",Jan28);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan28.setStyle("-fx-background-color: #CE2029");
            Jan28.setChecked(true);
            trackerHashMap.replace("btnJan28",Jan28);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan29Clicked(){
        if (trackerHashMap.get("btnJan29").getChecked()) {
            //set to not checked
            btnJan29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan29.setChecked(false);
            trackerHashMap.replace("btnJan29",Jan29);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan29.setStyle("-fx-background-color: #CE2029");
            Jan29.setChecked(true);
            trackerHashMap.replace("btnJan29",Jan29);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan30Clicked(){
        if (trackerHashMap.get("btnJan30").getChecked()) {
            //set to not checked
            btnJan30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan30.setChecked(false);
            trackerHashMap.replace("btnJan30",Jan30);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan30.setStyle("-fx-background-color: #CE2029");
            Jan30.setChecked(true);
            trackerHashMap.replace("btnJan30",Jan30);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }
    @FXML
    private void jan31Clicked(){
        if (trackerHashMap.get("btnJan31").getChecked()) {
            //set to not checked
            btnJan31.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan31.setChecked(false);
            trackerHashMap.replace("btnJan31",Jan31);
            fileOut.saveHashmapJan(trackerHashMap);
        } else {
            //set to checked
            btnJan31.setStyle("-fx-background-color: #CE2029");
            Jan31.setChecked(true);
            trackerHashMap.replace("btnJan31",Jan31);
            fileOut.saveHashmapJan(trackerHashMap);
        }
    }

    /*@FXML
    private void jan4Clicked(){
        if (trackers.get(3).getChecked()) {
            //set to not checked
            btnJan4.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan4.setChecked(false);
            trackers.remove(3);
            trackers.add(3,Jan4);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan4.setStyle("-fx-background-color: #CE2029");
            Jan4.setChecked(true);
            trackers.remove(3);
            trackers.add(3, Jan4);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan5Clicked(){
        if (trackers.get(4).getChecked()) {
            //set to not checked
            btnJan5.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan5.setChecked(false);
            trackers.remove(4);
            trackers.add(4,Jan5);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan5.setStyle("-fx-background-color: #CE2029");
            Jan5.setChecked(true);
            trackers.remove(4);
            trackers.add(4, Jan5);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan6Clicked(){
        if (trackers.get(5).getChecked()) {
            //set to not checked
            btnJan6.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan6.setChecked(false);
            trackers.remove(5);
            trackers.add(5,Jan6);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan6.setStyle("-fx-background-color: #CE2029");
            Jan6.setChecked(true);
            trackers.remove(5);
            trackers.add(5, Jan6);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan7Clicked(){
        if (trackers.get(6).getChecked()) {
            //set to not checked
            btnJan7.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan7.setChecked(false);
            trackers.remove(6);
            trackers.add(6,Jan7);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan7.setStyle("-fx-background-color: #CE2029");
            Jan7.setChecked(true);
            trackers.remove(6);
            trackers.add(6, Jan7);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan8Clicked(){
        if (trackers.get(7).getChecked()) {
            //set to not checked
            btnJan8.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan8.setChecked(false);
            trackers.remove(7);
            trackers.add(7,Jan8);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan8.setStyle("-fx-background-color: #CE2029");
            Jan8.setChecked(true);
            trackers.remove(7);
            trackers.add(7, Jan8);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan9Clicked(){
        if (trackers.get(8).getChecked()) {
            //set to not checked
            btnJan9.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan9.setChecked(false);
            trackers.remove(8);
            trackers.add(8,Jan9);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan9.setStyle("-fx-background-color: #CE2029");
            Jan9.setChecked(true);
            trackers.remove(8);
            trackers.add(8, Jan9);
            fileOut.save(trackers);
        }
    }

    @FXML
    private void jan10Clicked(){
        if (trackers.get(9).getChecked()) {
            //set to not checked
            btnJan10.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan10.setChecked(false);
            trackers.remove(9);
            trackers.add(9,Jan10);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan10.setStyle("-fx-background-color: #CE2029");
            Jan10.setChecked(true);
            trackers.remove(9);
            trackers.add(9, Jan10);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan11Clicked(){
        if (trackers.get(10).getChecked()) {
            //set to not checked
            btnJan11.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan11.setChecked(false);
            trackers.remove(10);
            trackers.add(10,Jan11);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan11.setStyle("-fx-background-color: #CE2029");
            Jan11.setChecked(true);
            trackers.remove(10);
            trackers.add(10, Jan11);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan12Clicked(){
        if (trackers.get(11).getChecked()) {
            //set to not checked
            btnJan12.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan12.setChecked(false);
            trackers.remove(11);
            trackers.add(11,Jan12);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan12.setStyle("-fx-background-color: #CE2029");
            Jan12.setChecked(true);
            trackers.remove(11);
            trackers.add(11, Jan12);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan13Clicked(){
        if (trackers.get(12).getChecked()) {
            //set to not checked
            btnJan13.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan13.setChecked(false);
            trackers.remove(12);
            trackers.add(12,Jan13);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan13.setStyle("-fx-background-color: #CE2029");
            Jan13.setChecked(true);
            trackers.remove(12);
            trackers.add(12, Jan13);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan14Clicked(){
        if (trackers.get(13).getChecked()) {
            //set to not checked
            btnJan14.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan14.setChecked(false);
            trackers.remove(13);
            trackers.add(13,Jan14);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan14.setStyle("-fx-background-color: #CE2029");
            Jan14.setChecked(true);
            trackers.remove(13);
            trackers.add(13, Jan14);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan15Clicked(){
        if (trackers.get(14).getChecked()) {
            //set to not checked
            btnJan15.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan15.setChecked(false);
            trackers.remove(14);
            trackers.add(14,Jan15);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan15.setStyle("-fx-background-color: #CE2029");
            Jan15.setChecked(true);
            trackers.remove(14);
            trackers.add(14, Jan15);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan16Clicked(){
        if (trackers.get(15).getChecked()) {
            //set to not checked
            btnJan16.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan16.setChecked(false);
            trackers.remove(15);
            trackers.add(15,Jan16);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan16.setStyle("-fx-background-color: #CE2029");
            Jan16.setChecked(true);
            trackers.remove(15);
            trackers.add(15, Jan16);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan17Clicked(){
        if (trackers.get(16).getChecked()) {
            //set to not checked
            btnJan17.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan17.setChecked(false);
            trackers.remove(16);
            trackers.add(16,Jan17);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan17.setStyle("-fx-background-color: #CE2029");
            Jan17.setChecked(true);
            trackers.remove(16);
            trackers.add(16, Jan17);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan18Clicked(){
        if (trackers.get(17).getChecked()) {
            //set to not checked
            btnJan18.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan18.setChecked(false);
            trackers.remove(17);
            trackers.add(17,Jan18);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan18.setStyle("-fx-background-color: #CE2029");
            Jan18.setChecked(true);
            trackers.remove(17);
            trackers.add(17, Jan18);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan19Clicked(){
        if (trackers.get(18).getChecked()) {
            //set to not checked
            btnJan19.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan19.setChecked(false);
            trackers.remove(18);
            trackers.add(18,Jan19);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan19.setStyle("-fx-background-color: #CE2029");
            Jan19.setChecked(true);
            trackers.remove(8);
            trackers.add(18, Jan19);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan20Clicked(){
        if (trackers.get(19).getChecked()) {
            //set to not checked
            btnJan20.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan20.setChecked(false);
            trackers.remove(19);
            trackers.add(19,Jan20);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan20.setStyle("-fx-background-color: #CE2029");
            Jan20.setChecked(true);
            trackers.remove(19);
            trackers.add(19, Jan20);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan21Clicked(){
        if (trackers.get(20).getChecked()) {
            //set to not checked
            btnJan21.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan21.setChecked(false);
            trackers.remove(20);
            trackers.add(20,Jan21);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan21.setStyle("-fx-background-color: #CE2029");
            Jan21.setChecked(true);
            trackers.remove(20);
            trackers.add(20, Jan21);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan22Clicked(){
        if (trackers.get(21).getChecked()) {
            //set to not checked
            btnJan22.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan22.setChecked(false);
            trackers.remove(21);
            trackers.add(21,Jan22);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan22.setStyle("-fx-background-color: #CE2029");
            Jan22.setChecked(true);
            trackers.remove(21);
            trackers.add(21, Jan22);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan23Clicked(){
        if (trackers.get(22).getChecked()) {
            //set to not checked
            btnJan23.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan23.setChecked(false);
            trackers.remove(22);
            trackers.add(22,Jan23);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan23.setStyle("-fx-background-color: #CE2029");
            Jan23.setChecked(true);
            trackers.remove(22);
            trackers.add(22, Jan23);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan24Clicked(){
        if (trackers.get(23).getChecked()) {
            //set to not checked
            btnJan24.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan24.setChecked(false);
            trackers.remove(23);
            trackers.add(23,Jan24);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan24.setStyle("-fx-background-color: #CE2029");
            Jan24.setChecked(true);
            trackers.remove(23);
            trackers.add(23, Jan24);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan25Clicked(){
        if (trackers.get(24).getChecked()) {
            //set to not checked
            btnJan25.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan25.setChecked(false);
            trackers.remove(24);
            trackers.add(24,Jan25);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan25.setStyle("-fx-background-color: #CE2029");
            Jan25.setChecked(true);
            trackers.remove(24);
            trackers.add(24, Jan25);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan26Clicked(){
        if (trackers.get(25).getChecked()) {
            //set to not checked
            btnJan26.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan26.setChecked(false);
            trackers.remove(25);
            trackers.add(25,Jan26);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan26.setStyle("-fx-background-color: #CE2029");
            Jan26.setChecked(true);
            trackers.remove(25);
            trackers.add(25, Jan26);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan27Clicked(){
        if (trackers.get(26).getChecked()) {
            //set to not checked
            btnJan27.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan27.setChecked(false);
            trackers.remove(26);
            trackers.add(26,Jan27);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan27.setStyle("-fx-background-color: #CE2029");
            Jan27.setChecked(true);
            trackers.remove(26);
            trackers.add(26, Jan27);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan28Clicked(){
        if (trackers.get(27).getChecked()) {
            //set to not checked
            btnJan28.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan28.setChecked(false);
            trackers.remove(27);
            trackers.add(27,Jan28);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan28.setStyle("-fx-background-color: #CE2029");
            Jan28.setChecked(true);
            trackers.remove(27);
            trackers.add(27, Jan28);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan29Clicked(){
        if (trackers.get(28).getChecked()) {
            //set to not checked
            btnJan29.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan29.setChecked(false);
            trackers.remove(28);
            trackers.add(28,Jan29);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan29.setStyle("-fx-background-color: #CE2029");
            Jan29.setChecked(true);
            trackers.remove(28);
            trackers.add(28, Jan29);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan30Clicked(){
        if (trackers.get(29).getChecked()) {
            //set to not checked
            btnJan30.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan30.setChecked(false);
            trackers.remove(29);
            trackers.add(29,Jan30);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan30.setStyle("-fx-background-color: #CE2029");
            Jan30.setChecked(true);
            trackers.remove(29);
            trackers.add(29, Jan30);
            fileOut.save(trackers);
        }
    }
    @FXML
    private void jan31Clicked(){
        if (trackers.get(30).getChecked()) {
            //set to not checked
            btnJan31.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
            Jan31.setChecked(false);
            trackers.remove(30);
            trackers.add(30,Jan31);
            fileOut.save(trackers);
        } else {
            //set to checked
            btnJan31.setStyle("-fx-background-color: #CE2029");
            Jan31.setChecked(true);
            trackers.remove(30);
            trackers.add(30, Jan31);
            fileOut.save(trackers);
        }
    }
*/


     /*@FXML
    private void clicked(MouseEvent event){
        //get id of button pressed
        String source = event.getPickResult().getIntersectedNode().getId();
        System.out.println("Source: " + source);
        try {
            switch (source) {
                case "btnJan1":
                    if (trackers.get(0).getChecked()) {
                        //set to not checked
                        btnJan1.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058);");
                        //trackers.remove(0);
                        //trackers.add(0,Jan1);
                        //System.out.println(trackers);
                        System.out.println("Before changing checked: " + Jan1.getChecked());
                        Jan1.setChecked(false);
                        System.out.println(Jan1.getChecked());
                        trackers.remove(0);
                        trackers.add(0,Jan1);
                        System.out.println("Checked From Arraylist: " + trackers.get(0).getChecked());
                        fileOut.save(trackers);
                    } else {
                        //set to checked
                        btnJan1.setStyle("-fx-background-color: #CE2029");
                        //System.out.println(trackers);
                        System.out.println("Before changing checked: " + Jan1.getChecked());
                        Jan1.setChecked(true);
                        System.out.println(Jan1.getChecked());
                        trackers.remove(0);
                        trackers.add(0,Jan1);
                        System.out.println("Not checked From Arraylist: " + trackers.get(0).getChecked());
                        fileOut.save(trackers);
                    }
                    break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }*/
}
