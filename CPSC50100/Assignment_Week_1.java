/* Week 1 Assignment
Design an algorithm to find the weighted average of six test scores and the weighted average of six assignment scores
and then get the master average between the two weighted averages.

The six test scores and their respective weights are given in the following format: 

75  0.10
95  0.20
85  0.25
55  0.25
65  0.10 
70  0.10
The six assignment scores and their respective weights are given in the following format: 

55  0.05
65  0.10
65  0.15
60  0.25
55  0.25 
50  0.20
Please send me the source code you designed.*/

public class Assignment_Week_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double test1 = 75 * 0.10;
		double test2 = 95 * 0.20;
		double test3 = 85 * 0.25;
		double test4 = 55 * 0.25;
		double test5 = 65 * 0.10;
		double test6 = 70 * 0.10;
		double testWeightedAvg = (test1 + test2 + test3 + test4 +test5 + test6);
		
		double assignment1 = 55 * 0.05;
		double assignment2 = 65 * 0.10;
		double assignment3 = 65 * 0.15;
		double assignment4 = 60 * 0.25;
		double assignment5 = 55 * 0.25;
		double assignment6 = 50 * 0.20;
		double assignmentWeightedAvg =  (assignment1 + assignment2 + assignment3 + assignment4 +assignment5 + assignment6);
		
		System.out.println("Your Weighted Test Average Is " + testWeightedAvg);
		System.out.println("Your Weighted Assignment Average Is " + assignmentWeightedAvg);
		System.out.println("Your Total Course Average Is " + ((testWeightedAvg + assignmentWeightedAvg)/2));
	}

}

