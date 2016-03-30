package com.designpattern.decoratorpattern.beverage;

/**
 * 创建时间：20160330
 *
 * @author liyongyong
 * 类说明：首选混合咖啡，  ---- 具体组件
 * 
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		mDescription = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
