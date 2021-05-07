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

public class Economics extends JFrame {

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
					Economics frame = new Economics();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Economics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 0, 1300, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ECONOMICS QUIZ");
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
		
		q[0][0] = "Market value of all goods and services produced within a country in a given period of time is";
        q[0][1] = "GNP";
        q[0][2] = "GDP";
        q[0][3] = "NDP";
        q[0][4] = "MNP";

        q[1][0] = "Comparative advantage is based on";
        q[1][1] = "dollar price";
        q[1][2] = "capital cost";
        q[1][3] = "labor cost";
        q[1][4] = "opportunity cost";

        q[2][0] = "Formula of Net Export";
        q[2][1] = "X";
        q[2][2] = "M-X";
        q[2][3] = "X-M";
        q[2][4] = "M";

        q[3][0] = "What is difference between goods and services";
        q[3][1] = "Both goods and services are intangible";
        q[3][2] = "Both goods and services are tangible";
        q[3][3] = "Goods are intangible, Services are tangible";
        q[3][4] = "Goods are tangible, Services are intangible";

        q[4][0] = "What is not contributed to GDP?";
        q[4][1] = "Final goods";
        q[4][2] = "Intermediate goods";
        q[4][3] = "Both the above";
        q[4][4] = "None of these";

        q[5][0] = "Income given to foreigner in India is greater than income given to indian in abroad means";
        q[5][1] = "GDP>GNP";
        q[5][2] = "GNP>GDP";
        q[5][3] = "GDP=GNP";
        q[5][4] = "NDP=MNP";

        q[6][0] = "Total income earned by nation's permanent residents is known as";
        q[6][1] = "NDP";
        q[6][2] = "GDP";
        q[6][3] = "GNP";
        q[6][4] = "MNP";

        q[7][0] = "What of the following is not included in income approach for measuring national income?";
        q[7][1] = "Profit";
        q[7][2] = "Wage";
        q[7][3] = "Interest";
        q[7][4] = "Food";

        q[8][0] = "GDP computed on basis of current year prices is";
        q[8][1] = "Real GDP";
        q[8][2] = "Nominal GDP";
        q[8][3] = "Both";
        q[8][4] = "None of these";

        q[9][0] = "Which one of the following is not the sector of economy.";
        q[9][1] = "Park Sector";
        q[9][2] = "Household Sector";
        q[9][3] = "Financial Sector";
        q[9][4] = "Foreign Sector";
        
        correct[0][1] = "GDP";
        correct[1][1] = "opportunity cost.";
        correct[2][1] = "X-M.";
        correct[3][1] = "Goods are tangible, Services are intangible.";
        correct[4][1] = "Intermediate goods.";
        correct[5][1] = "GDP>GNP";
        correct[6][1] = "GDP+Net Factor income from abroad.";
        correct[7][1] = "Sum of income of factors of production.";
        correct[8][1] = "Measures GDP without adjusting inflation.";
        correct[9][1] = "Sector comprises construction, manufacturing, and processing.";
        
        hint[0][1] = "Formula is C+I+G+NX.";
        hint[1][1] = "The next best alternative.";
        hint[2][1] = "Export and Import both are used to calculate Net Export.";
        hint[3][1] = "We can see goods, but can't see services.";
        hint[4][1] = "Semi-finished products.";
        hint[5][1] = "Domestic is more than national.";
        hint[6][1] = "It gives super-imposable mirror images.";
        hint[7][1] = "Substance or material consisting of very large molecules, or macromolecules, composed of many repeating subunits";
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
