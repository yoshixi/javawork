//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/28

public class Kadai03a {
  public static void main(String[] args) {
    double e = Math.E;
    double pi = Math.PI;
    double pie = Math.pow(pi,e);
    double epi = Math.pow(e,pi);
    
    System.out.println("π^e:" + pie);
    System.out.println("e^π:" + epi);
    
    if(pie > epi) {    	System.out.println("π^eの方が大きい");    }else {    	System.out.println("e^πの方が大きい");    }
  }
}
/*
π^e:22.45915771836104
e^π:23.140692632779263
e^πの方が大きい

*/
