package ma.gov.licence.pfe.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private String[] WHITE_PAGES={
            // -- Swagger UI v2
            "/v2/api-docs",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**",
            "/v3/api-docs/**",
            "/swagger-ui/**"
    };

    private final InMemoryUserDetailsManager inMemoryUserDetailsManager;
    private final PasswordEncoder passwordEncoderBcrypt;

    public SecurityConfig(InMemoryUserDetailsManager inMemoryUserDetailsManager,
                          @Qualifier("bcrypt") PasswordEncoder passwordEncoderBcrypt) {
        this.inMemoryUserDetailsManager = inMemoryUserDetailsManager;
        this.passwordEncoderBcrypt = passwordEncoderBcrypt;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(inMemoryUserDetailsManager).passwordEncoder(passwordEncoderBcrypt);
    }

    // 2 - Authorization : https urls : role admin -> users/create user-> users/find

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("start config");
        http.authorizeRequests()
                .antMatchers("/users/**").permitAll()
                .antMatchers("/exams/**").hasRole("ADMIN")
                .antMatchers("/consultation/**").hasRole("USER")
                .anyRequest().authenticated();
        http.csrf().disable();
        System.out.println("end config");
        // perte de login page
        // perte du comportement par défaut qui dit que toutes les actions sont par défaut authenticated
    }



    // 3- Security web : methodes https toléré + paramètre proxy + urls à ignorer

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.debug(true).ignoring().antMatchers(WHITE_PAGES);
    }
}
