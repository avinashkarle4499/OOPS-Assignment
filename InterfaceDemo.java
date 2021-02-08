package day9;

interface Softdrinks
{
	int price(int Amount);
	double discount(double amount);

}
class Pepsi implements Softdrinks
{

	@Override 
	public int price(int amount) {

		return amount;
	}
	@Override
	public double discount(double amount) {

		return amount;
	}
}

class Sprite implements Softdrinks
{
	@Override 
	public int price(int amount) {
		System.out.println("price of Sprite"+ amount);
		return amount;
	}

	@Override
	public double discount(double amount) {
		System.out.println("discount of Sprite"+ amount);
		return amount;

	}


}

public class InterfaceDemo {

	public static void main(String[] args) {
		Softdrinks s = new Pepsi();
		
		System.out.println("discount of Sprite "+ s.discount(500));
		
		System.out.println("orice of Sprite "+ s.price(200));
	}

}

