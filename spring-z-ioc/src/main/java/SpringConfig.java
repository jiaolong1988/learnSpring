
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiaolong
 * @date 2024/11/24 20:20
 */
@Configuration
public class SpringConfig {
	@Bean
	public MyBean myBean() {
		return new MyBean();
	}
}
