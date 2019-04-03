
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//This page is the home page for administrator.
public class Admistrator_main extends JFrame implements ActionListener {
	public JButton registerButton, checkUserButton,checkStationButton;
	public JLabel label;
	int number = 0;
	public JPanel Admin_p1,Admin_p2,Admin_p3,Admin_p4;


	public Admistrator_main() {
		this.setTitle("Administrator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		Admin_p1=new JPanel();
		Admin_p2=new JPanel();
		Admin_p3=new JPanel();
		Admin_p4=new JPanel();
		Admin_p1.setLayout(new GridLayout(4,1,10,10));

		label = new JLabel("Please select an option.");
		Admin_p1.add(label);
		//this.getContentPane().add(label);
		//this.add(Admin_p1);

		registerButton = new JButton("Register");
		registerButton.addActionListener(this);
		//this.getContentPane().add(registerButton);
		Admin_p1.add(registerButton);
		//this.add(Admin_p2);

		checkUserButton= new JButton("Check user's usage");
		checkUserButton.addActionListener(this);
		//this.getContentPane().add(checkUserButton);
		Admin_p1.add(checkUserButton);
		//this.add(Admin_p3);

		checkStationButton= new JButton("Check station's situation");
		checkStationButton.addActionListener(this);
		//this.getContentPane().add(checkStationButton);
		Admin_p1.add(checkStationButton);
		//this.add(Admin_p4);

		this.add(Admin_p1,BorderLayout.CENTER);
		this.add(Admin_p2,BorderLayout.SOUTH);
		this.add(Admin_p3,BorderLayout.WEST);
		this.add(Admin_p4,BorderLayout.EAST);

	}

	public void actionPerformed(ActionEvent e) {
		JButton eventSource = (JButton) e.getSource();
		if (eventSource == registerButton) {
			Admistrator_Register register = new Admistrator_Register();//为跳转的界面
			register.pack();
			register.setSize(300,200);
			register.setLocationRelativeTo(null);
			register.setVisible(true);
			this.dispose();//销毁当前界面

		}
		else if (eventSource == checkUserButton) {
			Admistrator_CheckUser checkUser = new Admistrator_CheckUser();//为跳转的界面
			checkUser.pack();
			checkUser.setSize(300, 100);
			checkUser.setLocationRelativeTo(null);
			checkUser.setVisible(true);
			this.dispose();//销毁当前界面
		}
		else if (eventSource == checkStationButton) {
			Admistrator_CheckStation checkStation = new Admistrator_CheckStation();//为跳转的界面
			checkStation.pack();
			checkStation.setSize(300, 200);
			checkStation.setLocationRelativeTo(null);
			checkStation.setVisible(true);
			this.dispose();//销毁当前界面
		}
	}

	public static void main(String[] args) {
		Admistrator_main main = new Admistrator_main();
		main.pack();
		main.setVisible(true);
		main.setSize(300, 200);
		main.setLocationRelativeTo(null);
	}
}
