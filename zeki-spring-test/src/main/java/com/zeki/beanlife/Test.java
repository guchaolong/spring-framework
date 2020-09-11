package com.zeki.beanlife;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/11 7:51
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConf.class);
		Object person = context.getBean("person");
		System.out.println(person);
	}
}
