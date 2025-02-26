package petShop;

import petShop.shopClasses.IndividualShop;
import petShop.shopClasses.searchesUtils.Searches; 
import utils.Utils;

public class Shop {
	
	/* #####FOR CURRO#####
	 * When I saw the way that Fernando made his comments in his code,
	 * made me realize how ugly were mine. So, I'll try to make them more "pretty"
	 * with line breaks.
	 */
	
	public static void main(String[] args) {
		
		//Asks the number of customers that want to buy at the shop
		int numCustomers = Utils.pedirNumeroEntero("How many customer are there?: ");
		
		//Creates the array where all the sales will be stored
		IndividualShop[] animalsSold = new IndividualShop[numCustomers];
		
		//For each customer, it initializes the individual shop
		for(int i = 0;i<numCustomers;i++) {
			animalsSold[i] = new IndividualShop();
		}
		
		//All the variables to store data about the sales
		int numAnimals = 0,numPets = 0,numDogs = 0,numCats = 0,numBirds = 0,numRats = 0;
		
		//For each sale, it adds all the data from one client to the global counters
		for(IndividualShop sale:animalsSold) {
			numAnimals += sale.numAnimals;
			numPets += sale.petsCounter;
			numDogs += sale.dogCounter;
			numCats += sale.catCounter;
			numBirds += sale.birdCounter;
			numRats += sale.ratCounter;
		}
		
		//Sale report
		System.out.println();
		System.out.println("-------SALE REPORT-------");
		System.out.println("number of animals sold today: "+numAnimals);
		System.out.println("number of pets sold today: "+numPets);
		System.out.println("number of dogs sold today: "+numDogs);
		System.out.println("number of cats sold today: "+numCats);
		System.out.println("number of birds sold today: "+numBirds);
		System.out.println("number of rats sold today: "+numRats);
		System.out.println("-------------------------");
		
		//Here are all the extra sentences given by the exercise
		Searches.searchNameByOwnersDni(animalsSold, numPets);
		Searches.searchChipByPetName(animalsSold, numPets);
		Searches.searchAndShowCharByEan(animalsSold);
		Searches.checkIfCanBeMated(animalsSold, numPets);
		Searches.checkIfItLikesAFood(animalsSold, numPets);
		
		
	}

}
