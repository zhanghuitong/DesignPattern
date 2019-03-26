package strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	public void performFly() {
		flyBehavior.fly(); //ί�и���Ϊ��
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("I can swim");
	}

	
	//��̬����Ѽ�ӵķ�����Ϊ�ͽ���
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	

}
