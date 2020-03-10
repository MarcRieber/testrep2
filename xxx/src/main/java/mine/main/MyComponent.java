package mine.main;

import lombok.extern.slf4j.Slf4j;
import mine.configuration.MyConf;
import mine.dto.Request;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
@Slf4j
public class MyComponent {
    @Autowired
    Request r;
    @Autowired
    MyConf c;

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void doIt(){
        kafkaTemplate.setDefaultTopic("foo");
        kafkaTemplate.sendDefault("AAA")
                .addCallback(x -> {log.info("Yeah");}, y ->{log.warn("Nee");});
    }

    public int calc(int x, int y){
        return x + y;

    }

}
