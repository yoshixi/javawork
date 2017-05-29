//15D8102011G Masubuchi Yoshiki
public class Ex01d extends JFrame {
  public static void main(String[] args){
  }
  public Ex01d(){
    super("Ex01d");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(800,800);
    sp = new MyPanel();
    add(sp, BorderLayout.CENTER);
    setVisible(true);
  }

  public class MyPanel extends JPanel{
    public void paintComponent(Graphics g){
      int i,j;
      super.paintComponent(g);
      int[][] a = new int[m][m];
      a[0][0] = 1;
      for(i=1;i<m;i++){
        for(j=0;j<m;j++){

          if(j == 0)a[i][j] = a[i-1][j];
          else if(i==0)a[i][j] = 1;
          else a[i][j] = a[i-1][j-1] + a[i-1][j];
        }
        System.out.println();
      }
      for(i=0;i<m;i++){
        for(j=0;j<m;j++){
          g.drawRect(i*10,j*10,10,10);
          if(a[i][j] % 2 == 1) g.fillRect(j*10,i*10,10,10);
        }
      }
    }
  }

}
