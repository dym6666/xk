 package ѧ��ѡ��;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class xuanke extends JFrame implements  ActionListener{
	JLabel a = new JLabel("��ѡ��γ̣�");
	JButton r = new JButton("ȷ��");
	JCheckBox jc1 = new JCheckBox("��ʦ���ƣ�����ѷ    ��ʦ��ţ� 1  ���ڿγ̣�����   ѧ�֣�2 �ص㣺��ѧ¥101   ʱ�䣺8:00am-10:00am");
	JCheckBox jc2 = new JCheckBox("��ʦ���ƣ� Τ��   ��ʦ��ţ� 2  ���ڿγ̣���ѧ   ѧ�֣�2 �ص㣺��ѧ¥103   ʱ�䣺10:10am-12:30pm");
	JCheckBox jc3 = new JCheckBox("��ʦ���ƣ�������   ��ʦ��ţ�  3 ���ڿγ̣�java   ѧ�֣�169  �ص㣺ʵ��¥0921  ʱ�䣺13:30pm-21:35pm");
	
	xuanke(){
		setTitle("ѡ��");
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
				JOptionPane.showMessageDialog(null, "ѡ�γɹ���");
				new caozuo();
				try {
					FileWriter fw1=new FileWriter("C:\\Users\\Thinkpad\\Desktop\\ѧ��ѡ��.txt",true);
					BufferedWriter fw=new BufferedWriter(fw1);
					fw.write("��ѡ�γ̣�");
					fw.newLine();
					fw.write("��ʦ���ƣ�����ѷ    ��ʦ��ţ� 1  ���ڿγ̣�����   ѧ�֣�2 �ص㣺��ѧ¥101   ʱ�䣺8:00am-10:00am");
					fw.newLine();
					fw.write("��ʦ���ƣ� Τ��   ��ʦ��ţ� 2  ���ڿγ̣���ѧ   ѧ�֣�2 �ص㣺��ѧ¥103   ʱ�䣺10:10am-12:30pm");
					fw.newLine();
					fw.write("��ʦ���ƣ�������   ��ʦ��ţ�  3 ���ڿγ̣�java   ѧ�֣�169  �ص㣺ʵ��¥0921  ʱ�䣺13:30pm-21:35pm");					
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
