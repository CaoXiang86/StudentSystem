package studentInterface;

import java.util.List;

import model.Score;
import model.StudentInfo;

public interface StudentInterface {

	public List<StudentInfo> queryAllStudent();
	public StudentInfo queryStudentById(int id);
	public void updateStudent(StudentInfo studentInfo);
	public void deleteStudentById(int id);
	
	public List<Score> queryAllScore();
	public Score queryScoreByName(String name);
	public void updateScore(Score score);
}
