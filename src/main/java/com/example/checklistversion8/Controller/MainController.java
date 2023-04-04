package com.example.checklistversion8.Controller;

import com.example.checklistversion8.FileIn;
import com.example.checklistversion8.FileOut;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{

    public TextField titleTextField;
    FileOut fileOut = new FileOut();
    FileIn fileIn = new FileIn();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file = new File("/fileTitle.ser");

        if(file.exists()){
            String title = fileIn.loadTitle();
            System.out.println("NewHM April: " + title);
            titleTextField.setText(title);
        }

        titleTextField.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                String title = titleTextField.getText();
                //System.out.println("In listener: " + title);
                fileOut.saveTitle(title);
            }
        });
    }

    /*public void openMonth() throws IOException {
        try {
            String month = mainMonthComboBox.getValue().toString();
            //System.out.println("month: " + month);
            switch (month.toLowerCase(Locale.ROOT)){
                case "january":
                    URL fxml = January.class.getResource("/com/example/checklistversion8/January.fxml");
                    //System.out.println("URL " + fxml);
                    FXMLLoader fxmlLoader = new FXMLLoader(fxml);
                    Parent root = fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();
                    break;

                case "february":
                    URL fxml2 = February.class.getResource("/com/example/checklistversion8/February.fxml");
                   // System.out.println("URL " + fxml2);
                    FXMLLoader fxmlLoader2 = new FXMLLoader(fxml2);
                    Parent root2 = fxmlLoader2.load();
                    Stage stage2 = new Stage();
                    stage2.setScene(new Scene(root2));
                    stage2.show();
                    break;

            }


        }catch(Exception e){
            e.printStackTrace();
        }

    }*/

}
