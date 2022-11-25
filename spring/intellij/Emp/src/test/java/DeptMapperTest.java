import com.app.manager.domain.DeptDTO;
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

    @Test
    public void selectByDeptnoTest(){
        log.info(deptMapper.selectByDeptno(10));
    }

    @Test
    public void insertDeptTest(){
        DeptDTO deptDTO = new DeptDTO(80, "테스트테스트", "테스트테스트");
        log.info(deptMapper.insertDept(deptDTO));
    }

    @Test
    public void updateDeptTest(){
        DeptDTO deptDTO = new DeptDTO(80, "테스트2", "테스트테스트");
        log.info(deptMapper.updateDept(deptDTO));
    }

    @Test
    public void deleteDeptByDeptnoTest(){
        log.info(deptMapper.deleteDeptByDeptno(52));
    }


}
