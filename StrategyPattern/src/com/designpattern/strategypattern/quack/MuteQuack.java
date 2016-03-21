package com.designpattern.strategypattern.quack;


/**
 * 创建时间：201603211852
 *
 * @author liyongyong
 * 类说明：这是"叫"行为的实现，给"不能叫唤"的鸭子用...
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// 什么都不做，不会叫
		System.out.println("MuteQuack");
	}

}
