package singleton;

/**
 * 懒汉式单例
 * @author HT
 *
 */
public class Singleton {
	//利用一个静态变量来记录Singleton类的唯一实例
	private static Singleton uniqueInstance;
	
	private Singleton() {} //把构造器设为私有 ,只有Singleton类内才能调用构造器
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance=new Singleton();
		}
		return uniqueInstance;
	}
}
