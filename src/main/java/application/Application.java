package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("come.zzy.springboot.server")
public class Application extends SpringBootServletInitializer {

    /***
     * springboot启动方法,如果需要发布需要打包jar包，直接发布到服务器tomcate中
     * @ComponentScan 这个注解是用于扫描这个包下的controller文件
     * @param args
     * @throws Exception
     */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/***返回jsp页面必须继承SpringBootServletInitializer类重写里面的方法***/
	  protected SpringApplicationBuilder config(SpringApplicationBuilder applicationBuilder){
	        return applicationBuilder.sources(Application.class);
	    }
}
