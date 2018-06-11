import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame implements MouseListener,ActionListener
{
	private JLabel yourScore;
	private JButton playAgain,exit;
	private JPanel p;

	public Result(int score,GamePage g)
	{
		super("Result");
		this.setSize(1200,675);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p=new JPanel();
		p.setBackground(Color.lightGray);
		p.setLayout(null);

		yourScore=new JLabel("Your Score :"+score);
		yourScore.setForeground(Color.RED.darker());
		yourScore.setFont(new Font("TimesRoman",Font.BOLD,30));
		yourScore.setBounds(470,50,700,50);		
		p.add(yourScore);	
		
		exit=new JButton("EXIT");
		exit.setBackground(Color.RED.darker());
		exit.setOpaque(true);
		exit.setForeground(Color.white);
		exit.setFont(new Font("TimesRoman",Font.BOLD,26));
		exit.setBounds(630,200,200,60);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		p.add(exit);

		playAgain=new JButton("Play Again");
		playAgain.setBackground(Color.GREEN.darker());
		playAgain.setOpaque(true);
		playAgain.setForeground(Color.white);
		playAgain.setFont(new Font("TimesRoman",Font.BOLD,26));
		playAgain.setBounds(320,200,200,60);
		playAgain.addMouseListener(this);
		playAgain.addActionListener(this);
		p.add(playAgain);		
		
		this.add(p);
	}
	public void mouseEntered(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		String elementText=ae.getActionCommand();
		if(elementText.equals(playAgain.getText()))
		{

		}
		else if(elementText.equals(exit.getText()))
		{
			System.exit(0);
		}
	}
}