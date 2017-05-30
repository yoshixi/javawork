//15D8102011G Masubuchi Yoshiki
import java.awt.*;
import javax.swing.*;
import java.util.Random;


public class Ex01f extends JFrame {
  private MyPanel sp;
  public static void main(String[] args){
    Ex01f sm = new Ex01f();
  }
  public Ex01f(){
    super("Ex01f");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(500,500);
    sp = new MyPanel();
    add(sp, BorderLayout.CENTER);
    setVisible(true);
  }
  public class MyPanel extends JPanel{
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      double n0[] = {0,0};
      double n1[] = {0,0};
      double scale = 400;
      int dx,dy;
      int N = 100000;
      double a1[][] = {{-0.29,0}, {0, 0.2}};
      double a2[][] = {{-0.07,-0.02}, {-0.01, 0.29}};
      double a3[][] = {{0.94,-0.22}, {0.21, 0.96}};
      double b1[] = {0.94,0.24};
      double b2[] = {0.94,0.33};
      double b3[] = {0.115,-0.08};

      for(int k = 0; k<N; k ++){

        Random rnd = new Random();
        int flag = rnd.nextInt(100);
        if (flag <= 5){
          n1 = cal(n0,a1,b1);
        }else if (flag >= 6 && flag <= 7){
          n1 = cal(n0,a2,b2);
        }else{
          n1 = cal(n0,a3,b3);
        }

        dx = (int)(n1[0]*scale);
        dy = (int)(n1[1]*scale);
        g.drawLine(dx, dy, dx, dy);

        n0 = n1;
      }
    }
    private double[] cal(double[] n,double[][] a,double[] b){
      double tmp[] = {0,0};
      for (int i=0;i<2;i++) {
        tmp[i] = a[i][0]*n[0] + a[i][1] * n[1] + b[i];
      }
      return tmp;
    }
  }
}
