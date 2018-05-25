package come.zzy.springboot.server;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import come.zzy.springboot.pojo.Entry;
//这个注解不能使用RestController，不然会返回模板类型的页面
//@RestController
@Controller
@RequestMapping(value = "/springB")
//@EnableAutoConfiguration
@EnableConfigurationProperties({Entry.class})
public class controller {
    
    @Autowired
    Entry entry;

    @Value("${name}")
    private String name;
 
    @Value("${age}")
    private String age;

    @Value("${six}")
    private String six;
    
    /*************/
    @Value("${sb}")
    private String loginjspcontroller;
    /*************/
    
    /***
     * 单纯调用 springboot 并且通过@value来获取配置文件的值
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping(value = "/{loginjspcontroller}")
    public String loginjsp() throws UnsupportedEncodingException {
        return "姓名:"+ name + "年龄:" + age + "性别:" + six;

    }
    
    /***
     * 通过创建pojo，并且对相应的pojo整体赋值具体参考 Entry.class。
     * 这里有提别需要注明的是 在启动方法类中需要加注@EnableConfigurationProperties 来指定你的实体。这样才能获取到实体值
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/Students")
    public String getStudents() throws UnsupportedEncodingException {
        return "姓名:"+ entry.getName() + "年龄:" + entry.getAge() + "性别:" + entry.getSix();
    }
    
    
    @RequestMapping("/st")
    public ModelAndView getStudentsJsp() throws UnsupportedEncodingException {
        return new ModelAndView("students");
    }
    

    @RequestMapping("/view")
    public ModelAndView showview() throws UnsupportedEncodingException {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("a");
        mv.addObject("name", "index");
        Entry entry = new Entry();
        mv.addObject("user", entry);
        return mv;
    }
    
    
}
