package petShop.shopClasses.searchesUtils;

import petShop.animalsClasses.Animal;
import petShop.animalsClasses.Pet;
import petShop.shopClasses.IndividualShop;
import utils.Utils;

public class Searches {
	//This file contains the functions to the last sections of the exercise
	public static void searchNameByOwnersDni(IndividualShop[] animalsSold, int numPets) {
		
		//Searching the owner name and pets entering the owner DNI's
		System.out.println();
		System.out.println("SHOW PET'S NAME");
		
		//Initial check for not asking an input if there is no pets to search
		if(numPets>0) {
			
			//Asking the user to enter a String
			System.out.println();
			String dniSearch = Utils.pedirCadena("For searching a pet by dni, introduce the dni: ");
			
			//For searching animals it is needed to iterate over all animals, including all the customers
			//Iterate over customers (or sales)
			for(IndividualShop sale:animalsSold) {
				
				//iterate over animals of the sale
				for(Animal animal:sale.animals) {
					
					/*
					 * There is two ways of checking if an object is a child of another class:
					 * 1- Checking with the keyword "instanceof" if it is, well, the instance of that class
					 * 2- Overriding the Object method toString and get the name of the instance of the object
					 * (There is an example on the last function "checkIfItLikesFood")
					 */
					
					//It checks if the animal is a Pet
					if(animal instanceof Pet) {
						
						//Cast the animal as a pet
						Pet pet = (Pet) animal;
						
						//If the pet's owner dni is the same as the dni it is looking for, prints the name
						if(pet.getOwnerDni().equals(dniSearch)) {
							
							System.out.println("The owner of "+pet.getName()+" is "+ pet.getOwnerName());
							
						}
					
					}
				
				}
			
			}
		
		
		}else {System.out.println("There is no pets for searching");}
	}
	
	public static void searchChipByPetName(IndividualShop[] animalsSold, int numPets) {
		
		//Show the number chip and name of a pet entering the name
		System.out.println();
		System.out.println("SHOW CHIP NUMBER OF A PET");
		if(numPets>0) {
			System.out.println();
			String nameSearch = Utils.pedirCadena("For searching a pet by its name, introduce the name: ");
			for(IndividualShop sale:animalsSold) {
				for(Animal animal:sale.animals) {
					if(animal instanceof Pet) {
						Pet pet = (Pet) animal;
						if(pet.getName().equals(nameSearch)) {
							System.out.println("The number chip of "+pet.getName()+
									" is "+pet.getId());
						}
					}
				}
			}
		}else {System.out.println("There is no pets for searching");}
	}
	
	public static void searchAndShowCharByEan(IndividualShop[] animalsSold) {
		System.out.println();
		//Show the characteristics of an animal entering its EAN code
		System.out.println("SHOW CHARACTERISTICS OF AN ANIMAL");
		System.out.println();
		int eanSearch = Utils.pedirNumeroEntero("For searching an animal by its ean, introduce the ean: ");
		for(IndividualShop sale:animalsSold) {
			for(Animal animal:sale.animals) {
				if(animal.getEan() == eanSearch) {
					animal.showCharacteristics();
				}
				
			}
		}
	}
	
	public static void checkIfCanBeMated(IndividualShop[] animalsSold, int numPets) {
		System.out.println();
		//Show if 2 pets can be mated
		System.out.println("CHECK IF TWO PETS CAN BE MATED");
		if(numPets>=2) {
			System.out.println();
			System.out.println("For checking if two pets can be mated");
			int firstName = Utils.pedirNumeroEntero("Introduce the firs pet's name: ");
			int secondName = Utils.pedirNumeroEntero("Introduce the second pet's name: ");
			Pet[] petsForMating = new Pet[2];
			
			for(IndividualShop sale:animalsSold) {
				for(Animal animal:sale.animals) {
					if(animal instanceof Pet) {
						Pet pet = (Pet) animal;
						if(pet.getName().equals(firstName)) {
							petsForMating[0] = pet;
						}else if(pet.getName().equals(secondName)) {
							petsForMating[1] = pet;
						}
					}
				}
			}
			if(petsForMating[0].toString().equals(petsForMating[1].toString())) {
				if(petsForMating[0].getSex()!=petsForMating[1].getSex()) {
					System.out.println("They can be mated!");
				}else System.out.println("They can not be mated, they have the same gender!");;
			}else System.out.println("They can not be mated, they are not the same animal!");; 
			
			
		}else if(numPets == 1) {
			System.out.println("There is not enough pets to mate");
		}else System.out.println("There is no pets for mating");
	}

	public static void checkIfItLikesAFood(IndividualShop[] animalsSold, int numPets) {
		System.out.println();
		//Shows if an animal likes a type of food
		System.out.println("CHECK IF AN ANIMAL LIKES A FOOD");
		int eanSearch = Utils.pedirNumeroEntero("For searching an animal by its ean, introduce the ean: ");
		String food = Utils.pedirCadena("Enter a type of food to see if the animal likes it: ");
		
		for(IndividualShop sale:animalsSold) {
			for(Animal animal:sale.animals) {
				if(animal.getEan() == eanSearch) {
					if(animal.toString().equals("cat")) {
						if(food.contains("fish")||food.contains("feed")) {
							System.out.println("It does like "+food);
						}else System.out.println("It doesn't like "+food);
						
					}else if(animal.toString().equals("dog")){
						if(food.contains("meat")||food.contains("bones")
								||food.contains("feed")||food.contains("bone")) {
							System.out.println("It does like "+food);
						}else System.out.println("It doesn't like "+food);
						
					}else if(animal.toString().equals("bird")) {
						if(food.contains("feed")) {
							System.out.println("It does like "+food);
						}else System.out.println("It doesn't like "+food);
					}else System.err.println("Thats a rat!");;
				}
				
			}
		}
	}
	
	
}
