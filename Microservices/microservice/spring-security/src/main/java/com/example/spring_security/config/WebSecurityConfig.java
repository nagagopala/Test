package com.example.spring_security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.example.spring_security.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf->csrf.disable())
		.authorizeHttpRequests(request->request
				.requestMatchers("register").permitAll()
				.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	
	//@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1=User.withUsername("naga")
				.password("{noop}naga").roles("USER").build();
		UserDetails user2=User.withUsername("gopala")
				.password("{noop}gopala").roles("USER").build();
		return new InMemoryUserDetailsManager(user1,user2);
	}
	
	@Autowired
	private CustomUserDetailsService userDetails;
	
	@Bean
	public AuthenticationProvider authentication() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetails);
		provider.setPasswordEncoder(bCryptPassworEncoder());
		return provider;
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPassworEncoder() {
		return new BCryptPasswordEncoder(14);
	}

}
