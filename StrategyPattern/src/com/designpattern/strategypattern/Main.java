package com.designpattern.strategypattern;

import com.designpattern.strategypattern.duck.Duck;
import com.designpattern.strategypattern.duck.MallardDuck;
import com.designpattern.strategypattern.duck.ModelDuck;
import com.designpattern.strategypattern.fly.FlyRocketPowered;


/**
 * 创建时间：201603212046
 *
 * @author liyongyong
 * 类说明：“策略模式”测试类
 * 
 * 策略模式：定义了算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户
 * 
 * 每一个鸭子都有一个FlyBehavior和一个QuackBehavior，好将飞行和呱呱叫委托给它们代为处理。
 * 当你将俩个类结合起来使用，如同本例一般，这就是组合。这种做法和“继承”不同的地方在于：鸭子的行为不是继承来的，而是和适当的行为对象“组合”来的。
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		/*
		 * 第一次调用performFly()会被委托给flyBehavior对象(也就是FlyNoWay实例)，该对象是在模型鸭构造函数设置的
		 */
		model.performFly();
		/*
		 * 这会调用继承来的setter方法，把火箭动力飞行的行为设定到模型鸭中。
		 * 在运行时想改变鸭子的行为，只需要调用鸭子的setter方法就可以。
		 */
		model.setFlyBehavior(new FlyRocketPowered());
		/*
		 * 这样就意味着模型鸭可以动态地改变它的飞行行为。
		 */
		model.performFly();
	}

}
