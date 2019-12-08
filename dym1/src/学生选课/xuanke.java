 package 学生选课;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class xuanke extends JFrame implements  ActionListener{
	JLabel a = new JLabel("请选择课程：");
	JButton r = new JButton("确定");
	JCheckBox jc1 = new JCheckBox("老师名称：威尔逊    老师编号： 1  所授课程：语文   学分：2 地点：教学楼101   时间：8:00am-10:00am");
	JCheckBox jc2 = new JCheckBox("老师名称： 韦伯   老师编号： 2  所授课程：数学   学分：2 地点：教学楼103   时间：10:10am-12:30pm");
	JCheckBox jc3 = new JCheckBox("老师名称：张世博   老师编号：  3 所授课程：java   学分：169  地点：实验楼0921  时间：13:30pm-21:35pm");
	
	xuanke(){
		setTitle("选课");
		setSize(600,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(a);
		add(jc1);
		add(jc2);
		add(jc3);
		add(r);
		jc1.addActionListener(this);
		jc2.addActionListener(this);
		jc3.addActionListener(this);
		r.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==r) {
				JOptionPane.showMessageDialog(null, "选课成功！");
				new caozuo();
				try {
					FileWriter fw1=new FileWriter("C:\\Users\\Thinkpad\\Desktop\\学生选课.txt",true);
					BufferedWriter fw=new BufferedWriter(fw1);
					fw.write("已选课程：");
					fw.newLine();
					fw.write("老师名称：威尔逊    老师编号： 1  所授课程：语文   学分：2 地点：教学楼101   时间：8:00am-10:00am");
					fw.newLine();
					fw.write("老师名称： 韦伯   老师编号： 2  所授课程：数学   学分：2 地点：教学楼103   时间：10:10am-12:30pm");
					fw.newLine();
					fw.write("老师名称：张世博   老师编号：  3 所授课程：java   学分：169  地点：实验楼0921  时间：13:30pm-21:35pm");					
					fw.close();
				}
				catch (IOException n) 
				{
				n.printStackTrace();
				}
			}
		}
		public static void main(String args[]) {
			xuanke c = new xuanke();
		}
}
