package strategy;

public class Main {

	public static void main(String[] args) {
		Duck mallard=new MallarDuck();
		mallard.performFly();
		mallard.performQuack();
	}

}
