import java.util.LinkedList;
import java.util.Queue;

public class queueingAlpha {
		
		Queue Alpha = new LinkedList();
		int maxQue = 10;

		public void addQue (String a)
		{
			Alpha.add(a);
			if (Alpha.size() >= maxQue)
			{	Alpha.remove(a);
				System.out.println("Error: No more elements could be added to the queue");
			} else 
			{
				System.out.println("You have successfully added an element to the queue");
			}
			
		}
		
		public void removeFirstQue ()
		{
			Alpha.remove();
			
			if (Alpha.isEmpty())
			{
				RuntimeException empty  = new RuntimeException ("Queue underflow");
				throw empty;
			} else 
			{
				System.out.println("You have successfully removed an element to the queue");
			}
				
		}
		public void removePositiontQue (int a )
		{	
			int position = a;
			Alpha.remove(position);	
			
			if (Alpha.isEmpty())
			{
				RuntimeException empty  = new RuntimeException ("Queue underflow");
				throw empty;
			} 	 
		}		

		
	}