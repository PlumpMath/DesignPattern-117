package com.designpattern.observerpattern.observer;


/**
 * 创建时间：201603221450
 *
 * @author liyongyong
 * 类说明：这是我们的观察者接口
 *       所有的观察者必须实现观察者接口，这个接口现在只有update()一个方法，当主题状态改变时它会被调用
 */
public interface Observer {

	/*
	 * 所有的气象组件都实现此观察者接口。
	 * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传递给观察者。
	 */
	public void update(float temp, float humidity, float pressure);
}
