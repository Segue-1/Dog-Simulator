package smithCProject4;

import java.util.Random;
import java.util.Scanner;

public class Dog extends Mammal {
	
int fun, cleanliness, randomNum, max; 
private int loyalty = loyalty();
String dogName, sex;
	
	
Dog() {	
		
	// Randomly generates sex.
	Random rand = new Random();
	randomNum = rand.nextInt(2) + 1;
		
	if (randomNum == 1) {
		sex = "Female";
	}
	else if (randomNum == 2) {
		sex = "Male";
	}
	else 
		System.out.println("Error with selecting gender");
		
	// Sets dog's attributes.
	fun = 10;
	cleanliness = 25;
	hunger = 50;
	loyalty = 0;	
	}
	
private int loyalty() {
	
	// Sets loyalty = to fun or hunger, whichever is highest.
	// Might have misinterpreted how this should be set.
	if (fun > hunger) {
		loyalty = fun;
	}
	else 
		loyalty = 100 - hunger;
	
	return loyalty;
}

	
public String toString() {
		
	// Displays attributes for dog.
	return name + " - " + sex + " - " + 
			"Loyalty = " + loyalty + " - Fun = " + fun +
			" - Cleanliness = " + cleanliness +
			" - Hunger = " + hunger;
	}
}
