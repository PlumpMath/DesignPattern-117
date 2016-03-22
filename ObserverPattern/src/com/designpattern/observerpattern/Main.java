package com.designpattern.observerpattern;

import com.designpattern.observerpattern.observer.CurrentConditionsDisplay;
import com.designpattern.observerpattern.observer.StatisticsDisplay;
import com.designpattern.observerpattern.subject.WeatherData;


/**
 * 创建时间：201603221425
 *
 * @author liyongyong
 * 类说明：“观察者模式”测试类
 * 
 * 观察者模式：定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。
 * 
 * 建立下一代Internet气象观测站！该气象站必须建立在我们专利申请中的WeatherData对象上，由WeatherData对象负责追踪目前的天气状况(温度、湿度、气压)。
 * 我们需要贵公司能建立一个应用，有三种布告板，分别显示目前的状况、气象统计及简单的预报。
 * 当WeatherObject对象获得最新的测量数据时，三种布告板必须实时更新。
 * 而且，这是一个可以扩展的气象站，气象站希望公布一组API，好让其他开发人员可以写出自己的气象布告板，并插入此应用中。我们需要贵公司能提供这样的API。
 * 
 * 此系统由三部分组成：气象站----Main.java(获取实际气象数据得物理装置)、
 *              WeatherData对象----WeatherData.java(追踪来自气象站的数据、并更新布告板)、
 *              布告板----CurrentConditionsDisplay.java(显示目前天气状况给用户看)
 */
public class Main {

	public static void main(String[] args) {
		
		// 首先建立一个WeatherData对象
		WeatherData weatherData = new WeatherData();
		
		// 建立布告板，并把WeatherData对象传给它们
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		// 模拟新的气象测量
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
