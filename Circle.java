//15D8102011G Yoshikii Masubuchi 増渕　佳輝　2017/04/14

import java.awt.*;

public class Circle {
	private int y;
	
	public Circle(int x,int y){
		this.y = y;
	public void draw(Graphics g){
		g.drawOval(x,y,50,10);