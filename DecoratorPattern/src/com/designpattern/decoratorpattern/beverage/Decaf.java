package com.designpattern.decoratorpattern.beverage;

/**
 * 创建时间：20160330
 *
 * @author liyongyong
 * 类说明：低咖啡因，  ---- 具体组件
 * 
 */
public class Decaf extends Beverage {

	public Decaf() {
		mDescription = "Decaf";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
