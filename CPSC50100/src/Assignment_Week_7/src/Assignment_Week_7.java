//Assignment Week 7 part 1
import java.util.*;

public class Assignment_Week_7 {

	public static void main(String[] args) {
		
		int imput1, imput2, check; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This Program Calculates the Greatest Common Divisor of Two Integers\n First Number:");
		imput1 = scan.nextInt();

		System.out.println("Please enter the Second Number:");
		imput2 = scan.nextInt();
		
		check = getGCD(imput1, imput2);
		
		if (check == 1)
			System.out.println("The GSD of those two Integers is 1");
		else
			System.out.println("The GSD of those two Integers is " + getGCD(imput1, imput2));
		
		scan.close();
		
	}
		private static int getGCD(int x, int y)
		{	
			if(y == 0)
			{
				return x;
			}
			return getGCD(y, x%y);
		}
}