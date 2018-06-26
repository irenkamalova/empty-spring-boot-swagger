package hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    // отсутствие указанного явно метода предполагает наличие всех (7!) методов
    public String index() {
        return "Greetings from Spring Boot!";
    }

}