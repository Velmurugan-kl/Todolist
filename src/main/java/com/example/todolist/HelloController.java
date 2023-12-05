package com.example.todolist;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    ListView welcomeText = new ListView();
    @FXML
    TextField txt=new TextField();
    @FXML
    protected void onHelloButtonClick() {
        String st=txt.getText();
        txt.clear();
        if(st.length()!=0)
        welcomeText.getItems().add(st);
    }
    @FXML
    protected void ondone() {
        Object str=welcomeText.getSelectionModel().getSelectedItem();
        welcomeText.getItems().remove(str);
    }



}