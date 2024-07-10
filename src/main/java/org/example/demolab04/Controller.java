package org.example.demolab04;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private TextField nameField;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private ListView<String> listView;

    private List<String> names = new ArrayList<>();

    @FXML
    public void initialize() {
        addButton.setOnAction(event -> addName());
        deleteButton.setOnAction(event -> deleteName());
    }

    private void addName() {
        String name = nameField.getText().trim();
        if (validateName(name)) {
            names.add(name);
            listView.getItems().add(name);
            nameField.clear();
        } else {
            showAlert("Invalid Name", "The name must start with an uppercase letter, be at least 5 characters long, and cannot be empty.");
        }
    }

    private void deleteName() {
        String selectedItem = listView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            names.remove(selectedItem);
            listView.getItems().remove(selectedItem);
        } else {
            showAlert("No Selection", "Please select an item to delete.");
        }
    }

    private boolean validateName(String name) {
        return name != null && !name.isEmpty() && name.length() >= 5 && Character.isUpperCase(name.charAt(0));
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
