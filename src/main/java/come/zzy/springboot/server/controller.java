package come.zzy.springboot.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class controller {

    public controller() {
        // TODO Auto-generated constructor stub
    }
    
    @RequestMapping("/SpringBoot")
    public String loginjsp(){
        return "Hello Spring Boot!";
        
    }

    
    public static void main(String[] args) {
        SpringApplication.run(controller.class, args);
    }
}
