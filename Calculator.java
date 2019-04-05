import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator extends JFrame 
{

	private JPanel contentPane;
	private JTextField txtDisplay;
	
	String operations;
	String answer;
	double firstnum;
	double secondnum;
	double result;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() 
	{
		
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 425);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDisplay.setBounds(10, 11, 248, 46);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnBS = new JButton("\uF0D5");
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				if(txtDisplay.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace=strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBS.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnBS.setBounds(10, 69, 60, 60);
		contentPane.add(btnBS);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(73, 68, 60, 60);
		contentPane.add(btnC);
		
		JButton button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="%";
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(136, 68, 60, 60);
		contentPane.add(button_1);
		
		JButton btnADD = new JButton("+");
		btnADD.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
		});
		btnADD.setBounds(197, 68, 60, 60);
		contentPane.add(btnADD);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 133, 60, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(73, 133, 60, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(136, 133, 60, 60);
		contentPane.add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(197, 133, 60, 60);
		contentPane.add(btnSub);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 204, 60, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(73, 204, 60, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(136, 204, 60, 60);
		contentPane.add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBounds(198, 204, 60, 60);
		contentPane.add(btnMul);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 264, 60, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(73, 264, 60, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(136, 264, 60, 60);
		contentPane.add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(198, 264, 60, 60);
		contentPane.add(btnDiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 326, 60, 60);
		contentPane.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! txtDisplay.getText().contains("."))
				{
					txtDisplay.setText(txtDisplay.getText() + btnDot.getText());
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(73, 326, 60, 60);
		contentPane.add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=ops*(-1);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(136, 326, 60, 60);
		contentPane.add(btnPM);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondnum=Double.parseDouble(txtDisplay.getText());
				
				if(operations=="+")
				{
					result=firstnum + secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="-")
				{
					result=firstnum - secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="*")
				{
					result=firstnum * secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="/")
				{
					result=firstnum / secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="%")
				{
					result=firstnum % secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEquals.setBounds(198, 325, 60, 60);
		contentPane.add(btnEquals);
	}
}
