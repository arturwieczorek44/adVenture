package adventure.adventure.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig  /*extends WebSecurityConfigurerAdapter*/  {


    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user1")
                .password("user1")
                .roles("USER")
                .build();
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin1")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        // Permit All Requests inside the Web Application
        http.authorizeRequests().
                    anyRequest().permitAll().
                    and().formLogin()
                    .and().httpBasic();
        // Deny All Requests inside the Web Application
        *//*http.authorizeRequests().
                anyRequest().denyAll().
                and().formLogin()
                .and().httpBasic();*//*
    }*/

    /**
     * From Spring Security 5.7, the WebSecurityConfigurerAdapter is deprecated to encourage users
     * to move towards a component-based security configuration. It is recommended to create a bean
     * of type SecurityFilterChain for security related configurations.
     * @param http
     * @return SecurityFilterChain
     * @throws Exception
     */
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        // Permit All Requests inside the Web Application
        http.authorizeHttpRequests()
                .requestMatchers("/dashboard").hasRole("USER")
                .anyRequest().permitAll()
                .and().formLogin().permitAll();

               // .and().httpBasic();

        // Deny All Requests inside the Web Application
            /*http.authorizeHttpRequests().anyRequest().denyAll().
                    and().formLogin()
                    .and().httpBasic();*/

        return http.build();

    }

}