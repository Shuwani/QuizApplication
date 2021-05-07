import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;

public class Score extends JFrame {

	private JPanel contentPane;
	int score;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Score frame = new Score(0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Score(int score) {
		this.score=score;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 0, 1300, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel lblNewLabel_1 = new JLabel("SCORE");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBounds(44, 71, 553, 144);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Your scored "+score+" out of 100.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setBounds(60, 246, 426, 119);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Thanks for completing the test.");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_3.setBounds(256, 420, 778, 144);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Play Again");
		btnNewButton.setBackground(new Color(0, 0, 139));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Subjects sub =new Subjects();
				sub.setVisible(true);
			}
		});
		btnNewButton.setBounds(904, 219, 184, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("FEEDBACK FORM");
		btnNewButton_1.setBackground(new Color(0, 0, 139));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form f =new Form();
				f.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(911, 337, 177, 45);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 40, 1264, 651);
		ImageIcon i1=new ImageIcon("C:\\Users\\Hp\\Desktop\\1941012818\\QuizApplication\\Images\\scr_bg.jpg");
		Image scale=i1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(scale);
		lblNewLabel.setIcon(i3);
		contentPane.add(lblNewLabel);
			
	}
}
