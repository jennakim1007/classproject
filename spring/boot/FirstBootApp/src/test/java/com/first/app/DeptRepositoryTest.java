package com.first.app;

import com.first.app.entity.Dept;
import com.first.app.entity.DeptRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Log4j2
@SpringBootTest
public class DeptRepositoryTest {

    @Autowired
    private DeptRepository deptRepository;

    @Test
    public void jpaMethodTest(){

        // 전체 리스트 반환 findAll()
        /*List<Dept> list1 = deptRepository.findAll();
        for(Dept dept : list1){
            log.info(dept);
        }*/

        // 정렬 기준 설정
        /*Sort sort = Sort.by(Sort.Direction.DESC, "dname");
        List<Dept> list2 = deptRepository.findAll(sort);
        for(Dept dept : list2){
            log.info(dept);
        }*/

        // 검색
        /*Optional<Dept> dept1 = deptRepository.findById(10);
        Dept deptData = dept1.orElse(null);
        log.info(deptData);*/

        // 여러 개 데이터로 검색
        /*List<Integer> nos = Arrays.asList(10, 20, 30, 40, 123456);
        List<Dept> list3 = deptRepository.findAllById(nos); // where in()연산
        for(Dept dept : list3){
            log.info(dept);
        }*/

        // insert
        /*Dept insertData = Dept.builder().dname("기획").loc("획기").build();
        log.info("insert 전 데이터... " + insertData);
        Dept resultData = deptRepository.save(insertData);
        log.info("insert 후 데이터... " + resultData);*/

        // update -> save(S) 이용
        /*Dept editData = Dept.builder().deptno(201).dname("크리스").loc("마스").build();
        log.info("update 전 데이터... " + editData);
        Dept resultData = deptRepository.save(editData);
        log.info("update 후 데이터... " + resultData);*/

        // delete
        /*deptRepository.deleteById(56);*/

        // 개수
        long cnt = deptRepository.count();
        log.info("전체 부서의 수 : " + cnt);

    }

    @Test
    public void jpqlMethodTest(){

        // find By Deptno
        /*Optional<Dept> dept1 = deptRepository.findByDeptno(10);
        log.info(dept1);*/

        // find By Dname Like("") Order By Loc Asc
        /*List<Dept> list1 = deptRepository.findByDnameLikeOrderByLocAsc("%A%");
        for (Dept dept : list1){
            log.info(dept);
        }*/

        // find By Loc Like("")
        /*List<Dept> list2 = deptRepository.findByLocLike("%N%");
        for (Dept dept : list2){
            log.info(dept);
        }*/

        // find By Deptno Between(startNum, endNum)
        List<Dept> list3 = deptRepository.findByDeptnoBetween(40, 200);
        for (Dept dept : list3){
            log.info(dept);
        }


    }


}
