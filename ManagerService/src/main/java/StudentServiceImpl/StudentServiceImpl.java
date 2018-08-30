package StudentServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Mapper.ScoreMapper;
import Mapper.StudentInfoMapper;
import model.Score;
import model.StudentInfo;

@Transactional
@Service("StudentService")
public class StudentServiceImpl {

	@Autowired
	private StudentInfoMapper studentMapper;
	@Autowired
	private ScoreMapper scoreMapper;
	public List<StudentInfo> queryAllStudent() {
		return studentMapper.queryAllStudent();
	}
	public StudentInfo queryStudentById(int id) {
		return studentMapper.queryStudentById(id);
	}
	public void updateStudent(StudentInfo studentInfo) {
		studentMapper.updateStudent(studentInfo);
	}
	public void deleteStudentById(int id) {
		studentMapper.deleteStudentById(id);
	}
	public List<Score> queryAllScore() {
		return scoreMapper.queryAllScore();
	}
	public Score queryScoreByName(String name) {
		return scoreMapper.queryScoreByName(name);
	}
	public void updateScore(Score score) {
		scoreMapper.updateScore(score);
	}
	
}
