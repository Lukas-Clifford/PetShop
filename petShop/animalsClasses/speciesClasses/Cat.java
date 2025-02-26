package petShop.animalsClasses.speciesClasses;

import petShop.animalsClasses.Pet;

public class Cat extends Pet{
	private String color = "";
	private String breed = "";
	private String hair = "";
	private int price = 50;

	public Cat(String sex, int age, String color, String breed, String hair,
			 String name,String ownerName, String ownerSurname, String ownerDni) {
		super(sex, age, name, ownerName, ownerSurname, ownerDni);
		this.color = color;
		this.breed = breed;
		this.hair = hair;
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
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int precio) {
		this.price = precio;
	}
	@Override
	public String toString() {
		String type = "cat";
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
		
	}
	

}
