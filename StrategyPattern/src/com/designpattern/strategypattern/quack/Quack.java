package com.designpattern.strategypattern.quack;


/**
 * 创建时间：201603211849
 *
 * @author liyongyong
 * 类说明：这是"叫"行为的实现，给"呱呱叫"的鸭子用...
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		// 实现鸭子呱呱叫
		System.out.println("Quack");
	}

}
