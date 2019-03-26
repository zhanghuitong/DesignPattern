package strategy;

public class MallarDuck extends Duck{
	
	public MallarDuck() {
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings();
	}
}
