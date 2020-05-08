package com.java.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(auth);
        PasswordEncoder encoder = 
                PasswordEncoderFactories.createDelegatingPasswordEncoder();		
		auth.inMemoryAuthentication()
		.withUser("user")
		.password(encoder.encode("password"))
		.roles("USER")
		.and()
		.withUser("admin")
		.password(encoder.encode("admin"))
		.roles("USER", "ADMIN");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		
		http
		.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin();
		
	}

}
