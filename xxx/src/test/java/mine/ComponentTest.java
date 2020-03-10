package mine;

import mine.main.MyComponent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@SpringBootTest
//@ContextConfiguration(classes={MyConf.class})
@ComponentScan(basePackages = {"mine"})
public class ComponentTest {
    @Autowired
    MyComponent mycomp;

    @Test
    void mainTest(){
    }

}
