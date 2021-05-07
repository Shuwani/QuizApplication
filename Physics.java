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

public class Physics extends JFrame {

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
					Physics frame = new Physics();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Physics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 0, 1300, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PHYSICS QUIZ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 70));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setBounds(364, 70, 643, 106);		
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
		lblNewLabel_3.setBounds(262, 567, 1013, 36);
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
		
		q[0][0] = "For a body moving in a circular path, the work done by the centripetal force is  _______.";
        q[0][1] = "Positive";
        q[0][2] = "Zero";
        q[0][3] = "Negative";
        q[0][4] = "Constant";

        q[1][0] = "A bullet fired from a gun can pierce a target due to its  _________?";
        q[1][1] = "Potential enery";
        q[1][2] = "Mechanical energy";
        q[1][3] = "Heat energy";
        q[1][4] = "Kinetic energy";

        q[2][0] = "The shape of the fringes observed in interference is ________.";
        q[2][1] = "Straight";
        q[2][2] = "Circular";
        q[2][3] = "Hyperbolic";
        q[2][4] = "Elliptical";

        q[3][0] = "The motion of a rocket is based on the principle of conservation of  ___________?";
        q[3][1] = "Angular Momentum";
        q[3][2] = "Mechanical Energy";
        q[3][3] = "Kinetic energy";
        q[3][4] = "Linear Momentum";

        q[4][0] = "If the length of a simple pendulum is increased by 2%, then the time period ________?";
        q[4][1] = "Decreases by 1%";
        q[4][2] = "Increases by 1%";
        q[4][3] = "Increases by 2%";
        q[4][4] = "Increases by 2%";

        q[5][0] = "When a body slides against a rough horizontal surface, the work done by friction is  __________?";
        q[5][1] = "Negative";
        q[5][2] = "Constant";
        q[5][3] = "Zero";
        q[5][4] = "Positive";

        q[6][0] = "When Two waves of same amplitude add constructively, the intensity becomes ________?";
        q[6][1] = "Double";
        q[6][2] = "Half";
        q[6][3] = "Four Times";
        q[6][4] = "One-Fourth";

        q[7][0] = "The main principle used in Interference is _______.";
        q[7][1] = "Heisenberg’s Uncertainty Principle";
        q[7][2] = "Quantum Mechanics";
        q[7][3] = "Fermi Principle";
        q[7][4] = "Superposition Principle";

        q[8][0] = "The velocity of light in water is 2.2 X 10^8 m/s. What is the polarizing angle of incidence?";
        q[8][1] = "47.23";
        q[8][2] = "53.74";
        q[8][3] = "51.02";
        q[8][4] = "65.36";

        q[9][0] = "Which of the following is a uniaxial crystal?";
        q[9][1] = "Quartz";
        q[9][2] = "Mica";
        q[9][3] = "Borax";
        q[9][4] = "Selenite";
        
        correct[0][1] = "Zero";
        correct[1][1] = "Kinetic energy";
        correct[2][1] = "Hyperbolic";
        correct[3][1] = "Linear Momentum";
        correct[4][1] = "Increases by 1%";
        correct[5][1] = "Negative";
        correct[6][1] = "Four times";
        correct[7][1] = "Superposition Principle";
        correct[8][1] = "53.74";
        correct[9][1] = "Quartz";
        
        hint[0][1] = "Here centipetal force and displacement are perpendicular to each other.";
        hint[1][1] = "Property of a moving object or particle and depends not only on its motion but also on its mass.";
        hint[2][1] = "Curves that are like infinite bows.";
        hint[3][1] = "Product of a system's mass multiplied by its velocity.";
        hint[4][1] = "Time period is directly proportional to square root of length.";
        hint[5][1] = "It's displacement is opposite to that of the force of friction.";
        hint[6][1] = "Intensity is directly proportional to square of amplitude.";
        hint[7][1] = "When two or more waves overlap in space.";
        hint[8][1] = "Brewster’s Law.";
        hint[9][1] = "Those crystals in which there is only one optic axis. .";
		
		rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(127, 308, 552, 34);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(127, 362, 552, 34);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setBounds(127, 419, 552, 34);
		contentPane.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setBounds(127, 477, 552, 34);
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
		setUndecorated(true);
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
