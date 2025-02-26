package petShop.animalsClasses.speciesClasses;

import petShop.animalsClasses.Animal;

public class Bird extends Animal {
	private String color = "";
	private String hair = "";
	private int precio = 10;

	public Bird(String sex, int age, String color, String hair) {
		super(sex, age);
		this.color = color;
		this.hair = hair;
	}
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getHair() {
		return hair;
	}
	
	public void setHair(String hair) {
		this.hair = hair;
	}

	public int getPrice() {
		return precio;
	}

	public void setPrice(int precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		String type = "bird";
		return type;
	}
	
	public void showCharacteristics() {
		System.out.println(this.toString());
		System.out.println("Sex: "+getSex());
		System.out.println("Age: "+getAge());
		System.out.println("Ean: "+getEan());

		System.out.println("Color : "+getColor());
		System.out.println("Hair: "+getHair());
		System.out.println("Price: "+getPrice());
	}
	
}
