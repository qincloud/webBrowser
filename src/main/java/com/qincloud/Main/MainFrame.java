package com.qincloud.Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainFrame extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane root = new BorderPane();
		Scene s = new Scene(root, 618, 382);
		stage.setScene(s);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
