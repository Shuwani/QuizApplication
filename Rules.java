import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextArea;
import javax.swing.JButton;

public class Rules extends JFrame {

	private JPanel contentPane;
	String name;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rules frame = new Rules("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Rules(String name) {
		this.name=name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 0, 1300, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome "+name);
		lblNewLabel_1.setForeground(new Color(245, 222, 179));
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(32, 118, 669, 71);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(42, 202, 560, 422);
		lblNewLabel_2.setText(
	            "<html>"+ 
	                "1. Read the questions carefully." + "<br><br>" +
	                "2. There are five subjects and each subject carry 10 questions." + "<br><br>" +
	                "3. Each question carry 10 mark. " + "<br><br>" +
	                "4. Time alloted to each question is 30 second." + "<br><br>" +
	                "5. There is one hint provided in each question." + "<br><br>" +
	                "6. There is one 50-50 lifeline. You can use it once during the exam." + "<br><br>" +
	                "7. There is no negative evaluation." + "<br><br>" +
	                "8. Anwer each question to the best of your ability. GOOD LUCK..!!!" + "<br><br>" +
	            "<html>"
	        );
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(750, 118, 386, 349);
		ImageIcon i2=new ImageIcon("C:\\Users\\Hp\\Desktop\\1941012818\\QuizApplication\\Images\\rules.jpg");
		Image scale1=i2.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_DEFAULT);
		ImageIcon i5=new ImageIcon(scale1);
		lblNewLabel_3.setIcon(i5);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(1254, 16, 25, 23);
		ImageIcon i13=new ImageIcon("C:\\Users\\Hp\\Desktop\\1941012818\\QuizApplication\\Images\\cross.png");
		Image img6=i13.getImage().getScaledInstance(lblNewLabel_6.getWidth(), lblNewLabel_6.getHeight(), Image.SCALE_DEFAULT);
		ImageIcon i14=new ImageIcon(img6);
		lblNewLabel_6.setIcon(i14);
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(lblNewLabel_6);

		JButton btnNewButton = new JButton("Next>");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(890, 530, 132, 38);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Subjects sub=new Subjects();
				sub.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 50, 1280, 651);
		ImageIcon i1=new ImageIcon("C:\\Users\\Hp\\Desktop\\1941012818\\QuizApplication\\Images\\scr_bg.jpg");
		Image scale=i1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(scale);
		lblNewLabel.setIcon(i3);
		contentPane.add(lblNewLabel);		
	}
}
