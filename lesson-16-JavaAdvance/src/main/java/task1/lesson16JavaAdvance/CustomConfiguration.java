package task1.lesson16JavaAdvance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import task1.lesson16JavaAdvance.dao.StudentDao;
import task1.lesson16JavaAdvance.dao.impl.StudentDaoImpl;

@Configuration
public class CustomConfiguration {
	@Bean(name = "studentDao")
	public StudentDao getStudentDao() {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao;
	}
	
	@Bean(name = "student")
	public Student getStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("Volodymyr");
		student.setAge(24);

		return student;
	}
}

