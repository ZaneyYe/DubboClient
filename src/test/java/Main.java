import dubbo.demo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yzy on 2016/8/31.
 */
public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();

        HelloService helloService = context.getBean("helloService", HelloService.class);
        String call = helloService.getHello("奥巴马");

        System.out.println(call);

    }
}
