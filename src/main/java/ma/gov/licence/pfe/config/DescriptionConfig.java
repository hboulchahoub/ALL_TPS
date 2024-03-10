package ma.gov.licence.pfe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Component
public class DescriptionConfig {
    // http://localhost:9091/swagger-ui/
    @Bean
    public Docket getDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("ma.gov.licence.pfe.presentation"))
                .paths(PathSelectors.any())
                .build();
    }
}
