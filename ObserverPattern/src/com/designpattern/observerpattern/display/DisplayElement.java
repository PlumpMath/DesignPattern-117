package com.designpattern.observerpattern.display;


/**
 * 创建时间：201603221504
 *
 * @author liyongyong
 * 类说明：我们为布告板建立一个共同的接口。布告板只需要实现display()方法。
 */
public interface DisplayElement {

	/*
	 * DisplayElement接口只包含了一个方法，也就是display()。当布告板需要显示时，调用此方法。
	 */
	public void display();
}
