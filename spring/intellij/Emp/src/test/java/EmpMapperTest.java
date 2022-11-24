import com.app.manager.domain.EmpDTO;
import com.app.manager.mapper.EmpMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class EmpMapperTest {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void selectAllTest(){
        log.info(empMapper.selectAll());
    }

    @Test
    public void selectByEmpnoTest(){
        log.info(empMapper.selectByEmpno(7499));
    }

    EmpDTO empDTO= new EmpDTO(1, "d", "d", 1, "1981-09-09", 1.0, 1.0, 10);
    EmpDTO empDTO1= new EmpDTO(1, "ddd", "d", 1, "1981-09-09", 1.0, 1.0, 10);

    @Test
    public void insertEmpTest(){
        log.info(empMapper.insertEmp(empDTO));
    }

    @Test
    public void updateEmpTest(){
        log.info(empMapper.updateEmp(empDTO1));
    }

    @Test
    public void deleteEmpByEmpnoTest(){
        log.info(empMapper.deleteEmpByEmpno(1));
    }


}
