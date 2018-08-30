package Controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import managerInterface.ManagerService;
import model.Manager;
import model.Score;
import model.StudentInfo;
import studentInterface.StudentInterface;


@Controller
public class ManagerController {

	@Autowired
	private ManagerService managerService;
	@Autowired
	private StudentInterface studentService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(Manager manager,HttpServletRequest req,HttpServletResponse res){
		Manager result = managerService.queryManagerByName(manager);
		if (result == null) {
			//当密码和用户名不匹配时返回login
			return "login";
		}else {
			//true表示若没有session则创建一个session
			HttpSession session = req.getSession(true);
			session.setAttribute("manager", result);
			return "studentsystem";
		}	
	}
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.invalidate();
		return "login";
	}
	@RequestMapping("/home")
	public String test(){
		System.out.println("进入方法");
		return "login";
	}
	
	@RequestMapping("/queryAllScore")
	public ModelAndView queryAllScore(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("ScoreList", studentService.queryAllScore());
		modelAndView.setViewName("ScoreList");
		return modelAndView;
	}
	@RequestMapping("/queryAllStudent")
	public ModelAndView queryAllStudent(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("StudentList", studentService.queryAllStudent());
		modelAndView.setViewName("StudentList");
		return modelAndView; 
	}
	
	@RequestMapping("/queryScoreByName/{name}")
	public ModelAndView queryScoreByName(@PathVariable String name){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("scoreByName", studentService.queryScoreByName(name));
		modelAndView.setViewName("scoreByName");
		return modelAndView;
	}
	@RequestMapping("/updateScore")
	public String updateScore(Score score){
		studentService.updateScore(score);
		//更新完分数后就重定向到当前连接
		return "redict:/queryAllScore";
	}
	
	@RequestMapping("/queryStudentById/{id}")
	public ModelAndView queryStudengById(@PathVariable int id){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", studentService.queryStudentById(id));
		modelAndView.setViewName("studentById");
		return modelAndView;
	}
	@RequestMapping("/updateStudent")
	public String updateStudent(StudentInfo studentInfo){
		studentService.updateStudent(studentInfo);
		//更新完学生信息后就重定向到当前连接
		return "redict:/queryAllStudent";
	}
	
	@RequestMapping("/deleteStudentById/{id}")
	public String deleteStudentById(@PathVariable int id){
		studentService.deleteStudentById(id);
		//删除完学生信息后就重定向到当前连接
		return "redict:/queryAllStudent";
	}
}
