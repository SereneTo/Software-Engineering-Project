

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Admistrator_UserReport extends JFrame implements ActionListener {
	public JButton send, back;
	public JTextArea report;
	JPanel panel1,panel2;
	private String idBuffer;
	
	public Admistrator_UserReport() {
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		panel1=new JPanel();
		//panel1.setPreferredSize(new Dimension(400, 600));
		//panel1.setSize(15,20);
		report = new JTextArea(5,20);
		report.setLineWrap(true);        //激活自动换行功能
		report.setWrapStyleWord(true); // 激活断行不断字功能
		report.setEditable(false);
		report.setText("ID number:2016213272\nTotal usage in last week:1 hours\n3-24-18-30:50 mins\n3-25-12-30:10 mins\n ");  //设置输出内容
		panel1.add(new JScrollPane(report));


		panel2=new JPanel();
		//panel2.setPreferredSize(new Dimension(400, 100));
		//panel2.setSize(1,1);
		send=new JButton("Send weekly report");
		send.addActionListener(this);
		panel2.add(send);
		back=new JButton("Back");
		back.addActionListener(this);
		panel2.add(back);

		c.add(panel1,BorderLayout.CENTER);
		c.add(panel2,BorderLayout.SOUTH);


		this.setTitle("Administrator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		JButton eventSource = (JButton) e.getSource();
		if (eventSource == send)
		{



		}
		else if (eventSource == back)
		{
			Admistrator_main main = new Admistrator_main();//为跳转的界面
			main.pack();
			main.setSize(300, 200);
			main.setLocationRelativeTo(null);
			main.setVisible(true);
			this.dispose();//销毁当前界面
		}

	}
	/*
	public static void main(String[] args) {
		Admistrator_UserReport myDemo = new Admistrator_UserReport();
		myDemo.pack();
		myDemo.setVisible(true);
	}
	*/
}
