package com.designpattern.strategypattern.fly;


/**
 * 创建时间：201603211737
 *
 * @author liyongyong
 * 类说明： 这是飞行行为的实现，给"不会"飞的鸭子用...
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		// 什么都不做，不会飞
		System.out.println("I can't fly!!!");
	}

}
