package petShop.animalsClasses;

public class Pet extends Animal {
	private int id = 0;
	private String name = "";
	private String ownerName = "";
	private String ownerSurname = "";
	private String ownerDni = "";
	
	public Pet(String sex, int age, String name,
			String ownerName, String ownerSurname, String ownerDni) {
		super(sex, age);
		this.id = this.hashCode()*2;
		this.name = name;
		this.ownerName = ownerName;
		this.ownerSurname = ownerSurname;
		this.ownerDni = ownerDni;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerSurname() {
		return ownerSurname;
	}

	public void setOwnerSurname(String ownerSurname) {
		this.ownerSurname = ownerSurname;
	}

	public String getOwnerDni() {
		return ownerDni;
	}

	public void setOwnerDni(String ownerDni) {
		this.ownerDni = ownerDni;
	}
	
	public void pucharsePet(String name, String ownerName, String ownerSurname, String dni) {
		setName(name);
		setOwnerName(name);
		setOwnerSurname(ownerSurname);
		setOwnerDni(dni);
	}
	
	public void showCharacteristics() {
		System.out.println("Sex: "+getSex());
		System.out.println("Age: "+getAge());
		System.out.println("Ean: "+getEan());

		System.out.println("Chip Number: "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Owner DNI: "+getOwnerDni());
		System.out.println("Owner name: "+getOwnerName());
		System.out.println("Owner surname: "+getOwnerSurname());
	}
	
}
