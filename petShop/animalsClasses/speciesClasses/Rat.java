package petShop.animalsClasses.speciesClasses;

import petShop.animalsClasses.Animal;
import utils.Utils;

public class Rat extends Animal{
	private float weight = Utils.pedirNumeroAleatorio(200, 500);
	private float height = Utils.pedirNumeroAleatorio(5, 10);
	private int precio = 2;
	
	public Rat(String sex, int age) {
		super(sex, age);
	}
	
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

	public int getPrice() {
		return precio;
	}

	public void setPrice(int precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		String type = "rat";
		return type;
	}
	
	public void showCharacteristics() {
		System.out.println(this.toString());
		System.out.println("Sex: "+getSex());
		System.out.println("Age: "+getAge());
		System.out.println("Ean: "+getEan());

		System.out.println("Height: "+getHeight());
		System.out.println("Weight: "+getWeight());
		System.out.println("Price: "+getPrice());
	}
	
}
