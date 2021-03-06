//Assignment Week 4 - Calculating student scores, grading on a curve based on standard deviation. 

import java.util.*;
import java.math.*;

//Calculation Methods

class methods {
    public int sum (List<Integer> a){
        if (a.size() > 0) {
            int sum = 0;
 
            for (Integer i : a) {
                sum += i;
            }
            return sum;
        }
        return 0;
    }
    public double meanvalue (List<Integer> a){
        int sum = sum(a);
        double mean = 0;
        mean = Math.abs(sum / (a.size() * 1.0));
        return mean;
    }
    public double stdev (List<Integer> a){
        double sum = 0;
        double mean = meanvalue(a);
 
        for (Integer i : a)
            sum += Math.pow((i - mean), 2);
        return Math.sqrt(sum / ( a.size())); 
    }
}

//Main Body

public class Assignment_Week_4 {

	public static void main(String[] args) {
		//Variables and List declarations 
		int [] testTotalScores = {400,350,370,280,300,290,310,340,350,330};
		int grade, nameloop = 0, i = 0, j = 1;
		String namecheck, name;
		ArrayList<Integer> enterScores = new ArrayList<Integer> ();
		ArrayList<String> studentName = new ArrayList<String> ();
		ArrayList<Integer> studentsum = new ArrayList<Integer>();
		
		
			 
		//Methods and Scanner
		Scanner user_input = new Scanner(System.in);
		methods Calc = new methods();
		
		//Getting the grades
		System.out.println("Welcome Professor Mike, Please enter the student grades for each of the below Quizs or Assignments.");
		
		while (nameloop == 0)
		{
		j = 1;
		System.out.println("Enter the Students Name:");
		name = user_input.next();
		studentName.add(name);
		
		System.out.println("Exam #1 Score (0 – 50 points):");
		grade = user_input.nextInt();
			while (grade > 50 || grade < 0)
		{
			System.out.println("That grade is too high for this Exam, please reenter a grade between (0 - 50 points):");
			grade = user_input.nextInt();
		} 			
		enterScores.add((int) grade);
		System.out.println("Exam #2 Score (0 – 50 points):");
		grade = user_input.nextInt();
		while (grade > 50 || grade < 0)
		{
		System.out.println("That grade isn't valid for this Exam, please reenter a grade between (0 - 50 points):");
		grade = user_input.nextInt();
		} 
		enterScores.add((int) grade);
		System.out.println("Exam #3 Score (0 – 50 points):");
		grade = user_input.nextInt();
		while (grade > 50 || grade < 0)
		{
		System.out.println("That grade isn't valid for this Exam, please reenter a grade between (0 - 50 points):");
		grade = user_input.nextInt();
		} 
		enterScores.add((int) grade);
		System.out.println("Exam #4 Score (0 – 50 points):");
		grade = user_input.nextInt();
		while (grade > 50 || grade < 0)
		{
		System.out.println("That grade isn't valid for this Exam, please reenter a grade between (0 - 50 points):");
		grade = user_input.nextInt();
		} 
		enterScores.add((int) grade);
		System.out.println("Assignment #1 Score (0 – 75 points):");
		grade = user_input.nextInt();
		while (grade > 75 || grade < 0)
		{
		System.out.println("That grade isn't valid for this Assignment, please reenter a grade between (0 - 75 points):");
		grade = user_input.nextInt();
		} 
		enterScores.add((int) grade);
		System.out.println("Assignment #2 Score (0 – 75 points):");
		grade = user_input.nextInt();
		while (grade > 75 || grade < 0)
		{
		System.out.println("That grade isn't valid for this Assignment, please reenter a grade between (0 - 75 points):");
		grade = user_input.nextInt();
		} 
		enterScores.add((int) grade);
		System.out.println("Assignment #3 Score (0 – 75 points):");
		grade = user_input.nextInt();
		while (grade > 75 || grade < 0)
		{
		System.out.println("That grade isn't valid for this Assignment, please reenter a grade between (0 - 75 points):");
		grade = user_input.nextInt();
		} 
		enterScores.add((int) grade);
		System.out.println("Assignment #4 Score (0 – 75 points):");
		grade = user_input.nextInt();
		while (grade > 75 || grade < 0)
		{
		System.out.println("That grade isn't valid for this Assignment, please reenter a grade between (0 - 75 points):");
		grade = user_input.nextInt();
		}
		enterScores.add((int) grade);
		studentsum.add((int) Calc.sum(enterScores));
		
		while (j == 1){
		System.out.println("Do you need to enter another students grades (Y/N)?");
		namecheck = user_input.next();
			
		if(namecheck.equals("Y") || namecheck.equals("y") || namecheck.equals("n") || namecheck.equals("N"))
			{	
				if(namecheck.equals("Y") || namecheck.equals("y"))
				{
					enterScores.clear();
					nameloop = 0;
					j = 0;
				}
				else 
				{
					nameloop = 1; 
					j = 0;	
				}
			} else 
				{
				System.out.println("Input not recognized");
				j = 1;
				}
			}
		
		}
		
		double curve;
        Integer ScoreA, ScoreB, ScoreC, ScoreD, ScoreF;
        
        curve = (Math.round((Calc.stdev(studentsum) / 5) / 5) * 5);
        
        	if(curve < 3)
        		curve = 5;
        
        ScoreA = (int) ((Calc.meanvalue(studentsum) + (curve * 2)));
        ScoreB = (int) ((Calc.meanvalue(studentsum) + (curve)));
        ScoreC = (int) (Calc.meanvalue(studentsum));
        ScoreD = (int) ((Calc.meanvalue(studentsum) - (curve)));
        ScoreF = (int) ((Calc.meanvalue(studentsum) - (curve * 2)));
        System.out.println(curve);  
        System.out.println("A = "+ ScoreA );
        System.out.println("B = "+ ScoreB );
        System.out.println("C = "+ ScoreC );
        System.out.println("D = "+ ScoreD );
        System.out.println("E = "+ ScoreF );
		
		//Printing out Scores
        for (i = 0; i < studentsum.size(); i++ )
        {	System.out.println("Below are the Students Grades for This Class.");
        	
        	if(studentsum.get(i) >= ScoreA)
        		{
        		System.out.println("Student "+ studentName.get(i)+", Scored " + studentsum.get(i) + " for the class and will receive an A Grade.\n");
        		}
        	else if ((studentsum.get(i) >= ScoreB) && (studentsum.get(i) < ScoreA))
        		{
        		System.out.println("Student "+ studentName.get(i)+", Scored " + studentsum.get(i) + " for the class and will receive an B Grade.\n");
        		}
        	else if (studentsum.get(i) >= ScoreC && studentsum.get(i) < ScoreB)
    		{
    		System.out.println("Student "+ studentName.get(i)+", Scored " + studentsum.get(i) + " for the class and will receive an C Grade.\n");
    		}
        	else if (studentsum.get(i) >= ScoreD && studentsum.get(i) <  ScoreC)
    		{
    		System.out.println("Student "+ studentName.get(i)+", Scored " + studentsum.get(i) + " for the class and will receive an D Grade.\n");
    		}
        	else if (studentsum.get(i) < ScoreF)
    		{
    		System.out.println("Student "+ studentName.get(i)+", Scored " + studentsum.get(i) + " for the class and will receive an F Grade.\n");
    		}
        	
        }
		

	}

}
