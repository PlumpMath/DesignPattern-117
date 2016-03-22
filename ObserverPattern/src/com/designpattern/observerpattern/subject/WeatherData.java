package com.designpattern.observerpattern.subject;

import java.util.ArrayList;

import com.designpattern.observerpattern.observer.Observer;


/**
 * 创建时间：201603221540
 *
 * @author liyongyong
 * 类说明：追踪来自气象站的数据，并更新布告板
 *      一个具体主题总是实现主题接口，除了注册和撤销方法之外，具体主题还实现了notifyObservers()方法，此方法用于在状态改变时更新所有当前观察者。
 */
public class WeatherData implements Subject {
	
	/*
	 * 我们加上一个ArrayList来记录观察者，此ArrayList是在构造函数中建立的。
	 */
	private ArrayList<Observer> mObservers;
	private float mTemperature;
	private float mHumidity;
	private float mPressure;
	
	public WeatherData() {
		mObservers = new ArrayList<Observer>();
	}

	/*
	 * 当注册观察者时，我们只要把它加到ArrayList的后面即可。
	 */
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		mObservers.add(o);
	}

	/*
	 * 当观察者想取消注册，我们把它从ArrayList中删除即可。
	 */
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int index = mObservers.indexOf(o);
		if (index >= 0) {
			mObservers.remove(index);
		}
	}

	/*
	 * 在这里，我们把状态告诉每一个观察者，因为观察者都实现了update(), 所以我们知道如何通知它们。
	 */
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i=0; i<mObservers.size(); i++) {
			mObservers.get(i).update(mTemperature, mHumidity, mPressure);
		}
	}

	/*
	 * 当从气象站得到更新观测值时，我们通知观察者。 
	 */
	public void measurementsChanged() {
		notifyObservers();
	}
	
	/*
	 * 利用此方法测试布告板
	 */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		mTemperature = temperature;
		mHumidity = humidity;
		mPressure = pressure;
		measurementsChanged();
	}
}
