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

public class Computer extends JFrame {

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
					Computer frame = new Computer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Computer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 0, 1300, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COMPUTER QUIZ");
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
		
		q[0][0] = "What is the difference between Queue and Stack?";
        q[0][1] = "Stack is FIFO, Queue is LIFO";
        q[0][2] = "Stack is LIFO, Queue is FIFO";
        q[0][3] = "Stack and Queue is FIFO";
        q[0][4] = "Stack and Queue is LIFO";

        q[1][0] = "What is the correct method used to insert and delete items from the queue?";
        q[1][1] = "push and pop";
        q[1][2] = "add and remove";
        q[1][3] = "push and peek";
        q[1][4] = "enqueue and dequeue";

        q[2][0] = "Which data structure is used in Breadth First Traversal of a graph?";
        q[2][1] = "Stack";
        q[2][2] = "Array";
        q[2][3] = "Queue";
        q[2][4] = "Tree";

        q[3][0] = "Which of the following can be operands of arithmetic operators?";
        q[3][1] = "Numeric";
        q[3][2] = "Boolean";
        q[3][3] = "Characters";
        q[3][4] = "Both Numeric & Characters";

        q[4][0] = "Which of the following is not OOPS concept in Java?";
        q[4][1] = "Inheritance";
        q[4][2] = "Encapsulation";
        q[4][3] = "Polymorphism";
        q[4][4] = "Compilation";

        q[5][0] = "When does method overloading is determined?";
        q[5][1] = "At compile time";
        q[5][2] = "At execution time";
        q[5][3] = "At run time";
        q[5][4] = "At coding time";

        q[6][0] = "What is it called where child object gets killed if parent object is killed?";
        q[6][1] = "Encapsulation";
        q[6][2] = "Composition";
        q[6][3] = "Aggregation";
        q[6][4] = "Association";

        q[7][0] = "Which of the following is a valid declaration of an object of class Box?";
        q[7][1] = "obj = new Box()";
        q[7][2] = "new Box obj";
        q[7][3] = "Box obj = new Box";
        q[7][4] = "Box obj = new Box()";

        q[8][0] = "Which of these operators is used to allocate memory for an object?";
        q[8][1] = "alloc";
        q[8][2] = "new";
        q[8][3] = "malloc";
        q[8][4] = "give";

        q[9][0] = "What is false about constructor?";
        q[9][1] = "Constructor can have a return type";
        q[9][2] = "'this' and 'super' can be used in a constructor";
        q[9][3] = "Java does not provide default copy constructor";
        q[9][4] = " Constructors cannot be synchronized in Java";
        
        correct[0][1] = "Stack is LIFO, Queue is FIFO";
        correct[1][1] = "enqueue and dequeue";
        correct[2][1] = "Queue";
        correct[3][1] = "Both Numeric & Characters";
        correct[4][1] = "Compilation";
        correct[5][1] = "At compile time";
        correct[6][1] = "Aggregation";
        correct[7][1] = "Box obj = new Box()";
        correct[8][1] = "new";
        correct[9][1] = "Constructor can have a return type";
        
        hint[0][1] = "Hint is not available in computer quiz.";
        hint[1][1] = "Hint is not available in computer quiz.";
        hint[2][1] = "Hint is not available in computer quiz.";
        hint[3][1] = "Hint is not available in computer quiz.";
        hint[4][1] = "Hint is not available in computer quiz.";
        hint[5][1] = "Hint is not available in computer quiz.";
        hint[6][1] = "Hint is not available in computer quiz.";
        hint[7][1] = "Hint is not available in computer quiz.";
        hint[8][1] = "Hint is not available in computer quiz.";
        hint[9][1] = "Hint is not available in computer quiz.";
		
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
