package singleton;

/**
 * ����ʽ����
 * @author HT
 *
 */
public class Singleton {
	//����һ����̬��������¼Singleton���Ψһʵ��
	private static Singleton uniqueInstance;
	
	private Singleton() {} //�ѹ�������Ϊ˽�� ,ֻ��Singleton���ڲ��ܵ��ù�����
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance=new Singleton();
		}
		return uniqueInstance;
	}
}
