import com.ren.dao.UserDaoImpl;
import com.ren.dao.UserDaoMysqlImpl;
import com.ren.service.UserService;
import com.ren.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();
    }
}
