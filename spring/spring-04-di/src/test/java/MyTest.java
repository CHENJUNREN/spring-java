import com.ren.pojo.Student;
import com.ren.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user", User.class);
        assert user.getName().equals("ren");
        assert user.getAge() == 23;

    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user2", User.class);
        assert user.getName().equals("tony");
        assert user.getAge() == 23;
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        assert user != user2;
    }
}
