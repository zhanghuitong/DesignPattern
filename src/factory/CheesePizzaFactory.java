package factory;

public class CheesePizzaFactory extends AbstractFacatory {

	@Override
	Pizza createPizza() {
		return new CheesePizza();
	}

}
