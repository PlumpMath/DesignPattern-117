package com.designpattern.decoratorpattern.beverage;

/**
 * 创建时间：20160330
 *
 * @author liyongyong
 * 类说明：深焙咖啡，  ---- 具体组件
 * 
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		mDescription = "DarkRoast";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.99;
	}

}
