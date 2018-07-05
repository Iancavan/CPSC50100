package application;

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