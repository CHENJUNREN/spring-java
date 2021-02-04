import com.ren.pojo.User;
import com.ren.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        // Spring container
        // objects in the container have been initialized when the config file is loaded
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user");
        user.show();

        // only one copy of the object is created in the container
        User user2 = (User) context.getBean("user");
        System.out.println(user == user2);

        UserT userT = (UserT) context.getBean("user2");
        userT.show();
    }
}
