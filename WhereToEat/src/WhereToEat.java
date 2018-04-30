import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collection;
import java.util.HashSet;

public class WhereToEat {

	private static Scanner restaurant;

	public static void main(String[] args) {
		
		interface_build interface_buildObject = new interface_build();
		interface_buildObject.build();
		
		restaurant = new Scanner(System.in);
		Collection<String> person1 = new LinkedList<>();
		Collection<String> person2 = new LinkedList<>();
		
		// First restaurant entered 
		System.out.println("Enter first option: ");	
		//Stores in restaurant
		String person1_option1 = restaurant.nextLine();
		//Replaces the spaces with no spaces and makes everything lower case
		person1_option1 = person1_option1.replaceAll(" ", "").toLowerCase();
		System.out.println("Option #1: \n" + person1_option1);
			
		// Second restaurant entered
		System.out.println("Enter second option: ".toLowerCase());
		String person1_option2 = restaurant.nextLine();
		person1_option2 = person1_option2.replaceAll(" ", "").toLowerCase();
		System.out.println("Option #2: \n" + person1_option2);
		
		// Third restaurant entered
		System.out.println("Enter third option: ");
		String person1_option3 = restaurant.nextLine();
		person1_option3 = person1_option3.replaceAll(" ", "").toLowerCase();
		System.out.println("Option #3: \n" + person1_option3);
		
		person1.add(person1_option1);
		person1.add(person1_option2);
		person1.add(person1_option3);
		System.out.println(person1);
		
		// First restaurant entered 
		System.out.println("Enter first option: ");	
		String person2_option1 = restaurant.nextLine();
		person2_option1 = person2_option1.replaceAll(" ", "").toLowerCase();
		System.out.println("Option #1: \n" + person2_option1);
					
		// Second restaurant entered
		System.out.println("Enter second option: ");
		String person2_option2 = restaurant.next();
		person2_option2 = person2_option2.replaceAll(" ", "").toLowerCase();
		System.out.println("Option #2: \n" + person2_option2);
				
		// Third restaurant entered
		System.out.println("Enter third option: ");
		String person2_option3 = restaurant.next();
		person2_option3 = person2_option3.replaceAll(" ", "").toLowerCase();
		System.out.println("Option #3: \n" + person2_option3);
				
		person2.add(person2_option1);
		person2.add(person2_option2);
		person2.add(person2_option3);
		System.out.println(person2);
		
		//Compares both lists 
		Collection<String> compare = new HashSet<String>(person1);
		compare.retainAll(person2);
		System.out.println(compare);
	}
}


