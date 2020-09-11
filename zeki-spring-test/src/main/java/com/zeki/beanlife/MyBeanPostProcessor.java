package com.zeki.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/11 7:45
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		super();
		System.out.println("BeanPostProcessor 构造函数！！");
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("BeanPostProcessor postProcessBeforeInitialization()！");
		return arg0;
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("BeanPostProcessor postProcessAfterInitialization()！");
		return arg0;
	}

}
