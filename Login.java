import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 180, 650, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPane = new JTextPane();
		textPane.setBounds(222, 107, 331, 36);
		textPane.setBackground(new Color(255, 255, 255));
		contentPane.add(textPane);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(222, 174, 331, 34);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 17));
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBounds(275, 237, 136, 36);
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			PreparedStatement ps;
			ResultSet rs;
			String uname=textPane.getText();
			String pass=String.valueOf(passwordField_1.getPassword());
			
			String query="select * from app_users where username=? and password=?";
			try {
				ps=myconnection.getConnection().prepareStatement(query);
				ps.setString(1,uname);
				ps.setString(2, pass);

				rs=ps.executeQuery();
				if(rs.next()) {
					JOptionPane.showMessageDialog(null, "Successfully logged in");
					String name=textPane.getText();
				    Rules r=new Rules(name);
					r.setVisible(true);
					dispose();
					}
				else {
					JOptionPane.showMessageDialog(null, "incorrect Username or password");
				}
				}
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setBackground(new Color(0, 255, 0));
		lblNewLabel.setBounds(60, 107, 109, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_1.setBounds(60, 172, 109, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setBackground(new Color(255, 140, 0));
		lblNewLabel_2.setBounds(256, 27, 136, 36);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 34));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Don't have an account? Click here to create a new One.");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(166, 297, 363, 49);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Register r=new Register();
				r.setVisible(true);
				dispose();
			}
		});
		contentPane.add(lblNewLabel_3);
		setUndecorated(true);
	}
}
