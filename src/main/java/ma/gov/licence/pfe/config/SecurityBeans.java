package ma.gov.licence.pfe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityBeans {

    @Bean("bcrypt")
    public PasswordEncoder passwordEncoderBcrypt() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() { // Page login : user1 password : 123 -> encode(123)
        UserDetails user1 = User.withUsername("user1")
                .password(passwordEncoderBcrypt().encode("123"))
                .roles("ADMIN")
                .build();
        UserDetails user2 = User.withUsername("user2")
                .password(passwordEncoderBcrypt().encode("123"))
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user1, user2);
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(inMemoryUserDetailsManager());
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoderBcrypt());
        return daoAuthenticationProvider;
    }
}
