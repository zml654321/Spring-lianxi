import com.chb.dao.UserDaoMySqlImpl;
import com.chb.pojo.Hello;
import com.chb.pojo.User;
import com.chb.service.UserService;
import com.chb.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test(){
        UserServiceImpl service=new UserServiceImpl();
        service.setUserDao(new UserDaoMySqlImpl());
        service.getUser();
    }
    @Test
    public void test1(){
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        serviceImpl.getUser();
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候, user已经创建好了 , 通过无参构造
        User user = (User) context.getBean("user");
        //调用对象的方法 .
        user.show();
    }
}
