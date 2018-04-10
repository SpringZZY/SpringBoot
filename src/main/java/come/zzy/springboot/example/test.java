package come.zzy.springboot.example;

import java.util.Arrays;

public class test {

    public test() {
        // TODO Auto-generated constructor stub
    }
    
    public String as() {
        // TODO Auto-generated constructor stub
           Arrays.asList( "a", "b", "d" ).forEach( e -> {
               if(e.equals("a")){
                   System.out.println(1);
                   return;
               }
               System.out.println(e);
           });
           
           System.out.println(1);
        return null;
    }
    
    public static void main(String[] args) {
        test aa = new test();
        aa.as();
    }

}
