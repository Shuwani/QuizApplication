import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;

public class Gk extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_6;
	JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3 ;
	JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_1,rdbtnNewRadioButton_2,rdbtnNewRadioButton_3;
	ButtonGroup options;
	String name;
	String q[][]=new String[10][5];// 10 rows and 5 column
	String ansuser[][] = new String[10][1];
	String hint[][] = new String[10][2];
	String correct[][] = new String[10][2];
	public static int count=0;
	public static int timer=30;
	public static int answer=0;
	public static int score=0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gk frame = new Gk();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Gk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 0, 1300, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GENERAL KNOWLEDGE QUIZ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 70));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setBounds(110, 53, 1071, 104);		
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(48, 238, 44, 25);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(99, 238, 982, 30);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(262, 567, 597, 36);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(1228, 38, 24, 23);
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
		
		q[0][0] = "The mountain Great Dividing Range is located in?";
        q[0][1] = "India";
        q[0][2] = "Australia";
        q[0][3] = "New Zealand";
        q[0][4] = "South Africa";

        q[1][0] = "Which among the following is known as ‘Gift of the Nile'?";
        q[1][1] = "Rome";
        q[1][2] = "Greek";
        q[1][3] = "Tunisia";
        q[1][4] = "Egypt";

        q[2][0] = "Which among the following is the nearest to earth planet?";
        q[2][1] = "Mars";
        q[2][2] = "Mercury";
        q[2][3] = "Venus";
        q[2][4] = "Saturn";

        q[3][0] = "Who was the first speaker of Lok Sabha.";
        q[3][1] = "Lal Bahadur Sashtri";
        q[3][2] = "S Radhakrishnan";
        q[3][3] = "Jawaharlal Nehru";
        q[3][4] = "GV Mavlankar";

        q[4][0] = "Where is the headquarters of Amnesty International located?";
        q[4][1] = "Jakarta";
        q[4][2] = "London";
        q[4][3] = "New Jersey";
        q[4][4] = "Thailand";

        q[5][0] = "The term ‘ace’ is related to?";
        q[5][1] = "Lawn Tennis";
        q[5][2] = "Basketball";
        q[5][3] = "Polo";
        q[5][4] = "Golf";

        q[6][0] = "Which among the following is the lowest atmospheric layer?";
        q[6][1] = "Thermosphere";
        q[6][2] = "Mesosphere";
        q[6][3] = "Troposphere";
        q[6][4] = "Stratosphere";

        q[7][0] = "Which among the following is the largest mosque in the world?";
        q[7][1] = "Moscow Cathedral Mosque";
        q[7][2] = "Al-Masjid al-Nabawi";
        q[7][3] = "Jama Masjid";
        q[7][4] = "Masjid al-Haram";

        q[8][0] = "Which among the following is popular as Land of White Elephant?";
        q[8][1] = "Norway";
        q[8][2] = "Thailand";
        q[8][3] = "Japan";
        q[8][4] = "South Africa";

        q[9][0] = "Where is the High Altitude Research Laboratory located?";
        q[9][1] = "Gulbarga";
        q[9][2] = "Jodhpur";
        q[9][3] = "Mumbai";
        q[9][4] = "Karnatka";
        
        correct[0][1] = "Australia";
        correct[1][1] = "Egypt";
        correct[2][1] = "Venus";
        correct[3][1] = "GV Mavlankar";
        correct[4][1] = "London";
        correct[5][1] = "Lawn Tennis";
        correct[6][1] = "Troposphere";
        correct[7][1] = "Masjid al-Haram";
        correct[8][1] = "Thailand";
        correct[9][1] = "Gulbarga";
        
        hint[0][1] = "Famous for Bondi Beach.";
        hint[1][1] = "Derived from Ancient Greek 'Aigyptos.'";
        hint[2][1] = "Named after the Roman goddess of love and beauty.";
        hint[3][1] = "Popularly known as Dadasaheb.";
        hint[4][1] = "Capital of England and UK.";
        hint[5][1] = "Played with rackets on grass.";
        hint[6][1] = "Many type of clouds are found here.";
        hint[7][1] = "Great Mosque of Mecca.";
        hint[8][1] = "Capital is Bangkok.";
        hint[9][1] = "Officially known as Kalaburagi.";
		
		rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(127, 308, 552, 34);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(127, 359, 552, 34);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setBounds(127, 410, 552, 34);
		contentPane.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setBounds(127, 465, 552, 34);
		contentPane.add(rdbtnNewRadioButton_3);
		
		options=new ButtonGroup();
		options.add(rdbtnNewRadioButton);
		options.add(rdbtnNewRadioButton_1);
		options.add(rdbtnNewRadioButton_2);
		options.add(rdbtnNewRadioButton_3);
		
		//BUTTON 1
		btnNewButton = new JButton("NEXT>");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(1043, 372, 138, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
				rdbtnNewRadioButton.setEnabled(true);
				rdbtnNewRadioButton_1.setEnabled(true);
				rdbtnNewRadioButton_2.setEnabled(true);
				rdbtnNewRadioButton_3.setEnabled(true);
				answer=1;
				if(options.getSelection()==null) {
					ansuser[count][0]="";
				}
				else {
					ansuser[count][0]=options.getSelection().getActionCommand();
				}
				if(count==8) {
	        		btnNewButton.setEnabled(false);
	        		btnNewButton_2.setEnabled(true);
	        	}
				lblNewLabel_3.setText("");
				count++;
				start(count);
			}
		});
		contentPane.add(btnNewButton);
		
		//BUTTON 2
		btnNewButton_1 = new JButton("50-50 LIFELINE");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setBounds(1043, 446, 138, 34);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==1||count==3||count==5||count==7||count==9) {
					rdbtnNewRadioButton_1.setEnabled(false);
					rdbtnNewRadioButton_2.setEnabled(false);
				}
				else {
					rdbtnNewRadioButton.setEnabled(false);
					rdbtnNewRadioButton_3.setEnabled(false);
				}
				btnNewButton_1.setEnabled(false);					
				}
		});
		contentPane.add(btnNewButton_1);
		
		//BUTTON 3
		btnNewButton_2 = new JButton("SUBMIT");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(1043, 522, 137, 30);
		btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==btnNewButton_2) {
				if(options.getSelection()==null) {
				ansuser[count][0]="";
			}
			else {
				ansuser[count][0]=options.getSelection().getActionCommand();
			}
			for(int i=0;i<ansuser.length;i++) {
				if(ansuser[i][0].equals(correct[i][1])) {
					score+=10;
				}
				else {
					score+=0;
				}
			}
			Score s=new Score(score);
			s.setVisible(true);
			dispose();
			}
	}
		});
		contentPane.add(btnNewButton_2);
		start(0);
		
		//BUTTON 4
		btnNewButton_3 = new JButton("HINT");
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(30, 144, 255));
		btnNewButton_3.setBounds(127, 569, 119, 34);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_3.setText(hint[count][1]);
				start(count);
			}
		});
		contentPane.add(btnNewButton_3);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		String time = "Time Left - " + timer + " seconds"; 
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 25));
       
        if(timer > 0) {
            g.drawString(time, 960, 320);  //display time
        }
        else {
            g.drawString("Times Up!!", 1038, 320);
        }
        timer--; 
        
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        if(answer==1) {
        	answer=0;
        	timer=30;
        }
        else if(timer<0) {
        	timer=30;
        	rdbtnNewRadioButton.setEnabled(true);
			rdbtnNewRadioButton_1.setEnabled(true);
			rdbtnNewRadioButton_2.setEnabled(true);
			rdbtnNewRadioButton_3.setEnabled(true);
        	
        	if(count==8) {
        		btnNewButton.setEnabled(false);
        		btnNewButton_2.setEnabled(true);
        	}
        	if(count==9) {
        		if(options.getSelection() == null){
                    ansuser[count][0] = "";
                }
        		else {
                    ansuser[count][0] = options.getSelection().getActionCommand();
                }
        		
        		for(int i=0;i<ansuser.length;i++) {
        			if(ansuser[i][0].equals(correct[i][1])) {
        				score+=10;
        			}
        			else {
        				score+=0;
        			}
        		}
        		Score s=new Score(score);
				s.setVisible(true);
				dispose();
        	}
        	else {
        		if(options.getSelection() == null){
                    ansuser[count][0] = "";
                }
        		else {
                    ansuser[count][0] = options.getSelection().getActionCommand();
                }
        		count++;
        		start(count);
        	}
        }
	}

	public void start(int count) {
		// TODO Auto-generated method stub
		lblNewLabel_1.setText(""+(count+1)+".");
		lblNewLabel_2.setText(q[count][0]);
		rdbtnNewRadioButton.setLabel(q[count][1]);
		rdbtnNewRadioButton.setActionCommand(q[count][1]);
		rdbtnNewRadioButton_1.setLabel(q[count][2]);
		rdbtnNewRadioButton_1.setActionCommand(q[count][2]);
		rdbtnNewRadioButton_2.setLabel(q[count][3]);
		rdbtnNewRadioButton_2.setActionCommand(q[count][3]);
		rdbtnNewRadioButton_3.setLabel(q[count][4]);
		rdbtnNewRadioButton_3.setActionCommand(q[count][4]);
		options.clearSelection();
	}
}
