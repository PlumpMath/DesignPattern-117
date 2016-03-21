package com.designpattern.strategypattern.duck;

import com.designpattern.strategypattern.fly.FlyNoWay;
import com.designpattern.strategypattern.quack.MuteQuack;


/**
 * 创建时间：201603212035
 *
 * @author liyongyong
 * 类说明：模型鸭----初始化时：不会飞，不会叫； 最后动态修改飞行为为“利用火箭动力飞行行为”
 */
public class ModelDuck extends Duck {

	public ModelDuck() {
		mFlyBehavior = new FlyNoWay();        // 一开始，我们的模型鸭子是不会飞的
		mQuackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model duck");
	}

}
