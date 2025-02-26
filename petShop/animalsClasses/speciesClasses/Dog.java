package petShop.animalsClasses.speciesClasses;

import petShop.animalsClasses.Pet;

public class Dog extends Pet{
	private String color = "";
	private String breed = "";
	private boolean pedigree = false;
	private String hair = "";
	private int price = 100;
	
	public Dog(String sex, int age, String color, String breed, String hasPedigree, String hair,
			String name, String ownerName, String ownerSurname, String ownerDni) {
		super(sex, age, name, ownerName, ownerSurname, ownerDni);
		this.color = color;
		this.breed = breed;
		if(hasPedigree.equalsIgnoreCase("yes")) {
			this.pedigree = true;
		}
		this.hair = hair;
		if(this.pedigree) {
			this.price = 200;
		}
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean getType() {
		return pedigree;
	}
	public void setType(boolean hasPedigree) {
		this.pedigree = hasPedigree;
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	public boolean isPedigree() {
		return pedigree;
	}

	public void setPedigree(boolean pedigree) {
		this.pedigree = pedigree;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int precio) {
		this.price = precio;
	}
	
	@Override
	public String toString() {
		String type = "dog";
		return type;
	}

	public void showCharacteristics() {
		System.out.println(this.toString());
		System.out.println("Sex: "+getSex());
		System.out.println("Age: "+getAge());
		System.out.println("Ean: "+getEan());

		System.out.println("Chip Number: "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Owner DNI: "+getOwnerDni());
		System.out.println("Owner name: "+getOwnerName());
		System.out.println("Owner surname: "+getOwnerSurname());
		
		System.out.println("Breed: "+getBreed());
		System.out.println("Color: "+getColor());
		System.out.println("Hair: "+getHair());
		System.out.println("Price: "+getPrice());
		System.out.println("Pedigree: "+isPedigree());
		
	}
	
}
