package com.zeki;

import com.zeki.conf.JavaConfig;
import com.zeki.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/10 20:32
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
