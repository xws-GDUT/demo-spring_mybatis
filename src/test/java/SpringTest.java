import com.vsen.pojo.Student;
import com.vsen.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl = (StudentService) applicationContext.getBean("studentServiceImpl");
        List<Student> allStudents = studentServiceImpl.getAllStudents();
        System.out.println(allStudents);
    }
}
