package factory;

public class Client {
	public static void main(String[] args) {
		AbstractFacatory abstractFacatory = new CheesePizzaFactory();
		Pizza pizza = abstractFacatory.createPizza();
	}
}
