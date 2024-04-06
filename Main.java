package assignment;


public class Main extends Car{

	public static void main(String[] args) {
		
				//Encapuslation, inheritance
				Car car = new Car("Toyota", "Camry",4);
				System.out.println("car", + car.getBrand() + " " + car.getModel() + "Doors:" + car.getDoors());
				
				//polymorphism
				Vehicle vehicle = new
			    Car("Honda", "Accord", 2);
				   vehicle.start(); // Output:car started
				   
				   //Abstraction
				   vehicle.stop(); //Output:car stopped
				
				  
				
			}
			
		}

	}

}
