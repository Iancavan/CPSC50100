//Assignment Week 6
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

 class Person {
	private static String firstname;
	private static String lastname;

	public Person() {
		firstname = "";
		lastname = "";
	}

	public Person(String first, String last) {
		setName(first, last);
	}

	public String toString() {
		return (firstname + " " + lastname);
	}

	private void setName(String first, String last) {
		firstname = first;
		lastname = last;
	}

	public String getFirstName() {
		return firstname;
	}

	public String getlastName() {
		return lastname;
	}
	
	static class PaidAdvisor extends Person {
		
		public int regularPayRate = 25;
		private int specialPayRate = 50;
		private int threshold = 30;
		private double overtimePayRate = (regularPayRate * 1.5);
		public static int hoursNormal;
		public static int hoursSpecial;
		public static String rateID;
		
		static void setNameRateHours(String first, String last , int hours, int special)
			{	
				firstname = first;
				lastname = last;
				hoursNormal = hours;
				hoursSpecial = special;
				
			}
				
		public int calculatePay(int hours, int special) {
			 
			if (hours <= threshold && special == 0) {
				// normal hours, no overtime or special pay
				return hours * regularPayRate; 
				
			} else if (hours <= threshold && special > 0) {
				//normal hours, no overtime and some special pay
				return ((hours * regularPayRate) + (special * specialPayRate));
			
			} else if (hours > threshold && special == 0)	{
				//normal hours, overtime and no special hours
				return (int) ((threshold * regularPayRate) + ((hours - threshold) * overtimePayRate));
							
			} else if (hours > threshold && special > 0)	{
				//normal hours, overtime and special hours
				return (int) ((threshold * regularPayRate) + ((hours - threshold) * overtimePayRate) + (hoursSpecial * specialPayRate));

			} else 
				
				return 0;
		}
		

		
		public int getHoursworked()
		{	
			if(rateID == "Regular")
				return hoursNormal;
			else if (rateID == "Special")
				return hoursSpecial;
			else 
				return hoursNormal + hoursSpecial;
		}
		
		public int getPayRate(String a )
		{
			if(a == "Regular" || a == "regular") 
			{
				return regularPayRate;
			}else if ( a == "special" || a == "Special")
			{
				return specialPayRate;
			}else if ( a == "Overtime" || a == "overtime")
			{
				return specialPayRate;
			}
			return 0;
		}

	}	
}

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
