package com.designpattern.strategypattern.quack;


/**
 * 创建时间：201603211854
 *
 * @author liyongyong
 * 类说明：这是"叫"行为的实现，给"吱吱叫"的鸭子用...
 */
public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		// 橡皮鸭子吱吱叫
		System.out.println("Squeak");
	}

}
