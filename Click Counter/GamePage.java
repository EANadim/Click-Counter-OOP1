import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class GamePage extends JFrame implements MouseListener,ActionListener,Runnable
{
	private JPanel panel;
	private JLabel scoreBoard,copyRight;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,exit,button;
	private int l1=0,l2=0,l3=0,l4=0,l5=0,l6=0,l7=0,l8=0,score=0;
		
	public GamePage()
	{
		super("Game Page");
		this.setSize(1200,675);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setLayout(null);
		
		b1=new JButton("Button 1");
		b1.setBackground(Color.blue.darker());
		b1.setOpaque(true);
		b1.setFont(new Font("TimesRoman",Font.BOLD,26));
		b1.setBounds(50,200,200,130);
		b1.setForeground(Color.white);
		b1.addMouseListener(this);
		b1.addActionListener(this);
		panel.add(b1);
		
		b2=new JButton("Button 2");
		b2.setBackground(Color.blue.darker());
		b2.setOpaque(true);
		b2.setFont(new Font("TimesRoman",Font.BOLD,26));
		b2.setBounds(300,200,200,130);
		b2.setForeground(Color.white);
		b2.addMouseListener(this);
		b2.addActionListener(this);
		panel.add(b2);
		
		b3=new JButton("Button 3");
		b3.setOpaque(true);
		b3.setBackground(Color.blue.darker());
		b3.setFont(new Font("TimesRoman",Font.BOLD,26));
		b3.setBounds(550,200,200,130);
		b3.setForeground(Color.white);
		b3.addMouseListener(this);
		b3.addActionListener(this);
		panel.add(b3);
		
		b4=new JButton("Button 4");
		b4.setOpaque(true);
		b4.setBackground(Color.blue.darker());
		b4.setFont(new Font("TimesRoman",Font.BOLD,26));
		b4.setBounds(800,200,200,130);
		b4.setForeground(Color.white);
		b4.addMouseListener(this);
		b4.addActionListener(this);
		panel.add(b4);
		
		b5=new JButton("Button 5");
		b5.setOpaque(true);
		b5.setBackground(Color.blue.darker());
		b5.setFont(new Font("TimesRoman",Font.BOLD,26));
		b5.setForeground(Color.white);
		b5.setBounds(50,350,200,130);
		b5.addMouseListener(this);
		b5.addActionListener(this);
		panel.add(b5);
		
		b6=new JButton("Button 6");
		b6.setOpaque(true);
		b6.setBackground(Color.blue.darker());
		b6.setFont(new Font("TimesRoman",Font.BOLD,26));
		b6.setForeground(Color.white);
		b6.setBounds(300,350,200,130);
		b6.addMouseListener(this);
		b6.addActionListener(this);
		panel.add(b6);
		
		b7=new JButton("Button 7");
		b7.setOpaque(true);
		b7.setBackground(Color.blue.darker());
		b7.setFont(new Font("TimesRoman",Font.BOLD,26));
		b7.setBounds(550,350,200,130);
		b7.setForeground(Color.white);
		b7.addMouseListener(this);
		b7.addActionListener(this);
		panel.add(b7);
		
		b8=new JButton("Button 8");
		b8.setOpaque(true);
		b8.setBackground(Color.blue.darker());
		b8.setFont(new Font("TimesRoman",Font.BOLD,26));
		b8.setBounds(800,350,200,130);
		b8.setForeground(Color.white);
		b8.addMouseListener(this);
		b8.addActionListener(this);
		panel.add(b8);
		
		copyRight=new JLabel("\u00a9"+"2017 Ehtesham Ahmad Nadim All right reserved");
		copyRight.setFont(new Font("Cambria",Font.ITALIC+Font.BOLD,11));
		copyRight.setBounds(700,550,400,40);
		panel.add(copyRight);	

		scoreBoard=new JLabel("Score :"+score);
		scoreBoard.setForeground(Color.RED.darker());
		scoreBoard.setFont(new Font("TimesRoman",Font.BOLD,30));
		scoreBoard.setBounds(900,50,300,50);		
		panel.add(scoreBoard);
		
		exit=new JButton("EXIT");
		exit.setBackground(Color.YELLOW.darker());
		exit.setFont(new Font("TimesRoman",Font.BOLD,26));
		exit.setBounds(950,550,200,60);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);
		
	/*  button=new JButton("Start");
		button.setBackground(Color.GREEN);
		button.setFont(new Font("TimesRoman",Font.BOLD,26));
		button.setBounds(100,50,200,60);
		button.addMouseListener(this);
		button.addActionListener(this);
		panel.add(button); */
		
		
		this.add(panel);
	}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae)
	{
		String elementText=ae.getActionCommand();
		if(elementText.equals(b1.getText()))
		{
			if(l1==1)
			{
				score=score+5;
			}
			else if(l1==0)
			{
				score=score-5;
			}
		}
		else if(elementText.equals(b2.getText()))
		{
			if(l2==1)
			{
				score=score+5;
			}
			else if(l2==0)
			{
				score=score-5;
			}
		}
		else if(elementText.equals(b3.getText()))
		{
			if(l3==1)
			{
				score=score+5;
			}
			else if(l3==0)
			{
				score=score-5;
			}
		}
		else if(elementText.equals(b4.getText()))
		{
			if(l4==1)
			{
				score=score+5;
			}
			else if(l4==0)
			{
				score=score-5;
			}
		}
		else if(elementText.equals(b5.getText()))
		{
			if(l5==1)
			{
				score=score+5;
			}
			else if(l5==0)
			{
				score=score-5;
			}
		}
		else if(elementText.equals(b6.getText()))
		{
			if(l6==1)
			{
				score=score+5;
			}
			else if(l6==0)
			{
				score=score-5;
			}
		}
		else if(elementText.equals(b7.getText()))
		{
			if(l7==1)
			{
				score=score+5;
			}
			else if(l7==0)
			{
				score=score-5;
			}
		}
		else if(elementText.equals(b8.getText()))
		{
			if(l8==1)
			{
				score=score+5;
			}
			else if(l8==0)
			{
				score=score-5;
			}
		}
		else if(elementText.equals(exit.getText()))
		{
			System.exit(0);
		}
		else{}
		l1=0;l2=0;l3=0;l4=0;l5=0;l6=0;l7=0;l8=0;
		if(score<0){score=0;}
		scoreBoard.setText("Score :"+score);
		panel.add(scoreBoard);
	}
	public void run()
	{
		int x,i;
		Random rn=new Random();
		for(i=0;i<20;i++)
		{
			x=rn.nextInt(8);
			if(x==0)
			{
				b1.setBackground(Color.YELLOW.darker());
				b2.setBackground(Color.BLUE.darker());
				b3.setBackground(Color.BLUE.darker());
				b4.setBackground(Color.BLUE.darker());
				b5.setBackground(Color.BLUE.darker());
				b6.setBackground(Color.BLUE.darker());
				b7.setBackground(Color.BLUE.darker());
				b8.setBackground(Color.BLUE.darker());
				l1=1;l2=0;l3=0;l4=0;l5=0;l6=0;l7=0;l8=0;
			}
			else if(x==1)
			{
				b1.setBackground(Color.BLUE.darker());
				b2.setBackground(Color.YELLOW.darker());
				b3.setBackground(Color.BLUE.darker());
				b4.setBackground(Color.BLUE.darker());
				b5.setBackground(Color.BLUE.darker());
				b6.setBackground(Color.BLUE.darker());
				b7.setBackground(Color.BLUE.darker());
				b8.setBackground(Color.BLUE.darker());
				l1=0;l2=1;l3=0;l4=0;l5=0;l6=0;l7=0;l8=0;
			}
			else if(x==2)
			{
				b1.setBackground(Color.BLUE.darker());
				b2.setBackground(Color.BLUE.darker());
				b3.setBackground(Color.YELLOW.darker());
				b4.setBackground(Color.BLUE.darker());
				b5.setBackground(Color.BLUE.darker());
				b6.setBackground(Color.BLUE.darker());
				b7.setBackground(Color.BLUE.darker());
				b8.setBackground(Color.BLUE.darker());
				l1=0;l2=0;l3=1;l4=0;l5=0;l6=0;l7=0;l8=0;
			}
			else if(x==3)
			{
				b1.setBackground(Color.BLUE.darker());
				b2.setBackground(Color.BLUE.darker());
				b3.setBackground(Color.BLUE.darker());
				b4.setBackground(Color.YELLOW.darker());
				b5.setBackground(Color.BLUE.darker());
				b6.setBackground(Color.BLUE.darker());
				b7.setBackground(Color.BLUE.darker());
				b8.setBackground(Color.BLUE.darker());
				l1=0;l2=0;l3=0;l4=1;l5=0;l6=0;l7=0;l8=0;
			}
			else if(x==4)
			{
				b1.setBackground(Color.BLUE.darker());
				b2.setBackground(Color.BLUE.darker());
				b3.setBackground(Color.BLUE.darker());
				b4.setBackground(Color.BLUE.darker());
				b5.setBackground(Color.YELLOW.darker());
				b6.setBackground(Color.BLUE.darker());
				b7.setBackground(Color.BLUE.darker());
				b8.setBackground(Color.BLUE.darker());
				l1=0;l2=0;l3=0;l4=0;l5=1;l6=0;l7=0;l8=0;
			}
			else if(x==5)
			{
				b1.setBackground(Color.BLUE.darker());
				b2.setBackground(Color.BLUE.darker());
				b3.setBackground(Color.BLUE.darker());
				b4.setBackground(Color.BLUE.darker());
				b5.setBackground(Color.BLUE.darker());
				b6.setBackground(Color.YELLOW.darker());
				b7.setBackground(Color.BLUE.darker());
				b8.setBackground(Color.BLUE.darker());
				l1=0;l2=0;l3=0;l4=0;l5=0;l6=1;l7=0;l8=0;
			}
			else if(x==6)
			{
				b1.setBackground(Color.BLUE.darker());
				b2.setBackground(Color.BLUE.darker());
				b3.setBackground(Color.BLUE.darker());
				b4.setBackground(Color.BLUE.darker());
				b5.setBackground(Color.BLUE.darker());
				b6.setBackground(Color.BLUE.darker());
				b7.setBackground(Color.YELLOW.darker());
				b8.setBackground(Color.BLUE.darker());
				l1=0;l2=0;l3=0;l4=0;l5=0;l6=0;l7=1;l8=0;
			}
			else if(x==7)
			{
				b1.setBackground(Color.BLUE.darker());
				b2.setBackground(Color.BLUE.darker());
				b3.setBackground(Color.BLUE.darker());
				b4.setBackground(Color.BLUE.darker());
				b5.setBackground(Color.BLUE.darker());
				b6.setBackground(Color.BLUE.darker());
				b7.setBackground(Color.BLUE.darker());
				b8.setBackground(Color.YELLOW.darker());
				l1=0;l2=0;l3=0;l4=0;l5=0;l6=0;l7=0;l8=1;
			}
			else{}

			try
			{
				Thread.sleep(700);
			}
			catch(Exception e){}
		} 
	}
	public void initialColor()
	{
		b1.setBackground(Color.BLUE);
		b2.setBackground(Color.BLUE);
		b3.setBackground(Color.BLUE);
		b4.setBackground(Color.BLUE);
		b5.setBackground(Color.BLUE);
		b6.setBackground(Color.BLUE);
		b7.setBackground(Color.BLUE);
		b8.setBackground(Color.BLUE);
		l1=0;l2=0;l3=0;l4=0;l5=0;l6=0;l7=0;l8=0;
		
		Result r=new Result(score,this);
		r.setVisible(true);
		this.setVisible(false);
	}
}