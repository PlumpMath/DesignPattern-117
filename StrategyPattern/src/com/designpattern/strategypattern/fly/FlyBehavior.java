package com.designpattern.strategypattern.fly;


/**
 * 创建时间：201603211728
 *
 * @author liyongyong
 * 类说明：行为类：这是一个接口，所有飞行类都实现它，所有新的飞行类都必须实现fly()方法。
 *      这样的设计，可以让飞行和呱呱叫的动作被其他的对象复用，因为这些行为已经与鸭子类无关了。
 *      而我们可以新增一些行为，不会影响到既有的行为类，也不会影响“使用”到飞行行为的鸭子类。
 */
public interface FlyBehavior {
	public void fly();
}
