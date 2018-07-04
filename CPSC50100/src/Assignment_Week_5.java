//Assignment Week 5 Redesign


	
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Assignment_Week_5 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			int x,y, setWdthHght = 15, size = 512, countX = 0, countY = 0;
			Group Group1 = new Group();
			
			for(countX = 0; countX < size; countX = countX + setWdthHght)
				{
					for (countY = 0; countY <= size; countY = countY + setWdthHght)
					{
						int rand;
						rand = (int) (Math.random() * 2);
						x = countX;
						y = countY;
						Color setFill = null;
						if (rand == 0)
						{
							setFill = Color.WHITE;
						} else { setFill = Color.BLACK;}
						
						Rectangle pattern = new Rectangle(x, y, (setWdthHght + rand) , (setWdthHght + rand));
						pattern.setFill(setFill);
						Group1.getChildren().add(pattern);
					}
				}
			
			Rectangle Sec1_B = new Rectangle(0,0,175,175);
			Group1.getChildren().add(Sec1_B);	
			
			Rectangle Sec1_W = new Rectangle(42.5,42.5,85,85);
			Sec1_W.setFill(Color.BLACK);
			Sec1_W.setStroke(Color.WHITE);
			Sec1_W.setStrokeWidth(35);
			Group1.getChildren().add(Sec1_W);
						
			Rectangle Sec2_B = new Rectangle(362,0,150,150);
			Group1.getChildren().add(Sec2_B);	
			
			Rectangle Sec2_W = new Rectangle(400,35,75,75);
			Sec2_W.setFill(Color.BLACK);
			Sec2_W.setStroke(Color.WHITE);
			Sec2_W.setStrokeWidth(25);
			Group1.getChildren().add(Sec2_W);
			
			Rectangle Sec3_B = new Rectangle(0,362,150,150);
			Group1.getChildren().add(Sec3_B);	
			
			Rectangle Sec3_W = new Rectangle(35,400,75,75);
			Sec3_W.setFill(Color.BLACK);
			Sec3_W.setStroke(Color.WHITE);
			Sec3_W.setStrokeWidth(25);
			Group1.getChildren().add(Sec3_W);
						
			Scene scene = new Scene(Group1, size, size, Color.WHITE);

			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
