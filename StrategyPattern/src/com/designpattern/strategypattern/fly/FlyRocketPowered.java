package com.designpattern.strategypattern.fly;


/**
 * 创建时间：201603212032
 *
 * @author liyongyong
 * 类说明： 这是飞行行为的实现，给"利用火箭动力飞行行为"飞的鸭子用...
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I'm flying with a rocket!!!");
	}

}
