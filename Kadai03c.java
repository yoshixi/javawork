//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/28

import java.awt.*;
import javax.swing.*;

public class Kadai03c extends JFrame {  private MyPanel sp;
  public static void main(String[] args) {  	Kadai03c sm = new Kadai03c();
  }
  public Kadai03c(){  	super("Kadai03c");
 	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(1000,500);
	sp = new MyPanel();
	add(sp, BorderLayout.CENTER);
	setVisible(true);  }
  
  public class MyPanel extends JPanel {
		public void  paintComponent(Graphics g){			super.paintComponent(g);
			int x, y_sin, y_cos, y_sum;
			double RD;
			int tan;
			int x_base = 0, y_base = 200, size = 100;
			for(int k=0; k<720; k++){				RD = k*Math.PI/180;
				x = x_base+k;
				y_sin = y_base-(int)(Math.sin(RD)*size);
				y_cos = y_base-(int)(Math.cos(RD)*size);
				
				y_sum = y_base-(int)(Math.sin(RD)*size+Math.cos(RD)*size);
				
				for(int h=0; h<720; h++){					tan = tan + (int)(1/(2.0*h -1)*(Math.sin((2*h-1)*RD)));				}
				
				
				System.out.println(tan);
				g.drawLine(x, y_sin, x, y_sin);
				g.drawLine(x, y_cos, x, y_cos);
				g.drawLine(x, y_sum, x, y_sum);
				g.drawLine(x, tan, x, tan);			}		}
		
  }
}
