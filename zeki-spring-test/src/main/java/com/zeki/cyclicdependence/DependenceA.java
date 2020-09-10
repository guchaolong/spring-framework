package com.zeki.cyclicdependence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/10 23:32
 */
@Component
public class DependenceA {

	@Autowired
	DependenceB dependenceB;

	public DependenceA() {
		System.out.println("A的构造函数");
	}

	@Override
	public String toString() {
		return super.toString() + "dependence-a";
	}
}
