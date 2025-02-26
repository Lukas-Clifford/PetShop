package petShop.shopClasses;

import petShop.animalsClasses.Animal;
import petShop.animalsClasses.speciesClasses.Bird;
import petShop.animalsClasses.speciesClasses.Cat;
import petShop.animalsClasses.speciesClasses.Dog;
import petShop.animalsClasses.speciesClasses.Rat;
import utils.Utils;

public class IndividualShop {
	
	//All initial attributes of the individual shop
	public int numAnimals = 0;
	int opcion = 0;
	int finalPrice = 0;
	public int petsCounter = 0,dogCounter = 0,catCounter = 0,birdCounter = 0,ratCounter = 0;
	public Animal[] animals;
	
	public IndividualShop() {
		//It starts with the initial prints of welcoming the customer
		System.out.println("Welcome to the virtual pet shop!");
		System.out.println("Enter your personal data");
		
		//Asking about credentials of the customer
		String name = Utils.pedirCadena("Please enter your name: ");
		String surname = Utils.pedirCadena("Please enter your surname: ");
		String dni = Utils.pedirCadena("Please enter your dni: ");
		System.out.println("Welcome sir/miss "+surname);
		
		//Asking the number of animals and making the array to store all of them
		numAnimals = Utils.pedirNumeroEntero("How many animals do you want to buy?: ");
		this.animals = new Animal[numAnimals];
		
		//Main loop to handle all the animals sales
		System.out.println("Which one");
		for(int i = 0;i<numAnimals;i++) {
			
			//Printing the menu
			System.out.println("1) Dog");
			System.out.println("2) Cat");
			System.out.println("3) Bird");
			System.out.println("4) Rat: ");
			
			//Selecting an option to buy an animal
			opcion = Utils.pedirNumeroEntero("Select your option: ");
			
			//If selected option is a dog
			if(opcion == 1) {
				System.out.println("You selected a dog");
				
				//It stores the animal that wants the customer to buy asking the parameters
				animals[i] = new Dog(
						Utils.pedirCadena("Do you want a male or a female?: ").toLowerCase(),
						Utils.pedirNumeroEntero("How many years do you want the dog to have?: "),
						Utils.pedirCadena("What color?: "),
						Utils.pedirCadena("What breed?: "),
						Utils.pedirCadena("Do you want a dog with pedigree?: ").toLowerCase(),
						Utils.pedirCadena("And what type of hair do you want the dog to have?: "),
						Utils.pedirCadena("Please enter your new dog name: "),
						name,
						surname,
						dni
						);
				
				//The animal is added as a Dog but, the array is set by Animal class, so we have
				//to cast the animal as a Dog to be able to access its methods
				Dog dog = (Dog) animals[i];
				
				//Gets data from the dog class
				finalPrice += dog.getPrice();
				dogCounter++;
				petsCounter++;
				
				//Prints the final message that confirms the addition to the purchase
				System.out.println("Price: "+dog.getPrice()+"$");
				System.out.println("The dog "+dog.getName()+" with EAN "+dog.getEan()+
						" has been added to the pucharse");
				
			//If selected option is a cat
			}else if(opcion == 2) {
				System.out.println("You selected a cat");
				
				//It stores the animal that wants the customer to buy asking the parameters
				animals[i] = new Cat(
						Utils.pedirCadena("Do you want a male or a female?: ").toLowerCase(),
						Utils.pedirNumeroEntero("How many years do you want the cat to have?: "),
						Utils.pedirCadena("What color?; "),
						Utils.pedirCadena("What breed?: "),
						Utils.pedirCadena("And what type of hair do you want the cat to have?: "),
						Utils.pedirCadena("Please enter your new cat name: "),
						name,
						surname,
						dni
						);
				
				//The animal is added as a Cat but, the array is set by Animal class, so we have
				//to cast the animal as a Cat to be able to access its methods
				Cat cat = (Cat) animals[i];
				
				//Gets data from the cat class
				finalPrice += cat.getPrice();
				catCounter++;
				petsCounter++;
				
				//Prints the final message that confirms the addition to the purchase
				System.out.println("Price: "+cat.getPrice()+"$");
				System.out.println("The cat "+cat.getName()+" with EAN "+cat.getEan()+
						" has been added to the pucharse");
				
			//If selected option is a bird
			}else if(opcion == 3) {
				System.out.println("You selected a bird");
				
				//It stores the animal that wants the customer to buy asking the parameters
				animals[i] = new Bird(
						Utils.pedirCadena("Do you want a male or a female?: ").toLowerCase(),
						Utils.pedirNumeroEntero("How many years do you want the bird to have?: "),
						Utils.pedirCadena("What color?; "),
						Utils.pedirCadena("And what type of hair do you want the bird to have?: ")
						);
				
				//The animal is added as a Bird but, the array is set by Animal class, so we have
				//to cast the animal as a Bird to be able to access its methods
				Bird bird = (Bird) animals[i];
				
				//Gets data from the Bird class
				finalPrice += bird.getPrice();
				birdCounter++;
				
				//Prints the final message that confirms the addition to the purchase
				System.out.println("Price: "+bird.getPrice()+"$");
				System.out.println("The bird with EAN "+animals[i].getEan()+
						" has been added to the pucharse");
			
			//If selected option is a rat
			}else if(opcion == 4) {
				System.out.println("You selected a rat");
				
				//It stores the animal that wants the customer to buy asking the parameters
				animals[i] = new Rat(
						Utils.pedirCadena("Do you want a male or a female?: ").toLowerCase(),
						Utils.pedirNumeroEntero("How many years do you want the rat to have?: ")
						);
				
				//The animal is added as a Rat but, the array is set by Animal class, so we have
				//to cast the animal as a Rat to be able to access its methods
				Rat rat = (Rat) animals[i];
				
				//Gets data from the Rat class
				finalPrice += rat.getPrice();
				ratCounter++;
				
				//Prints the final message that confirms the addition to the purchase
				System.out.println("Price "+rat.getPrice()+"$");
				System.out.println("The rat with EAN "+animals[i].getEan()+
						" has been added to the pucharse");
				
			//Handle the wrong option
			}else {
				System.err.println("No es una opción válida");
			}
			
		}
		
		//Prints the total purchase only showing the animals bought
		System.out.println("Total animals: "+numAnimals);
		if(petsCounter > 0) {
			System.out.println("Total pets: "+petsCounter);
		}
		if(dogCounter > 0) {
			System.out.println("Total dogs: "+dogCounter);
		}
		if(catCounter > 0) {
			System.out.println("Total cats: "+catCounter);
		}
		if(birdCounter > 0) {
			System.out.println("Total birds: "+birdCounter);
		}	
		if(ratCounter > 0) {	
			System.out.println("Total rats: "+ratCounter);
		}
		
		System.out.println("####################################");
		System.out.println("Total: "+finalPrice+"$");
		System.out.println("####################################");
}
	
}
