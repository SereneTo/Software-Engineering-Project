

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Admistrator_CheckStation extends JFrame implements ActionListener {
	public JButton back;
	public JTextArea report;
	JPanel panel1,panel2;

	public Admistrator_CheckStation() {
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		panel1=new JPanel();
		//panel1.setPreferredSize(new Dimension(400, 600));
		//panel1.setSize(15,20);
		report = new JTextArea(5,20);
		report.setLineWrap(true);        //激活自动换行功能
		report.setWrapStyleWord(true); // 激活断行不断字功能
		report.setEditable(false);
		report.setText("Station A:\nAvailable:3 Total:8\n---------\nStation B:\nAvailable:2 Total:8\n--------\nStation C:\nAvailable:1 Total:8\n\n-----------------\nThere are 18 scooters on the way.");  //设置输出内容
		panel1.add(new JScrollPane(report));


		panel2=new JPanel();
		//panel2.setPreferredSize(new Dimension(1, 1));
		//panel2.setSize(1,1);
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
		if (eventSource == back)
		{
			Admistrator_main main = new Admistrator_main();//为跳转的界面
			main.pack();
			main.setSize(300, 200);
			main.setLocationRelativeTo(null);
			main.setVisible(true);
			this.dispose();//销毁当前界面
		}

	}
}
