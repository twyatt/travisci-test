package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Launcher extends Application {

	public static final String NAME = "TravisCI Test";

	@Override
	public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();
		Scene scene = new Scene(root);

		stage.setWidth(640);
		stage.setHeight(480);
		stage.setTitle(NAME);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
