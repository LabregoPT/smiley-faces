package ui;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.paint.Color;

public class Controller {
	@FXML
	private Pane containerPane;
	
	@FXML
	void drawFace(MouseEvent e) {
		double drawX = e.getSceneX();
		double drawY = e.getSceneY();
		Circle face = new Circle(drawX, drawY, 40, Color.YELLOW);
		Circle rightEye = new Circle(drawX-13, drawY-9, 5, Color.BLACK);
		Circle leftEye = new Circle(drawX+13, drawY-9, 5, Color.BLACK);
		Arc smileShadow = new Arc(drawX, drawY+10, 25, 23, 180, 180);
		smileShadow.setFill(Color.BLACK);
		Arc smileTeeth = new Arc(drawX, drawY+12, 20, 18, 180, 180);
		smileTeeth.setFill(Color.WHITE);
		containerPane.getChildren().add(face);
		containerPane.getChildren().add(rightEye);
		containerPane.getChildren().add(leftEye);
		containerPane.getChildren().add(smileShadow);
		containerPane.getChildren().add(smileTeeth);
	}
}
