package com.zeki.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/11 7:41
 */
@Component
public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

	private String name;
	private String address;
	private int phone;

	private BeanFactory beanFactory;
	private String beanName;

	public Person() {
		System.out.println("Person()构造函数");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Person setName()");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("Person setAddress()");
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		System.out.println("Person setPhone()");
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + ", name=" + name + ", phone="
				+ phone + "]";
	}

	// 这是BeanFactoryAware接口方法
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("BeanFactoryAware setBeanFactory()");
		this.beanFactory = arg0;
	}

	// 这是BeanNameAware接口方法
	@Override
	public void setBeanName(String arg0) {
		System.out.println("BeanNameAware setBeanName()");
		this.beanName = arg0;
	}

//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		System.out.println("ApplicationContextAware setApplicationContext()");
//		this.setApplicationContext(applicationContext);
//	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("@PostConstruct 自定义方法");
	}

	// 这是InitializingBean接口方法
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean afterPropertiesSet()");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy 自定义方法");
	}

	// 这是DiposibleBean接口方法
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy()");
	}

}
