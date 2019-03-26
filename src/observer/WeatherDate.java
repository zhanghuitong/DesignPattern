package observer;

import java.util.ArrayList;

public class WeatherDate implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherDate() {
		observers=new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		int i=observers.indexOf(o);//�����������з���-1
		if(i>=0) {
			observers.remove(i);
		}
	}
	
	//֪ͨȫ���Ķ�����
	@Override
	public void notifyObservers() {
		for(Observer o:observers) {
			o.update(temperature, humidity, pressure);
		}

	}
	
	//�����ݱ仯��֪ͨ������
	public void measurementsChange() {
		this.notifyObservers();
	}
	
	public void setMeasurement(float temperature,float humidty,float pressure) {
		this.temperature=temperature;
		this.humidity=humidty;
		this.pressure=pressure;
	}
	
	

}
