//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/21

public class Kadai02a {	public static void main(String[] args) {		Dice d = new Dice();
		d.setN(1);
		d.setSize("L");
		
		System.out.println("n="+d.n);
		System.out.println("size="+d.size);
		
		d.play();
		
		System.out.println("n="+d.n);
		System.out.println("size="+d.size);
			}} 
