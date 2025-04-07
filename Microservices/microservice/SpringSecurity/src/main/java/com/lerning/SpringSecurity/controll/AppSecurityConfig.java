package com.lerning.SpringSecurity.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
//	@Bean
//	protected UserDetailsService userdetaiDetailsService() {
//		 
//		List<UserDetails> userDetails=new ArrayList<>();
//		userDetails.add(User.withDefaultPasswordEncoder().username("naga").password("123").roles("USER").build());
//		return new InMemoryUserDetailsManager(userDetails);
//	}
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider authProvider() {
		
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
	}
	
	@SuppressWarnings("removal")
	@Bean
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
        .authorizeRequests()
        .requestMatchers("/api/public/**").permitAll()
        .requestMatchers("/api/private/**").authenticated()
        .and()
        .httpBasic();
		
	}

}
