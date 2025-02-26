package petShop.animalsClasses;

public class Animal {
	private String sex = "male";
	private int age = 0;
	private int ean = 0;
	
	public Animal(String sex, int age) {
		if(sex.equalsIgnoreCase("male")||sex.equalsIgnoreCase("female")) {
			this.sex = sex;
		}else {
			System.err.println("Gender doesn't match male or female");
		}
		
		this.age = age;
		this.ean = this.hashCode();
	}
	

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEan() {
		return ean;
	}

	public void setEan(int ean) {
		this.ean = ean;
	}
	public void showCharacteristics() {
		System.out.println("Sex: "+getSex());
		System.out.println("Age: "+getAge());
		System.out.println("Ean: "+getEan());
	}

}
