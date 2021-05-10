package finalproject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Sammi
 */
public class FinalProject extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        
        Button solBtn= new Button("Find a Solution");
        solBtn.setTranslateX(10);
        solBtn.setTranslateY(10);
        
        TextField dialogBox = new TextField();
        dialogBox.setTranslateX(40);
        dialogBox.setTranslateY(10);
        dialogBox.setMaxWidth(400);
        
        
        
        
        Group gp = new Group();
        
        gp.getChildren().add(solBtn);
        gp.getChildren().add(dialogBox);
        
        Scene sn = new Scene(gp, 700, 500, Color.LIMEGREEN);
        
        
        stage.setScene(sn);
        
        stage.setTitle("Playing Cards");
        
        stage.show();

    }

}
