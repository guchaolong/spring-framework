package com.zeki.cyclicdependence;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/10 23:38
 */

/**
 * FIXME
 * 1. 扫描指定类文件
 *
 * @ComponentScan(basePackageClasses = Person.class)
 * <p>
 * 2. 扫描指定包，使用默认扫描规则，即被@Component, @Repository, @Service, @Controller或者已经声明过@Component自定义注解标记的组件；
 * @ComponentScan(value = "com.yibai")
 * <p>
 * 3. 扫描指定包，加载被@Component注解标记的组件和默认规则的扫描（因为useDefaultFilters默认为true）
 * @ComponentScan(value = "com.yibai", includeFilters = { @Filter(type = FilterType.ANNOTATION, value = Component.class) })
 * <p>
 * 4. 扫描指定包，只加载Person类型的组件
 * @ComponentScan(value = "com.yibai", includeFilters = { @Filter(type = FilterType.ASSIGNABLE_TYPE, value = Person.class) }, useDefaultFilters = false)
 * <p>
 * 5. 扫描指定包，过滤掉被@Component标记的组件
 * @ComponentScan(value = "com.yibai", excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = Component.class) })
 * <p>
 * 6. 扫描指定包，自定义过滤规则
 * @ComponentScan(value = "com.yibai", includeFilters = { @Filter(type = FilterType.CUSTOM, value = ColorBeanLoadFilter.class) }, useDefaultFilters = true)
 */


//@ComponentScan(value = "com.zeki.cyclicdependence", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Component.class)})
@ComponentScan(value = "com.zeki.cyclicdependence")
public class BeanConfig {
	static {
		System.out.println("静态代码段");
	}

	{
		System.out.println("构造代码段");
	}

	public BeanConfig() {
		System.out.println("构造函数");
	}
}
