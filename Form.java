import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.Result;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Form extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 180, 650, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(205, 104, 399, 36);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(205, 178, 399, 36);
		contentPane.add(textPane_1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(60, 267, 525, 36);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname=textPane.getText();
				String re=textPane_1.getText();
	
				PreparedStatement ps;
				String query="update app_users set review=? where username=?";
				
				try {
					ps=myconnection.getConnection().prepareStatement(query);
					ps.setString(1,re);
					ps.setString(2, uname);
					if(ps.executeUpdate()>0) {
						JOptionPane.showMessageDialog(null, "Thanks for filling the feedback form.");
						System.exit(0);
					}
				}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setBounds(50, 104, 145, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Feedback");
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setBounds(50, 178, 145, 36);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtrFeedback = new JTextArea();
		txtrFeedback.setFont(new Font("Arial", Font.BOLD, 30));
		txtrFeedback.setText("  FEEDBACK");
		txtrFeedback.setForeground(new Color(255, 255, 255));
		txtrFeedback.setBackground(new Color(255, 153, 102));
		txtrFeedback.setBounds(0, 0, 650, 48);
		contentPane.add(txtrFeedback);
		
	}
}
