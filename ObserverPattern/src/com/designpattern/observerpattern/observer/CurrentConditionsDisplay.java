package com.designpattern.observerpattern.observer;

import com.designpattern.observerpattern.display.DisplayElement;
import com.designpattern.observerpattern.subject.Subject;


/**
 * 创建时间：201603221623
 *
 * @author liyongyong
 * 类说明：显示目前状况布告板
 *      所有的观察者必须实现观察者接口，这个接口现在只有update()一个方法，当主题状态改变时它会被调用。
 *      观察者必须注册具体主题，以便接收更新。
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float mTemperature;
	private float mHumidity;
	private Subject mWeatherData;

	/*
	 * 构造函数需要weatherData对象(也就是主题)作为注册之用
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		mWeatherData = weatherData;
		mWeatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// 当update()被调用时，我们把温度和湿度保存起来，然后调用display()
		mTemperature = temperature;
		mHumidity = humidity;
		display();
	}

	/*
	 * display()方法就只是把最近的温度和湿度显示出来
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + mTemperature + "F degrees and " + mHumidity + "% humidity.");
	}

}
