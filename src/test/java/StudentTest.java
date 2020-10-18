import cn.Joy.AppMain;
import cn.Joy.dao.StudentMapper;
import cn.Joy.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppMain.class)
public class StudentTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    public void testFind() {
        Student result = studentMapper.findBySno(110);
        System.out.println(result);
    }

    @Test
    public void testDelete() {
        int result = studentMapper.deleteBySno(1);
    }

    @Test
    public void testUpdate() {
        studentMapper.updateAgeBySno(110, 199);
    }

    @Test
    public void testInsert() {
        Student stu = new Student(99, "陆宇", 2);
        studentMapper.insertStudent(stu);
    }
}
