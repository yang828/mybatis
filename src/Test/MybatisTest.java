package Test;


import JavaBean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;


public class MybatisTest {
    public static void main(String[] args) {
        String resource = "mybatis-configuration.xml";
        InputStream inputStream = null;
        try {
           inputStream = Resources.getResourceAsStream(resource);
        }catch(Exception e){
            System.out.println("打开文件错误");
        }
        SqlSessionFactoryBuilder buider = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = buider.build(inputStream);
        SqlSession session = factory.openSession();
        Student student = session.selectOne("Mapper.StudentMapper.selectStudent");
    }

}
