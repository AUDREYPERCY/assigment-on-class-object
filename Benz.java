package assignment;

//Inheritance
public class Benz extends Car{
	
	//Encapsulation
	private String brand;
	private String model;
	

	public Benz(int speed, String owner, int door, String brand, String model) {
		
		super(speed, owner, door);
		this.brand = brand;
		this.model = model;
	}
	

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	//Polymorphism
	
	@Override
	public void toString() {
		System.out.println("This is " + this.getBrand() + " " + this.getModel() + ". It has " + this.getDoor() + " doors, with a speed of " + this.getSpeed() + "km/h, owned by " + this.getOwner());
	};

	public static void main(String[] args) {
		Car firstCar = new Benz(49,"Patience", 4, "Mercedes", "Racers" );
		firstCar.toString();

	}

}
