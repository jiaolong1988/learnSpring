
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiaolong
 * @date 2024/11/24 20:01
 */

public class EnvTest {
	public static void main(String[] args) {
		//启动spring ioc容器:
		//1、基于xml配置方式 ClassPathXmlApplicationContext
		//2、基于注解的配置方式
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		MyBean myBean = context.getBean(MyBean.class);
		String hello = myBean.sayHello("jiaolong-焦龙");

		System.out.println(hello);
	}
}
