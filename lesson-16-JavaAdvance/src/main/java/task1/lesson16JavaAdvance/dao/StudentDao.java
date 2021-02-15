package task1.lesson16JavaAdvance.dao;

import java.util.List;

import task1.lesson16JavaAdvance.Student;

public interface StudentDao {
	
	void create(Student student);

	Student readById(int id);

	List<Student> readAll();

	void update(Student student);

	void delete(int id);
}
