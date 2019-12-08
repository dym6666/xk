package 学生选课;

import java.awt.FlowLayout;

import javax.swing.*;

public class Teacher extends JFrame {
	JLabel j1 = new JLabel("选课学生：");
	JLabel  name = new JLabel("老师名称：威尔逊");
	JLabel  ID = new JLabel("老师编号： 1");
	JLabel  course = new JLabel("所授课程：语文 "+"学分：2"+
	                            "地点：教学楼101"+"时间：8:00am-10:00am");
	JTextField jtf1 = new JTextField("dym",15);
	Teacher(){
		setSize(400,200);
		setTitle("教师");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout(5));    
		add(name);     //将标签加入窗口中
		System.out.print("\n");
		add(ID);  
		add(course);
		add(j1);
		add(jtf1);
		validate();
	}
	
	public static void main(String[] args) {
		new Teacher();
	}
	
}