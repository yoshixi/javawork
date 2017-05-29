//15D8102011G Yoshikii Masubuchi 増渕　佳輝　2017/04/14

import java.awt.*;

public class Circle {	private int x;
	private int y;
	
	public Circle(int x,int y){		this.x = x;
		this.y = y;	}
	public void draw(Graphics g){		g.setColor(Color.red);
		g.drawOval(x,y,50,10);	}}
