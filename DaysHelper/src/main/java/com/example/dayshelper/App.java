package com.example.dayshelper;

import javafx.application.Application;
import java.nio.file.Path;
import java.util.List;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class App extends Application {

    private DatePicker datePicker;

    private ComboBox<String> categoryPicker;

    private TextField descriptionField;

    private Button addButton;

    private EventManager eventManager;

    @Override
    public void init() throws Exception {
        this.eventManager = EventManager.getInstance();

        Path eventsPath = eventManager.getEventsPath();
        boolean success = eventManager.loadEvents(eventsPath);

        this.datePicker = new DatePicker();

        this.categoryPicker = new ComboBox<>();
        this.categoryPicker.setEditable(true);

        List<String> categories = eventManager.getCategories();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Days Helper");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(5);

        // Date label and input
        Label dateLabel = new Label("Date");
        DatePicker dateField = new DatePicker();

        // Category label and input
        Label categoryLabel = new Label("Category");
        ComboBox<String> categoryField = new ComboBox<>();
        categoryField.setEditable(true);
        categoryField.getItems().addAll("Choice 1", "Choice 2", "Choice 3");

        // Description label and input
        Label descriptionLabel = new Label("Description");
        TextField descriptionField = new TextField();

        // Submit button
        Button addButton = new Button("Add Event");

        int row = 0;

        grid.addRow(row, dateLabel, dateField);
        grid.addRow(++row, categoryLabel, categoryField);
        grid.addRow(++row, descriptionLabel, descriptionField);
        grid.add(addButton, 1, ++row);
        GridPane.setHalignment(addButton, HPos.CENTER);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}