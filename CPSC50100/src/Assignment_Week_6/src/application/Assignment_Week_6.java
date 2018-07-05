package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Group;

import java.util.*;

public class Assignment_Week_6 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Person.PaidAdvisor PaidAdvisor = new Person.PaidAdvisor();
								

			Text FirstTitle = new Text("Enter the First Name");
			TextField First_Name = new TextField();
			Text LastTitle = new Text("Enter the Last Name");
			TextField Last_Name = new TextField();
			Text HoursTitle = new Text("Please Enter The Number of Hours You Worked \n(if no hours were worked please put in 0)");
			TextField Normal_Hours = new TextField();
			Text SpecialTitle = new Text("Enter Any Special Hours You Worked \n(if no Special hours were worked please put in 0)");
			TextField Special_Hours = new TextField();
			
			
			Font font = new Font(12);

			Text Display = new Text(0,225,"");
			Display.setFont(font);
			Display.setWrappingWidth(150);

			
			Button button = new Button("Submit your Hours");

	        button.setOnAction(action -> {
	        	String output;
	        	Integer nHours, sHours;
	        	
	        	if (Normal_Hours.getText() == "")
	        	{ nHours = 0;
	        	} else nHours =Integer.parseInt(Normal_Hours.getText());
	        	if (Special_Hours.getText() == "")
	        	{ sHours = 0;
	        	} else sHours =Integer.parseInt(Special_Hours.getText());
	        	
	        	Person.PaidAdvisor.setNameRateHours(First_Name.getText(), Last_Name.getText(), nHours, sHours);
	        	output = First_Name.getText() + " " +Last_Name.getText() + " your Pay is $" + PaidAdvisor.calculatePay(Person.PaidAdvisor.hoursNormal, Person.PaidAdvisor.hoursSpecial) 
						+ ", and you Worked " + PaidAdvisor.getHoursworked() +" Hours this pay period.";
	          Display.setText(output);     	
	        });
	           	 
	        
			VBox nameBox = new VBox(FirstTitle, First_Name, LastTitle, Last_Name,HoursTitle, Normal_Hours, SpecialTitle, Special_Hours, button);
			
									
			Group root = new Group (nameBox, Display);
			
			Scene scene = new Scene(root,400,400);
		
		
			primaryStage.setTitle("Pay Rate Calculator");
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
