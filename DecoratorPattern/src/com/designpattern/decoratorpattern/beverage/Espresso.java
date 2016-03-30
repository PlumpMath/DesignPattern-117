package com.designpattern.decoratorpattern.beverage;

/**
 * 创建时间：20160330
 *
 * @author liyongyong
 * 类说明：浓缩咖啡，让Espresso继承自Beverage类，因为Espresso是一种饮料     ---- 具体组件
 * 
 */
public class Espresso extends Beverage {

	/*
	 * 为了要设置饮料的描述，我们写了一个构造器。 
	 * mDescription继承自Beverage
	 */
	public Espresso() {
		mDescription = "Espresso";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
