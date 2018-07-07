import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*CPSC 50100 Assignment 8
 */

public class main {

	public static void main(String[] args) {

		List<String> fileArray = new ArrayList<String>();
		
		StringTreeAVL tree = new StringTreeAVL();

		
		try {
		      fileArray = Files.readAllLines(Paths.get("FruitsAndVegetables.txt"), StandardCharsets.UTF_8);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		Collections.sort(fileArray);
		
		for (int counter = 0; counter < fileArray.size(); counter++ )
		{
			String temp = fileArray.get(counter);
			tree.nodeInsertion(counter, temp);
			tree.printingTree(tree.root, counter);
			System.out.println("\n -------------");
				
		}
			
		System.out.println("finished");
		

	}

}
