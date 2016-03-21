package com.designpattern.strategypattern.duck;

import com.designpattern.strategypattern.fly.FlyWithWings;
import com.designpattern.strategypattern.quack.Quack;


/**
 * 创建时间：201603211955
 *
 * @author liyongyong
 * 类说明：绿头鸭----可以飞，呱呱叫
 */
public class MallardDuck extends Duck {
	
	public MallardDuck() {
		/*
		 * 绿头鸭使用FlyWithWings类处理飞行为，所以当performFly()被调用时，飞的职责被委托给FlyWithWings对象，从而我们得到了真正的飞。
		 */
		mFlyBehavior = new FlyWithWings();
		/*
		 * 绿头鸭使用Quack类处理叫行为，所以当performQuack()被调用时，叫的职责被委托给Quack对象，从而我们得到了真正的呱呱叫。
		 */
		mQuackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
