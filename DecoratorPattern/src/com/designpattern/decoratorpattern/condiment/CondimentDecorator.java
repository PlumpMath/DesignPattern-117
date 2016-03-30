package com.designpattern.decoratorpattern.condiment;

import com.designpattern.decoratorpattern.beverage.Beverage;


/**
 * 创建时间：20160330
 *
 * @author liyongyong
 * 类说明：调料品装饰者，各种调料品的基类  ---- 抽象装饰者
 * 
 * 首先，必须让CondimentDecorator能够取代Beverage，所以将CondimentDetector扩展自Beverage类
 */
public abstract class CondimentDecorator extends Beverage {

	/*
	 * 所有的调料装饰者都必须重新实现getDescription()方法。
	 */
	public abstract String getDescription();
}
