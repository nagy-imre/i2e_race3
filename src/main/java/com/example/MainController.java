package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MainController {

    @FXML
    private CheckBox absoluteCheck;

    @FXML
    private TableColumn<?, ?> absoluteCol;

    @FXML
    private TableColumn<?, ?> birthCol;

    @FXML
    private DatePicker birthPicker;

    @FXML
    private ToggleGroup category;

    @FXML
    private TableColumn<?, ?> categoryCol;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private TextField idField;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TextField nameField;

    @FXML
    private TableView<?> raceTable;

    @FXML
    void onClickAboutButton(ActionEvent event) {

    }

    @FXML
    void onClickAddButton(ActionEvent event) {

    }

    @FXML
    void onClickDeleteButton(ActionEvent event) {

    }

    @FXML
    void onClickModifyButton(ActionEvent event) {

    }

}
