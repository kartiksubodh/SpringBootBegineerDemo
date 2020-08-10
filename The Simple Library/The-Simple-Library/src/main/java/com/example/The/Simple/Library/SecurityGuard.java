package com.example.The.Simple.Library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.authentication.PasswordEncoderParser;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMethod;




@EnableWebSecurity
public class SecurityGuard extends WebSecurityConfigurerAdapter{

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("admin"); 
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
	
		
		http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.POST, "/books").hasRole("admin").and().formLogin().and().csrf().disable();
		http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.PUT, "/books/**").hasRole("admin").and().formLogin().and().csrf().disable();
		http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.DELETE, "/books/**").hasRole("admin").and().formLogin().and().csrf().disable();
	}

	 
	 
}
