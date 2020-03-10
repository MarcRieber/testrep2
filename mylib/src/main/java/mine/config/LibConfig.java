package mine.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LibConfig {
    @Bean
    ObjectMapper objectMapper(){
        log.info("Custom object mapper");
        ObjectMapper ret = new ObjectMapper();
        return ret;
    }


}
