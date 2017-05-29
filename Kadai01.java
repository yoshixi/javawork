//15D8102011G Yoshikii Masubuchi 増渕　佳輝　2017/04/14

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Kadai01 extends JFrame {	private SamplePanel sp;
	
	public static void main(String[] args){		Kadai01 sm = new Kadai01();	}
	public Kadai01() {		super("Kadai01");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		sp = new SamplePanel();
		add(sp, BorderLayout.CENTER);
		setVisible(true);	}
	public class SamplePanel extends JPanel {		private ArrayList<Circle> circlelist = new ArrayList<Circle>();
		
		public SamplePanel(){			addMouseListener(new SampleMouseListener());		}
		public void  paintComponent(Graphics g){			super.paintComponent(g);
			Iterator<Circle> it = circlelist.iterator();
			while(it.hasNext()){				Circle c = it.next();
				c.draw(g);			}		}
		public	class SampleMouseListener extends MouseAdapter{			public void mousePressed(MouseEvent e){				circlelist.add(new Circle(e.getX(), e.getY()));
				repaint();			}		}	}}
