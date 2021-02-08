package day8;


public class Car {

	int yearModel; 
	String make;
	int speed;

	public Car(int yearModel , String make)
	{
		this.yearModel = yearModel;
		this.make= make;

		speed=0;

	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void acclerate()
	{
		speed+=5;  // increment of speed by 5
	}
	public void brake()
	{
		speed=speed-5;  // decrement of speed by 5

		if (speed<0)
			speed=0;
	} 
}
