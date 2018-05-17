<<<<<<< HEAD
import java.awt.Color;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
=======
import java.awt.Insets;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
>>>>>>> 9ed91048668912b6960dcff1a9fc495c98df3e49
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
        
<<<<<<< HEAD
        Button btn = new Button();
=======
        Button btn = new Button("Play Game");
>>>>>>> 9ed91048668912b6960dcff1a9fc495c98df3e49
        Button exit = new Button("Exit Game");
        
        exit.setOnAction(e -> System.exit(0));
        btn.setOnAction(e -> System.out.print("Run Game"));
        
        HBox root = new HBox();
        root.getChildren().addAll(btn,exit);
        root.setAlignment(Pos.BOTTOM_CENTER);
        
        primaryStage.setScene(new Scene(root, 500, 500));
<<<<<<< HEAD
      
        root.setStyle("-fx-background: #000000;");
=======
        


>>>>>>> 9ed91048668912b6960dcff1a9fc495c98df3e49
        primaryStage.show();
        
        
        
    }
}