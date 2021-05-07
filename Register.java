import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 180, 650, 370);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(232, 107, 321, 36);
		textPane.setBackground(new Color(255, 255, 255));
		contentPane.add(textPane);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(232, 174, 321, 36);
		contentPane.add(passwordField_1);
		
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(47, 107, 135, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(47, 171, 135, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("REGISTER");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setBounds(230, 31, 226, 49);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 35));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Already have an account. Click here to login.");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setBounds(190, 297, 363, 49);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Login l=new Login();
				l.setVisible(true);
				dispose();
			}
		});
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("REGISTER");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 17));
		btnNewButton_2.setBackground(new Color(65, 105, 225));
		btnNewButton_2.setBounds(285, 236, 136, 36);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname=textPane.getText();
				String pass=String.valueOf(passwordField_1.getPassword());
				
				PreparedStatement ps;
				String query="insert into app_users values(?,?,?)";
				
				try {
					ps=myconnection.getConnection().prepareStatement(query);
					ps.setString(1,uname);
					ps.setString(2, pass);
					ps.setString(3, null);
					
					if(ps.executeUpdate()>0) {
						JOptionPane.showMessageDialog(null, "Thanks for signing in");
						Login l=new Login();
						l.setVisible(true);
						dispose();
					}
				}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnNewButton_2);
	
		setUndecorated(true);	
	}
}
