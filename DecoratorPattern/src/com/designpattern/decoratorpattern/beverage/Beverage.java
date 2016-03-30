package com.designpattern.decoratorpattern.beverage;

/**
 * 创建时间：20160330
 *
 * @author liyongyong
 * 类说明：饮料，各种咖啡的基类  ---- 抽象组件Component
 * 
 */
public abstract class Beverage {

	protected String mDescription = "Unknown Beverage";
	
	public String getDescription() {
		return mDescription;
	}
	
	public abstract double cost();
}
