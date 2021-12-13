package com.bakery.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                    .loginPage("/member/login") // 로그인 설정
                    .permitAll()
                .and()
                    .logout() // 로그아웃 설정
                    .permitAll();

        http
                .csrf().disable()
                .authorizeRequests() // 페이지 권한 설정
                    .antMatchers("/", "/member/register",
                                 "/api/**", "/test").permitAll()
                    .mvcMatchers("/admin/**").hasRole("ADMIN")
                    .anyRequest().authenticated();

        http // 인증되지 않은 사용자가 리소스에 접근했을 때 수행되는 핸들러
                .exceptionHandling()
                .authenticationEntryPoint
                        (new CustomAuthenticationEntryPoint());

    }

    @Override // static 디렉토리의 하위 파일은 인증을 무시하도록 설정
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/img/**");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username, password, enabled " // 반드시 이 순서로
                        + "from member "
                        + "where username = ?")
                .authoritiesByUsernameQuery("select username, auth "
                        + "from authority "
                        + "where username = ?");
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
