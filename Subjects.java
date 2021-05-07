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
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class Subjects extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Subjects frame = new Subjects();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Subjects() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 0, 1300, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(81, 240, 174, 165);
		ImageIcon i3=new ImageIcon("C:\\Users\\Hp\\Desktop\\1941012818\\QuizApplication\\Images\\economic.jpg");
		Image img1=i3.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_DEFAULT);
		ImageIcon i4=new ImageIcon(img1);
		Border b1=new LineBorder(Color.black,4);
		lblNewLabel_1.setIcon(i4);
		lblNewLabel_1.setBorder(b1);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(297, 240, 174, 165);
		ImageIcon i5=new ImageIcon("C:\\Users\\Hp\\Desktop\\1941012818\\QuizApplication\\Images\\computer.jpg");
		Image img2=i5.getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(img2);
		Border b2=new LineBorder(Color.black,4);
		lblNewLabel_2.setIcon(i6);
		lblNewLabel_2.setBorder(b2);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(513, 240, 174, 165);
		ImageIcon i7=new ImageIcon("C:\\Users\\Hp\\Desktop\\1941012818\\QuizApplication\\Images\\gk.jpg");
		Image img3=i7.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_DEFAULT);
		ImageIcon i8=new ImageIcon(img3);
		Border b3=new LineBorder(Color.black,4);
		lblNewLabel_3.setIcon(i8);
		lblNewLabel_3.setBorder(b3);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(728, 240, 174, 165);
		ImageIcon i9=new ImageIcon("C:\\Users\\Hp\\Desktop\\1941012818\\QuizApplication\\Images\\physics.jpg");
		Image img4=i9.getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), Image.SCALE_DEFAULT);
		ImageIcon i10=new ImageIcon(img4);
		Border b4=new LineBorder(Color.black,4);
		lblNewLabel_4.setIcon(i10);
		lblNewLabel_4.setBorder(b4);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(953, 240, 160, 165);
		ImageIcon i11=new ImageIcon("C:\\Users\\Hp\\Desktop\\1941012818\\QuizApplication\\Images\\chem.jpg");
		Image img5=i11.getImage().getScaledInstance(lblNewLabel_5.getWidth(), lblNewLabel_5.getHeight(), Image.SCALE_DEFAULT);
		ImageIcon i12=new ImageIcon(img5);
		Border b5=new LineBorder(Color.black,4);
		lblNewLabel_5.setIcon(i12);
		lblNewLabel_5.setBorder(b5);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(1266, 11, 24, 23);
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
		
		JLabel lblNewLabel_7 = new JLabel("Let us know which type of skill test you want to take.");
		lblNewLabel_7.setForeground(new Color(51, 51, 51));
		lblNewLabel_7.setFont(new Font("Cooper Black", Font.PLAIN, 42));
		lblNewLabel_7.setBounds(65, 107, 1181, 100);
		contentPane.add(lblNewLabel_7);
		
		
		JButton btnNewButton = new JButton("ECONOMICS");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setBackground(new Color(102, 51, 102));
		btnNewButton.setBounds(81, 423, 174, 39);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Economics eco=new Economics();
				eco.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("COMPUTER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Computer com=new Computer();
				com.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_1.setForeground(new Color(255, 255, 0));
		btnNewButton_1.setBackground(new Color(102, 51, 102));
		btnNewButton_1.setBounds(297, 423, 174, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("GK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gk gk=new Gk();
				gk.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_2.setForeground(new Color(255, 255, 0));
		btnNewButton_2.setBackground(new Color(102, 51, 102));
		btnNewButton_2.setBounds(513, 423, 174, 39);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PHYSICS");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Physics phy=new Physics();
				phy.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_3.setForeground(new Color(255, 255, 0));
		btnNewButton_3.setBackground(new Color(102, 51, 102));
		btnNewButton_3.setBounds(728, 423, 174, 39);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("CHEMISTRY");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chemistry che=new Chemistry();
				che.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_4.setForeground(new Color(255, 255, 0));
		btnNewButton_4.setBackground(new Color(102, 51, 102));
		btnNewButton_4.setBounds(953, 423, 160, 39);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("PREVIOUS");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(new Color(0, 0, 255));
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_5.setBounds(1039, 525, 167, 47);
		Border b6=new LineBorder(Color.black,1);
		btnNewButton_5.setBorder(b6);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rules r=new Rules("");
				r.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(37, 63, 1280, 656);
		ImageIcon i1=new ImageIcon("C:\\Users\\Hp\\Desktop\\1941012818\\QuizApplication\\Images\\subjects.jpg");
		Image img=i1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(img);
		lblNewLabel.setIcon(i2);
		contentPane.add(lblNewLabel);
		
	}
}
