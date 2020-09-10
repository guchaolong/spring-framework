package com.zeki.cyclicdependence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/10 23:33
 */
@Component
public class DependenceB {

	@Autowired
	DependenceA dependenceA;

	public DependenceB() {
		System.out.println("B的构造函数");
	}
}
