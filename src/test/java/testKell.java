import com.vanke.demo.DemoApplication;
import com.vanke.demo.service.PersonServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= DemoApplication.class)
public class testKell{

    @Autowired
    PersonServiceImpl personServiceImpl;

    @Test
    public void testCode(){
        System.out.println("角色："+personServiceImpl.ofCode("ROLE_MJ_CITY_ADMIN").getRoleName());
    }

}
