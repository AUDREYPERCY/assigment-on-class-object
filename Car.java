package assignment;

//Abstraction

public abstract class Car {
	
	private int speed;
	private String owner;
	private int door;

	public Car(int speed, String owner, int door) {
		this.speed = speed;
		this.owner = owner;
		this.door = door;
		// TODO Auto-generated constructor stub
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String name) {
		this.owner = name;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
		System.out.println(door);
	}

	public void toString() {
		//To display stuffs
	}
	
}
