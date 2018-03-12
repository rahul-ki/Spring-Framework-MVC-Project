package springboot.try2.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
}
