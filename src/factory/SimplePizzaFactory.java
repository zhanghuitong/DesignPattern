package factory;

/**
 * 简单工厂模式
 * 根据传入的参数确定返回的实例
 * @author HT
 *
 */
public class SimplePizzaFactory {
	public Pizza getPizza(int type) {
		if(type==1) {
			return new CheesePizza();
		}
		if(type==2) {
			return new VeggiePizza();
		}
		return new DefaultPizza();
	}
}
