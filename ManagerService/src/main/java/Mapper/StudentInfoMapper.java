package Mapper;



import java.util.List;

import model.StudentInfo;

public interface StudentInfoMapper {

	public List<StudentInfo> queryAllStudent();
	public StudentInfo queryStudentById(int id);
	public void updateStudent(StudentInfo studentInfo);
	public void deleteStudentById(int id);
}
