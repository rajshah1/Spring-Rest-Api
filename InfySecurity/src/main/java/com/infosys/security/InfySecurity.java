package com.infosys.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
@Configuration
@EnableWebSecurity
public class InfySecurity extends WebSecurityConfigurerAdapter{
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("Infosys").password(passwordEncoder().encode("Infosys")).roles("ADMIN")
		.and().withUser("Infosys1").password(passwordEncoder().encode("Infosys1")).roles("USER");
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests()
		.antMatchers("/addCustomer**")
		.hasRole("ADMIN")													
		.antMatchers("/get*/**")
		.hasAnyRole("ADMIN","USER")
		.antMatchers("/**")
		.permitAll().and().csrf().disable();
	 


	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
