

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Admistrator_CheckUser extends JFrame implements ActionListener {

	public JButton check, back;
	public JLabel id_label;
	public JTextField id_text;
	JPanel panel1,panel2;
	String idBuffer;
	Object[] options= {"OK"};

	public Admistrator_CheckUser() {
		Container c = this.getContentPane();
		panel1=new JPanel();
		//panel1.setPreferredSize(new Dimension(400, 600));
		//panel1.setSize(15,20);
		id_label = new JLabel("ID Numer:");
		panel1.add(id_label);
		id_text=new JTextField(8);
		panel1.add(id_text);


		panel2=new JPanel();
		//panel2.setPreferredSize(new Dimension(1, 1));
		//panel2.setSize(1,1);
		check=new JButton("Check");
		check.addActionListener(this);
		panel2.add(check);
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
		if (eventSource == check)
		{
			if(id_text.getText().isEmpty())//check whether input is empty
			{
				JOptionPane.showOptionDialog(null,"You information is not fill out completely","Please enter again",JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE,null,options,options[0]);
			}
			/*else if ()//check input format
			{
				JOptionPane.showOptionDialog(null,"You input format is incorrect","Please enter again",JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE,null,options,options[0]);
			}
			*/
			/*else if ()//check if the user ID is in database
			{
				JOptionPane.showOptionDialog(null,"The user's ID is not in the database","Please enter again",JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE,null,options,options[0]);
			}
			*/
			else {
				idBuffer=id_text.getText();
				System.out.println("idBuffer="+idBuffer);
				Admistrator_UserReport UserReport = new Admistrator_UserReport();//为跳转的界面
				UserReport.pack();
				UserReport.setSize(300, 200);
				UserReport.setLocationRelativeTo(null);
				UserReport.setVisible(true);
				this.dispose();//销毁当前界面

			}

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




}
