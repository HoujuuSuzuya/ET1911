package com.etoak.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.etoak.action.UserAction;
import com.etoak.service.UserService;

/*
 *这个@ = xml中的beans
 * 
 * */

@Configuration
public class UserConfig {
	@Bean("userService")
	public UserService userService() {
		return new UserService();
	}
	
	/*
	 * @Bean 
	 * public UserAction userAction() { 
	 * 		return new UserAction(); 
	 * }
	 */
	
	@Bean
	public UserAction userAction(@Qualifier("userService") UserService userService) {
		UserAction userAction = new UserAction();
		userAction.setUserService(userService);
		return userAction;
	}
}
