package com.example;

import java.time.LocalDate;

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
    private TableColumn<Racer, Boolean> absoluteCol;

    @FXML
    private TableColumn<Racer, LocalDate> birthCol;

    @FXML
    private DatePicker birthPicker;

    @FXML
    private ToggleGroup category;

    @FXML
    private TableColumn<Racer, String> categoryCol;

    @FXML
    private TableColumn<Racer, Integer> idCol;

    @FXML
    private TextField idField;

    @FXML
    private TableColumn<Racer, String> nameCol;

    @FXML
    private TextField nameField;

    @FXML
    private TableView<Racer> raceTable;

    @FXML
    void initialize() {
        
    }

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
