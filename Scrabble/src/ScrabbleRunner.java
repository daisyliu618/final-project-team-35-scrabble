import javafx.application.Application;
import javafx.stage.Stage;

public class ScrabbleRunner extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage gameWindow) throws Exception {
		
		GUI gameUI = new GUI();
		gameUI.start(gameWindow);
		
	}

}
