import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Start
{
	public static void main(String []args)
	{
		GamePage g=new GamePage();
		g.setVisible(true);
		
		g.run();
		g.initialColor();
	}
}