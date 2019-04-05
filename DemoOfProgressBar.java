import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class DemoOfProgressBar extends JFrame
{
	JProgressBar bar;
	int i=0;
	
	public DemoOfProgressBar(String title)
	{
		JButton text=new JButton("<html><font color='blue' size='30'><i>Thankyou Abhishek sir for your support..<br><b><br></i><center>CALCULATOR<br><br><i>Made by :- Suraj Kumar</font></html>");
		setSize(500,400);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		bar=new JProgressBar(0,1000);
		bar.setStringPainted(true);
		bar.setForeground(Color.green);
		setUndecorated(true);
		bar.setValue(0);
		add(text);
		add(BorderLayout.SOUTH,bar);
	}
		void setvalue()
		{
			while(i<=1000)
			{
				bar.setValue(i);
				i=i+10;
				try
				{
					Thread.sleep(40);
				}
				catch(Exception e)
				{
					
				}
			}
			dispose();
			Calculator obj=new Calculator();
			obj.setVisible(true);
			
		}
		public static void main(String[] args) 
		{
			
			DemoOfProgressBar obj=new DemoOfProgressBar("Calculator");
			
			try
			{
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			obj.setVisible(true);
			obj.setvalue();
		}
}
