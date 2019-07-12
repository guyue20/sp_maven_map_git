package com.baizhi;

import com.baizhi.mapper.CourseMapper;
import com.baizhi.mapper.TeacherMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpMaMappApplicationTests {
    @Autowired
    CourseMapper courseMapper;
    @Autowired
    TeacherMapper teacherMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test1() {
        System.out.println(courseMapper.selectByPrimaryKey(2));
    }

    @Test
    public void test2() {
        System.out.println(teacherMapper.selectAll());
    }

}
