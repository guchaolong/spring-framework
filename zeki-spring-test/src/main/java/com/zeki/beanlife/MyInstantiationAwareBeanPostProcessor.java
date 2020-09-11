package com.zeki.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/11 7:47
 */
@Component
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

	public MyInstantiationAwareBeanPostProcessor() {
		super();
		System.out.println("这是InstantiationAwareBeanPostProcessorAdapter实现类构造器！！");
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor postProcessBeforeInstantiation()");
		return super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor postProcessAfterInstantiation()");
		return super.postProcessAfterInstantiation(bean, beanName);
	}

	//	// 接口方法、实例化Bean之前调用
//	@Override
//	public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException {
//		System.out.println("InstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation方法");
//		return null;
//	}
//
//	// 接口方法、实例化Bean之后调用
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName)
//			throws BeansException {
//		System.out.println("InstantiationAwareBeanPostProcessor调用postProcessAfterInitialization方法");
//		return bean;
//	}

}
