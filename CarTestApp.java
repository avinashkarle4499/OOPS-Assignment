package day8;

public class CarTestApp {

	public static void main(String[] args) {
		Car c = new Car(1965,"BatMobile");
		c.acclerate();
		System.out.println(c.getSpeed());
		c.acclerate();
		System.out.println(c.getSpeed());
		c.acclerate();
		System.out.println(c.getSpeed());
		c.acclerate();
		System.out.println(c.getSpeed());
		c.acclerate();
		System.out.println(c.getSpeed());
		
		c.brake();
		System.out.println(c.getSpeed());

		c.brake();
		System.out.println(c.getSpeed());

		c.brake();
		System.out.println(c.getSpeed());

		c.brake();
		System.out.println(c.getSpeed());

		c.brake();
		System.out.println(c.getSpeed());
		
	}

}
