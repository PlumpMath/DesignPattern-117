package com.designpattern.strategypattern.fly;


/**
 * 创建时间：201603211728
 *
 * @author liyongyong
 * 类说明： 这是飞行行为的实现，给"真会"飞的鸭子用...
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		// 实现鸭子飞行
		System.out.println("I'm flying!!!");
	}

}
