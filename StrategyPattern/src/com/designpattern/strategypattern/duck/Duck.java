package com.designpattern.strategypattern.duck;

import com.designpattern.strategypattern.fly.FlyBehavior;
import com.designpattern.strategypattern.quack.QuackBehavior;


/**
 * 创建时间：201603211855
 *
 * @author liyongyong
 * 类说明：鸭子的基类
 */
public abstract class Duck {
	/*
	 * 我们知道Duck类内的fly()和quack()行为会随着鸭子种类的不同而改变。
	 * 由此鸭子现在会将飞行和呱呱叫的动作"委托"别人处理，此类专门提供某行为接口的实现，而不是使用定义在Duck类(或子类)内的呱呱叫和飞行方法。(把易于变化的部分分离出去)
	 * 这样，鸭子类就不再需要知道行为的实现细节。
	 * 
	 * 首先，在Duck类中"加入俩个实例变量"，分别为mFlyBehavior, mQuackBehavior, 声明为接口类型(而不是具体类实现类型), 每个鸭子对象都会动态地设置这些变量以在运行时引用正确的行为类型
	 * 其次，我们来实现performFly(), perforomQuack()
	 * 最后，在鸭子子类的构造函数里面，动态地实例化变量mFlyBehavior, mQuackBehavior
	 */
	public FlyBehavior mFlyBehavior;  // 为行为接口类型声明俩个引用变量
	public QuackBehavior mQuackBehavior;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void performFly() {
		// 委托给行为类
		mFlyBehavior.fly();  
	}
	
	public void performQuack() {
		mQuackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		mFlyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		mQuackBehavior = qb;
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
