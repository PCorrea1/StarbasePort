package CodeMedia;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Representation of a Starbase.
 * @author Pablo Correa.
 * @version 1.1.
 */
public class Starbase extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        primaryStage.setTitle("Starbase Command");
        Image im = new Image("file:src/CodeMedia/Space.jpg");
        ImageView image = new ImageView(im);
        image.setFitHeight(700);
        image.setFitWidth(1200);
        ImageView im1 = new ImageView(new Image("file:src/CodeMedia/Port.png"));
        im1.setFitWidth(100);
        im1.setFitHeight(100);
        Button bp1 = new Button();
        bp1.setGraphic(im1);
        bp1.setStyle("-fx-background-color: transparent;");
        bp1.setDisable(true);
        Label lp1 = new Label("EMPTY", bp1);
        lp1.setContentDisplay(ContentDisplay.BOTTOM);
        lp1.setTextFill(Paint.valueOf("Yellow"));
        lp1.setFont(Font.font(lp1.getText(), FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 13));
        ImageView im2 = new ImageView(new Image("file:src/CodeMedia/Port.png"));
        im2.setFitWidth(100);
        im2.setFitHeight(100);
        Button bp2 = new Button();
        bp2.setGraphic(im2);
        bp2.setStyle("-fx-background-color: transparent;");
        bp2.setOnAction(event -> System.out.println("Here"));
        bp2.setDisable(true);
        Label lp2 = new Label("EMPTY", bp2);
        lp2.setContentDisplay(ContentDisplay.BOTTOM);
        lp2.setTextFill(Paint.valueOf("Yellow"));
        lp2.setFont(Font.font(lp2.getText(), FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 13));
        ImageView im3 = new ImageView(new Image("file:src/CodeMedia/Port.png"));
        im3.setFitWidth(100);
        im3.setFitHeight(100);
        Button bp3 = new Button();
        bp3.setGraphic(im3);
        bp3.setStyle("-fx-background-color: transparent;");
        bp3.setDisable(true);
        Label lp3 = new Label("EMPTY", bp3);
        lp3.setContentDisplay(ContentDisplay.BOTTOM);
        lp3.setTextFill(Paint.valueOf("Yellow"));
        lp3.setFont(Font.font(lp3.getText(), FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 13));
        ImageView im4 = new ImageView(new Image("file:src/CodeMedia/Port.png"));
        im4.setFitWidth(100);
        im4.setFitHeight(100);
        Button bp4 = new Button();
        bp4.setGraphic(im4);
        bp4.setStyle("-fx-background-color: transparent;");
        bp4.setDisable(true);
        Label lp4 = new Label("EMPTY", bp4);
        lp4.setContentDisplay(ContentDisplay.BOTTOM);
        lp4.setTextFill(Paint.valueOf("Yellow"));
        lp4.setFont(Font.font(lp4.getText(), FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 13));
        ImageView im5 = new ImageView(new Image("file:src/CodeMedia/Port.png"));
        im5.setFitWidth(100);
        im5.setFitHeight(100);
        Button bp5 = new Button();
        bp5.setGraphic(im5);
        bp5.setStyle("-fx-background-color: transparent;");
        bp5.setDisable(true);
        Label lp5 = new Label("EMPTY", bp5);
        lp5.setContentDisplay(ContentDisplay.BOTTOM);
        lp5.setTextFill(Paint.valueOf("Yellow"));
        lp5.setFont(Font.font(lp5.getText(), FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 13));
        ImageView im6 = new ImageView(new Image("file:src/CodeMedia/Port.png"));
        im6.setFitWidth(100);
        im6.setFitHeight(100);
        Button bp6 = new Button();
        bp6.setGraphic(im6);
        bp6.setStyle("-fx-background-color: transparent;");
        bp6.setDisable(true);
        Label lp6 = new Label("EMPTY", bp6);
        lp6.setContentDisplay(ContentDisplay.BOTTOM);
        lp6.setTextFill(Paint.valueOf("Yellow"));
        lp6.setFont(Font.font(lp6.getText(), FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 13));
        ImageView im7 = new ImageView(new Image("file:src/CodeMedia/Port.png"));
        im7.setFitWidth(100);
        im7.setFitHeight(100);
        Button bp7 = new Button();
        bp7.setGraphic(im7);
        bp7.setStyle("-fx-background-color: transparent;");
        bp7.setDisable(true);
        Label lp7 = new Label("EMPTY", bp7);
        lp7.setContentDisplay(ContentDisplay.BOTTOM);
        lp7.setTextFill(Paint.valueOf("Yellow"));
        lp7.setFont(Font.font(lp7.getText(), FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 13));
        ImageView im8 = new ImageView(new Image("file:src/CodeMedia/Port.png"));
        im8.setFitWidth(100);
        im8.setFitHeight(100);
        Button bp8 = new Button();
        bp8.setGraphic(im8);
        bp8.setStyle("-fx-background-color: transparent;");
        bp8.setDisable(true);
        Label lp8 = new Label("EMPTY", bp8);
        lp8.setContentDisplay(ContentDisplay.BOTTOM);
        lp8.setTextFill(Paint.valueOf("Yellow"));
        lp8.setFont(Font.font(lp8.getText(), FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 13));
        HBox hb1 = new HBox(80);
        hb1.setPadding(new Insets(10, 70, 10, 10));
        hb1.setAlignment(Pos.BASELINE_RIGHT);
        hb1.getChildren().addAll(lp1, lp2, lp3);
        HBox hb2 = new HBox(50);
        hb2.setPadding(new Insets(-5, 50, 10, 10));
        hb2.setAlignment(Pos.BASELINE_RIGHT);
        hb2.getChildren().addAll(lp4, lp5, lp6);
        HBox hb3 = new HBox(100);
        hb3.setPadding(new Insets(-5, 60, 30, 10));
        hb3.setAlignment(Pos.BASELINE_RIGHT);
        hb3.getChildren().addAll(lp7, lp8);
        VBox vb = new VBox(20);
        Text text = new Text("Welcome to Starbase Port!");
        text.setFont(Font.font(String.valueOf(text),
                FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 50));
        text.setFill(Paint.valueOf("Yellow"));
        vb.setAlignment(Pos.TOP_CENTER);
        HBox hb = new HBox(10);
        hb.setPadding(new Insets(5, 5, 10, 10));
        TextField tf = new TextField();
        tf.setPrefSize(240, 35);
        tf.setPromptText("Starship Name");
        tf.setFocusTraversable(false);
        Label l1 = new Label("Enter Incoming Starship Name Below", tf);
        l1.setContentDisplay(ContentDisplay.BOTTOM);
        l1.setTextFill(Paint.valueOf("Yellow"));
        l1.setFont(Font.font(l1.getText(), FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 13));
        ComboBox<Enum> type = new ComboBox<>();
        type.setPromptText("Starship Type");
        type.setFocusTraversable(false);
        type.setPrefSize(240, 35);
        Label l2 = new Label("Select Your Starship Type", type);
        l2.setContentDisplay(ContentDisplay.BOTTOM);
        l2.setTextFill(Paint.valueOf("Yellow"));
        l2.setFont(Font.font(l2.getText(), FontWeight.EXTRA_BOLD, FontPosture.findByName("News Gothic"), 13));
        type.getItems().addAll(Starship.CONSTITUTION, Starship.DEFIANT, Starship.GALAXY, Starship.INTREPID);
        Button b1 = new Button("Request Entry To Empire Space Port");
        b1.setPrefSize(240, 35);
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setHeaderText("Input not valid, Try again.");
        error.setContentText("The Starship Name Must Not Be Empty Or Only Whitespace");
        Alert error2 = new Alert(Alert.AlertType.ERROR);
        error2.setHeaderText("Warning!");
        error2.setContentText("Must Select A Type");
        b1.setOnAction(event -> {
            if (tf.getText() == null || tf.getText().trim().isEmpty()) {
                error.showAndWait();
            } else if (type.getValue() != Starship.CONSTITUTION
                    && type.getValue() != Starship.DEFIANT && type.getValue() != Starship.GALAXY
                    && type.getValue() != Starship.INTREPID) {
                error2.showAndWait();
            } else if (bp1.isDisabled()) {
                bp1.setDisable(false);
                lp1.setText(tf.getText() + ": " + type.getValue());
                tf.clear();
                type.setValue(null);
            } else if (bp2.isDisabled()) {
                bp2.setDisable(false);
                lp2.setText(tf.getText() + ": " + type.getValue());
                tf.clear();
                type.setValue(null);
            } else if (bp3.isDisabled()) {
                bp3.setDisable(false);
                lp3.setText(tf.getText() + ": " + type.getValue());
                tf.clear();
                type.setValue(null);
            } else if (bp4.isDisabled()) {
                bp4.setDisable(false);
                lp4.setText(tf.getText() + ": " + type.getValue());
                tf.clear();
                type.setValue(null);
            } else if (bp5.isDisabled()) {
                bp5.setDisable(false);
                lp5.setText(tf.getText() + ": " + type.getValue());
                tf.clear();
                type.setValue(null);
            } else if (bp6.isDisabled()) {
                bp6.setDisable(false);
                lp6.setText(tf.getText() + ": " + type.getValue());
                tf.clear();
                type.setValue(null);
            } else if (bp7.isDisabled()) {
                bp7.setDisable(false);
                lp7.setText(tf.getText() + ": " + type.getValue());
                tf.clear();
                type.setValue(null);
            } else if (bp8.isDisabled()) {
                bp8.setDisable(false);
                lp8.setText(tf.getText() + ": " + type.getValue());
                tf.clear();
                type.setValue(null);
            } else {
                Alert error1 = new Alert(Alert.AlertType.ERROR);
                error1.setHeaderText("ALERT");
                error1.setContentText(tf.getText() + " did not receive docking clearance!");
                error1.showAndWait();
            }
        });
        bp1.setOnAction(event -> {
            bp1.setDisable(true);
            lp1.setText("EMPTY");
        });
        bp2.setOnAction(event -> {
            bp2.setDisable(true);
            lp2.setText("EMPTY");
        });
        bp3.setOnAction(event -> {
            bp3.setDisable(true);
            lp3.setText("EMPTY");
        });
        bp4.setOnAction(event -> {
            bp4.setDisable(true);
            lp4.setText("EMPTY");
        });
        bp5.setOnAction(event -> {
            bp5.setDisable(true);
            lp5.setText("EMPTY");
        });
        bp6.setOnAction(event -> {
            bp6.setDisable(true);
            lp6.setText("EMPTY");
        });
        bp7.setOnAction(event -> {
            bp7.setDisable(true);
            lp7.setText("EMPTY");
        });
        bp8.setOnAction(event -> {
            bp8.setDisable(true);
            lp8.setText("EMPTY");
        });
        Button b2 = new Button("Rebels Inbound, Evacuate!");
        b2.setPrefSize(240, 35);
        b2.setStyle("-fx-background-color: #ff0000;");
        b2.setOnAction(event -> {
            Button[] ports = {bp1, bp2, bp3, bp4, bp5, bp6, bp7, bp8};
            Label[] labels = {lp1, lp2, lp3, lp4, lp5, lp6, lp7, lp8};
            for (int i = 0; i < ports.length; i++) {
                ports[i].setDisable(true);
                labels[i].setText("EMPTY");
            }
            tf.clear();
            type.setValue(null);
        });
        hb.getChildren().addAll(tf, l1, type, l2, b1, b2);
        hb.setAlignment(Pos.BOTTOM_LEFT);
        vb.getChildren().addAll(text, hb1, hb2, hb3, hb);
        root.getChildren().addAll(image, vb);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * Main method needed for IDE.
     * @param args main method.
     */
    public static void main(String[] args) {
        launch(args);
    }
}