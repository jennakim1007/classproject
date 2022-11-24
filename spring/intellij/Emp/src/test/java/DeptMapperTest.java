import com.app.manager.domain.EmpDTO;
import com.app.manager.mapper.DeptMapper;
import com.app.manager.mapper.EmpMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DeptMapperTest {

    @Autowired
    private DeptMapper deptMapper;

    @Test
    public void selectAllTest(){
        log.info(deptMapper.selectAll());
    }




}
