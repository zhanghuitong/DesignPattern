package factory;

/**
 * 抽象工厂中定义抽象方法,让不同的工厂类实现不同的创建方法
 * @author HT
 *
 */
public abstract class AbstractFacatory {
	abstract Pizza createPizza();
}
