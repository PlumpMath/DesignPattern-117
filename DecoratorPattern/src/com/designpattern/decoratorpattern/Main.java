package com.designpattern.decoratorpattern;

import com.designpattern.decoratorpattern.beverage.Beverage;
import com.designpattern.decoratorpattern.beverage.DarkRoast;
import com.designpattern.decoratorpattern.beverage.Espresso;
import com.designpattern.decoratorpattern.beverage.HouseBlend;
import com.designpattern.decoratorpattern.condiment.Mocha;
import com.designpattern.decoratorpattern.condiment.Soy;
import com.designpattern.decoratorpattern.condiment.Whip;


/**
 * 创建时间：20160330
 *
 * @author liyongyong
 * 类说明：“装饰者模式”测试类
 * 
 * 装饰者模式：动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
 * 
 * 星巴克咖啡订单系统：
 * 在星巴克咖啡中，随意的点取咖啡种类以及配料的场景，如果使用传统的逻辑控制，会出现类爆炸。
 * 
 * 装饰者模式通常有着如下的特点：
 * 1. 装饰者对象和被装饰者对象通常有着相同的接口，实现相同的操作；
 * 2. 装饰者对象中要含有被装饰者对象的实例
 * 3. 装饰者只是增加了附加功能，而不会去更改被装饰者对象的实现逻辑
 * 
 * 装饰者和被装饰者之间必须是一样的类型,也就是要有共同的超类。
 * 在这里应用继承并不是实现方法的复制,而是实现类型的匹配。因为装饰者和被装饰者是同一个类型,
 * 因此装饰者可以取代被装饰者,这样就使被装饰者拥有了装饰者独有的行为。
 * 根据装饰者模式的理念,我们可以在任何时候,实现新的装饰者增加新的行为。
 * 如果是用继承,每当需要增加新的行为时,就要修改原程序了。
 * 
 * 设计初衷:通常可以使用继承来实现功能的拓展,如果这些需要拓展的功能的种类很繁多,那么势必生成很多子类,
 * 增加系统的复杂性,同时,使用继承实现功能拓展,我们必须可预见这些拓展功能,这些功能是编译时就确定了,是静态的
 * 
 * 从上述的描述中，我们可以抽象一下几个领域模型：
 * 1. 共同的接口：装饰者和被装饰者会针对相同的应用场景进行逻辑功能的控制，所以势必需要一个共同的接口，来定义特定的解决问题的场景方法。
 * 2. 抽象组件：这个可以是被装饰者的抽象父类
 * 3. 抽象装饰者：抽象了装饰者的通用特征
 */
public class Main {

	public static void main(String[] args) {

		// 订一个Espresso，不需要调料，打印出它的描述与价钱
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		// 制造一个DarkRoast对象
		Beverage beverage2 = new DarkRoast();
		// 用Mocha装饰它
		beverage2 = new Mocha(beverage2);
		// 用第二个Mocha装饰它
		beverage2 = new Mocha(beverage2);
		// 用Whip装饰它
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}

}
