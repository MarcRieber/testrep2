package others;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import mine.MyAnno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@MyAnno
public class OBar {
    @Autowired
    ObjectMapper objectMapper(){
        log.info("Others custom object mapper");
        ObjectMapper ret = new ObjectMapper();
        return ret;
    }

}
