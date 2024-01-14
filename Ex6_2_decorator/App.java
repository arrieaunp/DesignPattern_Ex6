
public class App {
	public static void main(String[] args) {
		Beverage baseBeverage = new PlainBeverage();
		Beverage beverage = new AddSugarDecorator(new AddSugarDecorator(new AddMilkDecorator(baseBeverage)));
		System.out.println("You order " + beverage.getDescription());
		System.out.println("The cost is " + beverage.getCost());
	}
}
