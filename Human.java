package smithCProject4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Human extends Mammal {
	
double money, dogfood;
String dogName1, dogName2;
int n;
List<Dog> Pups = new ArrayList<>();


Human () {
	
	// Randomly generates 1-2 dogs per human.
	Random rand = new Random();
	n = rand.nextInt(2) + 1;

	for (int i = 0; i < n; i++) {
		this.Pups.add(new Dog());
	}
	
	// Lets user set dog's name.
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a dog name");
	if (n == 1) {
		dogName1 = scan.next();
		this.Pups.get(0).name = dogName1;
		sex = "Female";
	}
	if (n == 2) {
		dogName1 = scan.next();
		this.Pups.get(0).name = dogName1;
		System.out.println("Enter a name for the 2nd dog.");
		dogName2 = scan.next();
		this.Pups.get(1).name = dogName2;
		sex = "Male";
	}
	
	// Sets human attributes.
	money = 30;
	dogfood = 10;

}

public void nameHuman(String name) {
	
		// Setter for human's name.
		this.name = name;
}

public void walk() {
	double decreaseCleanliness, increaseHunger;
	
	// Increases fun by 50 and hunger by 10%.
	// Decreases cleanliness by 10%.
	if (n == 1) {
		this.Pups.get(0).fun += 50;
		decreaseCleanliness = (0.1 * Pups.get(0).cleanliness);
		this.Pups.get(0).cleanliness -= decreaseCleanliness;
		increaseHunger = (0.1 * Pups.get(0).hunger);
		this.Pups.get(0).hunger += increaseHunger; 
	}
	else if (n == 2) {
		this.Pups.get(0).fun += 50;
		decreaseCleanliness = (0.1 * Pups.get(0).cleanliness);
		this.Pups.get(0).cleanliness -= decreaseCleanliness;
		increaseHunger = (0.1 * Pups.get(0).hunger);
		this.Pups.get(0).hunger += increaseHunger; 
		
		this.Pups.get(1).fun += 50;
		decreaseCleanliness = (0.1 * Pups.get(1).cleanliness);
		this.Pups.get(1).cleanliness -= decreaseCleanliness;
		increaseHunger = (0.1 * Pups.get(1).hunger);
		this.Pups.get(1).hunger += increaseHunger; 
	}
	else
		System.out.println("How did you get so many dogs?");
		
}

public void feeds() {
	double decreaseCleanliness, increaseFun;
	
	// Decreases cleanliness by 10% and dogfood.  
	// Increases fun by 10%.
	if (n == 1) {
		this.Pups.get(0).hunger += 50;
		decreaseCleanliness = (0.1 * Pups.get(0).cleanliness);
		this.Pups.get(0).cleanliness -= decreaseCleanliness;
		increaseFun = (0.1 * Pups.get(0).fun);
		this.Pups.get(0).fun += increaseFun; 
		dogfood -= 1;
	}
	else if (n == 2) {
		this.Pups.get(0).hunger += 50;
		decreaseCleanliness = (0.1 * Pups.get(0).cleanliness);
		this.Pups.get(0).cleanliness -= decreaseCleanliness;
		increaseFun = (0.1 * Pups.get(0).fun);
		this.Pups.get(0).fun += increaseFun; 
		
		this.Pups.get(1).hunger += 50;
		decreaseCleanliness = (0.1 * Pups.get(1).cleanliness);
		this.Pups.get(1).cleanliness -= decreaseCleanliness;
		increaseFun = (0.1 * Pups.get(1).fun);
		this.Pups.get(1).fun += increaseFun; 
		dogfood -= 2;
	}
	else
		System.out.println("How did you get so many dogs?");
	

}

public void bathes() {
	double decreaseFun;
	
	// Increases cleanliness to 100. Decreases fun by 10%.
	if (n == 1) {
		this.Pups.get(0).cleanliness = 100;
		decreaseFun = (0.1 * Pups.get(0).fun);
		this.Pups.get(0).fun -= decreaseFun; 
	}
	else if (n == 2) {
		this.Pups.get(0).cleanliness = 100;
		decreaseFun = (0.1 * Pups.get(0).fun);
		this.Pups.get(0).fun -= decreaseFun; 
		
		this.Pups.get(1).cleanliness = 100;
		decreaseFun = (0.1 * Pups.get(1).fun);
		this.Pups.get(1).fun -= decreaseFun; 
	}
	else
		System.out.println("How did you get so many dogs?");
	
}

public String toString() {
	
	// Displays human's attributes.
	return name + " - " + sex + " - " + "Money = $" + 
		   money + " - Dogfood = " + dogfood;
}

public void passTheTime() {
	
	// Decreases fun by 1, increases money by 10.
	if (n == 1) {
		this.Pups.get(0).fun -= 1;
		this.money += 10;
	}
	else if (n == 2) {
		this.Pups.get(0).fun -= 1;
		this.Pups.get(1).fun -= 1;
		this.money += 10;
	}
	else
		System.out.println("How did you get so many dogs?");
	
}

public void buysFood() {
	
	// Increases dogfood by 50 and decreases money by 10.
	dogfood += 50;
	money -= 10;
}



}