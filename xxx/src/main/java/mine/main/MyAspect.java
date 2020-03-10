package mine.main;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @AfterReturning("my.main.MyComponent.calc(..)")
    public void doIt(){
        System.out.println("doIt !!!");
    }
}
