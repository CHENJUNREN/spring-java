import com.ren.config.AppConfig;
import com.ren.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
    }
}
