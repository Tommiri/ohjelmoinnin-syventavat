package addEvent;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Days Helper");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(5);
        grid.setAlignment(Pos.CENTER);

        // Date label and input
        Label dateLabel = new Label("Date");
        DatePicker dateField = new DatePicker();

        // Category label and input
        Label categoryLabel = new Label("Category");
        ComboBox<String> categoryField = new ComboBox<String>();
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

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}