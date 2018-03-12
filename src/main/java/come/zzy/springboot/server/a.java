package come.zzy.springboot.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class a {

    @RequestMapping("/zzy")
    public String login(){
        System.out.println("!!!!!!!!!!!!!!!!!!");
        return "Hello World!";
    }
    
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(a.class, args);
    }
    
}
