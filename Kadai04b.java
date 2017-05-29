//Kadai04b.java
//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/12

public class Kadai04b {	public static void main(String[] args){
		Dice2 d1 = new Dice2();
		Dice2 d2 = new Dice2(52);
		Dice2 d3 = new Dice2("S");
		Dice2 d4 = new Dice2(3,"L",1000);
		
		System.out.println("n="+d1.play());
		System.out.println("n="+d2.play());
		System.out.println("n="+d3.play());
		System.out.println("n="+d4.play());	}}

/* [15D8102011G@ise43c javawork]$ java Kadai04b
n=3
n=17
n=3
n=913

  */
