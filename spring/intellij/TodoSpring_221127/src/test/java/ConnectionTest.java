import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.mapper.MemberMapper;
import com.todo.todospring.mapper.TodoMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Autowired(required = false)
    private MemberMapper memberMapper;

    @Autowired(required = false)
    private TodoMapper todoMapper;


    @Test
    public void connectionTest() throws SQLException {
        Connection conn = dataSource.getConnection();
        log.info(conn);
        Assertions.assertNotNull(conn);

        log.info(memberMapper);
        log.info(todoMapper);

        log.info(todoMapper.selectAll());


    }


}
