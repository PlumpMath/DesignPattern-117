package com.designpattern.decoratorpattern.condiment;

import com.designpattern.decoratorpattern.beverage.Beverage;

/**
 * 创建时间：20160330
 *
 * @author liyongyong
 * 类说明：奶泡，  ---- 具体装饰者
 * 
 */
public class Whip extends CondimentDecorator {

	private Beverage mBeverage;
	
	public Whip(Beverage beverage) {
		mBeverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return mBeverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mBeverage.cost() + 0.10;
	}

}
