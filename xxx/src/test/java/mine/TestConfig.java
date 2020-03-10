package mine;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
@Primary
public class TestConfig {


    @Bean
    KafkaTemplate<String, String> kafkaTemplate(){
        KafkaTemplate<String, String> mock = Mockito.mock(KafkaTemplate.class);
        return mock;
    }
}
