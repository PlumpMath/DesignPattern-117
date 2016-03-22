package com.designpattern.observerpattern.subject;

import com.designpattern.observerpattern.observer.Observer;


/**
 * 创建时间：201603221500
 *
 * @author liyongyong
 * 类说明：这是我们的主题接口
 */
public interface Subject {

	/*
	 * 这俩个方法都需要一个观察者作为变量，该观察者是用来注册或被删除的。
	 */
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	/*
	 * 当主题状态改变时，这个方法会被调用，用来通知所有的观察者。
	 */
	public void notifyObservers();
}
