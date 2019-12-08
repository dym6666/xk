# xk     计181     董一鸣      2018310728
一、实验目的
分析学生选课系统
使用GUI窗体及其组件设计窗体界面
完成学生选课过程业务逻辑编程
基于文件保存并读取数据
处理异常
二、实验要求
1、系统角色分析及类设计
例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。
定义每种角色人员的属性，及其操作方法。
属性示例：人员（编号、姓名、性别……）
         教师（编号、姓名、性别、所授课程、……）
         学生（编号、姓名、性别、所选课程、……）
         课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展。
2、要求
1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
3、针对操作过程中可能会出现的各种异常，做异常处理。
4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
5、基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。
6、本次实验是综合性实验，在40%的实验成绩中占比最大，望同学们认真对待。
三、实验过程
1、核心代码
public class caozuo extends JFrame implements ActionListener{
	JButton Choosing = new JButton("选      课");
	JButton Printing = new JButton("输出信息");
	JLabel wel = new JLabel("请按照提示操作");
	
	caozuo(){
		setTitle("学生");
		setSize(250,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		add("North",wel);
		add("West",Choosing);add("East",Printing);
		validate();
		Choosing.addActionListener(this);;
		Printing.addActionListener(this);
	}
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
         ublic class Student extends JFrame implements ActionListener{
	JButton login1 = new JButton("登录");
	JButton login2 = new JButton("注册");
	JLabel id = new JLabel("学号：");
	JLabel password = new JLabel("密码：");
	JTextField jtf1 = new JTextField(15); 
	JTextField jtf2 = new JTextField(15); 
	
	Student(){
		setTitle("学生");
		setSize(250,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		add(id);add(jtf1);
		add(password);add(jtf2);
		add(login1);add(login2);
		validate();
		login1.addActionListener(this);;
		login2.addActionListener(this);
	}
四、运行截图
