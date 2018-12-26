package strategy;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior=new FlyNoWay();
		quackBehavior=new Quack();
	}
	
	
}
