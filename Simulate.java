package smithCProject4;


import java.util.Scanner;

public class Simulate {
	public static void main(String[] args) {
		
		int numofHumans;
		String num, humanName = null;
		boolean Continue = true;
		
		// Prompt user for number of humans.
		Scanner scan = new Scanner(System.in);
		System.out.println("How many humans should exist?");
		num = scan.next();
		numofHumans = Integer.parseInt(num);
	
		// Creates array of Humans.
		Human[] humanArray = new Human[numofHumans];		

		// Creates array of human names.
		String[] nameArray = new String[numofHumans];
		
		// Prompts user for humans names.
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println("Enter name for human " + (i+1) + ".");
			humanName = scan.next();
			nameArray[i] = humanName;
			System.out.println("The name for human " + (i+1) + " is " + nameArray[i]);
		}
		
		// Initializes Human array and passes names to setter.
		for (int i = 0; i < humanArray.length; i++) {
			humanArray[i] = new Human();
			humanArray[i].nameHuman(nameArray[i]);
		}
			
		// Calls toString for humans and dogs.
		do {
			
			for (int i = 0; i < humanArray.length; i++) {
				System.out.println(humanArray[i].toString());			
					if (humanArray[i].n == 1)		
						System.out.println(humanArray[i].Pups.get(0).toString());
					else if (humanArray[i].n == 2) {
						System.out.println(humanArray[i].Pups.get(0).toString());
						System.out.println(humanArray[i].Pups.get(1).toString());
					}
					else
						System.out.println("Seriously, where are you getting all these dogs?");
			}
			
			// Menu for human performing actions.
			for (int i = 0; i < humanArray.length; i++) {
				System.out.println("Perform an action for " + humanArray[i].name + ".\n" 
						+ "1. Walk\n" + "2. feed\n" + "3. bathe\n" + "4. buy food\n" + "5. exit");
				
				// Executes action selected by user.
				String choiceString;
				int choiceInt;
				choiceString = scan.next();
				choiceInt = Integer.parseInt(choiceString);
				
				switch (choiceInt) {
				case 1: humanArray[i].walk();
						break;
				case 2: humanArray[i].feeds();
						break;
				case 3: humanArray[i].bathes();
						break;
				case 4: humanArray[i].buysFood();
						break;
				case 5: Continue = false;
						System.exit(0);			
				}
				// Pass time.
				humanArray[i].passTheTime();
				
				// Exits if any of the dog's attributes go above 100 or below 1.
				if (humanArray[i].n == 1) {
					if (humanArray[i].Pups.get(0).fun > 100) {
						System.out.println("Your dog has died of happines :(");
						System.exit(0);
					}
					else if (humanArray[i].Pups.get(0).fun < 1) {
						System.out.println("You've lost your family, friends, and job );"
								+ "because your dog is so filthy. You lose.");
						System.exit(0);
					}
					else if (humanArray[i].Pups.get(0).cleanliness > 100) {
						System.out.print("Looks like you cleaned your dog with industrial grade detergent."
								+ " He did not survive.");
						System.exit(0);
					}
					else if (humanArray[i].Pups.get(0).cleanliness < 1) {
						System.out.println("You've lost your family, friends, and job "
								+ "because your dog is so filthy. You lose.");
					}
					else if (humanArray[i].Pups.get(0).hunger > 100) {
						System.out.println("You overfed your dog. At least he died happy.");
						System.exit(0);
					}
					else if (humanArray[i].Pups.get(0).hunger < 1) {
						System.out.println("Your dog has starved to death. What is wrong with you?");
						System.exit(0);
					}			
				}
				else if(humanArray[i].n == 2) {
					if (humanArray[i].Pups.get(0).fun > 100 || humanArray[i].Pups.get(1).fun > 100) {
						System.out.println("Your dog has died of happines :(");
						System.exit(0);
					}
					else if (humanArray[i].Pups.get(0).fun < 1 || humanArray[i].Pups.get(1).fun < 1) {
						System.out.println("You've lost your family, friends, and job "
								+ "because your dog is so filthy. You lose.");
						System.exit(0);
					}
					else if (humanArray[i].Pups.get(0).cleanliness > 100 || humanArray[i].Pups.get(1).cleanliness > 100) {
						System.out.print("Looks like you cleaned your dog with industrial grade detergent."
								+ " He did not survive.");
						System.exit(0);
					}
					else if (humanArray[i].Pups.get(0).cleanliness < 1 || humanArray[i].Pups.get(1).cleanliness < 1) {
						System.out.println("You've lost your family, friends, and job );"
								+ "because your dog is so filthy. You lose.");
					}
					else if (humanArray[i].Pups.get(0).hunger > 100 || humanArray[i].Pups.get(1).hunger > 100) {
						System.out.println("You overfed your dog. At least he died happy.");
						System.exit(0);
					}
					else if (humanArray[i].Pups.get(0).hunger < 1 || humanArray[i].Pups.get(0).hunger < 1) {
						System.out.println("Your dog has starved to death. What is wrong with you?");
						System.exit(0);
					}			
					
				}

			}
			
		} while (Continue == true);
	}
}

