
import java.io.IOException;
import java.io.*;
import java.io.Serializable;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Calendar;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Admistrator_Register extends JFrame implements ActionListener {
	public JButton register, back;
	public JLabel id_label,name_label,email_label;
	public JTextField id_text,name_text,email_text;
	JPanel panel1,panel2,panel3,panel4,panel5,panel6,panel7;
	private String idBuffer,nameBuffer,emailBuffer;
	Object[] options= {"OK"};


	public Admistrator_Register() {
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());

		panel1=new JPanel();
		//panel1.setPreferredSize(new Dimension(400, 600));
		//panel1.setSize(15,20);
		panel1.setLayout(new GridLayout(4,2,10,10));
		id_label = new JLabel("ID Numer:");
		panel1.add(id_label);
		id_text=new JTextField(8);
		panel1.add(id_text);
		name_label = new JLabel("      Name:");
		panel1.add(name_label);
		name_text=new JTextField(8);
		panel1.add(name_text);
		email_label = new JLabel("      Email:");
		panel1.add(email_label);
		email_text=new JTextField(8);
		panel1.add(email_text);

		//panel2=new JPanel();

		//panel2.setPreferredSize(new Dimension(1, 1));
		//panel2.setSize(1,1);
		register=new JButton("Register");
		register.addActionListener(this);
		panel1.add(register);
		back=new JButton("Back");
		back.addActionListener(this);
		panel1.add(back);
		//panel2.setLayout(new GridLayout(0,2,10,10));

		//panel7=new JPanel();
		//panel7.add(panel1);
		//panel7.add(panel2);
		//panel7.setLayout(new GridLayout(2,1,10,10));

		panel3=new JPanel();
		panel4=new JPanel();
		panel5=new JPanel();
		panel6=new JPanel();
		c.add(panel1,BorderLayout.CENTER);
		c.add(panel6,BorderLayout.SOUTH);
		c.add(panel3,BorderLayout.WEST);
		c.add(panel4,BorderLayout.EAST);
		c.add(panel5,BorderLayout.NORTH);


		this.setTitle("Administrator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {

		JButton eventSource = (JButton) e.getSource();
		if (eventSource == register)
		{
			if(id_text.getText().isEmpty()||name_text.getText().isEmpty()||email_text.getText().isEmpty())//check whether input is empty
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
				JOptionPane.showOptionDialog(null,"Your information has met the requirements","Keep going",JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
			}
			*/
			else {
				idBuffer=id_text.getText();
				nameBuffer=name_text.getText();
				emailBuffer=email_text.getText();
				IOTest.student1.setQMNum(idBuffer);
				IOTest.student1.setStudentName(nameBuffer);
				IOTest.student1.setEmail(emailBuffer);
				IOTest.studentOutput();
				System.out.println("idBuffer="+idBuffer);
				System.out.println("nameBuffer="+nameBuffer);
				System.out.println("emailBuffer="+emailBuffer);
				/*
				try{
					IOTest.studentInput();
				}catch(ClassNotFoundException | IOException ex){
				ex.printStackTrace();
				}
				System.out.println(IOTest.student1.getQMNum());
				System.out.println(IOTest.student1.getStudentName());
				System.out.println(IOTest.student1.getEmail());
				System.out.println(IOTest.student1.getCurrentTime());
				System.out.println(IOTest.student1.getTotalTime());
				System.out.println(IOTest.student1.getDifferentDay());
				System.out.println(IOTest.student1.getDataMonth());
				System.out.println(IOTest.student1.getDataDay());
				*/
				//Sucessfully log in (JOptionPane)

			}

		}
		else if (eventSource == back)
		{
			Admistrator_main main = new Admistrator_main();//为跳转的界面
			main.pack();
			main.setSize(300, 200);
			main.setLocationRelativeTo(null);
			main.setVisible(true);
			this.dispose();

		}




	}

/*
	public static void main(String[] args) {
		Admistrator_Register myDemo = new Admistrator_Register();
		myDemo.pack();
		myDemo.setVisible(true);
	}
*/
}
