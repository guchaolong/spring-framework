package com.zeki.conf;

import com.zeki.entity.User;
import org.springframework.context.annotation.Bean;

/**
 * Description:
 *
 * @author AA
 * @date 2020/9/10 20:31
 */
public class JavaConfig {
	@Bean
	public User user(){
		return new User("001","smart哥");
	}
}
