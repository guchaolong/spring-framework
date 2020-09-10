package com.zeki.cyclicdependence;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/10 23:35
 */
public class Test {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(BeanConfig.class);
		DependenceA bean = con.getBean(DependenceA.class);
		System.out.println(bean);
	}

	static {
		System.out.println("Test静态代码段");
	}

	//main函数所在类，类加载的时候执行静态代码段，但是构造代码段和构造函数没执行
	{
		System.out.println("Test构造代码段");
	}

	public Test() {
		System.out.println("Test构造函数");
	}
}
