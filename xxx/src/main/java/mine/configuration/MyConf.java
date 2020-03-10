package mine.configuration;

import mine.dto.Request;
import mine.dto.Something;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Matchers.anyString;

@Configuration
public class MyConf {
    //@Autowired
    Something s;

    @Bean
    Request requ(){
        return new Request();
    }

    @Bean
    Something requ1(Request r){
        return new Something();
    }

//    @Primary
//    @Bean
    KafkaTemplate<String, String> kafkaTemplate() {
        KafkaTemplate ret = Mockito.mock(KafkaTemplate.class);

        Mockito.when(ret.sendDefault(anyString())).thenReturn(null);
        return ret;
    }


}
