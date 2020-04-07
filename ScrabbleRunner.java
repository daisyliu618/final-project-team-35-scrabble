import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This class tests the game of Scrabble
 * @author CIT-591 Team-35 Project
 *
 */
public class ScrabbleRunner extends Application{
    
    public static void main(String[] args) {
        launch(args); // need to install JavaFx application properly for this to work!
    }

    @Override
    public void start(Stage gameWindow) throws Exception {
        
        GUI gameUI = new GUI();
        gameUI.start(gameWindow);
    }

} 

/*
public class ScrabbleRunner {

/**
 * The main method
 * @param args
 */ /*
public static void main(String[] args) {
    ScrabbleGame game = new ScrabbleGame(GUI.Button);
    game.play();
}
}
*/