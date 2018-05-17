import java.awt.Insets;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Tron extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) 
    {
    	
        primaryStage.setTitle("Tron");
        
        Button btn = new Button("Play Game");
        Button exit = new Button("Exit Game");
        
        exit.setOnAction(e -> System.exit(0));
        btn.setOnAction(e -> System.out.print("Run Game"));
        
        VBox root = new VBox();
        root.getChildren().addAll(btn,exit);
          
        primaryStage.setScene(new Scene(root, 500, 500));
        

        primaryStage.setScene(new Scene(root, 500, 500));

        primaryStage.show();
    }
}