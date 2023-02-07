package dio.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Transformando  WelcomeController em componente
@RestController
@RequestMapping(value="/") //definindo o path raiz

public class WelcomeController {  
    @GetMapping
    public String welcome(){
        return "Bem-vindo ao meu primeiro Spring Boot Web API";
    }

}  
