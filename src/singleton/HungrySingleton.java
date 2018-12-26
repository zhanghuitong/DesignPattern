package singleton;


/**
 * ¶öººÊ½µ¥Àý
 * @author HT
 *
 */
public class HungrySingleton {
	private static HungrySingleton instance;
	
	static {
		instance=new HungrySingleton();
	}
	
	private HungrySingleton() {
		
	}
	
	public static HungrySingleton getInstance() {
		return instance;
	}

}
