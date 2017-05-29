//15D8102011G Yoshikii Masubuchi 増渕　佳輝　2017/04/14

import java.awt.*;

public class RedCircle {	private int x;
	private int y;
	
	public RedCircle(int x,int y){		this.x = x;
		this.y = y;	}
	public void draw(Graphics g){		g.setColor(Color.red);
		g.drawOval(x,y,50,50);
		g.drawOval(x + 5,y + 5,40,40);	}}
