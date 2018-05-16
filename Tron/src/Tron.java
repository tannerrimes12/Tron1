import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Tron extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tron");
        Button btn = new Button();
        Button exit = new Button("Exit Game");
        exit.setOnAction(e -> System.exit(0));
        btn.setText("Play Game");
        btn.setOnAction(e -> System.out.print("Run Game"));
        StackPane root = new StackPane();
        root.getChildren().addAll(btn,exit);
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }
}