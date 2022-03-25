package springboot.RestAPISB.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    // GET method
    // http://localhost:8080/user

    @GetMapping("/user")
    public String helloWorld() {
        return "Hello World!";
    }

}
