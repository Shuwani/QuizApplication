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

public class Chemistry extends JFrame {

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
					Chemistry frame = new Chemistry();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Chemistry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 0, 1300, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHEMISTRY QUIZ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 70));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setBounds(326, 70, 643, 106);		
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
		
		q[0][0] = "Which of the following is not a common method used for purification?";
        q[0][1] = "Sublimation";
        q[0][2] = "Electrolysis";
        q[0][3] = "Crystallisation";
        q[0][4] = "Chromatography";

        q[1][0] = "The bond angles in sp3d2 hybridisation is _____";
        q[1][1] = "0 degree";
        q[1][2] = "120 degree";
        q[1][3] = "180 degree";
        q[1][4] = "90 degree";

        q[2][0] = "Based on the important category, concrete and fibre glass are the examples of ______";
        q[2][1] = "Sand";
        q[2][2] = "Ceramics";
        q[2][3] = "Composites";
        q[2][4] = "Polymers";

        q[3][0] = "The filling of molecular orbital takes place according to ________";
        q[3][1] = "The Aufbau Principle";
        q[3][2] = "Pauli Exclusion Principle";
        q[3][3] = "Hund’s rule of maximum multiplicity";
        q[3][4] = "All of the mentioned";

        q[4][0] = "Which type of compounds cannot exhibit geometrical isomerism?";
        q[4][1] = "Singly Bonded";
        q[4][2] = "Triply Bonded";
        q[4][3] = "Doubly Bonded";
        q[4][4] = "Cyclic compounds";

        q[5][0] = "For any given substance, the amount of rotation does not depends upon _______";
        q[5][1] = "Pressure";
        q[5][2] = "Temperature";
        q[5][3] = "Nature of the solvent";
        q[5][4] = "Wavelength of light used";

        q[6][0] = "Which of the following is not an example of chiral object?";
        q[6][1] = "Cylindrical helix";
        q[6][2] = "Glove";
        q[6][3] = "Square box";
        q[6][4] = "Elliptical";

        q[7][0] = "Which of the following is not an aerospace material?";
        q[7][1] = "Aluminium alloys";
        q[7][2] = "Plastics";
        q[7][3] = "Silica";
        q[7][4] = "Polymers";

        q[8][0] = "Shape of PCl5 molecule is _________";
        q[8][1] = "Tigonal Planar";
        q[8][2] = "Trigonal bipyramidal";
        q[8][3] = "Linear";
        q[8][4] = "Tetrahedral";

        q[9][0] = "Which of the following is known as mother liquor?";
        q[9][1] = "Filtrate";
        q[9][2] = "Solution";
        q[9][3] = "Solute";
        q[9][4] = "Solvent";
        
        correct[0][1] = "Electrolysis";
        correct[1][1] = "90 degree";
        correct[2][1] = "Composites";
        correct[3][1] = "All of the mentioned";
        correct[4][1] = "Triply Bonded";
        correct[5][1] = "Pressure";
        correct[6][1] = "Square box";
        correct[7][1] = "Polymers";
        correct[8][1] = "Trigonal bipyramidal";
        correct[9][1] = "Filtrate";
        
        hint[0][1] = "Components are electrode, electrolyte and power source.";
        hint[1][1] = "All angles are equal in sp3d2 hybridisation'";
        hint[2][1] = "Combination of two materials with different physical and chemical properties.";
        hint[3][1] = "Molecular orbitals are filled in order of increasing energy.";
        hint[4][1] = "Molecules which are linear.";
        hint[5][1] = "Comes from gases.";
        hint[6][1] = "It gives super-imposable mirror images.";
        hint[7][1] = "Substance or material consisting of very large molecules, composed of many repeating subunits";
        hint[8][1] = "Bond angle equal to 120 degree and 90 degree.";
        hint[9][1] = "Clear liquid which passes through the filter paper.";
		
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
		rdbtnNewRadioButton_2.setBounds(127, 415, 552, 34);
		contentPane.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setBounds(127, 475, 552, 34);
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
