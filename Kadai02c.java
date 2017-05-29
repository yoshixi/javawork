//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/21

public class Kadai02c {
  public static void main(String[] args) {
    double x = 150.5;
    Range d = new Range();
    boolean flag;
    d.setMin(50.0);
    d.setMax(250.0);

    System.out.println(d.outputRange());
    flag = d.isOK(x);
    if(flag){
        System.out.println(x+"  範囲内");
    }else{
        System.out.println(x+"  範囲外");
    }
  }
}
