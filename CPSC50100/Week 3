/*Assignment Week 3
Let us go back to the 4th condition again. In this situation, your program shows
where the elevator is located: (“The Elevator (E) is in ‘B’.”) And a passenger
pushes the button from the first floor to go up to the second floor: (“The
button is pushed at ‘1.’”) Then, the elevator should go to the first floor and
open its door. This leads to the series of events: (“The Elevator (E) is going up
‘U’.” “The Elevator (E) is now at ‘1’.” “The Elevator (E) is now ‘open ‘O’ and ‘C.’
“Elevator is going up again ‘U.’” “The Elevator (E) is now ‘open ‘O’ and ‘C.’ */

import java.util.Scanner;

public class Assignment_Week_3 {

	public static void main(String[] args) {

		int StartfloorNum, EndfloorNum, ElevatorPos = 1, i = 2, j = 0;
		String[] floorsTextArray = new String[] { "Static", "The Elevator (E) is in (B) basement.",
				"The Elevator (E) is in (1st) Floor.", "The Elevator (E) is in (2nd) Floor." };
		Scanner user_input = new Scanner(System.in);

		while (j == 0) {

			/* Floor "Buttons" */
			System.out.println(floorsTextArray[ElevatorPos]);
			do {
				System.out.println("What Floor are you on: 1) Basement, 2) 1st Floor, 3) 2nd Floor:");
				StartfloorNum = user_input.nextInt();
				System.out.println("Destination Floor: 1) Basement, 2) 1st Floor, 3) 2nd Floor:");
				EndfloorNum = user_input.nextInt();

				if ((StartfloorNum == 1 || StartfloorNum == 2 || StartfloorNum == 3)
						&& (EndfloorNum == 1 || EndfloorNum == 2 || EndfloorNum == 3)) {
					i = 0;
				}

				else if ((StartfloorNum != 1 || StartfloorNum != 2 || StartfloorNum != 3)
						&& (EndfloorNum != 1 || EndfloorNum != 2 || EndfloorNum != 3)) {
					i = 1;
					System.out.println("That was not a valid floor option, please re-enter your choices.\n");
				}
			} while (i != 0);

			if (ElevatorPos - StartfloorNum == 0)
				System.out.println("The Elevator is on your Floor " + StartfloorNum + ".");

			/* If the floor numbers are the same */
			if (EndfloorNum - StartfloorNum == 0) {
				System.out.println("You are already on Floor " + StartfloorNum + ", please try again");
			}
			/* Floor Movements (1-3/E1,1-2/E1,2-3/E2) Up only */
			else if (ElevatorPos - StartfloorNum == 0
					&& (EndfloorNum - StartfloorNum == 2 || EndfloorNum - StartfloorNum == 1)) {
				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");
				System.out.println("The Elevator going UP");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(floorsTextArray[EndfloorNum]);

				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");
				ElevatorPos = EndfloorNum;
			}
			/* Floor Movements (2-1/E2,3-2/E3,3-1/E3) Down Only */
			else if (ElevatorPos - StartfloorNum == 0
					&& (EndfloorNum - StartfloorNum == -2 || EndfloorNum - StartfloorNum == -1)) {
				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");
				System.out.println("The Elevator going Down");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(floorsTextArray[EndfloorNum]);

				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");
				ElevatorPos = EndfloorNum;
			}
			/* Floor Movements (2-1/E3) Down and Down */
			else if (ElevatorPos - StartfloorNum == 1 && EndfloorNum - StartfloorNum == -1) {
				System.out.println("The Elevator is going Down");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("The Elevator is on your Floor " + StartfloorNum + ".");
				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");

				System.out.println("The Elevator going Down");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(floorsTextArray[EndfloorNum]);

				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");
				ElevatorPos = EndfloorNum;
			}
			/* Floor Movements (2-3/E1) Up and Up */
			else if (ElevatorPos - StartfloorNum == -1 && EndfloorNum - StartfloorNum == 1) {
				System.out.println("The Elevator is going Up");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("The Elevator is on your Floor " + StartfloorNum + ".");
				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");

				System.out.println("The Elevator going Up");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(floorsTextArray[EndfloorNum]);

				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");
				ElevatorPos = EndfloorNum;
			}
			/*
			 * Floor Movements (S1-F3/E2,S1-F3/E3,S1-F2/E2,S1-F2/E3,2-3/E3) Down
			 * and Up
			 */
			else if ((ElevatorPos - StartfloorNum == 2 || ElevatorPos - StartfloorNum == 1)
					&& (EndfloorNum - StartfloorNum == 1 || EndfloorNum - StartfloorNum == 2)) {
				System.out.println("The Elevator is going Down");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("The Elevator is on your Floor " + StartfloorNum + ".");
				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");

				System.out.println("The Elevator going Up");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(floorsTextArray[EndfloorNum]);

				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");
				ElevatorPos = EndfloorNum;
			}
			/*
			 * Floor Movements (2-1/E1,3-2/E1,3-2/E2,3-1/E1,3-1/E2) Up and Down
			 */
			else if ((ElevatorPos - StartfloorNum == -2 || ElevatorPos - StartfloorNum == -1)
					&& (EndfloorNum - StartfloorNum == -1 || EndfloorNum - StartfloorNum == -2)) {
				System.out.println("The Elevator is going Up");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("The Elevator is on your Floor " + StartfloorNum + ".");
				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");

				System.out.println("The Elevator going Down");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(floorsTextArray[EndfloorNum]);

				System.out.println("	The Elevator (E) is now Open (O).");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("	The Elevator (E) is now Closed (C).");
				ElevatorPos = EndfloorNum;
			}

			System.out.print("\n");
		}

	}

}

/*
 * Floors B = "The Elevator (E) is in (B) basement." 1 =
 * "The Elevator (E) is in (1st) Floor." 2 =
 * "The Elevator (E) is in (2nd) Floor."
 * 
 * Directions UP = U1 and U2 DOWN = D1 and D2
 * 
 * Door Position Open = "The Elevator (E) is now Open (O)." Closed =
 * "The Elevator (E) is now Closed (C)."
 * 
 * Request States Elevator Position + Direction + Floors Travel
 * 
 * (ElevatorPos(1) - StartfloorNum(1) = 0 && EndfloorNum(3) - StartfloorNum(1)=
 * 2) == (-/U) 1-3/E1 (ElevatorPos(2) - StartfloorNum(1) = 1 && EndfloorNum(3) -
 * StartfloorNum(1) = 2) == (D/U) 1-3/E2 (ElevatorPos(3) - StartfloorNum(1) = 2
 * && EndfloorNum(3) - StartfloorNum(1) = 2) == (D/U) 1-3/E3
 * 
 * (ElevatorPos(1) - StartfloorNum(1) = 0 && EndfloorNum(2) - StartfloorNum(1) =
 * 1) == (-/U) 1-2/E1 (ElevatorPos(2) - StartfloorNum(1) = 1 && EndfloorNum(2) -
 * StartfloorNum(1) = 1) == (D/U) 1-2/E2 (ElevatorPos(3) - StartfloorNum(1) = 2
 * && EndfloorNum(2) - StartfloorNum(1) = 1) == (D/U) 1-2/E3
 * 
 * (ElevatorPos(1) - StartfloorNum(2) = -1 && EndfloorNum(3) - StartfloorNum(2)
 * = 1) == (U/U) 2-3/E1 (ElevatorPos(2) - StartfloorNum(2) = 0 && EndfloorNum(3)
 * - StartfloorNum(2) = 1) == (-/U) 2-3/E2 (ElevatorPos(3) - StartfloorNum(2) =
 * 1 && EndfloorNum(3) - StartfloorNum(2) = 1) == (D/U) 2-3/E3
 * 
 * (ElevatorPos(1) - StartfloorNum(2) = -1 && EndfloorNum(1) - StartfloorNum(2)
 * = -1) == (U/D) 2-1/E1 (ElevatorPos(2) - StartfloorNum(2) = 0 &&
 * EndfloorNum(1) - StartfloorNum(2) = -1) == (-/D) 2-1/E2 (ElevatorPos(3) -
 * StartfloorNum(2) = 1 && EndfloorNum(1) - StartfloorNum(2) = -1) == (D/D)
 * 2-1/E3
 * 
 * (ElevatorPos(1) - StartfloorNum(3) = -2 && EndfloorNum(2) - StartfloorNum(3)
 * = -1) == (D/D) 3-2/E1 (ElevatorPos(2) - StartfloorNum(3) = -1 &&
 * EndfloorNum(2) - StartfloorNum(3) = -1) == (U/D) 3-2/E2 (ElevatorPos(3) -
 * StartfloorNum(3) = 0 && EndfloorNum(2) - StartfloorNum(3) = -1) == (-/D)
 * 3-2/E3
 * 
 * (ElevatorPos(1) - StartfloorNum(3) = -2 && EndfloorNum(1) - StartfloorNum(3)
 * = -2) == (U/D) 3-1/E1 (ElevatorPos(2) - StartfloorNum(3) = -1 &&
 * EndfloorNum(1) - StartfloorNum(3) = -2) == (U/D) 3-1/E2 (ElevatorPos(3) -
 * StartfloorNum(3) = 0 && EndfloorNum(1) - StartfloorNum(3) = -2) == (-/D)
 * 3-1/E3
 * -----------------------------------------------------------------------------
 * -----------------------
 * 
 * ElevatorPos - StartfloorNum = +(D)/0(N)/-(U) EndfloorNum - StartfloorNum =
 * +(U)/0(N)/-(D)
 * 
 * -/U -/D U/D D/U U/U D/D
 * 
 * Challenges Simple Entering System Elevator Position Tracking Printing out
 * Right Order of Operation for Elevator
 * 
 * 
 * 
 */
