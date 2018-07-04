/*CPSC 50100 Assignment 2
 In this app, you are to ask a customer to choose various
options for their meals.

1. First, ask the customer if he/she wants the order to be a â€œPick-Upâ€� or
â€œDelivery.â€�
2. Second, ask the customer to enter a zip code if it is a â€œDelivery.â€� Based on
the entered zip code, there should three following messages: â€œDelivery
Available,â€� â€œDelivery Not Available,â€� and â€œDelivery with extra cost.â€� Say the
customer has entered 60446, which is the zip code for this restaurant. The
exact zip code and area distribution we do not know, so we presume that
the zip code that is different from 60446 less than the degree of 5 (either
above or below), that is â€œDelivery Available.â€� Also, the zip code that is
60451 or 60441 is â€œDelivery with extra cost.â€� Any other zip codes are
â€œDelivery Not Available.â€�
3. Third, ask the customer about the order. Below are suggested items but are
not limited. You should have an option to order more than one item. The
tax rate is multiplied with the items only. Then, add the delivery fee. If
â€œDelivery Availableâ€� is chosen based on the entered zip code, add $5.00
after the tax. If â€œDelivery with Extra Costâ€� is chosen, add $7.00 after the tax.
The output should be the total bill including the tax and the delivery fee.
Build necessary methods for the items to be ordered.
(a) Flyers' Burger: $4.50 per an order
(b) Flyers' Drink: $1.50 per a container
(c) Flyers' Fries: $ 2.50 per an order
(d) Flyers' Dessert: $ 3.00 per an order
(e) Tax: 5% */

import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;


public class Assignment_Week_2
{
		public static Scanner user_input;

		public static void main(String[] args)
		{
			user_input = new Scanner(System.in);
			String deliveryOp, customer_name;
			int zipNum, deliveryStat = 0, i = 0, Item;
			String loopCheck;
			double subtotal = 0, total = 0;
			String [] menuArray = {"Menu items below:","1. Flyers' Burger: $4.50 per an order","2. Flyers' Hotdog: $3.50 per an order","3. Flyers' Fries: $2.50 per an order","4. Flyers' Drink: $1.50 per a container","5. Flyers' Chocolate Milkshake: $4.00 per order","6. Flyers' Vanilla Milkshake: $4.00 per order","7. Flyers' Dessert: $3.00 per an order"};
			double [] priceArray = {4.50,3.50,2.50,1.50,4.00,4.00,3.00};
		
			/*Initial customer greeting*/
			System.out.println("Welcome to Flyrs' Online Ordering. Could we get your name?");
			customer_name = user_input.next();
			System.out.print("Thank you "+customer_name +" for choosing Flyrs'. We are proud to serve the 27804 and the surrounding areas.\nWill your order be A) Pick-up or B) Delivery?\nPlease Enter one:");
			deliveryOp = user_input.next();
			
			
			/*Delivery Check and Zip Code Check"*/
			
			while(i == 0) {
			if(deliveryOp.equals("b") || deliveryOp.equals("Delivery") || deliveryOp.equals("B")) 
				{System.out.println("Because you chose to have your order delivered please enter your Zip code: ");	
					zipNum = user_input.nextInt();
					
					if(zipNum < 27810 & zipNum > 27789) {
						deliveryStat = 5; 
						i = 1;
					}
					else if (zipNum == 27811 || zipNum == 27788) {
						deliveryStat =  7;
						i = 1;
					}
					else {
						deliveryStat =  0;
						i = 1;
					}
					if(zipNum < 27810 & zipNum > 27789) 
						System.out.println("You are in our delivery area, but please note there is a $5.00 delivery charge.\nPlease proceed to your order.");
					
					else if (zipNum == 27811 || zipNum == 27788) 
						System.out.println("You are just outside our delivery area, but we can still deliver to you for a $7.00 delivery charge.\nPlease proceed to your order.");
					else 
					 System.out.println("You are outside our delivery area, but can still come and Pick-up your order.\nPlease proceed to your order.");
					
			} else if(deliveryOp.equals("a") || deliveryOp.equals("Pick-up") || deliveryOp.equals("A")) {
			
				System.out.println("Thank you for your Pick-up order. Please Proceed with the ordering process.");
				i = 1;
			
			}else  {System.out.println("I'm sorry, I didn't understand what you entered could you please try again.\n Will this be A) Pick-up or B) Delivery");
						deliveryOp = user_input.next();
						i = 0;
			}
			}
			/*Menu print out*/
			for(i = 0; i < menuArray.length; i++)
	        {
	            System.out.print(menuArray[i]+"\n");
	        }        
			
      
	        
	        /*user selection*/    
			
			ArrayList<Integer> orderItemsList = new ArrayList<Integer> ();
						
	        System.out.println("Please Enter the Menu Item Number of each of the menu items you would like to Order.");
	        Item = user_input.nextInt();
	        orderItemsList.add(Item);
	        
	        int counter = 0;
			while (counter == 0) 
	        {
	        	System.out.println("Does that complete your order?(Y/N):");
	        	loopCheck = user_input.next();
	        	
	        	if(loopCheck.equals("N") || loopCheck.equals("n")) 
	        	{
	        		System.out.println("Okay, what is the next item you would like to add to your order?\n");
	        		counter = 0;
	           		Item = user_input.nextInt();
	    	        orderItemsList.add(Item);
	    	        
	           	}else 
	           	{
	           		counter = 1;
	           	}
	        	
	        }
	        
	        System.out.print("Here is your Order:\n");
	        
	        
	        for(i = 0; i < orderItemsList.size(); i++)
	        {
	            System.out.print(menuArray[orderItemsList.get(i)]+"\n");
	        }
			
	        for(i = 0; i < orderItemsList.size(); i++)
	        {   
	        	subtotal = subtotal + priceArray[orderItemsList.get(i)]; 
	        }
	        /*pricing output*/
	        System.out.println("Your Order Subtotal is \n$"+subtotal);	
	        System.out.println("Delivery Fees are:\n$"+deliveryStat);
	        total = (subtotal*1.05)+deliveryStat;   
			System.out.printf("Your Total for today's Order comes too:\n$%.2f %n", total);
			
			
			
				
		}
}
